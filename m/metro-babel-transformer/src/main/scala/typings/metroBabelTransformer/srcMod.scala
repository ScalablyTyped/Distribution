package typings.metroBabelTransformer

import org.scalablytyped.runtime.StringDictionary
import typings.metroBabelTransformer.anon.Ast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("metro-babel-transformer/src", "transform")
  @js.native
  val transform: js.Function1[/* args */ BabelTransformerArgs, Ast] = js.native
  
  trait BabelTransformer extends StObject {
    
    var getCacheKey: js.UndefOr[js.Function0[String]] = js.undefined
    
    def transform(args: BabelTransformerArgs): Ast
  }
  object BabelTransformer {
    
    inline def apply(transform: BabelTransformerArgs => Ast): BabelTransformer = {
      val __obj = js.Dynamic.literal(transform = js.Any.fromFunction1(transform))
      __obj.asInstanceOf[BabelTransformer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BabelTransformer] (val x: Self) extends AnyVal {
      
      inline def setGetCacheKey(value: () => String): Self = StObject.set(x, "getCacheKey", js.Any.fromFunction0(value))
      
      inline def setGetCacheKeyUndefined: Self = StObject.set(x, "getCacheKey", js.undefined)
      
      inline def setTransform(value: BabelTransformerArgs => Ast): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    }
  }
  
  trait BabelTransformerArgs extends StObject {
    
    val filename: String
    
    val options: BabelTransformerOptions
    
    val plugins: js.UndefOr[Any] = js.undefined
    
    val src: String
  }
  object BabelTransformerArgs {
    
    inline def apply(filename: String, options: BabelTransformerOptions, src: String): BabelTransformerArgs = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[BabelTransformerArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BabelTransformerArgs] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: BabelTransformerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPlugins(value: Any): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait BabelTransformerOptions extends StObject {
    
    val customTransformOptions: js.UndefOr[CustomTransformOptions] = js.undefined
    
    val dev: Boolean
    
    val enableBabelRCLookup: js.UndefOr[Boolean] = js.undefined
    
    val enableBabelRuntime: Boolean | String
    
    val experimentalImportSupport: js.UndefOr[Boolean] = js.undefined
    
    val extendsBabelConfigPath: js.UndefOr[String] = js.undefined
    
    val globalPrefix: String
    
    val hermesParser: js.UndefOr[Boolean] = js.undefined
    
    val hot: Boolean
    
    val inlineRequires: Boolean
    
    val minify: Boolean
    
    val nonInlinedRequires: js.UndefOr[js.Array[String]] = js.undefined
    
    val platform: String | Null
    
    val projectRoot: String
    
    val publicPath: String
    
    val unstable_disableES6Transforms: js.UndefOr[Boolean] = js.undefined
    
    val unstable_transformProfile: js.UndefOr[TransformProfile] = js.undefined
  }
  object BabelTransformerOptions {
    
    inline def apply(
      dev: Boolean,
      enableBabelRuntime: Boolean | String,
      globalPrefix: String,
      hot: Boolean,
      inlineRequires: Boolean,
      minify: Boolean,
      projectRoot: String,
      publicPath: String
    ): BabelTransformerOptions = {
      val __obj = js.Dynamic.literal(dev = dev.asInstanceOf[js.Any], enableBabelRuntime = enableBabelRuntime.asInstanceOf[js.Any], globalPrefix = globalPrefix.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], inlineRequires = inlineRequires.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], publicPath = publicPath.asInstanceOf[js.Any], platform = null)
      __obj.asInstanceOf[BabelTransformerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BabelTransformerOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomTransformOptions(value: CustomTransformOptions): Self = StObject.set(x, "customTransformOptions", value.asInstanceOf[js.Any])
      
      inline def setCustomTransformOptionsUndefined: Self = StObject.set(x, "customTransformOptions", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setEnableBabelRCLookup(value: Boolean): Self = StObject.set(x, "enableBabelRCLookup", value.asInstanceOf[js.Any])
      
      inline def setEnableBabelRCLookupUndefined: Self = StObject.set(x, "enableBabelRCLookup", js.undefined)
      
      inline def setEnableBabelRuntime(value: Boolean | String): Self = StObject.set(x, "enableBabelRuntime", value.asInstanceOf[js.Any])
      
      inline def setExperimentalImportSupport(value: Boolean): Self = StObject.set(x, "experimentalImportSupport", value.asInstanceOf[js.Any])
      
      inline def setExperimentalImportSupportUndefined: Self = StObject.set(x, "experimentalImportSupport", js.undefined)
      
      inline def setExtendsBabelConfigPath(value: String): Self = StObject.set(x, "extendsBabelConfigPath", value.asInstanceOf[js.Any])
      
      inline def setExtendsBabelConfigPathUndefined: Self = StObject.set(x, "extendsBabelConfigPath", js.undefined)
      
      inline def setGlobalPrefix(value: String): Self = StObject.set(x, "globalPrefix", value.asInstanceOf[js.Any])
      
      inline def setHermesParser(value: Boolean): Self = StObject.set(x, "hermesParser", value.asInstanceOf[js.Any])
      
      inline def setHermesParserUndefined: Self = StObject.set(x, "hermesParser", js.undefined)
      
      inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setInlineRequires(value: Boolean): Self = StObject.set(x, "inlineRequires", value.asInstanceOf[js.Any])
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setNonInlinedRequires(value: js.Array[String]): Self = StObject.set(x, "nonInlinedRequires", value.asInstanceOf[js.Any])
      
      inline def setNonInlinedRequiresUndefined: Self = StObject.set(x, "nonInlinedRequires", js.undefined)
      
      inline def setNonInlinedRequiresVarargs(value: String*): Self = StObject.set(x, "nonInlinedRequires", js.Array(value*))
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformNull: Self = StObject.set(x, "platform", null)
      
      inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
      
      inline def setPublicPath(value: String): Self = StObject.set(x, "publicPath", value.asInstanceOf[js.Any])
      
      inline def setUnstable_disableES6Transforms(value: Boolean): Self = StObject.set(x, "unstable_disableES6Transforms", value.asInstanceOf[js.Any])
      
      inline def setUnstable_disableES6TransformsUndefined: Self = StObject.set(x, "unstable_disableES6Transforms", js.undefined)
      
      inline def setUnstable_transformProfile(value: TransformProfile): Self = StObject.set(x, "unstable_transformProfile", value.asInstanceOf[js.Any])
      
      inline def setUnstable_transformProfileUndefined: Self = StObject.set(x, "unstable_transformProfile", js.undefined)
    }
  }
  
  type CustomTransformOptions = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.metroBabelTransformer.metroBabelTransformerStrings.default
    - typings.metroBabelTransformer.metroBabelTransformerStrings.`hermes-stable`
    - typings.metroBabelTransformer.metroBabelTransformerStrings.`hermes-canary`
  */
  trait TransformProfile extends StObject
  object TransformProfile {
    
    inline def default: typings.metroBabelTransformer.metroBabelTransformerStrings.default = "default".asInstanceOf[typings.metroBabelTransformer.metroBabelTransformerStrings.default]
    
    inline def `hermes-canary`: typings.metroBabelTransformer.metroBabelTransformerStrings.`hermes-canary` = "hermes-canary".asInstanceOf[typings.metroBabelTransformer.metroBabelTransformerStrings.`hermes-canary`]
    
    inline def `hermes-stable`: typings.metroBabelTransformer.metroBabelTransformerStrings.`hermes-stable` = "hermes-stable".asInstanceOf[typings.metroBabelTransformer.metroBabelTransformerStrings.`hermes-stable`]
  }
}
