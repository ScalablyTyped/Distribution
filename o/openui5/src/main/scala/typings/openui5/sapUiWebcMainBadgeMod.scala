package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcMainLibraryMod.IIcon
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcMainBadgeMod {
  
  @JSImport("sap/ui/webc/main/Badge", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `Badge`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Badge {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BadgeSettings) = this()
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
    mSettings: BadgeSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BadgeSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/main/Badge", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.main.Badge with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.webc.common.WebComponent.extend}.
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
    oClassInfo: ClassInfo[T, Badge]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Badge],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.main.Badge.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait Badge
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default {
    
    /**
      * Destroys the icon in the aggregation {@link #getIcon icon}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyIcon(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getColorScheme colorScheme}.
      *
      * Defines the color scheme of the component. There are 10 predefined schemes. Each scheme applies different
      * values for the `background-color` and `border-color`. To use one you can set a number from `"1"` to `"10"`.
      * The `colorScheme` `"1"` will be set by default.
      *
      *  **Note:** Color schemes have no visual representation in High Contrast Black (sap_belize_hcb) theme.
      *
      * Default value is `"1"`.
      *
      * @returns Value of property `colorScheme`
      */
    def getColorScheme(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getIcon icon}.
      *
      * Defines the icon to be displayed in the component.
      */
    def getIcon(): IIcon = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the content of the control
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Sets a new value for property {@link #getColorScheme colorScheme}.
      *
      * Defines the color scheme of the component. There are 10 predefined schemes. Each scheme applies different
      * values for the `background-color` and `border-color`. To use one you can set a number from `"1"` to `"10"`.
      * The `colorScheme` `"1"` will be set by default.
      *
      *  **Note:** Color schemes have no visual representation in High Contrast Black (sap_belize_hcb) theme.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"1"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setColorScheme(): this.type = js.native
    def setColorScheme(/**
      * New value for property `colorScheme`
      */
    sColorScheme: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getIcon icon}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(/**
      * The icon to set
      */
    oIcon: IIcon): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the content of the control
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
  }
  
  trait BadgeSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the color scheme of the component. There are 10 predefined schemes. Each scheme applies different
      * values for the `background-color` and `border-color`. To use one you can set a number from `"1"` to `"10"`.
      * The `colorScheme` `"1"` will be set by default.
      *
      *  **Note:** Color schemes have no visual representation in High Contrast Black (sap_belize_hcb) theme.
      */
    var colorScheme: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the icon to be displayed in the component.
      */
    var icon: js.UndefOr[IIcon] = js.undefined
    
    /**
      * Defines the content of the control
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object BadgeSettings {
    
    inline def apply(): BadgeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeSettings]
    }
    
    extension [Self <: BadgeSettings](x: Self) {
      
      inline def setColorScheme(value: String | PropertyBindingInfo): Self = StObject.set(x, "colorScheme", value.asInstanceOf[js.Any])
      
      inline def setColorSchemeUndefined: Self = StObject.set(x, "colorScheme", js.undefined)
      
      inline def setIcon(value: IIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
