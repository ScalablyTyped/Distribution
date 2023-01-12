package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFProductSwitchItemMod {
  
  @JSImport("sap/f/ProductSwitchItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ProductSwitchItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ProductSwitchItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ProductSwitchItemSettings) = this()
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
    mSettings: ProductSwitchItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ProductSwitchItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/ProductSwitchItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.ProductSwitchItem with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, ProductSwitchItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ProductSwitchItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.ProductSwitchItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ProductSwitchItem
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Gets current value of property {@link #getSrc src}.
      *
      * Defines the icon to be displayed as graphical element within the `ProductSwitchItem`. It can be an icon
      * from the SAP icon font.
      *
      * @returns Value of property `src`
      */
    def getSrc(): URI = js.native
    
    /**
      * Gets current value of property {@link #getSubTitle subTitle}.
      *
      * Determines the subtitle of the `ProductSwitchItem`.
      *
      * @returns Value of property `subTitle`
      */
    def getSubTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getTarget target}.
      *
      * Specifies a target where the `targetSrc` content must be open.
      *
      * Options are the standard values for window.open() supported by browsers: `_self`, `_top`, `_blank`, `_parent`,
      * `_search`. Alternatively, a frame name can be entered.
      *
      * @returns Value of property `target`
      */
    def getTarget(): String = js.native
    
    /**
      * Gets current value of property {@link #getTargetSrc targetSrc}.
      *
      * Defines the `ProductSwitchItem` target URI. Supports standard hyperlink behavior.
      *
      * **Note:** Redirection is handled via application logic, by subscribing to the {@link sap.f.ProductSwitch#event:change
      * change} event of `sap.f.ProductSwitch`.
      *
      * @returns Value of property `targetSrc`
      */
    def getTargetSrc(): URI = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Determines the title of the `ProductSwitchItem`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Sets a new value for property {@link #getSrc src}.
      *
      * Defines the icon to be displayed as graphical element within the `ProductSwitchItem`. It can be an icon
      * from the SAP icon font.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSrc(): this.type = js.native
    def setSrc(/**
      * New value for property `src`
      */
    sSrc: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSubTitle subTitle}.
      *
      * Determines the subtitle of the `ProductSwitchItem`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSubTitle(): this.type = js.native
    def setSubTitle(/**
      * New value for property `subTitle`
      */
    sSubTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTarget target}.
      *
      * Specifies a target where the `targetSrc` content must be open.
      *
      * Options are the standard values for window.open() supported by browsers: `_self`, `_top`, `_blank`, `_parent`,
      * `_search`. Alternatively, a frame name can be entered.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTarget(): this.type = js.native
    def setTarget(/**
      * New value for property `target`
      */
    sTarget: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTargetSrc targetSrc}.
      *
      * Defines the `ProductSwitchItem` target URI. Supports standard hyperlink behavior.
      *
      * **Note:** Redirection is handled via application logic, by subscribing to the {@link sap.f.ProductSwitch#event:change
      * change} event of `sap.f.ProductSwitch`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTargetSrc(): this.type = js.native
    def setTargetSrc(/**
      * New value for property `targetSrc`
      */
    sTargetSrc: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Determines the title of the `ProductSwitchItem`.
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
  }
  
  trait ProductSwitchItemSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the icon to be displayed as graphical element within the `ProductSwitchItem`. It can be an icon
      * from the SAP icon font.
      */
    var src: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the subtitle of the `ProductSwitchItem`.
      */
    var subTitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies a target where the `targetSrc` content must be open.
      *
      * Options are the standard values for window.open() supported by browsers: `_self`, `_top`, `_blank`, `_parent`,
      * `_search`. Alternatively, a frame name can be entered.
      */
    var target: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the `ProductSwitchItem` target URI. Supports standard hyperlink behavior.
      *
      * **Note:** Redirection is handled via application logic, by subscribing to the {@link sap.f.ProductSwitch#event:change
      * change} event of `sap.f.ProductSwitch`.
      */
    var targetSrc: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Determines the title of the `ProductSwitchItem`.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ProductSwitchItemSettings {
    
    inline def apply(): ProductSwitchItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProductSwitchItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProductSwitchItemSettings] (val x: Self) extends AnyVal {
      
      inline def setSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setSubTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
      
      inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
      
      inline def setTarget(value: String | PropertyBindingInfo): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "targetSrc", value.asInstanceOf[js.Any])
      
      inline def setTargetSrcUndefined: Self = StObject.set(x, "targetSrc", js.undefined)
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
