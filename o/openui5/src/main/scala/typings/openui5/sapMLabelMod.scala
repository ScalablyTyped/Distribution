package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IOverflowToolbarContent
import typings.openui5.sapMLibraryMod.LabelDesign
import typings.openui5.sapMLibraryMod.OverflowToolbarConfig
import typings.openui5.sapMLibraryMod.WrappingType
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IAccessKeySupport
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IShrinkable
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.VerticalAlign
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMLabelMod {
  
  @JSImport("sap/m/Label", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Label.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/label/ Label}
    */
  open class default () extends Label {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: LabelSettings) = this()
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
    mSettings: LabelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: LabelSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IOverflowToolbarContent: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IAccessKeySupport: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IShrinkable: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_Label: Boolean = js.native
    
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
    
    @JSImport("sap/m/Label", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.Label with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, Label]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Label],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.Label.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Label
    extends typings.openui5.sapUiCoreControlMod.default
       with typings.openui5.sapUiCoreLibraryMod.Label
       with IShrinkable
       with IAccessKeySupport
       with IOverflowToolbarContent
       with /* was: sap.m.IToolbarInteractiveControl */ Object {
    
    var __implements__sap_m_IToolbarInteractiveControl: Boolean = js.native
    
    /**
      * Gets current value of property {@link #getDesign design}.
      *
      * Sets the design of a Label to either Standard or Bold.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): LabelDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LabelDesign * / any */ String) = js.native
    
    /**
      * @SINCE 1.50.0
      *
      * Gets current value of property {@link #getDisplayOnly displayOnly}.
      *
      * Determines if the label is in displayOnly mode.
      *
      * **Note:** This property should be used only in Form controls in preview mode.
      *
      * Default value is `false`.
      *
      * @returns Value of property `displayOnly`
      */
    def getDisplayOnly(): Boolean = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getLabelFor labelFor}, or `null`.
      */
    def getLabelFor(): ID = js.native
    
    /**
      * Enables the `sap.m.Label` to move inside the sap.m.OverflowToolbar. Required by the {@link sap.m.IOverflowToolbarContent}
      * interface.
      *
      * @returns Configuration information for the `sap.m.IOverflowToolbarContent` interface.
      */
    def getOverflowToolbarConfig(): OverflowToolbarConfig = js.native
    
    /**
      * Gets current value of property {@link #getRequired required}.
      *
      * Indicates that user input is required for input control labeled by the sap.m.Label. When the property
      * is set to true and associated input field is empty an asterisk character is added to the label text.
      *
      * Default value is `false`.
      *
      * @returns Value of property `required`
      */
    def getRequired(): Boolean = js.native
    
    /**
      * @SINCE 1.98
      *
      * Gets current value of property {@link #getShowColon showColon}.
      *
      * Defines whether a colon (:) character is added to the label.
      *
      * **Note:** By default when the `Label` is in the `sap.ui.layout.form.Form` and `sap.ui.layout.form.SimpleForm`
      * controls the colon (:) character is displayed automatically regardless of the value of the `showColon`
      * property.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showColon`
      */
    def getShowColon(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Determines the Label text to be displayed.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Available alignment settings are "Begin", "Center", "End", "Left", and "Right".
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
      * @SINCE 1.54
      *
      * Gets current value of property {@link #getVAlign vAlign}.
      *
      * Specifies the vertical alignment of the `Label` related to the tallest and lowest element on the line.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `vAlign`
      */
    def getVAlign(): VerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Determines the width of the label.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * @SINCE 1.50
      *
      * Gets current value of property {@link #getWrapping wrapping}.
      *
      * Determines the wrapping of the text within the `Label`. If set to true the `Label` will wrap, when set
      * to false the `Label` will be truncated and replaced with ellipsis which is the default behavior.
      *
      * Default value is `false`.
      *
      * @returns Value of property `wrapping`
      */
    def getWrapping(): Boolean = js.native
    
    /**
      * @SINCE 1.60
      *
      * Gets current value of property {@link #getWrappingType wrappingType}.
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * **Note:** This property takes effect only when the `wrapping` property is set to `true`.
      *
      * Default value is `Normal`.
      *
      * @returns Value of property `wrappingType`
      */
    def getWrappingType(): WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * Sets the design of a Label to either Standard or Bold.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Standard`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LabelDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: LabelDesign): this.type = js.native
    
    /**
      * @SINCE 1.50.0
      *
      * Sets a new value for property {@link #getDisplayOnly displayOnly}.
      *
      * Determines if the label is in displayOnly mode.
      *
      * **Note:** This property should be used only in Form controls in preview mode.
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
    
    def setLabelFor(
      /**
      * ID of an element which becomes the new target of this labelFor association; alternatively, an element
      * instance may be given
      */
    oLabelFor: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getLabelFor labelFor}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabelFor(
      /**
      * ID of an element which becomes the new target of this labelFor association; alternatively, an element
      * instance may be given
      */
    oLabelFor: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRequired required}.
      *
      * Indicates that user input is required for input control labeled by the sap.m.Label. When the property
      * is set to true and associated input field is empty an asterisk character is added to the label text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRequired(): this.type = js.native
    def setRequired(/**
      * New value for property `required`
      */
    bRequired: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.98
      *
      * Sets a new value for property {@link #getShowColon showColon}.
      *
      * Defines whether a colon (:) character is added to the label.
      *
      * **Note:** By default when the `Label` is in the `sap.ui.layout.form.Form` and `sap.ui.layout.form.SimpleForm`
      * controls the colon (:) character is displayed automatically regardless of the value of the `showColon`
      * property.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowColon(): this.type = js.native
    def setShowColon(/**
      * New value for property `showColon`
      */
    bShowColon: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Determines the Label text to be displayed.
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
      * Available alignment settings are "Begin", "Center", "End", "Left", and "Right".
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
      * @SINCE 1.54
      *
      * Sets a new value for property {@link #getVAlign vAlign}.
      *
      * Specifies the vertical alignment of the `Label` related to the tallest and lowest element on the line.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inherit`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVAlign(): this.type = js.native
    def setVAlign(
      /**
      * New value for property `vAlign`
      */
    sVAlign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlign * / any */ String
    ): this.type = js.native
    def setVAlign(/**
      * New value for property `vAlign`
      */
    sVAlign: VerticalAlign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Determines the width of the label.
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
      * @SINCE 1.50
      *
      * Sets a new value for property {@link #getWrapping wrapping}.
      *
      * Determines the wrapping of the text within the `Label`. If set to true the `Label` will wrap, when set
      * to false the `Label` will be truncated and replaced with ellipsis which is the default behavior.
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
    
    /**
      * @SINCE 1.60
      *
      * Sets a new value for property {@link #getWrappingType wrappingType}.
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * **Note:** This property takes effect only when the `wrapping` property is set to `true`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Normal`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrappingType(): this.type = js.native
    def setWrappingType(
      /**
      * New value for property `wrappingType`
      */
    sWrappingType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String
    ): this.type = js.native
    def setWrappingType(/**
      * New value for property `wrappingType`
      */
    sWrappingType: WrappingType): this.type = js.native
  }
  
  trait LabelSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Sets the design of a Label to either Standard or Bold.
      */
    var design: js.UndefOr[
        LabelDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LabelDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * @SINCE 1.50.0
      *
      * Determines if the label is in displayOnly mode.
      *
      * **Note:** This property should be used only in Form controls in preview mode.
      */
    var displayOnly: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Association to the labelled control. By default, the label sets the for attribute to the ID of the labelled
      * control. This can be changed by implementing the function getIdForLabel on the labelled control.
      */
    var labelFor: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * Indicates that user input is required for input control labeled by the sap.m.Label. When the property
      * is set to true and associated input field is empty an asterisk character is added to the label text.
      */
    var required: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.98
      *
      * Defines whether a colon (:) character is added to the label.
      *
      * **Note:** By default when the `Label` is in the `sap.ui.layout.form.Form` and `sap.ui.layout.form.SimpleForm`
      * controls the colon (:) character is displayed automatically regardless of the value of the `showColon`
      * property.
      */
    var showColon: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the Label text to be displayed.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Available alignment settings are "Begin", "Center", "End", "Left", and "Right".
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
      * @SINCE 1.54
      *
      * Specifies the vertical alignment of the `Label` related to the tallest and lowest element on the line.
      */
    var vAlign: js.UndefOr[
        VerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the width of the label.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.50
      *
      * Determines the wrapping of the text within the `Label`. If set to true the `Label` will wrap, when set
      * to false the `Label` will be truncated and replaced with ellipsis which is the default behavior.
      */
    var wrapping: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.60
      *
      * Defines the type of text wrapping to be used (hyphenated or normal).
      *
      * **Note:** This property takes effect only when the `wrapping` property is set to `true`.
      */
    var wrappingType: js.UndefOr[
        WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object LabelSettings {
    
    inline def apply(): LabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LabelSettings] (val x: Self) extends AnyVal {
      
      inline def setDesign(
        value: LabelDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LabelDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setDisplayOnly(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayOnly", value.asInstanceOf[js.Any])
      
      inline def setDisplayOnlyUndefined: Self = StObject.set(x, "displayOnly", js.undefined)
      
      inline def setLabelFor(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "labelFor", value.asInstanceOf[js.Any])
      
      inline def setLabelForUndefined: Self = StObject.set(x, "labelFor", js.undefined)
      
      inline def setRequired(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setShowColon(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showColon", value.asInstanceOf[js.Any])
      
      inline def setShowColonUndefined: Self = StObject.set(x, "showColon", js.undefined)
      
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
      
      inline def setVAlign(
        value: VerticalAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof VerticalAlign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "vAlign", value.asInstanceOf[js.Any])
      
      inline def setVAlignUndefined: Self = StObject.set(x, "vAlign", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapping(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "wrapping", value.asInstanceOf[js.Any])
      
      inline def setWrappingType(
        value: WrappingType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappingType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "wrappingType", value.asInstanceOf[js.Any])
      
      inline def setWrappingTypeUndefined: Self = StObject.set(x, "wrappingType", js.undefined)
      
      inline def setWrappingUndefined: Self = StObject.set(x, "wrapping", js.undefined)
    }
  }
}
