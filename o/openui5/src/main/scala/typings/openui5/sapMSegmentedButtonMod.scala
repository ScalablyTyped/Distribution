package typings.openui5

import typings.openui5.anon.ButtonId
import typings.openui5.anon.`20`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IOverflowToolbarContent
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSegmentedButtonMod {
  
  @JSImport("sap/m/SegmentedButton", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `SegmentedButton`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/button/ Segmented Button}
    */
  open class default () extends SegmentedButton {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SegmentedButtonSettings) = this()
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
    mSettings: SegmentedButtonSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SegmentedButtonSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IOverflowToolbarContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/SegmentedButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.SegmentedButton with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, SegmentedButton]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SegmentedButton],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.SegmentedButton.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SegmentedButton
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent
       with IOverflowToolbarContent {
    
    def addAriaDescribedBy(
      /**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaDescribedBy into the association {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaDescribedBy(/**
      * The ariaDescribedBy to add; if empty, nothing is inserted
      */
    vAriaDescribedBy: ID): this.type = js.native
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * @deprecated (since 1.28.0) - replaced by `items` aggregation
      *
      * Adds some button to the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addButton(
      /**
      * The button to add; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Adds item to `items` aggregation.
      *
      * @returns `this` pointer for chaining
      */
    def addItem(/**
      * The item to be added
      */
    oItem: typings.openui5.sapMSegmentedButtonItemMod.default): this.type = js.native
    
    /**
      * @deprecated (since 1.52) - replaced by `selectionChange` event
      *
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.m.SegmentedButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SegmentedButton` itself.
      *
      * Fires when the user selects a button, which returns the ID and button object.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelect(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SegmentedButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.52) - replaced by `selectionChange` event
      *
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.m.SegmentedButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SegmentedButton` itself.
      *
      * Fires when the user selects a button, which returns the ID and button object.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelect(
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
    def attachSelect(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SegmentedButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.SegmentedButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SegmentedButton` itself.
      *
      * Fires when the user selects an item, which returns the item object.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachSelectionChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.SegmentedButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @SINCE 1.52
      *
      * Attaches event handler `fnFunction` to the {@link #event:selectionChange selectionChange} event of this
      * `sap.m.SegmentedButton`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.SegmentedButton` itself.
      *
      * Fires when the user selects an item, which returns the item object.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachSelectionChange(
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
    def attachSelectionChange(
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
      * Context object to call the event handler with. Defaults to this `sap.m.SegmentedButton` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @SINCE 1.28
      *
      * Binds aggregation {@link #getItems items} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindItems(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Binds property {@link #getSelectedKey selectedKey} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindProperty ManagedObject.bindProperty} for a detailed description
      * of the possible properties of `oBindingInfo`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindSelectedKey(/**
      * The binding information
      */
    oBindingInfo: PropertyBindingInfo): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Adds a Button with a text as title, a URI for an icon, enabled and textDirection. Only one is allowed.
      *
      * @returns The created Button
      */
    def createButton(
      /**
      * Defines the title text of the newly created Button
      */
    sText: String,
      /**
      * Icon to be displayed as graphical element within the Button. Density related image will be loaded if
      * image with density awareness name in format [imageName]@[densityValue].[extension] is provided.
      */
    sURI: URI
    ): typings.openui5.sapMButtonMod.default = js.native
    def createButton(
      /**
      * Defines the title text of the newly created Button
      */
    sText: String,
      /**
      * Icon to be displayed as graphical element within the Button. Density related image will be loaded if
      * image with density awareness name in format [imageName]@[densityValue].[extension] is provided.
      */
    sURI: URI,
      /**
      * Enables the control. Buttons that are disabled have other colors than enabled ones, depending on custom
      * settings.
      */
    bEnabled: Boolean
    ): typings.openui5.sapMButtonMod.default = js.native
    def createButton(
      /**
      * Defines the title text of the newly created Button
      */
    sText: String,
      /**
      * Icon to be displayed as graphical element within the Button. Density related image will be loaded if
      * image with density awareness name in format [imageName]@[densityValue].[extension] is provided.
      */
    sURI: URI,
      /**
      * Enables the control. Buttons that are disabled have other colors than enabled ones, depending on custom
      * settings.
      */
    bEnabled: Boolean,
      /**
      * Element's text directionality with enumerated options
      */
    sTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): typings.openui5.sapMButtonMod.default = js.native
    def createButton(
      /**
      * Defines the title text of the newly created Button
      */
    sText: String,
      /**
      * Icon to be displayed as graphical element within the Button. Density related image will be loaded if
      * image with density awareness name in format [imageName]@[densityValue].[extension] is provided.
      */
    sURI: URI,
      /**
      * Enables the control. Buttons that are disabled have other colors than enabled ones, depending on custom
      * settings.
      */
    bEnabled: Boolean,
      /**
      * Element's text directionality with enumerated options
      */
    sTextDirection: TextDirection
    ): typings.openui5.sapMButtonMod.default = js.native
    def createButton(
      /**
      * Defines the title text of the newly created Button
      */
    sText: String,
      /**
      * Icon to be displayed as graphical element within the Button. Density related image will be loaded if
      * image with density awareness name in format [imageName]@[densityValue].[extension] is provided.
      */
    sURI: URI,
      /**
      * Enables the control. Buttons that are disabled have other colors than enabled ones, depending on custom
      * settings.
      */
    bEnabled: Unit,
      /**
      * Element's text directionality with enumerated options
      */
    sTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): typings.openui5.sapMButtonMod.default = js.native
    def createButton(
      /**
      * Defines the title text of the newly created Button
      */
    sText: String,
      /**
      * Icon to be displayed as graphical element within the Button. Density related image will be loaded if
      * image with density awareness name in format [imageName]@[densityValue].[extension] is provided.
      */
    sURI: URI,
      /**
      * Enables the control. Buttons that are disabled have other colors than enabled ones, depending on custom
      * settings.
      */
    bEnabled: Unit,
      /**
      * Element's text directionality with enumerated options
      */
    sTextDirection: TextDirection
    ): typings.openui5.sapMButtonMod.default = js.native
    
    /**
      * @deprecated (since 1.28.0) - replaced by `items` aggregation
      *
      * Destroys all the buttons in the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyButtons(): this.type = js.native
    
    /**
      * @SINCE 1.28
      *
      * Destroys all the items in the aggregation {@link #getItems items}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyItems(): this.type = js.native
    
    /**
      * @deprecated (since 1.52) - replaced by `selectionChange` event
      *
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.m.SegmentedButton`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelect(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelect(
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
      * @SINCE 1.52
      *
      * Detaches event handler `fnFunction` from the {@link #event:selectionChange selectionChange} event of
      * this `sap.m.SegmentedButton`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachSelectionChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachSelectionChange(
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
      * @deprecated (since 1.52) - replaced by `selectionChange` event
      *
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: ButtonId): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Fires event {@link #event:selectionChange selectionChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelectionChange(): this.type = js.native
    def fireSelectionChange(/**
      * Parameters to pass along with the event
      */
    mParameters: `20`): this.type = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaDescribedBy
      * ariaDescribedBy}.
      */
    def getAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @deprecated (since 1.28.0) - replaced by `items` aggregation
      *
      * Gets content of aggregation {@link #getButtons buttons}.
      *
      * The buttons of the SegmentedButton control. The items set in this aggregation are used as an interface
      * for the buttons displayed by the control. Only the properties ID, icon, text, enabled and textDirections
      * of the Button control are evaluated. Setting other properties of the button will have no effect. Alternatively,
      * you can use the createButton method to add buttons.
      */
    def getButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Disables all the buttons in the SegmentedButton control. When disabled all the buttons look grey and
      * you cannot focus or click on them.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * `SegmentedButton` must not be stretched in Form because ResizeHandler is used internally in order to
      * manage the width of the SegmentedButton depending on the container size
      *
      * @returns True this method always returns `true`
      */
    @JSName("getFormDoNotAdjustWidth")
    def getFormDoNotAdjustWidth_MSegmentedButton(): Boolean = js.native
    
    /**
      * @SINCE 1.28
      *
      * Gets content of aggregation {@link #getItems items}.
      *
      * Aggregation of items to be displayed. The items set in this aggregation are used as an interface for
      * the buttons displayed by the control. The "items" and "buttons" aggregations should NOT be used simultaneously
      * as it causes the control to work incorrectly. Note: If `width` is supplied in percetange to `SegmentedButtonItem`
      * instances and the sum of all percentages exeeds 100%, then the buttons display could overlap other elements
      * in the page.
      */
    def getItems(): js.Array[typings.openui5.sapMSegmentedButtonItemMod.default] = js.native
    
    /**
      * @deprecated (since 1.52) - replaced by `selectedItem` association
      *
      * ID of the element which is the current target of the association {@link #getSelectedButton selectedButton},
      * or `null`.
      */
    def getSelectedButton(): ID = js.native
    
    /**
      * @SINCE 1.52
      *
      * ID of the element which is the current target of the association {@link #getSelectedItem selectedItem},
      * or `null`.
      */
    def getSelectedItem(): ID = js.native
    
    /**
      * @SINCE 1.28
      *
      * Gets the `selectedKey` and is usable only when the control is initiated with the `items` aggregation.
      *
      * @returns Current selected key
      */
    def getSelectedKey(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the SegmentedButton control. If not set, it uses the minimum required width to make
      * all buttons inside of the same size (based on the biggest button).
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @deprecated (since 1.28.0) - replaced by `items` aggregation
      *
      * Checks for the provided `sap.m.Button` in the aggregation {@link #getButtons buttons}. and returns its
      * index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfButton(/**
      * The button whose index is looked for
      */
    oButton: typings.openui5.sapMButtonMod.default): int = js.native
    
    /**
      * @SINCE 1.28
      *
      * Checks for the provided `sap.m.SegmentedButtonItem` in the aggregation {@link #getItems items}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfItem(
      /**
      * The item whose index is looked for
      */
    oItem: typings.openui5.sapMSegmentedButtonItemMod.default
    ): int = js.native
    
    /**
      * @deprecated (since 1.28.0) - replaced by `items` aggregation
      *
      * Inserts a button into the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertButton(
      /**
      * The button to insert; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapMButtonMod.default,
      /**
      * The `0`-based index the button should be inserted at; for a negative value of `iIndex`, the button is
      * inserted at position 0; for a value greater than the current size of the aggregation, the button is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts item into `items` aggregation.
      *
      * @returns `this` pointer for chaining
      */
    def insertItem(
      /**
      * The item to be inserted
      */
    oItem: typings.openui5.sapMSegmentedButtonItemMod.default,
      /**
      * index the item should be inserted at
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaDescribedBy(): js.Array[ID] = js.native
    
    /**
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @deprecated (since 1.28.0) - replaced by `items` aggregation
      *
      * Removes all the controls from the aggregation {@link #getButtons buttons}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllButtons(): js.Array[typings.openui5.sapMButtonMod.default] = js.native
    
    /**
      * Removes all items from `items` aggregation
      */
    def removeAllItems(): Unit = js.native
    def removeAllItems(/**
      * If `true` the control invalidation will be suppressed
      */
    bSuppressInvalidate: Boolean): Unit = js.native
    
    /**
      * Removes an ariaDescribedBy from the association named {@link #getAriaDescribedBy ariaDescribedBy}.
      *
      * @returns The removed ariaDescribedBy or `null`
      */
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: int): ID | Null = js.native
    def removeAriaDescribedBy(
      /**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaDescribedBy(/**
      * The ariaDescribedBy to be removed or its index or ID
      */
    vAriaDescribedBy: ID): ID | Null = js.native
    
    /**
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: String): typings.openui5.sapMButtonMod.default | Null = js.native
    /**
      * @deprecated (since 1.28.0) - replaced by `items` aggregation
      *
      * Removes a button from the aggregation {@link #getButtons buttons}.
      *
      * @returns The removed button or `null`
      */
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: int): typings.openui5.sapMButtonMod.default | Null = js.native
    def removeButton(
      /**
      * The button to remove or its index or id
      */
    vButton: typings.openui5.sapMButtonMod.default
    ): typings.openui5.sapMButtonMod.default | Null = js.native
    
    /**
      * Removes an item from `items` aggregation.
      */
    def removeItem(/**
      * The item to be removed
      */
    oItem: typings.openui5.sapMSegmentedButtonItemMod.default): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Disables all the buttons in the SegmentedButton control. When disabled all the buttons look grey and
      * you cannot focus or click on them.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * Setter for association `selectedButton`.
      *
      * @returns `this` pointer for chaining
      */
    def setSelectedButton(): this.type = js.native
    def setSelectedButton(
      /**
      * New value for association `setSelectedButton` An sap.m.Button instance which becomes the new target of
      * this `selectedButton` association. Alternatively, the ID of an sap.m.Button instance may be given as
      * a string. If the value of null, undefined, or an empty string is provided the first item will be selected.
      */
    vButton: String
    ): this.type = js.native
    def setSelectedButton(
      /**
      * New value for association `setSelectedButton` An sap.m.Button instance which becomes the new target of
      * this `selectedButton` association. Alternatively, the ID of an sap.m.Button instance may be given as
      * a string. If the value of null, undefined, or an empty string is provided the first item will be selected.
      */
    vButton: typings.openui5.sapMButtonMod.default
    ): this.type = js.native
    
    /**
      * Setter for association `selectedItem`.
      *
      * @returns `this` pointer for chaining
      */
    def setSelectedItem(): this.type = js.native
    def setSelectedItem(
      /**
      * New value for association `setSelectedItem` An sap.m.SegmentedButtonItem instance which becomes the new
      * target of this `selectedItem` association. Alternatively, the ID of an `sap.m.SegmentedButtonItem` instance
      * may be given as a string. If the value of null, undefined, or an empty string is provided, the first
      * item will be selected.
      */
    vItem: String
    ): this.type = js.native
    def setSelectedItem(
      /**
      * New value for association `setSelectedItem` An sap.m.SegmentedButtonItem instance which becomes the new
      * target of this `selectedItem` association. Alternatively, the ID of an `sap.m.SegmentedButtonItem` instance
      * may be given as a string. If the value of null, undefined, or an empty string is provided, the first
      * item will be selected.
      */
    vItem: typings.openui5.sapMSegmentedButtonItemMod.default
    ): this.type = js.native
    
    /**
      * @SINCE 1.28
      *
      * Sets the `selectedKey` and is usable only when the control is initiated with the `items` aggregation.
      *
      * @returns `this` pointer for chaining
      */
    def setSelectedKey(/**
      * The key of the button to be selected
      */
    sKey: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the SegmentedButton control. If not set, it uses the minimum required width to make
      * all buttons inside of the same size (based on the biggest button).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.28
      *
      * Unbinds aggregation {@link #getItems items} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindItems(): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Unbinds property {@link #getSelectedKey selectedKey} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindSelectedKey(): this.type = js.native
  }
  
  trait SegmentedButtonSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Association to controls / IDs, which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / IDs, which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @deprecated (since 1.28.0) - replaced by `items` aggregation
      *
      * The buttons of the SegmentedButton control. The items set in this aggregation are used as an interface
      * for the buttons displayed by the control. Only the properties ID, icon, text, enabled and textDirections
      * of the Button control are evaluated. Setting other properties of the button will have no effect. Alternatively,
      * you can use the createButton method to add buttons.
      */
    var buttons: js.UndefOr[
        js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Disables all the buttons in the SegmentedButton control. When disabled all the buttons look grey and
      * you cannot focus or click on them.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.28
      *
      * Aggregation of items to be displayed. The items set in this aggregation are used as an interface for
      * the buttons displayed by the control. The "items" and "buttons" aggregations should NOT be used simultaneously
      * as it causes the control to work incorrectly. Note: If `width` is supplied in percetange to `SegmentedButtonItem`
      * instances and the sum of all percentages exeeds 100%, then the buttons display could overlap other elements
      * in the page.
      */
    var items: js.UndefOr[
        js.Array[typings.openui5.sapMSegmentedButtonItemMod.default] | typings.openui5.sapMSegmentedButtonItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.52) - replaced by `selectionChange` event
      *
      * Fires when the user selects a button, which returns the ID and button object.
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @deprecated (since 1.52) - replaced by `selectedItem` association
      *
      * A reference to the currently selected button control. By default or if the association is set to false
      * (null, undefined, "", false), the first button will be selected. If the association is set to an invalid
      * value (for example, an ID of a button that does not exist) the selection on the SegmentedButton will
      * be removed.
      */
    var selectedButton: js.UndefOr[typings.openui5.sapMButtonMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * A reference to the currently selected item control.
      */
    var selectedItem: js.UndefOr[typings.openui5.sapMSegmentedButtonItemMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.28.0
      *
      * Key of the selected item. If no item to this key is found in the items aggregation, no changes will apply.
      * Only the items aggregation is affected. If duplicate keys exist, the first item matching the key is used.
      */
    var selectedKey: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * Fires when the user selects an item, which returns the item object.
      */
    var selectionChange: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the width of the SegmentedButton control. If not set, it uses the minimum required width to make
      * all buttons inside of the same size (based on the biggest button).
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object SegmentedButtonSettings {
    
    inline def apply(): SegmentedButtonSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentedButtonSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SegmentedButtonSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setButtons(
        value: js.Array[typings.openui5.sapMButtonMod.default] | typings.openui5.sapMButtonMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: typings.openui5.sapMButtonMod.default*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setItems(
        value: js.Array[typings.openui5.sapMSegmentedButtonItemMod.default] | typings.openui5.sapMSegmentedButtonItemMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: typings.openui5.sapMSegmentedButtonItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelectedButton(value: typings.openui5.sapMButtonMod.default | String): Self = StObject.set(x, "selectedButton", value.asInstanceOf[js.Any])
      
      inline def setSelectedButtonUndefined: Self = StObject.set(x, "selectedButton", js.undefined)
      
      inline def setSelectedItem(value: typings.openui5.sapMSegmentedButtonItemMod.default | String): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setSelectedKey(value: String | PropertyBindingInfo): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      inline def setSelectionChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      inline def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
