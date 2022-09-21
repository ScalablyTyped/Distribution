package typings.polyfillService

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("polyfill-service", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPolyfillString(options: GetPolyfillStringOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolyfillString")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getPolyfills(options: GetPolyfillsOptions): js.Promise[GetPolyfillsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolyfills")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetPolyfillsResponse]]
  
  inline def listAllPolyfills(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAllPolyfills")().asInstanceOf[js.Promise[js.Array[String]]]
  
  trait Feature extends StObject {
    
    var flags: js.UndefOr[js.Array[PolyfillFlag]] = js.undefined
  }
  object Feature {
    
    inline def apply(): Feature = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Feature]
    }
    
    extension [Self <: Feature](x: Self) {
      
      inline def setFlags(value: js.Array[PolyfillFlag]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setFlagsVarargs(value: PolyfillFlag*): Self = StObject.set(x, "flags", js.Array(value*))
    }
  }
  
  type Features = StringDictionary[Feature]
  
  trait GetPolyfillStringOptions
    extends StObject
       with GetPolyfillsOptions {
    
    var minify: js.UndefOr[Boolean] = js.undefined
    
    var unknown: js.UndefOr[Unknown] = js.undefined
  }
  object GetPolyfillStringOptions {
    
    inline def apply(uaString: String): GetPolyfillStringOptions = {
      val __obj = js.Dynamic.literal(uaString = uaString.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolyfillStringOptions]
    }
    
    extension [Self <: GetPolyfillStringOptions](x: Self) {
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setUnknown(value: Unknown): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  trait GetPolyfillsOptions extends StObject {
    
    var excludes: js.UndefOr[js.Array[String]] = js.undefined
    
    var features: js.UndefOr[Features] = js.undefined
    
    var uaString: String
  }
  object GetPolyfillsOptions {
    
    inline def apply(uaString: String): GetPolyfillsOptions = {
      val __obj = js.Dynamic.literal(uaString = uaString.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPolyfillsOptions]
    }
    
    extension [Self <: GetPolyfillsOptions](x: Self) {
      
      inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
      
      inline def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setUaString(value: String): Self = StObject.set(x, "uaString", value.asInstanceOf[js.Any])
    }
  }
  
  type GetPolyfillsResponse = StringDictionary[PolyfillSpec]
  
  /* Rewritten from type alias, can be one of: 
    - typings.polyfillService.polyfillServiceStrings.gated
    - typings.polyfillService.polyfillServiceStrings.always
  */
  trait PolyfillFlag extends StObject
  object PolyfillFlag {
    
    inline def always: typings.polyfillService.polyfillServiceStrings.always = "always".asInstanceOf[typings.polyfillService.polyfillServiceStrings.always]
    
    inline def gated: typings.polyfillService.polyfillServiceStrings.gated = "gated".asInstanceOf[typings.polyfillService.polyfillServiceStrings.gated]
  }
  
  trait PolyfillSpec extends StObject {
    
    var aliasOf: js.UndefOr[Set[String]] = js.undefined
    
    var flags: Set[PolyfillFlag]
  }
  object PolyfillSpec {
    
    inline def apply(flags: Set[PolyfillFlag]): PolyfillSpec = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolyfillSpec]
    }
    
    extension [Self <: PolyfillSpec](x: Self) {
      
      inline def setAliasOf(value: Set[String]): Self = StObject.set(x, "aliasOf", value.asInstanceOf[js.Any])
      
      inline def setAliasOfUndefined: Self = StObject.set(x, "aliasOf", js.undefined)
      
      inline def setFlags(value: Set[PolyfillFlag]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.polyfillService.polyfillServiceStrings.polyfill
    - typings.polyfillService.polyfillServiceStrings.ignore
  */
  trait Unknown extends StObject
  object Unknown {
    
    inline def ignore: typings.polyfillService.polyfillServiceStrings.ignore = "ignore".asInstanceOf[typings.polyfillService.polyfillServiceStrings.ignore]
    
    inline def polyfill: typings.polyfillService.polyfillServiceStrings.polyfill = "polyfill".asInstanceOf[typings.polyfillService.polyfillServiceStrings.polyfill]
  }
}
