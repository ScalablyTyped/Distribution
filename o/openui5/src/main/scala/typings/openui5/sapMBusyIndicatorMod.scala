package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.TextDirection
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMBusyIndicatorMod {
  
  @JSImport("sap/m/BusyIndicator", JSImport.Default)
  @js.native
  /**
    * Constructor for a new BusyIndicator.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/busy-indicator/ Busy Indicator}
    */
  open class default () extends BusyIndicator {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BusyIndicatorSettings) = this()
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
    mSettings: BusyIndicatorSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BusyIndicatorSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/BusyIndicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.BusyIndicator with name `sClassName` and enriches it with the information
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
    oClassInfo: ClassInfo[T, BusyIndicator]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BusyIndicator],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.BusyIndicator.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BusyIndicator
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @since 1.27.0
      *
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * @since 1.27.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * Gets current value of property {@link #getCustomIcon customIcon}.
      *
      * Icon URL if an icon is used as the busy indicator.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `customIcon`
      */
    def getCustomIcon(): URI = js.native
    
    /**
      * Gets current value of property {@link #getCustomIconDensityAware customIconDensityAware}.
      *
      * If this is set to false, the src image will be loaded directly without attempting to fetch the density
      * perfect image for high density device. By default, this is set to true but then one or more requests
      * are sent to the server, trying to get the density perfect version of the specified image. If bandwidth
      * is the key for the application, set this value to false.
      *
      * Default value is `true`.
      *
      * @returns Value of property `customIconDensityAware`
      */
    def getCustomIconDensityAware(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getCustomIconHeight customIconHeight}.
      *
      * Height of the provided icon. By default 44px are used.
      *
      * Default value is `"44px"`.
      *
      * @returns Value of property `customIconHeight`
      */
    def getCustomIconHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getCustomIconRotationSpeed customIconRotationSpeed}.
      *
      * Defines the rotation speed of the given image. If a .gif is used, the speed has to be set to 0. The unit
      * is in ms. **Note:** Values are considered valid when greater than or equal to 0. If invalid value is
      * provided the speed defaults to 0.
      *
      * Default value is `1000`.
      *
      * @returns Value of property `customIconRotationSpeed`
      */
    def getCustomIconRotationSpeed(): int = js.native
    
    /**
      * Gets current value of property {@link #getCustomIconWidth customIconWidth}.
      *
      * Width of the provided icon. By default 44px are used.
      *
      * Default value is `"44px"`.
      *
      * @returns Value of property `customIconWidth`
      */
    def getCustomIconWidth(): CSSSize = js.native
    
    /**
      * @deprecated (since 1.32.1)
      *
      * Gets current value of property {@link #getDesign design}.
      *
      * Setting this property will not have any effect on the appearance of the BusyIndicator in versions greater
      * than or equal to 1.32.1
      *
      * Default value is `"auto"`.
      *
      * @returns Value of property `design`
      */
    def getDesign(): String = js.native
    
    /**
      * Gets current value of property {@link #getSize size}.
      *
      * Defines the size of the busy indicator. The animation consists of three circles, each of which will be
      * this size. Therefore the total width of the control amounts to three times the given size.
      *
      * Default value is `"1rem"`.
      *
      * @returns Value of property `size`
      */
    def getSize(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines text to be displayed below the busy indicator. It can be used to inform the user of the current
      * operation.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
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
      * @since 1.27.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @since 1.27.0
      *
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
      * Sets a new value for property {@link #getCustomIcon customIcon}.
      *
      * Icon URL if an icon is used as the busy indicator.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomIcon(): this.type = js.native
    def setCustomIcon(/**
      * New value for property `customIcon`
      */
    sCustomIcon: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCustomIconDensityAware customIconDensityAware}.
      *
      * If this is set to false, the src image will be loaded directly without attempting to fetch the density
      * perfect image for high density device. By default, this is set to true but then one or more requests
      * are sent to the server, trying to get the density perfect version of the specified image. If bandwidth
      * is the key for the application, set this value to false.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomIconDensityAware(): this.type = js.native
    def setCustomIconDensityAware(/**
      * New value for property `customIconDensityAware`
      */
    bCustomIconDensityAware: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCustomIconHeight customIconHeight}.
      *
      * Height of the provided icon. By default 44px are used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"44px"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomIconHeight(): this.type = js.native
    def setCustomIconHeight(/**
      * New value for property `customIconHeight`
      */
    sCustomIconHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCustomIconRotationSpeed customIconRotationSpeed}.
      *
      * Defines the rotation speed of the given image. If a .gif is used, the speed has to be set to 0. The unit
      * is in ms. **Note:** Values are considered valid when greater than or equal to 0. If invalid value is
      * provided the speed defaults to 0.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1000`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomIconRotationSpeed(): this.type = js.native
    def setCustomIconRotationSpeed(/**
      * New value for property `customIconRotationSpeed`
      */
    iCustomIconRotationSpeed: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getCustomIconWidth customIconWidth}.
      *
      * Width of the provided icon. By default 44px are used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"44px"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCustomIconWidth(): this.type = js.native
    def setCustomIconWidth(/**
      * New value for property `customIconWidth`
      */
    sCustomIconWidth: CSSSize): this.type = js.native
    
    /**
      * @deprecated (since 1.32.1)
      *
      * Sets a new value for property {@link #getDesign design}.
      *
      * Setting this property will not have any effect on the appearance of the BusyIndicator in versions greater
      * than or equal to 1.32.1
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"auto"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSize size}.
      *
      * Defines the size of the busy indicator. The animation consists of three circles, each of which will be
      * this size. Therefore the total width of the control amounts to three times the given size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"1rem"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSize(): this.type = js.native
    def setSize(/**
      * New value for property `size`
      */
    sSize: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines text to be displayed below the busy indicator. It can be used to inform the user of the current
      * operation.
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
  }
  
  trait BusyIndicatorSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @since 1.27.0
      *
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Icon URL if an icon is used as the busy indicator.
      */
    var customIcon: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * If this is set to false, the src image will be loaded directly without attempting to fetch the density
      * perfect image for high density device. By default, this is set to true but then one or more requests
      * are sent to the server, trying to get the density perfect version of the specified image. If bandwidth
      * is the key for the application, set this value to false.
      */
    var customIconDensityAware: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Height of the provided icon. By default 44px are used.
      */
    var customIconHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the rotation speed of the given image. If a .gif is used, the speed has to be set to 0. The unit
      * is in ms. **Note:** Values are considered valid when greater than or equal to 0. If invalid value is
      * provided the speed defaults to 0.
      */
    var customIconRotationSpeed: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Width of the provided icon. By default 44px are used.
      */
    var customIconWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.32.1)
      *
      * Setting this property will not have any effect on the appearance of the BusyIndicator in versions greater
      * than or equal to 1.32.1
      */
    var design: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the size of the busy indicator. The animation consists of three circles, each of which will be
      * this size. Therefore the total width of the control amounts to three times the given size.
      */
    var size: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines text to be displayed below the busy indicator. It can be used to inform the user of the current
      * operation.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Options for the text direction are RTL and LTR. Alternatively, the control can inherit the text direction
      * from its parent container.
      */
    var textDirection: js.UndefOr[
        TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object BusyIndicatorSettings {
    
    inline def apply(): BusyIndicatorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BusyIndicatorSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BusyIndicatorSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setCustomIcon(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customIcon", value.asInstanceOf[js.Any])
      
      inline def setCustomIconDensityAware(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customIconDensityAware", value.asInstanceOf[js.Any])
      
      inline def setCustomIconDensityAwareUndefined: Self = StObject.set(x, "customIconDensityAware", js.undefined)
      
      inline def setCustomIconHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customIconHeight", value.asInstanceOf[js.Any])
      
      inline def setCustomIconHeightUndefined: Self = StObject.set(x, "customIconHeight", js.undefined)
      
      inline def setCustomIconRotationSpeed(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customIconRotationSpeed", value.asInstanceOf[js.Any])
      
      inline def setCustomIconRotationSpeedUndefined: Self = StObject.set(x, "customIconRotationSpeed", js.undefined)
      
      inline def setCustomIconUndefined: Self = StObject.set(x, "customIcon", js.undefined)
      
      inline def setCustomIconWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "customIconWidth", value.asInstanceOf[js.Any])
      
      inline def setCustomIconWidthUndefined: Self = StObject.set(x, "customIconWidth", js.undefined)
      
      inline def setDesign(value: String | PropertyBindingInfo): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setSize(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextDirection(
        value: TextDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TextDirection * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "textDirection", value.asInstanceOf[js.Any])
      
      inline def setTextDirectionUndefined: Self = StObject.set(x, "textDirection", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
