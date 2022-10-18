package typings.openui5.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bundles extends StObject {
  
  /**
    * When set to true, the ui5loader will overwrite the global properties `define` and `require` with its
    * own implementations. Any previously active AMD loader will be remembered internally and can be restored
    * by setting `amd` to false again.
    *
    * **Note:** Switching to the `amd` mode, the ui5loader will set `async` to true implicitly for activating
    * asynchronous loading. Once the loading behaviour has been defined to be asynchronous, it can not be changed
    * to synchronous behaviour again, also not via setting `amd` to false.
    */
  var amd: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to true, `sap.ui.require` loads modules asynchronously via script tags and `sap.ui.define` executes
    * asynchronously. To enable this feature, it is recommended to set the attribute `data-sap-ui-async="true"`
    * on the application bootstrap tag.
    *
    * **Note:** Switching back from async to sync is not supported and trying to do so will throw an `Error`
    */
  var async: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default location to load modules from. If none of the configured `paths` prefixes matches a module ID,
    * the module will be loaded from the concatenation of the `baseUrl` and the module ID.
    *
    * If the `baseUrl` itself is a relative URL, it is evaluated relative to `document.baseURI`.
    */
  var baseUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A map of arrays that each define the modules contained in a bundle.
    *
    * Each key of the map represents the module ID of a bundle file. The array value represents the set of
    * JavaScript modules (their module IDs) that are contained in the bundle.
    *
    * When a module is required that has not been loaded yet, and for which a containing bundle is known, that
    * bundle will be required first. Only then the original module will be required again and usually be taken
    * from the just loaded bundle.
    *
    * A bundle will be loaded asynchronously only when the loader is in asynchronous mode and when the request
    * for the contained module originates from an asynchronous API. In all other cases, the bundle has to be
    * loaded synchronously to fulfill API contracts.
    *
    * **Note:** The loader only supports one containing bundle per module. If a module is declared to be part
    * of multiple bundles, only the last one will be taken into account.
    *
    * This configuration option is basically provided to be compatible with requireJS or SystemJS configuration.
    */
  var bundles: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  
  /**
    * A map of arrays that each define the resources contained in a bundle.
    *
    * This is similar to `bundles`, but all strings are unified resource names including a file type extension,
    * not only module IDs. This allows to represent more than just JavaScript modules.
    *
    * Each key of the map represents the resource name (in unified resource name syntax) of a bundle file.
    * The array value represents the set of resources (also in unified resource name syntax) that are contained
    * in the bundle. The array can contain JavaScript as well as other textual resource types (e.g. *.xml or
    * *.json resources).
    *
    * When a module is required that has not been loaded yet, and for which a containing bundle is known, that
    * bundle will be required first. Only then the original module will be required again and usually be taken
    * from the just loaded bundle.
    *
    * A bundle will be loaded asynchronously only when the loader is in asynchronous mode and when the request
    * for the contained module originates from an asynchronous API. In all other cases, the bundle has to be
    * loaded synchronously to fulfill API contracts.
    *
    * **Note:** The loader only supports one containing bundle per module. If a module is declared to be part
    * of multiple bundles, only the last one will be taken into account.
    *
    * **Note:** Although non-JS resources can be declared to be part of a bundle, only requests for JavaScript
    * modules will currently trigger the loading of a bundle.
    */
  var bundlesUI5: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
  
  /**
    * A map of maps that defines how to map module IDs to other module IDs (inner maps) in the context of a
    * specific set of modules (keys of outer map).
    *
    * Each key of the outer map represents a module ID prefix that describes the context for which its value
    * (inner map) has to be used. The special key `*` describes the default context which applies for any module.
    * Only the most specific matching context will be taken into account.
    *
    * Each inner map maps a module ID or module ID prefix to another module ID or module ID prefix. Again,
    * only the most specific match is taken into account and only one mapping is evaluated (the evaluation
    * of the mappings is not done recursively).
    *
    * Matches are always complete matches, a prefix 'a/b/c' does not match the module ID 'a/b/com'.
    */
  var map: js.UndefOr[Record[String, Record[String, String]]] = js.undefined
  
  /**
    * A map of resource locations keyed by a corresponding module ID prefix. When a module is to be loaded,
    * the longest key in `paths` is searched that is a prefix of the module ID. The module will be loaded from
    * the concatenation of the corresponding value in `paths` and the remainder of the module ID (after the
    * prefix). If no entry in `paths` matches, then the module will be loaded from the `baseUrl`.
    *
    * The prefixes (keys) must not contain relative segments (./ or ../), a trailing slash will be removed,
    * and only full name segment matches are considered a match (prefix 'sap/m' does not match a module ID
    * 'sap/main').
    *
    * **Note**: In contrast to the "Common Config" of the AMD spec, the paths (values in the map) are interpreted
    * relative to `document.baseURI`, not relative to `cfg.baseUrl`.
    */
  var paths: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Defines additional metadata for modules for which the normal behavior of the AMD APIs is not sufficient.
    *
    * A typical example are scripts that don't use `define` or `sap.ui.define`, but export to a global name.
    * With the `exports` property, one or more export names can be specified, and the loader can retrieve the
    * exported value after executing the corresponding module. If such a module has dependencies, they can
    * be specified in the `deps` array and are loaded and executed before executing the module.
    *
    * The `amd` flag of a shim is a ui5loader-specific extension of the standard AMD shims. If set, the ui5loader
    * hides a currently active AMD loader before executing the module and restores it afterwards. Otherwise,
    * it might miss the export of third party modules that check for an AMD loader and register with it instead
    * of exporting to a global name. A future version of the ui5loader might ignore this flag when it acts
    * as an AMD loader by itself.
    *
    * **Note:** The ui5loader does not support the `init` option described by the "Common Config" section of
    * the AMD spec.
    */
  var shim: js.UndefOr[Record[String, Amd]] = js.undefined
}
object Bundles {
  
  inline def apply(): Bundles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bundles]
  }
  
  extension [Self <: Bundles](x: Self) {
    
    inline def setAmd(value: Boolean): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    inline def setAmdUndefined: Self = StObject.set(x, "amd", js.undefined)
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
    
    inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
    
    inline def setBundles(value: Record[String, js.Array[String]]): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    inline def setBundlesUI5(value: Record[String, js.Array[String]]): Self = StObject.set(x, "bundlesUI5", value.asInstanceOf[js.Any])
    
    inline def setBundlesUI5Undefined: Self = StObject.set(x, "bundlesUI5", js.undefined)
    
    inline def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    inline def setMap(value: Record[String, Record[String, String]]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPaths(value: Record[String, String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setShim(value: Record[String, Amd]): Self = StObject.set(x, "shim", value.asInstanceOf[js.Any])
    
    inline def setShimUndefined: Self = StObject.set(x, "shim", js.undefined)
  }
}
