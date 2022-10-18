package typings.openui5

import typings.openui5.anon.BaseUrl
import typings.openui5.anon.ComponentName
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreManifestMod {
  
  @JSImport("sap/ui/core/Manifest", JSImport.Default)
  @js.native
  open class default protected () extends Manifest {
    /**
      * Creates and initializes a manifest wrapper which provides API access to the content of the manifest.
      */
    def this(/**
      * the manifest object
      */
    oManifest: js.Object) = this()
    def this(
      /**
      * the manifest object
      */
    oManifest: js.Object,
      /**
      * (optional) the configuration options
      */
    mOptions: BaseUrl
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/Manifest", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.Manifest with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.Object.extend}.
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
    oClassInfo: ClassInfo[T, Manifest]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Manifest],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.Manifest.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
    
    /**
      * Function to load the manifest by URL
      *
      * @returns Manifest object or for asynchronous calls an ECMA Script 6 Promise object will be returned.
      */
    inline def load(/**
      * the configuration options
      */
    mOptions: ComponentName): Manifest | js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(mOptions.asInstanceOf[js.Any]).asInstanceOf[Manifest | js.Promise[Any]]
  }
  
  @js.native
  trait Manifest
    extends typings.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Returns the Component name which is defined in the manifest as `sap.ui5/componentName` or `sap.app/id`
      *
      * @returns the component name
      */
    def getComponentName(): String = js.native
    
    /**
      * Returns the configuration of a manifest section or the value for a specific path. If no key is specified,
      * the return value is null.
      *
      * Example: ` { "sap.ui5": { "dependencies": { "libs": { "sap.m": {} }, "components": { "my.component.a":
      * {} } } }); `
      *
      * The configuration above can be accessed in the following ways:
      * 	 - **By section/namespace**: `oManifest.getEntry("sap.ui5")`
      * 	 - **By path**: `oManifest.getEntry("/sap.ui5/dependencies/libs")`
      *
      * By section/namespace returns the configuration for the specified manifest section and by path allows
      * to specify a concrete path to a dedicated entry inside the manifest. The path syntax always starts with
      * a slash (/).
      *
      * @returns Value of the key (could be any kind of value)
      */
    def getEntry(/**
      * Either the manifest section name (namespace) or a concrete path
      */
    sPath: String): Any | Null = js.native
    
    /**
      * Returns the manifest defined in the metadata of the component. If not specified, the return value is
      * null.
      *
      * @returns manifest.
      */
    def getJson(): js.Object = js.native
    
    /**
      * Returns the raw manifest defined in the metadata of the component. If not specified, the return value
      * is null.
      *
      * @returns manifest
      */
    def getRawJson(): js.Object = js.native
    
    /**
      * @SINCE 1.60.1
      *
      * Resolves the given URI relative to the Component by default or optional relative to the manifest when
      * passing 'manifest' as second parameter.
      *
      * @returns resolved URI as string
      */
    def resolveUri(/**
      * URI to resolve as string
      */
    sUri: String): String = js.native
    def resolveUri(
      /**
      * URI to resolve as string
      */
    sUri: String,
      /**
      * defines to which base URI the given URI will be resolved to; one of ‘component' (default) or 'manifest'
      */
    sRelativeTo: String
    ): String = js.native
  }
}
