package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreTooltipBaseMod.TooltipBaseSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsRichTooltipMod {
  
  @JSImport("sap/ui/commons/RichTooltip", JSImport.Default)
  @js.native
  /**
    * Constructor for a new RichTooltip.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends RichTooltip {
    def this(/**
      * initial settings for the new control
      */
    mSettings: RichTooltipSettings) = this()
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
    mSettings: RichTooltipSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: RichTooltipSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/RichTooltip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.RichTooltip with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.TooltipBase.extend}.
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
    oClassInfo: ClassInfo[T, RichTooltip]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, RichTooltip],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.RichTooltip.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait RichTooltip
    extends typings.openui5.sapUiCoreTooltipBaseMod.default {
    
    /**
      * @SINCE 1.11.1
      *
      * Gets current value of property {@link #getImageAltText imageAltText}.
      *
      * This is the alt text for the image
      *
      * @returns Value of property `imageAltText`
      */
    def getImageAltText(): String = js.native
    
    /**
      * Gets current value of property {@link #getImageSrc imageSrc}.
      *
      * If RichTooltip contains an image, this property is used to define the source path.
      *
      * @returns Value of property `imageSrc`
      */
    def getImageSrc(): URI = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Tool tip title to be displayed in the header.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * This returns the previously set text. Since a FormattedTextView is used for rendering and stuff the corresponding
      * property of the FormattedTextView is being read and returned. If no text was set an empty string is being
      * returned.
      *
      * @returns the ValueState text that was previously set.
      */
    def getValueStateText(): String = js.native
    
    /**
      * Calculates the height of the RichTooltip to set a proper min-height. Additionally the ARIA attributes
      * are set to the corresponding elements.
      */
    def onAfterRendering(): Unit = js.native
    
    /**
      * @SINCE 1.11.1
      *
      * Sets a new value for property {@link #getImageAltText imageAltText}.
      *
      * This is the alt text for the image
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setImageAltText(): this.type = js.native
    def setImageAltText(/**
      * New value for property `imageAltText`
      */
    sImageAltText: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getImageSrc imageSrc}.
      *
      * If RichTooltip contains an image, this property is used to define the source path.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setImageSrc(): this.type = js.native
    def setImageSrc(/**
      * New value for property `imageSrc`
      */
    sImageSrc: URI): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Tool tip title to be displayed in the header.
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
      * This sets an individual text for the ValueState of the parent element of the RichTooltip.
      *
      * @returns Returns `this` to facilitate method chaining.
      */
    def setValueStateText(/**
      * the text that should be shown as individual ValueState text
      */
    sText: String): this.type = js.native
  }
  
  trait RichTooltipSettings
    extends StObject
       with TooltipBaseSettings {
    
    /**
      * @SINCE 1.11.1
      *
      * This is the alt text for the image
      */
    var imageAltText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * If RichTooltip contains an image, this property is used to define the source path.
      */
    var imageSrc: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Tool tip title to be displayed in the header.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.11.1
      *
      * This property is an individual text that will be used instead of the default ValueState text
      */
    var valueStateText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object RichTooltipSettings {
    
    inline def apply(): RichTooltipSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RichTooltipSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RichTooltipSettings] (val x: Self) extends AnyVal {
      
      inline def setImageAltText(value: String | PropertyBindingInfo): Self = StObject.set(x, "imageAltText", value.asInstanceOf[js.Any])
      
      inline def setImageAltTextUndefined: Self = StObject.set(x, "imageAltText", js.undefined)
      
      inline def setImageSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      inline def setImageSrcUndefined: Self = StObject.set(x, "imageSrc", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValueStateText(value: String | PropertyBindingInfo): Self = StObject.set(x, "valueStateText", value.asInstanceOf[js.Any])
      
      inline def setValueStateTextUndefined: Self = StObject.set(x, "valueStateText", js.undefined)
    }
  }
}
