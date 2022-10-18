package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.FormattedTextViewControl
import typings.openui5.sapUiCommonsLibraryMod.ToolbarItem
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.IFormContent
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsImageMod {
  
  @JSImport("sap/ui/commons/Image", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Image.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Image {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ImageSettings) = this()
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
    mSettings: ImageSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ImageSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_commons_FormattedTextViewControl: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_commons_ToolbarItem: Boolean = js.native
    
    /* CompleteClass */
    var __implements__sap_ui_core_IFormContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Image", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Image with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, Image]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Image],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Image.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Image
    extends typings.openui5.sapUiCoreControlMod.default
       with ToolbarItem
       with FormattedTextViewControl
       with IFormContent {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.commons.Image`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Image` itself.
      *
      * Event is fired when the user clicks on the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Image` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.ui.commons.Image`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Image` itself.
      *
      * Event is fired when the user clicks on the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
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
    def attachPress(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Image` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.ui.commons.Image`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPress(
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
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAlt alt}.
      *
      * The alternative text that is displayed in case the Image is not available, or cannot be displayed. If
      * the image is set to decorative this property is ignored.
      *
      * @returns Value of property `alt`
      */
    def getAlt(): String = js.native
    
    /**
      * Gets current value of property {@link #getDecorative decorative}.
      *
      * A decorative image is included for design reasons. Accessibility tools will ignore decorative images.
      * Note: If the Image has an image map (useMap is set), this property will be overridden (the image will
      * not be rendered as decorative). A decorative image has no ALT attribute, so the Alt property is ignored
      * if the image is decorative.
      *
      * Default value is `true`.
      *
      * @returns Value of property `decorative`
      */
    def getDecorative(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * When the empty value is kept, the original size is not changed. It is also possible to make settings
      * for width or height only, the overall size is maintained then, considering the aspect ratio.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getSrc src}.
      *
      * Relative or absolute path to URL where the image file is stored.
      *
      * @returns Value of property `src`
      */
    def getSrc(): URI = js.native
    
    /**
      * Gets current value of property {@link #getUseMap useMap}.
      *
      * The name of the image map that defines the clickable areas
      *
      * @returns Value of property `useMap`
      */
    def getUseMap(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * When the empty value is kept, the original size is not changed. It is also possible to make settings
      * for width or height only, the overall size is maintained then, considering the aspect ratio.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getAlt alt}.
      *
      * The alternative text that is displayed in case the Image is not available, or cannot be displayed. If
      * the image is set to decorative this property is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAlt(): this.type = js.native
    def setAlt(/**
      * New value for property `alt`
      */
    sAlt: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDecorative decorative}.
      *
      * A decorative image is included for design reasons. Accessibility tools will ignore decorative images.
      * Note: If the Image has an image map (useMap is set), this property will be overridden (the image will
      * not be rendered as decorative). A decorative image has no ALT attribute, so the Alt property is ignored
      * if the image is decorative.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDecorative(): this.type = js.native
    def setDecorative(/**
      * New value for property `decorative`
      */
    bDecorative: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * When the empty value is kept, the original size is not changed. It is also possible to make settings
      * for width or height only, the overall size is maintained then, considering the aspect ratio.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSrc src}.
      *
      * Relative or absolute path to URL where the image file is stored.
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
      * Sets a new value for property {@link #getUseMap useMap}.
      *
      * The name of the image map that defines the clickable areas
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUseMap(): this.type = js.native
    def setUseMap(/**
      * New value for property `useMap`
      */
    sUseMap: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * When the empty value is kept, the original size is not changed. It is also possible to make settings
      * for width or height only, the overall size is maintained then, considering the aspect ratio.
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
  }
  
  trait ImageSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The alternative text that is displayed in case the Image is not available, or cannot be displayed. If
      * the image is set to decorative this property is ignored.
      */
    var alt: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * A decorative image is included for design reasons. Accessibility tools will ignore decorative images.
      * Note: If the Image has an image map (useMap is set), this property will be overridden (the image will
      * not be rendered as decorative). A decorative image has no ALT attribute, so the Alt property is ignored
      * if the image is decorative.
      */
    var decorative: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * When the empty value is kept, the original size is not changed. It is also possible to make settings
      * for width or height only, the overall size is maintained then, considering the aspect ratio.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the user clicks on the control.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Relative or absolute path to URL where the image file is stored.
      */
    var src: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * The name of the image map that defines the clickable areas
      */
    var useMap: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * When the empty value is kept, the original size is not changed. It is also possible to make settings
      * for width or height only, the overall size is maintained then, considering the aspect ratio.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ImageSettings {
    
    inline def apply(): ImageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageSettings]
    }
    
    extension [Self <: ImageSettings](x: Self) {
      
      inline def setAlt(value: String | PropertyBindingInfo): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setDecorative(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "decorative", value.asInstanceOf[js.Any])
      
      inline def setDecorativeUndefined: Self = StObject.set(x, "decorative", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setUseMap(value: String | PropertyBindingInfo): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
