package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.TextViewColor
import typings.openui5.sapUiCommonsLibraryMod.TextViewDesign
import typings.openui5.sapUiCommonsLibraryMod.ToolbarItem
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.AccessibleRole
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.TextAlign
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsTextViewMod {
  
  @JSImport("sap/ui/commons/TextView", JSImport.Default)
  @js.native
  /**
    * Constructor for a new TextView.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TextView {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: TextViewSettings) = this()
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
    mSettings: TextViewSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: TextViewSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_commons_ToolbarItem: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/TextView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.TextView with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, TextView]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TextView],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.TextView.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TextView
    extends typings.openui5.sapUiCoreControlMod.default
       with ToolbarItem
       with IFormContent {
    
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
      * Binds property {@link #getText text} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindProperty ManagedObject.bindProperty} for a detailed description
      * of the possible properties of `oBindingInfo`
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindText(/**
      * The binding information
      */
    oBindingInfo: PropertyBindingInfo): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleRole accessibleRole}.
      *
      * The ARIA role for the control.
      *
      * @returns Value of property `accessibleRole`
      */
    def getAccessibleRole(): AccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleRole * / any */ String) = js.native
    
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
      * Gets current value of property {@link #getDesign design}.
      *
      * Defines the visual appearance of the control.
      *
      * Default value is `Standard`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): TextViewDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextViewDesign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Switches the enabled state of the control. When the control is disabled, it is greyed out and no longer
      * focusable.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHelpId helpId}.
      *
      * Unique identifier used for help services.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `helpId`
      */
    def getHelpId(): String = js.native
    
    /**
      * Gets current value of property {@link #getSemanticColor semanticColor}.
      *
      * Semantic color of the text View
      *
      * Default value is `Default`.
      *
      * @returns Value of property `semanticColor`
      */
    def getSemanticColor(): TextViewColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextViewColor * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Text to be displayed.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Gets current value of property {@link #getTextAlign textAlign}.
      *
      * Sets the horizontal alignment of the text.
      *
      * Default value is `Begin`.
      *
      * @returns Value of property `textAlign`
      */
    def getTextAlign(): TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getTextDirection textDirection}.
      *
      * Determines the text directionality. Available options are LTR and RTL. Alternatively, the control can
      * inherit the text direction from its parent control.
      *
      * Default value is `Inherit`.
      *
      * @returns Value of property `textDirection`
      */
    def getTextDirection(): TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Width of the TextView
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getWrapping wrapping}.
      *
      * Disabled automatic wrapping of the text.
      *
      * Default value is `true`.
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
    
    def setAccessibleRole(
      /**
      * New value for property `accessibleRole`
      */
    sAccessibleRole: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleRole * / any */ String
    ): this.type = js.native
    /**
      * Sets a new value for property {@link #getAccessibleRole accessibleRole}.
      *
      * The ARIA role for the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleRole(/**
      * New value for property `accessibleRole`
      */
    sAccessibleRole: AccessibleRole): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * Defines the visual appearance of the control.
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
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextViewDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: TextViewDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Switches the enabled state of the control. When the control is disabled, it is greyed out and no longer
      * focusable.
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
      * Sets a new value for property {@link #getHelpId helpId}.
      *
      * Unique identifier used for help services.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHelpId(): this.type = js.native
    def setHelpId(/**
      * New value for property `helpId`
      */
    sHelpId: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSemanticColor semanticColor}.
      *
      * Semantic color of the text View
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Default`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSemanticColor(): this.type = js.native
    def setSemanticColor(
      /**
      * New value for property `semanticColor`
      */
    sSemanticColor: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextViewColor * / any */ String
    ): this.type = js.native
    def setSemanticColor(/**
      * New value for property `semanticColor`
      */
    sSemanticColor: TextViewColor): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Text to be displayed.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
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
      * Sets the horizontal alignment of the text.
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
      * Determines the text directionality. Available options are LTR and RTL. Alternatively, the control can
      * inherit the text direction from its parent control.
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
      * Sets a new value for property {@link #getWidth width}.
      *
      * Width of the TextView
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
      * Sets a new value for property {@link #getWrapping wrapping}.
      *
      * Disabled automatic wrapping of the text.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWrapping(): this.type = js.native
    def setWrapping(/**
      * New value for property `wrapping`
      */
    bWrapping: Boolean): this.type = js.native
    
    /**
      * Unbinds property {@link #getText text} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindText(): this.type = js.native
  }
  
  trait TextViewSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The ARIA role for the control.
      */
    var accessibleRole: js.UndefOr[
        AccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleRole * / any */ String) | PropertyBindingInfo
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
      * Defines the visual appearance of the control.
      */
    var design: js.UndefOr[
        TextViewDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextViewDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Switches the enabled state of the control. When the control is disabled, it is greyed out and no longer
      * focusable.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Unique identifier used for help services.
      */
    var helpId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Semantic color of the text View
      */
    var semanticColor: js.UndefOr[
        TextViewColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextViewColor * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Text to be displayed.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Sets the horizontal alignment of the text.
      */
    var textAlign: js.UndefOr[
        TextAlign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextAlign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Determines the text directionality. Available options are LTR and RTL. Alternatively, the control can
      * inherit the text direction from its parent control.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Width of the TextView
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Disabled automatic wrapping of the text.
      */
    var wrapping: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object TextViewSettings {
    
    inline def apply(): TextViewSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextViewSettings]
    }
    
    extension [Self <: TextViewSettings](x: Self) {
      
      inline def setAccessibleRole(
        value: AccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleRole * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "accessibleRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibleRoleUndefined: Self = StObject.set(x, "accessibleRole", js.undefined)
      
      inline def setAriaDescribedBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescribedByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaDescribedBy", js.Array(value*))
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setDesign(
        value: TextViewDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextViewDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHelpId(value: String | PropertyBindingInfo): Self = StObject.set(x, "helpId", value.asInstanceOf[js.Any])
      
      inline def setHelpIdUndefined: Self = StObject.set(x, "helpId", js.undefined)
      
      inline def setSemanticColor(
        value: TextViewColor | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextViewColor * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "semanticColor", value.asInstanceOf[js.Any])
      
      inline def setSemanticColorUndefined: Self = StObject.set(x, "semanticColor", js.undefined)
      
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
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrapping(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "wrapping", value.asInstanceOf[js.Any])
      
      inline def setWrappingUndefined: Self = StObject.set(x, "wrapping", js.undefined)
    }
  }
}
