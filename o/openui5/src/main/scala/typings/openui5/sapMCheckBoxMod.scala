package typings.openui5

import typings.openui5.anon.Selected
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IAccessKeySupport
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.ISemanticFormContent
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.ValueState
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMCheckBoxMod {
  
  @JSImport("sap/m/CheckBox", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `CheckBox`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/checkbox/ Check Box}
    */
  open class default () extends CheckBox {
    def this(/**
      * The Initial settings for the new control
      */
    mSettings: CheckBoxSettings) = this()
    def this(/**
      * The ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * The ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * The Initial settings for the new control
      */
    mSettings: CheckBoxSettings
    ) = this()
    def this(
      /**
      * The ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * The Initial settings for the new control
      */
    mSettings: CheckBoxSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_IAccessKeySupport: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_ISemanticFormContent: Boolean = js.native
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/CheckBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.CheckBox with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, CheckBox]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CheckBox],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.CheckBox.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait CheckBox
    extends typings.openui5.sapUiCoreControlMod.default
       with IFormContent
       with ISemanticFormContent
       with IAccessKeySupport
       with /* was: sap.m.IToolbarInteractiveControl */ Object {
    
    var __implements__sap_m_IToolbarInteractiveControl: Boolean = js.native
    
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
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.m.CheckBox`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.CheckBox` itself.
      *
      * Event is triggered when the control status is changed by the user by selecting or deselecting the checkbox.
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
      * Context object to call the event handler with. Defaults to this `sap.m.CheckBox` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:select select} event of this `sap.m.CheckBox`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.CheckBox` itself.
      *
      * Event is triggered when the control status is changed by the user by selecting or deselecting the checkbox.
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
      * Context object to call the event handler with. Defaults to this `sap.m.CheckBox` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:select select} event of this `sap.m.CheckBox`.
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:select select} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireSelect(): this.type = js.native
    def fireSelect(/**
      * Parameters to pass along with the event
      */
    mParameters: Selected): this.type = js.native
    
    /**
      * Gets current value of property {@link #getActiveHandling activeHandling}.
      *
      * Flag to switch on activeHandling, when it is switched off, there will be no visual changes on active
      * state. Default value is 'true'
      *
      * Default value is `true`.
      *
      * @returns Value of property `activeHandling`
      */
    def getActiveHandling(): Boolean = js.native
    
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
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getDisplayOnly displayOnly}.
      *
      * Determines whether the `CheckBox` is in display only state.
      *
      * When set to `true`, the `CheckBox` is not interactive, not editable, not focusable and not in the tab
      * chain. This setting is used for forms in review mode.
      *
      *  When the property `enabled` is set to `false` this property has no effect.
      *
      * Default value is `false`.
      *
      * @returns Value of property `displayOnly`
      */
    def getDisplayOnly(): Boolean = js.native
    
    /**
      * @SINCE 1.25
      *
      * Gets current value of property {@link #getEditable editable}.
      *
      * Specifies whether the user shall be allowed to edit the state of the checkbox
      *
      * Default value is `true`.
      *
      * @returns Value of property `editable`
      */
    def getEditable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Whether the `CheckBox` is enabled.
      *
      * **Note:** Disabled `CheckBox` is not interactive and is rendered differently according to the theme.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * The 'name' property to be used in the HTML code, for example for HTML forms that send data to the server
      * via submit.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * @SINCE 1.58
      *
      * Gets current value of property {@link #getPartiallySelected partiallySelected}.
      *
      * Determines whether the `CheckBox` is displayed as partially selected.
      *
      * **Note:** This property leads only to visual change of the checkbox and the state cannot be achieved
      * by user interaction. The visual state depends on the value of the `selected` property:
      * 	 - If `selected` = `true` and `partiallySelected` = `true`, the control is displayed as partially selected
      *
      * 	 - If `selected` = `true` and `partiallySelected` = `false`, the control is displayed as selected
      * 	 - If `selected` = `false`, the control is displayed as not selected regardless of what is set for `partiallySelected`
      *
      *
      * Default value is `false`.
      *
      * @returns Value of property `partiallySelected`
      */
    def getPartiallySelected(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Determines whether the `CheckBox` is selected (checked).
      *
      * When this property is set to `true`, the control is displayed as selected, unless the value of the `partiallySelected`
      * property is also set to `true`. In this case, the control is displayed as partially selected.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * @SINCE 1.22
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns the CheckBox`s tab index.
      *
      * @returns iTabIndex for Checkbox
      */
    def getTabIndex(): int = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the text displayed next to the checkbox
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Aligns the text of the checkbox. Available alignment settings are "Begin", "Center", "End", "Left", and
      * "Right".
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `textAlign`
      */
    def getTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Options for the text direction are RTL and LTR. Alternatively, the control can inherit the text direction
      * from its parent container.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * @SINCE 1.52
      *
      * Gets current value of property {@link #getUseEntireWidth useEntireWidth}.
      *
      * Indicates if the given width will be applied to the control as a whole or to its label only.
      *
      * **Note:** by default the width is set to the label
      *
      * Default value is `false`.
      *
      * @returns Value of property `useEntireWidth`
      */
    def getUseEntireWidth(): Boolean = js.native
    
    /**
      * @SINCE 1.38
      *
      * Gets current value of property {@link #getValueState valueState}.
      *
      * Accepts the core enumeration ValueState.type that supports 'None', 'Error', 'Warning', 'Success' and
      * 'Information'.
      *
      * Default value is `None`.
      *
      * @returns Value of property `valueState`
      */
    def getValueState(): ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Determines the total width of the control or the width of its label only, depending on the value of `useEntireWidth`.
      *
      * **Note:** When `useEntireWidth` is set to `true`, `width` is applied to the control as a whole (checkbox
      * and label). Otherwise, `width` is applied to the label only.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getWrapping wrapping}.
      *
      * Determines whether the label's text is wrapped.
      *
      * When set to `false` (default), the label's text is truncated with ellipsis at the end.
      *
      * Default value is `false`.
      *
      * @returns Value of property `wrapping`
      */
    def getWrapping(): Boolean = js.native
    
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
    
    /**
      * Sets a new value for property {@link #getActiveHandling activeHandling}.
      *
      * Flag to switch on activeHandling, when it is switched off, there will be no visual changes on active
      * state. Default value is 'true'
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setActiveHandling(): this.type = js.native
    def setActiveHandling(/**
      * New value for property `activeHandling`
      */
    bActiveHandling: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getDisplayOnly displayOnly}.
      *
      * Determines whether the `CheckBox` is in display only state.
      *
      * When set to `true`, the `CheckBox` is not interactive, not editable, not focusable and not in the tab
      * chain. This setting is used for forms in review mode.
      *
      *  When the property `enabled` is set to `false` this property has no effect.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayOnly(): this.type = js.native
    def setDisplayOnly(/**
      * New value for property `displayOnly`
      */
    bDisplayOnly: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.25
      *
      * Sets a new value for property {@link #getEditable editable}.
      *
      * Specifies whether the user shall be allowed to edit the state of the checkbox
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEditable(): this.type = js.native
    def setEditable(/**
      * New value for property `editable`
      */
    bEditable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Whether the `CheckBox` is enabled.
      *
      * **Note:** Disabled `CheckBox` is not interactive and is rendered differently according to the theme.
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
      * Sets a new value for property {@link #getName name}.
      *
      * The 'name' property to be used in the HTML code, for example for HTML forms that send data to the server
      * via submit.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(): this.type = js.native
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
    
    /**
      * @SINCE 1.58
      *
      * Sets a new value for property {@link #getPartiallySelected partiallySelected}.
      *
      * Determines whether the `CheckBox` is displayed as partially selected.
      *
      * **Note:** This property leads only to visual change of the checkbox and the state cannot be achieved
      * by user interaction. The visual state depends on the value of the `selected` property:
      * 	 - If `selected` = `true` and `partiallySelected` = `true`, the control is displayed as partially selected
      *
      * 	 - If `selected` = `true` and `partiallySelected` = `false`, the control is displayed as selected
      * 	 - If `selected` = `false`, the control is displayed as not selected regardless of what is set for `partiallySelected`
      *
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPartiallySelected(): this.type = js.native
    def setPartiallySelected(/**
      * New value for property `partiallySelected`
      */
    bPartiallySelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Determines whether the `CheckBox` is selected (checked).
      *
      * When this property is set to `true`, the control is displayed as selected, unless the value of the `partiallySelected`
      * property is also set to `true`. In this case, the control is displayed as partially selected.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.16
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets the tab index of the control
      *
      * @returns The `sap.m.CheckBox` instance
      */
    def setTabIndex(/**
      * The tab index should be greater than or equal -1
      */
    iTabIndex: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the text displayed next to the checkbox
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTextAlign textAlign}.
      *
      * Aligns the text of the checkbox. Available alignment settings are "Begin", "Center", "End", "Left", and
      * "Right".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Begin`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextAlign(): this.type = js.native
    def setTextAlign(
      /**
      * New value for property `textAlign`
      */
    sTextAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String
    ): this.type = js.native
    def setTextAlign(/**
      * New value for property `textAlign`
      */
    sTextAlign: TextAlign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTextDirection textDirection}.
      *
      * Options for the text direction are RTL and LTR. Alternatively, the control can inherit the text direction
      * from its parent container.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTextDirection(): this.type = js.native
    def setTextDirection(
      /**
      * New value for property `textDirection`
      */
    sTextDirection: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String
    ): this.type = js.native
    def setTextDirection(/**
      * New value for property `textDirection`
      */
    sTextDirection: TextDirection): this.type = js.native
    
    /**
      * @SINCE 1.52
      *
      * Sets a new value for property {@link #getUseEntireWidth useEntireWidth}.
      *
      * Indicates if the given width will be applied to the control as a whole or to its label only.
      *
      * **Note:** by default the width is set to the label
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseEntireWidth(): this.type = js.native
    def setUseEntireWidth(/**
      * New value for property `useEntireWidth`
      */
    bUseEntireWidth: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.38
      *
      * Sets a new value for property {@link #getValueState valueState}.
      *
      * Accepts the core enumeration ValueState.type that supports 'None', 'Error', 'Warning', 'Success' and
      * 'Information'.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValueState(): this.type = js.native
    def setValueState(
      /**
      * New value for property `valueState`
      */
    sValueState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String
    ): this.type = js.native
    def setValueState(/**
      * New value for property `valueState`
      */
    sValueState: ValueState): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Determines the total width of the control or the width of its label only, depending on the value of `useEntireWidth`.
      *
      * **Note:** When `useEntireWidth` is set to `true`, `width` is applied to the control as a whole (checkbox
      * and label). Otherwise, `width` is applied to the label only.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
    
    /**
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getWrapping wrapping}.
      *
      * Determines whether the label's text is wrapped.
      *
      * When set to `false` (default), the label's text is truncated with ellipsis at the end.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrapping(): this.type = js.native
    def setWrapping(/**
      * New value for property `wrapping`
      */
    bWrapping: Boolean): this.type = js.native
  }
  
  trait CheckBoxSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Flag to switch on activeHandling, when it is switched off, there will be no visual changes on active
      * state. Default value is 'true'
      */
    var activeHandling: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Association to controls / IDs which describe this control (see WAI-ARIA attribute aria-describedby).
      */
    var ariaDescribedBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Association to controls / IDs which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Determines whether the `CheckBox` is in display only state.
      *
      * When set to `true`, the `CheckBox` is not interactive, not editable, not focusable and not in the tab
      * chain. This setting is used for forms in review mode.
      *
      *  When the property `enabled` is set to `false` this property has no effect.
      */
    var displayOnly: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.25
      *
      * Specifies whether the user shall be allowed to edit the state of the checkbox
      */
    var editable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Whether the `CheckBox` is enabled.
      *
      * **Note:** Disabled `CheckBox` is not interactive and is rendered differently according to the theme.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The 'name' property to be used in the HTML code, for example for HTML forms that send data to the server
      * via submit.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.58
      *
      * Determines whether the `CheckBox` is displayed as partially selected.
      *
      * **Note:** This property leads only to visual change of the checkbox and the state cannot be achieved
      * by user interaction. The visual state depends on the value of the `selected` property:
      * 	 - If `selected` = `true` and `partiallySelected` = `true`, the control is displayed as partially selected
      *
      * 	 - If `selected` = `true` and `partiallySelected` = `false`, the control is displayed as selected
      * 	 - If `selected` = `false`, the control is displayed as not selected regardless of what is set for `partiallySelected`
      */
    var partiallySelected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is triggered when the control status is changed by the user by selecting or deselecting the checkbox.
      */
    var select: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines whether the `CheckBox` is selected (checked).
      *
      * When this property is set to `true`, the control is displayed as selected, unless the value of the `partiallySelected`
      * property is also set to `true`. In this case, the control is displayed as partially selected.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the text displayed next to the checkbox
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Aligns the text of the checkbox. Available alignment settings are "Begin", "Center", "End", "Left", and
      * "Right".
      */
    var textAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Options for the text direction are RTL and LTR. Alternatively, the control can inherit the text direction
      * from its parent container.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.52
      *
      * Indicates if the given width will be applied to the control as a whole or to its label only.
      *
      * **Note:** by default the width is set to the label
      */
    var useEntireWidth: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.38
      *
      * Accepts the core enumeration ValueState.type that supports 'None', 'Error', 'Warning', 'Success' and
      * 'Information'.
      */
    var valueState: js.UndefOr[
        ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the total width of the control or the width of its label only, depending on the value of `useEntireWidth`.
      *
      * **Note:** When `useEntireWidth` is set to `true`, `width` is applied to the control as a whole (checkbox
      * and label). Otherwise, `width` is applied to the label only.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.54
      *
      * Determines whether the label's text is wrapped.
      *
      * When set to `false` (default), the label's text is truncated with ellipsis at the end.
      */
    var wrapping: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object CheckBoxSettings {
    
    inline def apply(): CheckBoxSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckBoxSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckBoxSettings] (val x: Self) extends AnyVal {
      
      inline def setActiveHandling(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "activeHandling", value.asInstanceOf[js.Any])
      
      inline def setActiveHandlingUndefined: Self = StObject.set(x, "activeHandling", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setDisplayOnly(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayOnly", value.asInstanceOf[js.Any])
      
      inline def setDisplayOnlyUndefined: Self = StObject.set(x, "displayOnly", js.undefined)
      
      inline def setEditable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPartiallySelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "partiallySelected", value.asInstanceOf[js.Any])
      
      inline def setPartiallySelectedUndefined: Self = StObject.set(x, "partiallySelected", js.undefined)
      
      inline def setSelect(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(
        value: TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setUseEntireWidth(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "useEntireWidth", value.asInstanceOf[js.Any])
      
      inline def setUseEntireWidthUndefined: Self = StObject.set(x, "useEntireWidth", js.undefined)
      
      inline def setValueState(
        value: ValueState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "valueState", value.asInstanceOf[js.Any])
      
      inline def setValueStateUndefined: Self = StObject.set(x, "valueState", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapping(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "wrapping", value.asInstanceOf[js.Any])
      
      inline def setWrappingUndefined: Self = StObject.set(x, "wrapping", js.undefined)
    }
  }
}
