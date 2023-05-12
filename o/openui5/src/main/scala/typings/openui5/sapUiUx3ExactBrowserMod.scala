package typings.openui5

import typings.openui5.anon.AllAttributes
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiUx3LibraryMod.ExactOrder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUx3ExactBrowserMod {
  
  @JSImport("sap/ui/ux3/ExactBrowser", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ExactBrowser.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ExactBrowser {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ExactBrowserSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: ExactBrowserSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ExactBrowserSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/ux3/ExactBrowser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.ux3.ExactBrowser with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ExactBrowser]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ExactBrowser],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.ux3.ExactBrowser.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ExactBrowser
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Adds some attribute to the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAttribute(
      /**
      * The attribute to add; if empty, nothing is inserted
      */
    oAttribute: typings.openui5.sapUiUx3ExactAttributeMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:attributeSelected attributeSelected} event of
      * this `sap.ui.ux3.ExactBrowser`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ExactBrowser` itself.
      *
      * Event is fired when an attribute is selected or unselected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAttributeSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAttributeSelected(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ExactBrowser` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:attributeSelected attributeSelected} event of
      * this `sap.ui.ux3.ExactBrowser`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ExactBrowser` itself.
      *
      * Event is fired when an attribute is selected or unselected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAttributeSelected(
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
    def attachAttributeSelected(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ExactBrowser` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:save save} event of this `sap.ui.ux3.ExactBrowser`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ExactBrowser` itself.
      *
      * Event is fired when an attribute is selected or unselected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSave(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSave(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ExactBrowser` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:save save} event of this `sap.ui.ux3.ExactBrowser`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.ux3.ExactBrowser` itself.
      *
      * Event is fired when an attribute is selected or unselected.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSave(
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
    def attachSave(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.ux3.ExactBrowser` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys all the attributes in the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAttributes(): this.type = js.native
    
    /**
      * Destroys the optionsMenu in the aggregation {@link #getOptionsMenu optionsMenu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyOptionsMenu(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:attributeSelected attributeSelected} event
      * of this `sap.ui.ux3.ExactBrowser`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAttributeSelected(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAttributeSelected(
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
      * Detaches event handler `fnFunction` from the {@link #event:save save} event of this `sap.ui.ux3.ExactBrowser`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSave(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSave(
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
      * Fires event {@link #event:attributeSelected attributeSelected} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAttributeSelected(): this.type = js.native
    def fireAttributeSelected(/**
      * Parameters to pass along with the event
      */
    mParameters: AllAttributes): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:save save} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSave(): this.type = js.native
    def fireSave(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAttributes attributes}.
      *
      * The attributes which shall be available.
      */
    def getAttributes(): js.Array[typings.openui5.sapUiUx3ExactAttributeMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getEnableListClose enableListClose}.
      *
      * Enables the close icons of the displayed lists.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableListClose`
      */
    def getEnableListClose(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnableReset enableReset}.
      *
      * Whether the reset functionality should be available in the header area.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableReset`
      */
    def getEnableReset(): Boolean = js.native
    
    /**
      * @SINCE 1.9.2
      *
      * Gets current value of property {@link #getEnableSave enableSave}.
      *
      * Whether the save button should be available in the header area.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableSave`
      */
    def getEnableSave(): Boolean = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getFollowUpControl followUpControl},
      * or `null`.
      */
    def getFollowUpControl(): ID = js.native
    
    /**
      * Gets current value of property {@link #getHeaderTitle headerTitle}.
      *
      * Title text in the header of the Exact Browser.
      *
      * @returns Value of property `headerTitle`
      */
    def getHeaderTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getListHeight listHeight}.
      *
      * The height of the list area in px.
      *
      * Default value is `290`.
      *
      * @returns Value of property `listHeight`
      */
    def getListHeight(): int = js.native
    
    /**
      * Gets content of aggregation {@link #getOptionsMenu optionsMenu}.
      *
      * Menu with options. The menu can not used when the property showTopList is set to false.
      */
    def getOptionsMenu(): typings.openui5.sapUiCommonsMenuMod.default = js.native
    
    /**
      * Gets current value of property {@link #getShowHeader showHeader}.
      *
      * Whether the header area of the ExactBrowser should be shown.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showHeader`
      */
    def getShowHeader(): Boolean = js.native
    
    /**
      * @SINCE 1.7.0
      *
      * Gets current value of property {@link #getShowTopList showTopList}.
      *
      * Whether the top list of the ExactBrowser should be shown. When the property is set to false the application
      * must ensure to select top level attributes appropriately.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showTopList`
      */
    def getShowTopList(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Title text in the list area of the Exact Browser. The title is not shown when the property showTopList
      * is set to false.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * @SINCE 1.7.1
      *
      * Gets current value of property {@link #getTopListOrder topListOrder}.
      *
      * The order how the sublists of the top level list should be displayed.
      *
      * Default value is `Select`.
      *
      * @returns Value of property `topListOrder`
      */
    def getTopListOrder(): ExactOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExactOrder * / any */ String) = js.native
    
    /**
      * @SINCE 1.7.0
      *
      * Gets current value of property {@link #getTopListWidth topListWidth}.
      *
      * Specifies the width of the top list in pixels. The value must be between 70 and 500.
      *
      * Default value is `168`.
      *
      * @returns Value of property `topListWidth`
      */
    def getTopListWidth(): int = js.native
    
    /**
      * Checks for the provided `sap.ui.ux3.ExactAttribute` in the aggregation {@link #getAttributes attributes}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfAttribute(
      /**
      * The attribute whose index is looked for
      */
    oAttribute: typings.openui5.sapUiUx3ExactAttributeMod.default
    ): int = js.native
    
    /**
      * Inserts a attribute into the aggregation {@link #getAttributes attributes}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertAttribute(
      /**
      * The attribute to insert; if empty, nothing is inserted
      */
    oAttribute: typings.openui5.sapUiUx3ExactAttributeMod.default,
      /**
      * The `0`-based index the attribute should be inserted at; for a negative value of `iIndex`, the attribute
      * is inserted at position 0; for a value greater than the current size of the aggregation, the attribute
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getAttributes attributes}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAttributes(): js.Array[typings.openui5.sapUiUx3ExactAttributeMod.default] = js.native
    
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: String): typings.openui5.sapUiUx3ExactAttributeMod.default | Null = js.native
    /**
      * Removes a attribute from the aggregation {@link #getAttributes attributes}.
      *
      * @returns The removed attribute or `null`
      */
    def removeAttribute(/**
      * The attribute to remove or its index or id
      */
    vAttribute: int): typings.openui5.sapUiUx3ExactAttributeMod.default | Null = js.native
    def removeAttribute(
      /**
      * The attribute to remove or its index or id
      */
    vAttribute: typings.openui5.sapUiUx3ExactAttributeMod.default
    ): typings.openui5.sapUiUx3ExactAttributeMod.default | Null = js.native
    
    /**
      * Deselects all currently selected attributes and closes all attribute lists.
      */
    def reset(): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getEnableListClose enableListClose}.
      *
      * Enables the close icons of the displayed lists.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableListClose(): this.type = js.native
    def setEnableListClose(/**
      * New value for property `enableListClose`
      */
    bEnableListClose: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnableReset enableReset}.
      *
      * Whether the reset functionality should be available in the header area.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableReset(): this.type = js.native
    def setEnableReset(/**
      * New value for property `enableReset`
      */
    bEnableReset: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.9.2
      *
      * Sets a new value for property {@link #getEnableSave enableSave}.
      *
      * Whether the save button should be available in the header area.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableSave(): this.type = js.native
    def setEnableSave(/**
      * New value for property `enableSave`
      */
    bEnableSave: Boolean): this.type = js.native
    
    def setFollowUpControl(
      /**
      * ID of an element which becomes the new target of this followUpControl association; alternatively, an
      * element instance may be given
      */
    oFollowUpControl: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getFollowUpControl followUpControl}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFollowUpControl(
      /**
      * ID of an element which becomes the new target of this followUpControl association; alternatively, an
      * element instance may be given
      */
    oFollowUpControl: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeaderTitle headerTitle}.
      *
      * Title text in the header of the Exact Browser.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeaderTitle(): this.type = js.native
    def setHeaderTitle(/**
      * New value for property `headerTitle`
      */
    sHeaderTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getListHeight listHeight}.
      *
      * The height of the list area in px.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `290`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setListHeight(): this.type = js.native
    def setListHeight(/**
      * New value for property `listHeight`
      */
    iListHeight: int): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getOptionsMenu optionsMenu}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setOptionsMenu(/**
      * The optionsMenu to set
      */
    oOptionsMenu: typings.openui5.sapUiCommonsMenuMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowHeader showHeader}.
      *
      * Whether the header area of the ExactBrowser should be shown.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowHeader(): this.type = js.native
    def setShowHeader(/**
      * New value for property `showHeader`
      */
    bShowHeader: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.7.0
      *
      * Sets a new value for property {@link #getShowTopList showTopList}.
      *
      * Whether the top list of the ExactBrowser should be shown. When the property is set to false the application
      * must ensure to select top level attributes appropriately.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowTopList(): this.type = js.native
    def setShowTopList(/**
      * New value for property `showTopList`
      */
    bShowTopList: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Title text in the list area of the Exact Browser. The title is not shown when the property showTopList
      * is set to false.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * @SINCE 1.7.1
      *
      * Sets a new value for property {@link #getTopListOrder topListOrder}.
      *
      * The order how the sublists of the top level list should be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Select`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTopListOrder(): this.type = js.native
    def setTopListOrder(
      /**
      * New value for property `topListOrder`
      */
    sTopListOrder: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExactOrder * / any */ String
    ): this.type = js.native
    def setTopListOrder(/**
      * New value for property `topListOrder`
      */
    sTopListOrder: ExactOrder): this.type = js.native
    
    /**
      * @SINCE 1.7.0
      *
      * Sets a new value for property {@link #getTopListWidth topListWidth}.
      *
      * Specifies the width of the top list in pixels. The value must be between 70 and 500.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `168`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTopListWidth(): this.type = js.native
    def setTopListWidth(/**
      * New value for property `topListWidth`
      */
    iTopListWidth: int): this.type = js.native
  }
  
  trait ExactBrowserSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Event is fired when an attribute is selected or unselected.
      */
    var attributeSelected: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The attributes which shall be available.
      */
    var attributes: js.UndefOr[
        js.Array[typings.openui5.sapUiUx3ExactAttributeMod.default] | typings.openui5.sapUiUx3ExactAttributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Enables the close icons of the displayed lists.
      */
    var enableListClose: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether the reset functionality should be available in the header area.
      */
    var enableReset: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.9.2
      *
      * Whether the save button should be available in the header area.
      */
    var enableSave: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The successor control of the Exact Browser. The id of this control is used in the ARIA description of
      * the control.
      */
    var followUpControl: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Title text in the header of the Exact Browser.
      */
    var headerTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The height of the list area in px.
      */
    var listHeight: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Menu with options. The menu can not used when the property showTopList is set to false.
      */
    var optionsMenu: js.UndefOr[typings.openui5.sapUiCommonsMenuMod.default] = js.undefined
    
    /**
      * Event is fired when an attribute is selected or unselected.
      */
    var save: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Whether the header area of the ExactBrowser should be shown.
      */
    var showHeader: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.7.0
      *
      * Whether the top list of the ExactBrowser should be shown. When the property is set to false the application
      * must ensure to select top level attributes appropriately.
      */
    var showTopList: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Title text in the list area of the Exact Browser. The title is not shown when the property showTopList
      * is set to false.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.7.1
      *
      * The order how the sublists of the top level list should be displayed.
      */
    var topListOrder: js.UndefOr[
        ExactOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExactOrder * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.7.0
      *
      * Specifies the width of the top list in pixels. The value must be between 70 and 500.
      */
    var topListWidth: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object ExactBrowserSettings {
    
    inline def apply(): ExactBrowserSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExactBrowserSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExactBrowserSettings] (val x: Self) extends AnyVal {
      
      inline def setAttributeSelected(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "attributeSelected", js.Any.fromFunction1(value))
      
      inline def setAttributeSelectedUndefined: Self = StObject.set(x, "attributeSelected", js.undefined)
      
      inline def setAttributes(
        value: js.Array[typings.openui5.sapUiUx3ExactAttributeMod.default] | typings.openui5.sapUiUx3ExactAttributeMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setAttributesVarargs(value: typings.openui5.sapUiUx3ExactAttributeMod.default*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setEnableListClose(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableListClose", value.asInstanceOf[js.Any])
      
      inline def setEnableListCloseUndefined: Self = StObject.set(x, "enableListClose", js.undefined)
      
      inline def setEnableReset(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableReset", value.asInstanceOf[js.Any])
      
      inline def setEnableResetUndefined: Self = StObject.set(x, "enableReset", js.undefined)
      
      inline def setEnableSave(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableSave", value.asInstanceOf[js.Any])
      
      inline def setEnableSaveUndefined: Self = StObject.set(x, "enableSave", js.undefined)
      
      inline def setFollowUpControl(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "followUpControl", value.asInstanceOf[js.Any])
      
      inline def setFollowUpControlUndefined: Self = StObject.set(x, "followUpControl", js.undefined)
      
      inline def setHeaderTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      inline def setHeaderTitleUndefined: Self = StObject.set(x, "headerTitle", js.undefined)
      
      inline def setListHeight(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      inline def setListHeightUndefined: Self = StObject.set(x, "listHeight", js.undefined)
      
      inline def setOptionsMenu(value: typings.openui5.sapUiCommonsMenuMod.default): Self = StObject.set(x, "optionsMenu", value.asInstanceOf[js.Any])
      
      inline def setOptionsMenuUndefined: Self = StObject.set(x, "optionsMenu", js.undefined)
      
      inline def setSave(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
      
      inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
      
      inline def setShowHeader(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setShowTopList(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showTopList", value.asInstanceOf[js.Any])
      
      inline def setShowTopListUndefined: Self = StObject.set(x, "showTopList", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTopListOrder(
        value: ExactOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ExactOrder * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "topListOrder", value.asInstanceOf[js.Any])
      
      inline def setTopListOrderUndefined: Self = StObject.set(x, "topListOrder", js.undefined)
      
      inline def setTopListWidth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "topListWidth", value.asInstanceOf[js.Any])
      
      inline def setTopListWidthUndefined: Self = StObject.set(x, "topListWidth", js.undefined)
    }
  }
}
