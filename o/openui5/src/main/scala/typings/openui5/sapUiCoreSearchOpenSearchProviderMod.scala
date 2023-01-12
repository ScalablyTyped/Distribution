package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.openui5.sapUiCoreSearchSearchProviderMod.SearchProviderSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreSearchOpenSearchProviderMod {
  
  @JSImport("sap/ui/core/search/OpenSearchProvider", JSImport.Default)
  @js.native
  /**
    * Constructor for a new search/OpenSearchProvider.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends OpenSearchProvider {
    def this(/**
      * initial settings for the new control
      */
    mSettings: OpenSearchProviderSettings) = this()
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
    mSettings: OpenSearchProviderSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: OpenSearchProviderSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/search/OpenSearchProvider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.search.OpenSearchProvider with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.search.SearchProvider.extend}.
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
    oClassInfo: ClassInfo[T, OpenSearchProvider]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, OpenSearchProvider],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.search.OpenSearchProvider.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait OpenSearchProvider
    extends typings.openui5.sapUiCoreSearchSearchProviderMod.default {
    
    /**
      * Gets current value of property {@link #getSuggestType suggestType}.
      *
      * The type of data which is provided by the given suggestUrl: either 'json' or 'xml'.
      *
      * Default value is `'json'`.
      *
      * @returns Value of property `suggestType`
      */
    def getSuggestType(): String = js.native
    
    /**
      * Gets current value of property {@link #getSuggestUrl suggestUrl}.
      *
      * The URL for suggestions of the search provider. As placeholder for the concrete search queries '{searchTerms}'
      * must be used. For cross domain requests maybe a proxy must be used.
      *
      * @returns Value of property `suggestUrl`
      */
    def getSuggestUrl(): URI = js.native
    
    /**
      * Sets a new value for property {@link #getSuggestType suggestType}.
      *
      * The type of data which is provided by the given suggestUrl: either 'json' or 'xml'.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'json'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSuggestType(): this.type = js.native
    def setSuggestType(/**
      * New value for property `suggestType`
      */
    sSuggestType: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSuggestUrl suggestUrl}.
      *
      * The URL for suggestions of the search provider. As placeholder for the concrete search queries '{searchTerms}'
      * must be used. For cross domain requests maybe a proxy must be used.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSuggestUrl(): this.type = js.native
    def setSuggestUrl(/**
      * New value for property `suggestUrl`
      */
    sSuggestUrl: URI): this.type = js.native
  }
  
  trait OpenSearchProviderSettings
    extends StObject
       with SearchProviderSettings {
    
    /**
      * The type of data which is provided by the given suggestUrl: either 'json' or 'xml'.
      */
    var suggestType: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The URL for suggestions of the search provider. As placeholder for the concrete search queries '{searchTerms}'
      * must be used. For cross domain requests maybe a proxy must be used.
      */
    var suggestUrl: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object OpenSearchProviderSettings {
    
    inline def apply(): OpenSearchProviderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenSearchProviderSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenSearchProviderSettings] (val x: Self) extends AnyVal {
      
      inline def setSuggestType(value: String | PropertyBindingInfo): Self = StObject.set(x, "suggestType", value.asInstanceOf[js.Any])
      
      inline def setSuggestTypeUndefined: Self = StObject.set(x, "suggestType", js.undefined)
      
      inline def setSuggestUrl(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "suggestUrl", value.asInstanceOf[js.Any])
      
      inline def setSuggestUrlUndefined: Self = StObject.set(x, "suggestUrl", js.undefined)
    }
  }
}
