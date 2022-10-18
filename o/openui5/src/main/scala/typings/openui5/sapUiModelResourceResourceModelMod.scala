package typings.openui5

import typings.openui5.anon.Bundle
import typings.openui5.anon.BundleLocale
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelResourceResourceModelMod {
  
  @JSImport("sap/ui/model/resource/ResourceModel", JSImport.Default)
  @js.native
  open class default protected () extends ResourceModel {
    /**
      * Constructor for a new ResourceModel.
      *
      * Declarative Usage: The ResourceModel can be created using configuration objects instead of `ResourceBundle`
      * instances. This is the recommended way and enables:
      * 	 - use of terminologies in the bundle and in the enhancements
      * 	 - a guaranteed order of resolution
      *
      * Programmatic Usage: The ResourceModel can be created in a programmatic manner which means that `ResourceBundle`
      * instances are used instead of configurations. Existing ResourceBundles can either be used in the `bundle`
      * parameter or in the `enhanceWith` array. Runtime errors are thrown when `ResourceBundle` instances are
      * used with `terminologies`. Also when using `ResourceModel#enhance` with `terminologies`.
      */
    def this(/**
      * Parameters used to initialize the `ResourceModel`; at least one of `bundle`, `bundleName` or `bundleUrl`
      * must be set; if more than one property is set, they are evaluated in the mentioned order
      */
    oData: Bundle) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/resource/ResourceModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.resource.ResourceModel with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.Model.extend}.
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
    oClassInfo: ClassInfo[T, ResourceModel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ResourceModel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.resource.ResourceModel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ResourceModel
    extends typings.openui5.sapUiModelModelMod.default {
    
    def enhance(
      /**
      * Either an already loaded bundle instance, or a configuration object with parameters to load a new resource
      * bundle. When a configuration object is given, at least one of `bundleUrl` or `bundleName` must be set;
      * if both are set, `bundleName` wins
      */
    oData: BundleLocale
    ): js.Promise[Any] | Null = js.native
    /**
      * @SINCE 1.16.1
      *
      * Enhances the resource model with a custom resource bundle.
      *
      * The custom bundle can define new texts for keys existing in the main bundle, texts for new keys, or both.
      * A resource model can be enhanced with multiple resource bundles by calling this method multiple times.
      * Each call appends to the list of enhancements, but no bundle can be removed from the list.
      *
      * When looking up a text for a key, the enhancements are processed in reverse order. Texts from the last
      * added resource bundle are preferred over texts from previously added bundles or texts from the main bundle.
      *
      * @returns A Promise resolving when the enhancement is finished or `null` if the `ResourceModel` is configured
      * to act synchronously
      */
    def enhance(
      /**
      * Either an already loaded bundle instance, or a configuration object with parameters to load a new resource
      * bundle. When a configuration object is given, at least one of `bundleUrl` or `bundleName` must be set;
      * if both are set, `bundleName` wins
      */
    oData: typings.openui5.sapBaseI18nResourceBundleMod.default
    ): js.Promise[Any] | Null = js.native
    
    /**
      * Gets the resource bundle of this model.
      *
      * @returns The loaded resource bundle or a Promise resolving with it in asynchronous case
      */
    def getResourceBundle(): typings.openui5.sapBaseI18nResourceBundleMod.default | js.Promise[typings.openui5.sapBaseI18nResourceBundleMod.default] = js.native
  }
}
