package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMLightBoxItemMod {
  
  @JSImport("sap/m/LightBoxItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new LightBoxItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends LightBoxItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: LightBoxItemSettings) = this()
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
    mSettings: LightBoxItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: LightBoxItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/LightBoxItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.LightBoxItem with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, LightBoxItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, LightBoxItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.LightBoxItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait LightBoxItem
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Gets current value of property {@link #getAlt alt}.
      *
      * Alt value for the image.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `alt`
      */
    def getAlt(): String = js.native
    
    /**
      * Gets current value of property {@link #getImageSrc imageSrc}.
      *
      * Source for the image. This property is mandatory. If not set the popup will not open.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `imageSrc`
      */
    def getImageSrc(): URI = js.native
    
    /**
      * Gets current value of property {@link #getSubtitle subtitle}.
      *
      * Subtitle text for the image.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `subtitle`
      */
    def getSubtitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Title text for the image. This property is mandatory.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Sets the alt text of the image.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def setAlt(/**
      * The alt text
      */
    alt: String): this.type = js.native
    
    /**
      * Sets the source of the image.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def setImageSrc(/**
      * The image URI
      */
    sImageSrc: URI): this.type = js.native
    
    /**
      * Sets the subtitle of the image.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def setSubtitle(/**
      * The image subtitle
      */
    sSubtitleText: String): this.type = js.native
    
    /**
      * Sets the title of the image.
      *
      * @returns Pointer to the control instance for chaining.
      */
    def setTitle(/**
      * The image title
      */
    title: String): this.type = js.native
  }
  
  trait LightBoxItemSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Alt value for the image.
      */
    var alt: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Source for the image. This property is mandatory. If not set the popup will not open.
      */
    var imageSrc: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Subtitle text for the image.
      */
    var subtitle: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Title text for the image. This property is mandatory.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object LightBoxItemSettings {
    
    inline def apply(): LightBoxItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LightBoxItemSettings]
    }
    
    extension [Self <: LightBoxItemSettings](x: Self) {
      
      inline def setAlt(value: String | PropertyBindingInfo): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setImageSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      inline def setImageSrcUndefined: Self = StObject.set(x, "imageSrc", js.undefined)
      
      inline def setSubtitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
