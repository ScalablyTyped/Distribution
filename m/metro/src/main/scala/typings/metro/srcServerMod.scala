package typings.metro

import org.scalablytyped.runtime.NumberDictionary
import typings.metro.anon.Dev
import typings.metro.anon.Map
import typings.metro.metroBooleans.`false`
import typings.metro.metroBooleans.`true`
import typings.metro.srcAssetMod.AssetData
import typings.metro.srcDeltaBundlerSerializersGetRamBundleInfoMod.RamBundleInfo
import typings.metro.srcDeltaBundlerTypesMod.TransformInputOptions
import typings.metro.srcIncrementalBundlerMod.RevisionId
import typings.metro.srcLibGetGraphIdMod.GraphId
import typings.metro.srcSharedTypesMod.BundleOptions
import typings.metro.srcSharedTypesMod.GraphOptions
import typings.metro.srcSharedTypesMod.ResolverInputOptions
import typings.metro.srcSharedTypesMod.SerializerOptions
import typings.metro.srcSharedTypesMod.SplitBundleOptions
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcServerMod {
  
  @JSImport("metro/src/Server", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Server {
    def this(config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any) = this()
    def this(
      config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConfigT */ Any,
      options: ServerOptions
    ) = this()
    
    /* CompleteClass */
    override def build(options: BundleOptions): js.Promise[Map] = js.native
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    /* CompleteClass */
    override def getAssets(options: BundleOptions): js.Promise[js.Array[AssetData]] = js.native
    
    /* CompleteClass */
    override def getBundler(): typings.metro.srcIncrementalBundlerMod.default = js.native
    
    /* CompleteClass */
    override def getCreateModuleId(): js.Function1[/* path */ String, Double] = js.native
    
    /* CompleteClass */
    override def getOrderedDependencyPaths(options: Dev): js.Promise[js.Array[String]] = js.native
    
    /* CompleteClass */
    override def getRamBundleInfo(options: BundleOptions): js.Promise[RamBundleInfo] = js.native
    
    /* CompleteClass */
    override def processRequest(
      IncomingMessage: IncomingMessage,
      ServerResponse: ServerResponse[IncomingMessage],
      next: js.Function1[/* e */ js.Error | Null, Any]
    ): Unit = js.native
  }
  /* static members */
  object default {
    
    @JSImport("metro/src/Server", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("metro/src/Server", "default.DEFAULT_BUNDLE_OPTIONS")
    @js.native
    def DEFAULT_BUNDLE_OPTIONS: BundleOptions = js.native
    inline def DEFAULT_BUNDLE_OPTIONS_=(x: BundleOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_BUNDLE_OPTIONS")(x.asInstanceOf[js.Any])
    
    @JSImport("metro/src/Server", "default.DEFAULT_GRAPH_OPTIONS")
    @js.native
    def DEFAULT_GRAPH_OPTIONS: DefaultGraphOptions = js.native
    inline def DEFAULT_GRAPH_OPTIONS_=(x: DefaultGraphOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_GRAPH_OPTIONS")(x.asInstanceOf[js.Any])
  }
  
  trait BundleMetadata extends StObject {
    
    var hash: String
    
    var mobileConfigs: js.Array[String]
    
    var otaBuildNumber: String | Null
    
    var segmentHashes: js.Array[String]
    
    var segmentLoadData: SegmentLoadData
  }
  object BundleMetadata {
    
    inline def apply(
      hash: String,
      mobileConfigs: js.Array[String],
      segmentHashes: js.Array[String],
      segmentLoadData: SegmentLoadData
    ): BundleMetadata = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], mobileConfigs = mobileConfigs.asInstanceOf[js.Any], segmentHashes = segmentHashes.asInstanceOf[js.Any], segmentLoadData = segmentLoadData.asInstanceOf[js.Any], otaBuildNumber = null)
      __obj.asInstanceOf[BundleMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundleMetadata] (val x: Self) extends AnyVal {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setMobileConfigs(value: js.Array[String]): Self = StObject.set(x, "mobileConfigs", value.asInstanceOf[js.Any])
      
      inline def setMobileConfigsVarargs(value: String*): Self = StObject.set(x, "mobileConfigs", js.Array(value*))
      
      inline def setOtaBuildNumber(value: String): Self = StObject.set(x, "otaBuildNumber", value.asInstanceOf[js.Any])
      
      inline def setOtaBuildNumberNull: Self = StObject.set(x, "otaBuildNumber", null)
      
      inline def setSegmentHashes(value: js.Array[String]): Self = StObject.set(x, "segmentHashes", value.asInstanceOf[js.Any])
      
      inline def setSegmentHashesVarargs(value: String*): Self = StObject.set(x, "segmentHashes", js.Array(value*))
      
      inline def setSegmentLoadData(value: SegmentLoadData): Self = StObject.set(x, "segmentLoadData", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultBundleOptions
    extends StObject
       with DefaultGraphOptions {
    
    var excludeSource: `false`
    
    var inlineSourceMap: `false`
    
    var modulesOnly: `false`
    
    var onProgress: Null
    
    var runModule: `true`
    
    var shallow: `false`
    
    var sourceMapUrl: Null
    
    var sourceUrl: Null
  }
  object DefaultBundleOptions {
    
    inline def apply(
      customResolverOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolverOptions */ Any,
      customTransformOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomTransformOptions */ Any,
      dev: Boolean,
      hot: Boolean,
      minify: Boolean,
      onProgress: Null,
      sourceMapUrl: Null,
      sourceUrl: Null,
      unstable_transformProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformProfile */ Any
    ): DefaultBundleOptions = {
      val __obj = js.Dynamic.literal(customResolverOptions = customResolverOptions.asInstanceOf[js.Any], customTransformOptions = customTransformOptions.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], excludeSource = false, hot = hot.asInstanceOf[js.Any], inlineSourceMap = false, minify = minify.asInstanceOf[js.Any], modulesOnly = false, onProgress = onProgress.asInstanceOf[js.Any], runModule = true, shallow = false, sourceMapUrl = sourceMapUrl.asInstanceOf[js.Any], sourceUrl = sourceUrl.asInstanceOf[js.Any], unstable_transformProfile = unstable_transformProfile.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultBundleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultBundleOptions] (val x: Self) extends AnyVal {
      
      inline def setExcludeSource(value: `false`): Self = StObject.set(x, "excludeSource", value.asInstanceOf[js.Any])
      
      inline def setInlineSourceMap(value: `false`): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
      
      inline def setModulesOnly(value: `false`): Self = StObject.set(x, "modulesOnly", value.asInstanceOf[js.Any])
      
      inline def setOnProgress(value: Null): Self = StObject.set(x, "onProgress", value.asInstanceOf[js.Any])
      
      inline def setRunModule(value: `true`): Self = StObject.set(x, "runModule", value.asInstanceOf[js.Any])
      
      inline def setShallow(value: `false`): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrl(value: Null): Self = StObject.set(x, "sourceMapUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceUrl(value: Null): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultGraphOptions extends StObject {
    
    var customResolverOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolverOptions */ Any
    
    var customTransformOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomTransformOptions */ Any
    
    var dev: Boolean
    
    var hot: Boolean
    
    var minify: Boolean
    
    var runtimeBytecodeVersion: js.UndefOr[Double] = js.undefined
    
    var unstable_transformProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformProfile */ Any
  }
  object DefaultGraphOptions {
    
    inline def apply(
      customResolverOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolverOptions */ Any,
      customTransformOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomTransformOptions */ Any,
      dev: Boolean,
      hot: Boolean,
      minify: Boolean,
      unstable_transformProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformProfile */ Any
    ): DefaultGraphOptions = {
      val __obj = js.Dynamic.literal(customResolverOptions = customResolverOptions.asInstanceOf[js.Any], customTransformOptions = customTransformOptions.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], unstable_transformProfile = unstable_transformProfile.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultGraphOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultGraphOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomResolverOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolverOptions */ Any
      ): Self = StObject.set(x, "customResolverOptions", value.asInstanceOf[js.Any])
      
      inline def setCustomTransformOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomTransformOptions */ Any
      ): Self = StObject.set(x, "customTransformOptions", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setRuntimeBytecodeVersion(value: Double): Self = StObject.set(x, "runtimeBytecodeVersion", value.asInstanceOf[js.Any])
      
      inline def setRuntimeBytecodeVersionUndefined: Self = StObject.set(x, "runtimeBytecodeVersion", js.undefined)
      
      inline def setUnstable_transformProfile(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformProfile */ Any
      ): Self = StObject.set(x, "unstable_transformProfile", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessDeleteContext extends StObject {
    
    val graphId: GraphId
    
    val req: IncomingMessage
    
    val res: ServerResponse[IncomingMessage]
  }
  object ProcessDeleteContext {
    
    inline def apply(graphId: GraphId, req: IncomingMessage, res: ServerResponse[IncomingMessage]): ProcessDeleteContext = {
      val __obj = js.Dynamic.literal(graphId = graphId.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessDeleteContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessDeleteContext] (val x: Self) extends AnyVal {
      
      inline def setGraphId(value: GraphId): Self = StObject.set(x, "graphId", value.asInstanceOf[js.Any])
      
      inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRes(value: ServerResponse[IncomingMessage]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessEndContext[T]
    extends StObject
       with ProcessStartContext {
    
    val result: T
  }
  object ProcessEndContext {
    
    inline def apply[T](
      buildNumber: Double,
      bundleOptions: BundleOptions,
      bundlePerfLogger: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RootPerfLogger */ Any,
      entryFile: String,
      graphId: GraphId,
      graphOptions: GraphOptions,
      mres: typings.metro.srcServerMultipartResponseMod.default | ServerResponse[IncomingMessage],
      req: IncomingMessage,
      resolverOptions: ResolverInputOptions,
      result: T,
      serializerOptions: SerializerOptions,
      transformOptions: TransformInputOptions
    ): ProcessEndContext[T] = {
      val __obj = js.Dynamic.literal(buildNumber = buildNumber.asInstanceOf[js.Any], bundleOptions = bundleOptions.asInstanceOf[js.Any], bundlePerfLogger = bundlePerfLogger.asInstanceOf[js.Any], entryFile = entryFile.asInstanceOf[js.Any], graphId = graphId.asInstanceOf[js.Any], graphOptions = graphOptions.asInstanceOf[js.Any], mres = mres.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], resolverOptions = resolverOptions.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], serializerOptions = serializerOptions.asInstanceOf[js.Any], transformOptions = transformOptions.asInstanceOf[js.Any], onProgress = null)
      __obj.asInstanceOf[ProcessEndContext[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessEndContext[?], T] (val x: Self & ProcessEndContext[T]) extends AnyVal {
      
      inline def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessStartContext
    extends StObject
       with SplitBundleOptions {
    
    val buildNumber: Double
    
    val bundleOptions: BundleOptions
    
    val bundlePerfLogger: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RootPerfLogger */ Any
    
    val graphId: GraphId
    
    val mres: typings.metro.srcServerMultipartResponseMod.default | ServerResponse[IncomingMessage]
    
    val req: IncomingMessage
    
    val revisionId: js.UndefOr[RevisionId | Null] = js.undefined
  }
  object ProcessStartContext {
    
    inline def apply(
      buildNumber: Double,
      bundleOptions: BundleOptions,
      bundlePerfLogger: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RootPerfLogger */ Any,
      entryFile: String,
      graphId: GraphId,
      graphOptions: GraphOptions,
      mres: typings.metro.srcServerMultipartResponseMod.default | ServerResponse[IncomingMessage],
      req: IncomingMessage,
      resolverOptions: ResolverInputOptions,
      serializerOptions: SerializerOptions,
      transformOptions: TransformInputOptions
    ): ProcessStartContext = {
      val __obj = js.Dynamic.literal(buildNumber = buildNumber.asInstanceOf[js.Any], bundleOptions = bundleOptions.asInstanceOf[js.Any], bundlePerfLogger = bundlePerfLogger.asInstanceOf[js.Any], entryFile = entryFile.asInstanceOf[js.Any], graphId = graphId.asInstanceOf[js.Any], graphOptions = graphOptions.asInstanceOf[js.Any], mres = mres.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], resolverOptions = resolverOptions.asInstanceOf[js.Any], serializerOptions = serializerOptions.asInstanceOf[js.Any], transformOptions = transformOptions.asInstanceOf[js.Any], onProgress = null)
      __obj.asInstanceOf[ProcessStartContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProcessStartContext] (val x: Self) extends AnyVal {
      
      inline def setBuildNumber(value: Double): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
      
      inline def setBundleOptions(value: BundleOptions): Self = StObject.set(x, "bundleOptions", value.asInstanceOf[js.Any])
      
      inline def setBundlePerfLogger(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RootPerfLogger */ Any
      ): Self = StObject.set(x, "bundlePerfLogger", value.asInstanceOf[js.Any])
      
      inline def setGraphId(value: GraphId): Self = StObject.set(x, "graphId", value.asInstanceOf[js.Any])
      
      inline def setMres(value: typings.metro.srcServerMultipartResponseMod.default | ServerResponse[IncomingMessage]): Self = StObject.set(x, "mres", value.asInstanceOf[js.Any])
      
      inline def setReq(value: IncomingMessage): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      inline def setRevisionId(value: RevisionId): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
      
      inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
      
      inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    }
  }
  
  type SegmentLoadData = NumberDictionary[js.Tuple2[js.Array[Double], Double | Null]]
  
  trait Server extends StObject {
    
    def build(options: BundleOptions): js.Promise[Map]
    
    def end(): Unit
    
    def getAssets(options: BundleOptions): js.Promise[js.Array[AssetData]]
    
    def getBundler(): typings.metro.srcIncrementalBundlerMod.default
    
    def getCreateModuleId(): js.Function1[/* path */ String, Double]
    
    def getOrderedDependencyPaths(options: Dev): js.Promise[js.Array[String]]
    
    def getRamBundleInfo(options: BundleOptions): js.Promise[RamBundleInfo]
    
    def processRequest(
      IncomingMessage: IncomingMessage,
      ServerResponse: ServerResponse[IncomingMessage],
      next: js.Function1[/* e */ js.Error | Null, Any]
    ): Unit
  }
  object Server {
    
    inline def apply(
      build: BundleOptions => js.Promise[Map],
      end: () => Unit,
      getAssets: BundleOptions => js.Promise[js.Array[AssetData]],
      getBundler: () => typings.metro.srcIncrementalBundlerMod.default,
      getCreateModuleId: () => js.Function1[/* path */ String, Double],
      getOrderedDependencyPaths: Dev => js.Promise[js.Array[String]],
      getRamBundleInfo: BundleOptions => js.Promise[RamBundleInfo],
      processRequest: (IncomingMessage, ServerResponse[IncomingMessage], js.Function1[/* e */ js.Error | Null, Any]) => Unit
    ): Server = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction1(build), end = js.Any.fromFunction0(end), getAssets = js.Any.fromFunction1(getAssets), getBundler = js.Any.fromFunction0(getBundler), getCreateModuleId = js.Any.fromFunction0(getCreateModuleId), getOrderedDependencyPaths = js.Any.fromFunction1(getOrderedDependencyPaths), getRamBundleInfo = js.Any.fromFunction1(getRamBundleInfo), processRequest = js.Any.fromFunction3(processRequest))
      __obj.asInstanceOf[Server]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: BundleOptions => js.Promise[Map]): Self = StObject.set(x, "build", js.Any.fromFunction1(value))
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setGetAssets(value: BundleOptions => js.Promise[js.Array[AssetData]]): Self = StObject.set(x, "getAssets", js.Any.fromFunction1(value))
      
      inline def setGetBundler(value: () => typings.metro.srcIncrementalBundlerMod.default): Self = StObject.set(x, "getBundler", js.Any.fromFunction0(value))
      
      inline def setGetCreateModuleId(value: () => js.Function1[/* path */ String, Double]): Self = StObject.set(x, "getCreateModuleId", js.Any.fromFunction0(value))
      
      inline def setGetOrderedDependencyPaths(value: Dev => js.Promise[js.Array[String]]): Self = StObject.set(x, "getOrderedDependencyPaths", js.Any.fromFunction1(value))
      
      inline def setGetRamBundleInfo(value: BundleOptions => js.Promise[RamBundleInfo]): Self = StObject.set(x, "getRamBundleInfo", js.Any.fromFunction1(value))
      
      inline def setProcessRequest(
        value: (IncomingMessage, ServerResponse[IncomingMessage], js.Function1[/* e */ js.Error | Null, Any]) => Unit
      ): Self = StObject.set(x, "processRequest", js.Any.fromFunction3(value))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      inline def setHasReducedPerformance(value: Boolean): Self = StObject.set(x, "hasReducedPerformance", value.asInstanceOf[js.Any])
      
      inline def setHasReducedPerformanceUndefined: Self = StObject.set(x, "hasReducedPerformance", js.undefined)
      
      inline def setOnBundleBuilt(value: /* bundlePath */ String => Unit): Self = StObject.set(x, "onBundleBuilt", js.Any.fromFunction1(value))
      
      inline def setOnBundleBuiltUndefined: Self = StObject.set(x, "onBundleBuilt", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
}
