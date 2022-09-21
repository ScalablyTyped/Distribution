package typings.polyfillLibrary

import org.scalablytyped.runtime.StringDictionary
import typings.node.streamMod.Readable
import typings.polyfillLibrary.anon.AliasOf
import typings.polyfillLibrary.anon.Flags
import typings.polyfillLibrary.polyfillLibraryBooleans.`false`
import typings.polyfillLibrary.polyfillLibraryStrings.ignore
import typings.polyfillLibrary.polyfillLibraryStrings.polyfill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("polyfill-library", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def describePolyfill(featureName: String): js.Promise[js.UndefOr[PolyfillMeta]] = ^.asInstanceOf[js.Dynamic].applyDynamic("describePolyfill")(featureName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[PolyfillMeta]]]
  
  inline def getOptions(): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")().asInstanceOf[Options]
  inline def getOptions(opts: Options): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("getOptions")(opts.asInstanceOf[js.Any]).asInstanceOf[Options]
  
  inline def getPolyfillString(): js.Promise[Readable | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolyfillString")().asInstanceOf[js.Promise[Readable | String]]
  inline def getPolyfillString(opts: Options): js.Promise[Readable | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolyfillString")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Readable | String]]
  
  inline def getPolyfills(): js.Promise[Feature] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolyfills")().asInstanceOf[js.Promise[Feature]]
  inline def getPolyfills(opts: Options): js.Promise[Feature] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPolyfills")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Feature]]
  
  inline def listAliases(): js.Promise[AliasesMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAliases")().asInstanceOf[js.Promise[AliasesMap]]
  
  inline def listAllPolyfills(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("listAllPolyfills")().asInstanceOf[js.Promise[js.Array[String]]]
  
  trait AliasesMap
    extends StObject
       with /* aliases */ StringDictionary[js.Array[String]] {
    
    var default: js.Array[String]
    
    var all: js.Array[String]
    
    var es2015: js.Array[String]
    
    var es2016: js.Array[String]
    
    var es2017: js.Array[String]
    
    var es2018: js.Array[String]
    
    var es2019: js.Array[String]
    
    var es2021: js.Array[String]
    
    var es5: js.Array[String]
    
    var es6: js.Array[String]
    
    var es7: js.Array[String]
  }
  object AliasesMap {
    
    inline def apply(
      all: js.Array[String],
      default: js.Array[String],
      es2015: js.Array[String],
      es2016: js.Array[String],
      es2017: js.Array[String],
      es2018: js.Array[String],
      es2019: js.Array[String],
      es2021: js.Array[String],
      es5: js.Array[String],
      es6: js.Array[String],
      es7: js.Array[String]
    ): AliasesMap = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], es2015 = es2015.asInstanceOf[js.Any], es2016 = es2016.asInstanceOf[js.Any], es2017 = es2017.asInstanceOf[js.Any], es2018 = es2018.asInstanceOf[js.Any], es2019 = es2019.asInstanceOf[js.Any], es2021 = es2021.asInstanceOf[js.Any], es5 = es5.asInstanceOf[js.Any], es6 = es6.asInstanceOf[js.Any], es7 = es7.asInstanceOf[js.Any])
      __obj.asInstanceOf[AliasesMap]
    }
    
    extension [Self <: AliasesMap](x: Self) {
      
      inline def setAll(value: js.Array[String]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllVarargs(value: String*): Self = StObject.set(x, "all", js.Array(value*))
      
      inline def setDefault(value: js.Array[String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultVarargs(value: String*): Self = StObject.set(x, "default", js.Array(value*))
      
      inline def setEs2015(value: js.Array[String]): Self = StObject.set(x, "es2015", value.asInstanceOf[js.Any])
      
      inline def setEs2015Varargs(value: String*): Self = StObject.set(x, "es2015", js.Array(value*))
      
      inline def setEs2016(value: js.Array[String]): Self = StObject.set(x, "es2016", value.asInstanceOf[js.Any])
      
      inline def setEs2016Varargs(value: String*): Self = StObject.set(x, "es2016", js.Array(value*))
      
      inline def setEs2017(value: js.Array[String]): Self = StObject.set(x, "es2017", value.asInstanceOf[js.Any])
      
      inline def setEs2017Varargs(value: String*): Self = StObject.set(x, "es2017", js.Array(value*))
      
      inline def setEs2018(value: js.Array[String]): Self = StObject.set(x, "es2018", value.asInstanceOf[js.Any])
      
      inline def setEs2018Varargs(value: String*): Self = StObject.set(x, "es2018", js.Array(value*))
      
      inline def setEs2019(value: js.Array[String]): Self = StObject.set(x, "es2019", value.asInstanceOf[js.Any])
      
      inline def setEs2019Varargs(value: String*): Self = StObject.set(x, "es2019", js.Array(value*))
      
      inline def setEs2021(value: js.Array[String]): Self = StObject.set(x, "es2021", value.asInstanceOf[js.Any])
      
      inline def setEs2021Varargs(value: String*): Self = StObject.set(x, "es2021", js.Array(value*))
      
      inline def setEs5(value: js.Array[String]): Self = StObject.set(x, "es5", value.asInstanceOf[js.Any])
      
      inline def setEs5Varargs(value: String*): Self = StObject.set(x, "es5", js.Array(value*))
      
      inline def setEs6(value: js.Array[String]): Self = StObject.set(x, "es6", value.asInstanceOf[js.Any])
      
      inline def setEs6Varargs(value: String*): Self = StObject.set(x, "es6", js.Array(value*))
      
      inline def setEs7(value: js.Array[String]): Self = StObject.set(x, "es7", value.asInstanceOf[js.Any])
      
      inline def setEs7Varargs(value: String*): Self = StObject.set(x, "es7", js.Array(value*))
    }
  }
  
  type Feature = StringDictionary[AliasOf]
  
  /* Rewritten from type alias, can be one of: 
    - typings.polyfillLibrary.polyfillLibraryStrings.always
    - typings.polyfillLibrary.polyfillLibraryStrings.gated
  */
  trait Flag extends StObject
  object Flag {
    
    inline def always: typings.polyfillLibrary.polyfillLibraryStrings.always = "always".asInstanceOf[typings.polyfillLibrary.polyfillLibraryStrings.always]
    
    inline def gated: typings.polyfillLibrary.polyfillLibraryStrings.gated = "gated".asInstanceOf[typings.polyfillLibrary.polyfillLibraryStrings.gated]
  }
  
  trait Options extends StObject {
    
    /**
      * Name of the JavaScript function to call after the polyfill bundle is loaded.
      * @default false
      */
    var callback: js.UndefOr[`false` | String] = js.undefined
    
    /**
      * Which features should be excluded from the returned object.
      * @default []
      */
    var excludes: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Which features should be returned if the user-agent does not support them natively.
      * @default {}
      */
    var features: js.UndefOr[StringDictionary[Flags]] = js.undefined
    
    /**
      * Whether to return the minified or raw implementation of the polyfills.
      * @default true
      */
    var minify: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to include a script that reports anonymous usage data in the polyfill bundle.
      * @default false
      */
    var rum: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The user-agent string to check each feature against.
      * @default ''
      */
    var uaString: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to return all polyfills or no polyfills if the user-agent is unknown or unsupported.
      * @default 'polyfill'
      */
    var unknown: js.UndefOr[ignore | polyfill] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCallback(value: `false` | String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
      
      inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
      
      inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
      
      inline def setFeatures(value: StringDictionary[Flags]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
      
      inline def setRum(value: Boolean): Self = StObject.set(x, "rum", value.asInstanceOf[js.Any])
      
      inline def setRumUndefined: Self = StObject.set(x, "rum", js.undefined)
      
      inline def setUaString(value: String): Self = StObject.set(x, "uaString", value.asInstanceOf[js.Any])
      
      inline def setUaStringUndefined: Self = StObject.set(x, "uaString", js.undefined)
      
      inline def setUnknown(value: ignore | polyfill): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
    }
  }
  
  trait PolyfillConfig extends StObject {
    
    var aliases: js.Array[String]
    
    var browsers: StringDictionary[String]
    
    var dependencies: js.Array[String]
    
    var docs: String
    
    var install: StringDictionary[String | js.Array[String]]
    
    var license: String
    
    var notes: js.Array[String]
    
    var repo: String
    
    var spec: String
  }
  object PolyfillConfig {
    
    inline def apply(
      aliases: js.Array[String],
      browsers: StringDictionary[String],
      dependencies: js.Array[String],
      docs: String,
      install: StringDictionary[String | js.Array[String]],
      license: String,
      notes: js.Array[String],
      repo: String,
      spec: String
    ): PolyfillConfig = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], browsers = browsers.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolyfillConfig]
    }
    
    extension [Self <: PolyfillConfig](x: Self) {
      
      inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
      
      inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "aliases", js.Array(value*))
      
      inline def setBrowsers(value: StringDictionary[String]): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setDocs(value: String): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
      
      inline def setInstall(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
      
      inline def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      inline def setNotes(value: js.Array[String]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      inline def setNotesVarargs(value: String*): Self = StObject.set(x, "notes", js.Array(value*))
      
      inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: String): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolyfillMeta
    extends StObject
       with PolyfillConfig {
    
    var baseDir: String
    
    var detectSource: String
    
    var hasTests: Boolean
    
    var isPublic: Boolean
    
    var isTestable: Boolean
    
    var size: Double
  }
  object PolyfillMeta {
    
    inline def apply(
      aliases: js.Array[String],
      baseDir: String,
      browsers: StringDictionary[String],
      dependencies: js.Array[String],
      detectSource: String,
      docs: String,
      hasTests: Boolean,
      install: StringDictionary[String | js.Array[String]],
      isPublic: Boolean,
      isTestable: Boolean,
      license: String,
      notes: js.Array[String],
      repo: String,
      size: Double,
      spec: String
    ): PolyfillMeta = {
      val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], baseDir = baseDir.asInstanceOf[js.Any], browsers = browsers.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], detectSource = detectSource.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], hasTests = hasTests.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], isTestable = isTestable.asInstanceOf[js.Any], license = license.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolyfillMeta]
    }
    
    extension [Self <: PolyfillMeta](x: Self) {
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setDetectSource(value: String): Self = StObject.set(x, "detectSource", value.asInstanceOf[js.Any])
      
      inline def setHasTests(value: Boolean): Self = StObject.set(x, "hasTests", value.asInstanceOf[js.Any])
      
      inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
      
      inline def setIsTestable(value: Boolean): Self = StObject.set(x, "isTestable", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
