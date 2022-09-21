package typings.metro

import typings.metro.assetMod.AssetData
import typings.metro.typesMod.BundleOptions
import typings.metroBabelTransformer.mod.CustomTransformOptions
import typings.metroBabelTransformer.mod.TransformProfile
import typings.metroConfig.configTypesMod.ConfigT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("metro/src/Server", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Server {
    def this(config: ConfigT) = this()
    def this(config: ConfigT, options: ServerOptions) = this()
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    /* CompleteClass */
    override def getAssets(options: BundleOptions): js.Promise[js.Array[AssetData]] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("metro/src/Server", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("metro/src/Server", "default.DEFAULT_BUNDLE_OPTIONS")
    @js.native
    def DEFAULT_BUNDLE_OPTIONS: DefaultBundleOptions = js.native
    inline def DEFAULT_BUNDLE_OPTIONS_=(x: DefaultBundleOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BUNDLE_OPTIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("metro/src/Server", "default.DEFAULT_GRAPH_OPTIONS")
    @js.native
    def DEFAULT_GRAPH_OPTIONS: DefaultGraphOptions = js.native
    inline def DEFAULT_GRAPH_OPTIONS_=(x: DefaultGraphOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GRAPH_OPTIONS")(x.asInstanceOf[js.Any])
  }
  
  trait DefaultBundleOptions
    extends StObject
       with DefaultGraphOptions {
    
    var excludeSource: Boolean
    
    var inlineSourceMap: Boolean
    
    var modulesOnly: Boolean
    
    def onProgress(): Unit
    
    var runModule: Boolean
    
    var shallow: Boolean
    
    var sourceMapUrl: String
    
    var sourceUrl: String
  }
  object DefaultBundleOptions {
    
    inline def apply(
      customTransformOptions: CustomTransformOptions,
      dev: Boolean,
      excludeSource: Boolean,
      hot: Boolean,
      inlineSourceMap: Boolean,
      minify: Boolean,
      modulesOnly: Boolean,
      onProgress: () => Unit,
      runModule: Boolean,
      shallow: Boolean,
      sourceMapUrl: String,
      sourceUrl: String,
      unstable_transformProfile: TransformProfile
    ): DefaultBundleOptions = {
      val __obj = js.Dynamic.literal(customTransformOptions = customTransformOptions.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], excludeSource = excludeSource.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], inlineSourceMap = inlineSourceMap.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], modulesOnly = modulesOnly.asInstanceOf[js.Any], onProgress = js.Any.fromFunction0(onProgress), runModule = runModule.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], sourceMapUrl = sourceMapUrl.asInstanceOf[js.Any], sourceUrl = sourceUrl.asInstanceOf[js.Any], unstable_transformProfile = unstable_transformProfile.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultBundleOptions]
    }
    
    extension [Self <: DefaultBundleOptions](x: Self) {
      
      inline def setExcludeSource(value: Boolean): Self = StObject.set(x, "excludeSource", value.asInstanceOf[js.Any])
      
      inline def setInlineSourceMap(value: Boolean): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
      
      inline def setModulesOnly(value: Boolean): Self = StObject.set(x, "modulesOnly", value.asInstanceOf[js.Any])
      
      inline def setOnProgress(value: () => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction0(value))
      
      inline def setRunModule(value: Boolean): Self = StObject.set(x, "runModule", value.asInstanceOf[js.Any])
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrl(value: String): Self = StObject.set(x, "sourceMapUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultGraphOptions extends StObject {
    
    var customTransformOptions: CustomTransformOptions
    
    var dev: Boolean
    
    var hot: Boolean
    
    var minify: Boolean
    
    var runtimeBytecodeVersion: js.UndefOr[Double] = js.undefined
    
    var unstable_transformProfile: TransformProfile
  }
  object DefaultGraphOptions {
    
    inline def apply(
      customTransformOptions: CustomTransformOptions,
      dev: Boolean,
      hot: Boolean,
      minify: Boolean,
      unstable_transformProfile: TransformProfile
    ): DefaultGraphOptions = {
      val __obj = js.Dynamic.literal(customTransformOptions = customTransformOptions.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], unstable_transformProfile = unstable_transformProfile.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultGraphOptions]
    }
    
    extension [Self <: DefaultGraphOptions](x: Self) {
      
      inline def setCustomTransformOptions(value: CustomTransformOptions): Self = StObject.set(x, "customTransformOptions", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setRuntimeBytecodeVersion(value: Double): Self = StObject.set(x, "runtimeBytecodeVersion", value.asInstanceOf[js.Any])
      
      inline def setRuntimeBytecodeVersionUndefined: Self = StObject.set(x, "runtimeBytecodeVersion", js.undefined)
      
      inline def setUnstable_transformProfile(value: TransformProfile): Self = StObject.set(x, "unstable_transformProfile", value.asInstanceOf[js.Any])
    }
  }
  
  trait Server extends StObject {
    
    def end(): Unit
    
    def getAssets(options: BundleOptions): js.Promise[js.Array[AssetData]]
  }
  object Server {
    
    inline def apply(end: () => Unit, getAssets: BundleOptions => js.Promise[js.Array[AssetData]]): Server = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), getAssets = js.Any.fromFunction1(getAssets))
      __obj.asInstanceOf[Server]
    }
    
    extension [Self <: Server](x: Self) {
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setGetAssets(value: BundleOptions => js.Promise[js.Array[AssetData]]): Self = StObject.set(x, "getAssets", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<{  hasReducedPerformance :boolean | undefined,   onBundleBuilt :(bundlePath : string): void | undefined,   watch :boolean | undefined}> */
  trait ServerOptions extends StObject {
    
    val hasReducedPerformance: js.UndefOr[Boolean] = js.undefined
    
    val onBundleBuilt: js.UndefOr[js.Function1[/* bundlePath */ String, Unit]] = js.undefined
    
    val watch: js.UndefOr[Boolean] = js.undefined
  }
  object ServerOptions {
    
    inline def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    extension [Self <: ServerOptions](x: Self) {
      
      inline def setHasReducedPerformance(value: Boolean): Self = StObject.set(x, "hasReducedPerformance", value.asInstanceOf[js.Any])
      
      inline def setHasReducedPerformanceUndefined: Self = StObject.set(x, "hasReducedPerformance", js.undefined)
      
      inline def setOnBundleBuilt(value: /* bundlePath */ String => Unit): Self = StObject.set(x, "onBundleBuilt", js.Any.fromFunction1(value))
      
      inline def setOnBundleBuiltUndefined: Self = StObject.set(x, "onBundleBuilt", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
}
