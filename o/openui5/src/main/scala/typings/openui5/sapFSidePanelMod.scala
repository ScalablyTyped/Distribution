package typings.openui5

import typings.openui5.anon.Expanded
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFSidePanelMod {
  
  @JSImport("sap/f/SidePanel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `SidePanel`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SidePanel {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SidePanelSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: SidePanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SidePanelSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/SidePanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.SidePanel with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SidePanel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SidePanel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.SidePanel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SidePanel
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some item to the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addItem(
      /**
      * The item to add; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapFSidePanelItemMod.default
    ): this.type = js.native
    
    /**
      * Adds some mainContent to the aggregation {@link #getMainContent mainContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addMainContent(
      /**
      * The mainContent to add; if empty, nothing is inserted
      */
    oMainContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggle toggle} event of this `sap.f.SidePanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.SidePanel` itself.
      *
      * Fires on expand and collapse of the side content.
      *
      *
      * 	 - If the event fired as a result of action item selection (`expanded` parameter contains `true`) is
      * 			prevented, the display of the side content will be blocked.
      * 	 - If the event fired as a result of action item deselection, selection of different action item, pressing
      * 			the `Close` button, or pressing the `Escape` key (`expanded` parameter contains `false`) is prevented,
      * 			this will block closing of the currently displayed side content, and if the event is fired by selection
      * 			of a different action item, the selection will be cancelled, and the next event (for expansion of a new
      * 			action item) will not be fired and the new side content will not be displayed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggle(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachToggle(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.SidePanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:toggle toggle} event of this `sap.f.SidePanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.f.SidePanel` itself.
      *
      * Fires on expand and collapse of the side content.
      *
      *
      * 	 - If the event fired as a result of action item selection (`expanded` parameter contains `true`) is
      * 			prevented, the display of the side content will be blocked.
      * 	 - If the event fired as a result of action item deselection, selection of different action item, pressing
      * 			the `Close` button, or pressing the `Escape` key (`expanded` parameter contains `false`) is prevented,
      * 			this will block closing of the currently displayed side content, and if the event is fired by selection
      * 			of a different action item, the selection will be cancelled, and the next event (for expansion of a new
      * 			action item) will not be fired and the new side content will not be displayed.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachToggle(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachToggle(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.f.SidePanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * Destroys all the mainContent in the aggregation {@link #getMainContent mainContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMainContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:toggle toggle} event of this `sap.f.SidePanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachToggle(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachToggle(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:toggle toggle} to attached listeners.
      *
      * Listeners may prevent the default action of this event by calling the `preventDefault` method on the
      * event object. The return value of this method indicates whether the default action should be executed.
      *
      * @returns Whether or not to prevent the default action
      */
    def fireToggle(): Boolean = js.native
    def fireToggle(/**
      * Parameters to pass along with the event
      */
    mParameters: Expanded): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getActionBarExpanded actionBarExpanded}.
      *
      * Determines whether the action bar is expanded or collapsed.
      *
      * Default value is `false`.
      *
      * @returns Value of property `actionBarExpanded`
      */
    def getActionBarExpanded(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getAriaLabel ariaLabel}.
      *
      * Description for aria-label.
      *
      * Default value is `"Side Panel"`.
      *
      * @returns Value of property `ariaLabel`
      */
    def getAriaLabel(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getItems items}.
      *
      * The list of action items. Each action items can have different side content added to its `content` aggregation.
      */
    def getItems(): js.Array[typings.openui5.sapFSidePanelItemMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getMainContent mainContent}.
      *
      * The list of controls for the main content.
      */
    def getMainContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getSelectedItem selectedItem},
      * or `null`.
      */
    def getSelectedItem(): ID = js.native
    
    /**
      * @SINCE 1.109.0
      *
      * Gets current value of property {@link #getSidePanelMaxWidth sidePanelMaxWidth}.
      *
      * Determines the maximum side panel width (Side Content width + Action Bar width). **Note:** if the width
      * is given in percent(%), it is calculated as given percent from the Side Panel parent container width,
      * otherwise it's calculated in absolute units.
      *
      * Default value is `"90%"`.
      *
      * @returns Value of property `sidePanelMaxWidth`
      */
    def getSidePanelMaxWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.109.0
      *
      * Gets current value of property {@link #getSidePanelMinWidth sidePanelMinWidth}.
      *
      * Determines the minimum side panel width (Side Content width + Action Bar width). **Note:** if the width
      * is given in percent(%), it is calculated as given percent from the Side Panel parent container width,
      * otherwise it's calculated in absolute units.
      *
      * Default value is `"15rem"`.
      *
      * @returns Value of property `sidePanelMinWidth`
      */
    def getSidePanelMinWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getSidePanelResizable sidePanelResizable}.
      *
      * Determines whether the side panel is resizable or fixed. **Note:** setting this property only affects
      * desktop or tablet devices.
      *
      * Default value is `false`.
      *
      * @returns Value of property `sidePanelResizable`
      */
    def getSidePanelResizable(): Boolean = js.native
    
    /**
      * @SINCE 1.109.0
      *
      * Gets current value of property {@link #getSidePanelResizeLargerStep sidePanelResizeLargerStep}.
      *
      * Determines the large step (in pixels) when changing the width of the side panel with the keyboard. **Note:**
      * the width can be changed by large step with `Shift + Left Arrow` and `Shift + Right Arrow` keys when
      * the resize splitter is focused.
      *
      * Default value is `100`.
      *
      * @returns Value of property `sidePanelResizeLargerStep`
      */
    def getSidePanelResizeLargerStep(): int = js.native
    
    /**
      * @SINCE 1.109.0
      *
      * Gets current value of property {@link #getSidePanelResizeStep sidePanelResizeStep}.
      *
      * Determines the step (in pixels) when changing the width of the side panel with the keyboard. **Note:**
      * the width can be changed by this step with `Left Arrow` and `Right Arrow` keys when the resize splitter
      * is focused.
      *
      * Default value is `10`.
      *
      * @returns Value of property `sidePanelResizeStep`
      */
    def getSidePanelResizeStep(): int = js.native
    
    /**
      * Gets current value of property {@link #getSidePanelWidth sidePanelWidth}.
      *
      * Determines the side panel width (Side Content width + Action Bar width). **Note:** if the width is given
      * in percent(%), it is calculated as given percent from the Side Panel parent container width, otherwise
      * it's calculated in absolute units.
      *
      * Default value is `"20rem"`.
      *
      * @returns Value of property `sidePanelWidth`
      */
    def getSidePanelWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.f.SidePanelItem` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapFSidePanelItemMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getMainContent mainContent}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfMainContent(
      /**
      * The mainContent whose index is looked for
      */
    oMainContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a item into the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertItem(
      /**
      * The item to insert; if empty, nothing is inserted
      */
    oItem: typings.openui5.sapFSidePanelItemMod.default,
      /**
      * The `0`-based index the item should be inserted at; for a negative value of `iIndex`, the item is inserted
      * at position 0; for a value greater than the current size of the aggregation, the item is inserted at
      * the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a mainContent into the aggregation {@link #getMainContent mainContent}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertMainContent(
      /**
      * The mainContent to insert; if empty, nothing is inserted
      */
    oMainContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the mainContent should be inserted at; for a negative value of `iIndex`, the mainContent
      * is inserted at position 0; for a value greater than the current size of the aggregation, the mainContent
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getItems items}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllItems(): js.Array[typings.openui5.sapFSidePanelItemMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getMainContent mainContent}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllMainContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: String): typings.openui5.sapFSidePanelItemMod.default | Null = js.native
    /**
      * Removes a item from the aggregation {@link #getItems items}.
      *
      * @returns The removed item or `null`
      */
    def removeItem(/**
      * The item to remove or its index or id
      */
    vItem: int): typings.openui5.sapFSidePanelItemMod.default | Null = js.native
    def removeItem(
      /**
      * The item to remove or its index or id
      */
    vItem: typings.openui5.sapFSidePanelItemMod.default
    ): typings.openui5.sapFSidePanelItemMod.default | Null = js.native
    
    def removeMainContent(/**
      * The mainContent to remove or its index or id
      */
    vMainContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a mainContent from the aggregation {@link #getMainContent mainContent}.
      *
      * @returns The removed mainContent or `null`
      */
    def removeMainContent(/**
      * The mainContent to remove or its index or id
      */
    vMainContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeMainContent(
      /**
      * The mainContent to remove or its index or id
      */
    vMainContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getActionBarExpanded actionBarExpanded}.
      *
      * Determines whether the action bar is expanded or collapsed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActionBarExpanded(): this.type = js.native
    def setActionBarExpanded(/**
      * New value for property `actionBarExpanded`
      */
    bActionBarExpanded: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getAriaLabel ariaLabel}.
      *
      * Description for aria-label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"Side Panel"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAriaLabel(): this.type = js.native
    def setAriaLabel(/**
      * New value for property `ariaLabel`
      */
    sAriaLabel: String): this.type = js.native
    
    /**
      * @SINCE 1.109.0
      *
      * Sets a new value for property {@link #getSidePanelMaxWidth sidePanelMaxWidth}.
      *
      * Determines the maximum side panel width (Side Content width + Action Bar width). **Note:** if the width
      * is given in percent(%), it is calculated as given percent from the Side Panel parent container width,
      * otherwise it's calculated in absolute units.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"90%"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSidePanelMaxWidth(): this.type = js.native
    def setSidePanelMaxWidth(/**
      * New value for property `sidePanelMaxWidth`
      */
    sSidePanelMaxWidth: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.109.0
      *
      * Sets a new value for property {@link #getSidePanelMinWidth sidePanelMinWidth}.
      *
      * Determines the minimum side panel width (Side Content width + Action Bar width). **Note:** if the width
      * is given in percent(%), it is calculated as given percent from the Side Panel parent container width,
      * otherwise it's calculated in absolute units.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"15rem"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSidePanelMinWidth(): this.type = js.native
    def setSidePanelMinWidth(/**
      * New value for property `sidePanelMinWidth`
      */
    sSidePanelMinWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSidePanelResizable sidePanelResizable}.
      *
      * Determines whether the side panel is resizable or fixed. **Note:** setting this property only affects
      * desktop or tablet devices.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSidePanelResizable(): this.type = js.native
    def setSidePanelResizable(/**
      * New value for property `sidePanelResizable`
      */
    bSidePanelResizable: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.109.0
      *
      * Sets a new value for property {@link #getSidePanelResizeLargerStep sidePanelResizeLargerStep}.
      *
      * Determines the large step (in pixels) when changing the width of the side panel with the keyboard. **Note:**
      * the width can be changed by large step with `Shift + Left Arrow` and `Shift + Right Arrow` keys when
      * the resize splitter is focused.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `100`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSidePanelResizeLargerStep(): this.type = js.native
    def setSidePanelResizeLargerStep(/**
      * New value for property `sidePanelResizeLargerStep`
      */
    iSidePanelResizeLargerStep: int): this.type = js.native
    
    /**
      * @SINCE 1.109.0
      *
      * Sets a new value for property {@link #getSidePanelResizeStep sidePanelResizeStep}.
      *
      * Determines the step (in pixels) when changing the width of the side panel with the keyboard. **Note:**
      * the width can be changed by this step with `Left Arrow` and `Right Arrow` keys when the resize splitter
      * is focused.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `10`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSidePanelResizeStep(): this.type = js.native
    def setSidePanelResizeStep(/**
      * New value for property `sidePanelResizeStep`
      */
    iSidePanelResizeStep: int): this.type = js.native
  }
  
  trait SidePanelSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Determines whether the action bar is expanded or collapsed.
      */
    var actionBarExpanded: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Description for aria-label.
      */
    var ariaLabel: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The list of action items. Each action items can have different side content added to its `content` aggregation.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapFSidePanelItemMod.default] | typings.openui5.sapFSidePanelItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The list of controls for the main content.
      */
    var mainContent: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The action item that is currently selected.
      */
    var selectedItem: js.UndefOr[typings.openui5.sapFSidePanelItemMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.109.0
      *
      * Determines the maximum side panel width (Side Content width + Action Bar width). **Note:** if the width
      * is given in percent(%), it is calculated as given percent from the Side Panel parent container width,
      * otherwise it's calculated in absolute units.
      */
    var sidePanelMaxWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.109.0
      *
      * Determines the minimum side panel width (Side Content width + Action Bar width). **Note:** if the width
      * is given in percent(%), it is calculated as given percent from the Side Panel parent container width,
      * otherwise it's calculated in absolute units.
      */
    var sidePanelMinWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the side panel is resizable or fixed. **Note:** setting this property only affects
      * desktop or tablet devices.
      */
    var sidePanelResizable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.109.0
      *
      * Determines the large step (in pixels) when changing the width of the side panel with the keyboard. **Note:**
      * the width can be changed by large step with `Shift + Left Arrow` and `Shift + Right Arrow` keys when
      * the resize splitter is focused.
      */
    var sidePanelResizeLargerStep: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.109.0
      *
      * Determines the step (in pixels) when changing the width of the side panel with the keyboard. **Note:**
      * the width can be changed by this step with `Left Arrow` and `Right Arrow` keys when the resize splitter
      * is focused.
      */
    var sidePanelResizeStep: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the side panel width (Side Content width + Action Bar width). **Note:** if the width is given
      * in percent(%), it is calculated as given percent from the Side Panel parent container width, otherwise
      * it's calculated in absolute units.
      */
    var sidePanelWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires on expand and collapse of the side content.
      *
      *
      * 	 - If the event fired as a result of action item selection (`expanded` parameter contains `true`) is
      * 			prevented, the display of the side content will be blocked.
      * 	 - If the event fired as a result of action item deselection, selection of different action item, pressing
      * 			the `Close` button, or pressing the `Escape` key (`expanded` parameter contains `false`) is prevented,
      * 			this will block closing of the currently displayed side content, and if the event is fired by selection
      * 			of a different action item, the selection will be cancelled, and the next event (for expansion of a new
      * 			action item) will not be fired and the new side content will not be displayed.
      */
    var toggle: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object SidePanelSettings {
    
    inline def apply(): SidePanelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidePanelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SidePanelSettings] (val x: Self) extends AnyVal {
      
      inline def setActionBarExpanded(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "actionBarExpanded", value.asInstanceOf[js.Any])
      
      inline def setActionBarExpandedUndefined: Self = StObject.set(x, "actionBarExpanded", js.undefined)
      
      inline def setAriaLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapFSidePanelItemMod.default] | typings.openui5.sapFSidePanelItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapFSidePanelItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setMainContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "mainContent", value.asInstanceOf[js.Any])
      
      inline def setMainContentUndefined: Self = StObject.set(x, "mainContent", js.undefined)
      
      inline def setMainContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "mainContent", js.Array(value*))
      
      inline def setSelectedItem(value: typings.openui5.sapFSidePanelItemMod.default | String): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setSidePanelMaxWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sidePanelMaxWidth", value.asInstanceOf[js.Any])
      
      inline def setSidePanelMaxWidthUndefined: Self = StObject.set(x, "sidePanelMaxWidth", js.undefined)
      
      inline def setSidePanelMinWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sidePanelMinWidth", value.asInstanceOf[js.Any])
      
      inline def setSidePanelMinWidthUndefined: Self = StObject.set(x, "sidePanelMinWidth", js.undefined)
      
      inline def setSidePanelResizable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sidePanelResizable", value.asInstanceOf[js.Any])
      
      inline def setSidePanelResizableUndefined: Self = StObject.set(x, "sidePanelResizable", js.undefined)
      
      inline def setSidePanelResizeLargerStep(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sidePanelResizeLargerStep", value.asInstanceOf[js.Any])
      
      inline def setSidePanelResizeLargerStepUndefined: Self = StObject.set(x, "sidePanelResizeLargerStep", js.undefined)
      
      inline def setSidePanelResizeStep(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sidePanelResizeStep", value.asInstanceOf[js.Any])
      
      inline def setSidePanelResizeStepUndefined: Self = StObject.set(x, "sidePanelResizeStep", js.undefined)
      
      inline def setSidePanelWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "sidePanelWidth", value.asInstanceOf[js.Any])
      
      inline def setSidePanelWidthUndefined: Self = StObject.set(x, "sidePanelWidth", js.undefined)
      
      inline def setToggle(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
      
      inline def setToggleUndefined: Self = StObject.set(x, "toggle", js.undefined)
    }
  }
}
