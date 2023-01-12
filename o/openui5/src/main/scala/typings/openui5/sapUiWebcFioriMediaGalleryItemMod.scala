package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiWebcFioriLibraryMod.IMediaGalleryItem
import typings.openui5.sapUiWebcFioriLibraryMod.MediaGalleryItemLayout
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiWebcFioriMediaGalleryItemMod {
  
  @JSImport("sap/ui/webc/fiori/MediaGalleryItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `MediaGalleryItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends MediaGalleryItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MediaGalleryItemSettings) = this()
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
    mSettings: MediaGalleryItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MediaGalleryItemSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_webc_fiori_IMediaGalleryItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/webc/fiori/MediaGalleryItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.webc.fiori.MediaGalleryItem with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, MediaGalleryItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, MediaGalleryItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.webc.fiori.MediaGalleryItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiWebcCommonWebComponentMetadataMod.default]
  }
  
  @js.native
  trait MediaGalleryItem
    extends typings.openui5.sapUiWebcCommonWebComponentMod.default
       with IMediaGalleryItem {
    
    /**
      * Destroys the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Destroys the thumbnail in the aggregation {@link #getThumbnail thumbnail}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyThumbnail(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Defines the content of the component.
      */
    def getContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getLayout layout}.
      *
      * Determines the layout of the item container.
      *
      *  Available options are:
      * 	 - `Square`
      * 	 - `Wide`
      *
      * Default value is `Square`.
      *
      * @returns Value of property `layout`
      */
    def getLayout(): MediaGalleryItemLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryItemLayout * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Defines the selected state of the component.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getThumbnail thumbnail}.
      *
      * Defines the content of the thumbnail.
      */
    def getThumbnail(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Sets the aggregated {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContent(/**
      * The content to set
      */
    oContent: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
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
      * Sets a new value for property {@link #getLayout layout}.
      *
      * Determines the layout of the item container.
      *
      *  Available options are:
      * 	 - `Square`
      * 	 - `Wide`
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Square`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayout(): this.type = js.native
    def setLayout(
      /**
      * New value for property `layout`
      */
    sLayout: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryItemLayout * / any */ String
    ): this.type = js.native
    def setLayout(/**
      * New value for property `layout`
      */
    sLayout: MediaGalleryItemLayout): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Defines the selected state of the component.
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
      * Sets the aggregated {@link #getThumbnail thumbnail}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setThumbnail(/**
      * The thumbnail to set
      */
    oThumbnail: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
  }
  
  trait MediaGalleryItemSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the content of the component.
      */
    var content: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Defines whether the control is enabled. A disabled control can't be interacted with, and it is not in
      * the tab chain.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the layout of the item container.
      *
      *  Available options are:
      * 	 - `Square`
      * 	 - `Wide`
      */
    var layout: js.UndefOr[
        MediaGalleryItemLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryItemLayout * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the selected state of the component.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the content of the thumbnail.
      */
    var thumbnail: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
  }
  object MediaGalleryItemSettings {
    
    inline def apply(): MediaGalleryItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaGalleryItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaGalleryItemSettings] (val x: Self) extends AnyVal {
      
      inline def setContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setLayout(
        value: MediaGalleryItemLayout | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MediaGalleryItemLayout * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setThumbnail(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    }
  }
}
