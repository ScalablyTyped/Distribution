package typings.metro

import typings.metro.metroStrings.ascii
import typings.metro.metroStrings.utf16le
import typings.metro.metroStrings.utf8
import typings.metro.srcDeltaBundlerTypesMod.TransformInputOptions
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSharedTypesMod {
  
  trait BundleOptions extends StObject {
    
    var bundleType: BundleType
    
    var createModuleIdFactory: js.UndefOr[js.Function0[js.Function1[/* path */ String, Double]]] = js.undefined
    
    val customResolverOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolverOptions */ Any
    
    var customTransformOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomTransformOptions */ Any
    
    var dev: Boolean
    
    var entryFile: String
    
    val excludeSource: Boolean
    
    val hot: Boolean
    
    val inlineSourceMap: Boolean
    
    val `lazy`: Boolean
    
    var minify: Boolean
    
    val modulesOnly: Boolean
    
    var onProgress: js.UndefOr[js.Function2[/* doneCont */ Double, /* totalCount */ Double, Any]] = js.undefined
    
    val platform: js.UndefOr[String] = js.undefined
    
    val runModule: Boolean
    
    var runtimeBytecodeVersion: js.UndefOr[Double] = js.undefined
    
    val shallow: Boolean
    
    var sourceMapUrl: js.UndefOr[String] = js.undefined
    
    var sourceUrl: js.UndefOr[String] = js.undefined
    
    val unstable_transformProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformProfile */ Any
  }
  object BundleOptions {
    
    inline def apply(
      bundleType: BundleType,
      customResolverOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolverOptions */ Any,
      customTransformOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomTransformOptions */ Any,
      dev: Boolean,
      entryFile: String,
      excludeSource: Boolean,
      hot: Boolean,
      inlineSourceMap: Boolean,
      `lazy`: Boolean,
      minify: Boolean,
      modulesOnly: Boolean,
      runModule: Boolean,
      shallow: Boolean,
      unstable_transformProfile: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformProfile */ Any
    ): BundleOptions = {
      val __obj = js.Dynamic.literal(bundleType = bundleType.asInstanceOf[js.Any], customResolverOptions = customResolverOptions.asInstanceOf[js.Any], customTransformOptions = customTransformOptions.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], entryFile = entryFile.asInstanceOf[js.Any], excludeSource = excludeSource.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], inlineSourceMap = inlineSourceMap.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], modulesOnly = modulesOnly.asInstanceOf[js.Any], runModule = runModule.asInstanceOf[js.Any], shallow = shallow.asInstanceOf[js.Any], unstable_transformProfile = unstable_transformProfile.asInstanceOf[js.Any])
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BundleOptions] (val x: Self) extends AnyVal {
      
      inline def setBundleType(value: BundleType): Self = StObject.set(x, "bundleType", value.asInstanceOf[js.Any])
      
      inline def setCreateModuleIdFactory(value: () => js.Function1[/* path */ String, Double]): Self = StObject.set(x, "createModuleIdFactory", js.Any.fromFunction0(value))
      
      inline def setCreateModuleIdFactoryUndefined: Self = StObject.set(x, "createModuleIdFactory", js.undefined)
      
      inline def setCustomResolverOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolverOptions */ Any
      ): Self = StObject.set(x, "customResolverOptions", value.asInstanceOf[js.Any])
      
      inline def setCustomTransformOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomTransformOptions */ Any
      ): Self = StObject.set(x, "customTransformOptions", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setEntryFile(value: String): Self = StObject.set(x, "entryFile", value.asInstanceOf[js.Any])
      
      inline def setExcludeSource(value: Boolean): Self = StObject.set(x, "excludeSource", value.asInstanceOf[js.Any])
      
      inline def setHot(value: Boolean): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setInlineSourceMap(value: Boolean): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setModulesOnly(value: Boolean): Self = StObject.set(x, "modulesOnly", value.asInstanceOf[js.Any])
      
      inline def setOnProgress(value: (/* doneCont */ Double, /* totalCount */ Double) => Any): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setRunModule(value: Boolean): Self = StObject.set(x, "runModule", value.asInstanceOf[js.Any])
      
      inline def setRuntimeBytecodeVersion(value: Double): Self = StObject.set(x, "runtimeBytecodeVersion", value.asInstanceOf[js.Any])
      
      inline def setRuntimeBytecodeVersionUndefined: Self = StObject.set(x, "runtimeBytecodeVersion", js.undefined)
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrl(value: String): Self = StObject.set(x, "sourceMapUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrlUndefined: Self = StObject.set(x, "sourceMapUrl", js.undefined)
      
      inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceUrlUndefined: Self = StObject.set(x, "sourceUrl", js.undefined)
      
      inline def setUnstable_transformProfile(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransformProfile */ Any
      ): Self = StObject.set(x, "unstable_transformProfile", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.metro.metroStrings.bundle
    - typings.metro.metroStrings.delta
    - typings.metro.metroStrings.meta
    - typings.metro.metroStrings.map
    - typings.metro.metroStrings.ram
    - typings.metro.metroStrings.cli
    - typings.metro.metroStrings.hmr
    - typings.metro.metroStrings.todo
    - typings.metro.metroStrings.graph
  */
  trait BundleType extends StObject
  object BundleType {
    
    inline def bundle: typings.metro.metroStrings.bundle = "bundle".asInstanceOf[typings.metro.metroStrings.bundle]
    
    inline def cli: typings.metro.metroStrings.cli = "cli".asInstanceOf[typings.metro.metroStrings.cli]
    
    inline def delta: typings.metro.metroStrings.delta = "delta".asInstanceOf[typings.metro.metroStrings.delta]
    
    inline def graph: typings.metro.metroStrings.graph = "graph".asInstanceOf[typings.metro.metroStrings.graph]
    
    inline def hmr: typings.metro.metroStrings.hmr = "hmr".asInstanceOf[typings.metro.metroStrings.hmr]
    
    inline def map: typings.metro.metroStrings.map = "map".asInstanceOf[typings.metro.metroStrings.map]
    
    inline def meta: typings.metro.metroStrings.meta = "meta".asInstanceOf[typings.metro.metroStrings.meta]
    
    inline def ram: typings.metro.metroStrings.ram = "ram".asInstanceOf[typings.metro.metroStrings.ram]
    
    inline def todo: typings.metro.metroStrings.todo = "todo".asInstanceOf[typings.metro.metroStrings.todo]
  }
  
  trait GraphOptions extends StObject {
    
    val `lazy`: Boolean
    
    val shallow: Boolean
  }
  object GraphOptions {
    
    inline def apply(`lazy`: Boolean, shallow: Boolean): GraphOptions = {
      val __obj = js.Dynamic.literal(shallow = shallow.asInstanceOf[js.Any])
      __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GraphOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GraphOptions] (val x: Self) extends AnyVal {
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setShallow(value: Boolean): Self = StObject.set(x, "shallow", value.asInstanceOf[js.Any])
    }
  }
  
  type MetroSourceMapOrMappings = (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MixedSourceMap */ Any) | (js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetroSourceMapSegmentTuple */ Any
  ])
  
  trait ModuleGroups extends StObject {
    
    var groups: Map[Double, Set[Double]]
    
    var modulesById: Map[Double, ModuleTransportLike]
    
    var modulesInGroups: Set[Double]
  }
  object ModuleGroups {
    
    inline def apply(
      groups: Map[Double, Set[Double]],
      modulesById: Map[Double, ModuleTransportLike],
      modulesInGroups: Set[Double]
    ): ModuleGroups = {
      val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], modulesById = modulesById.asInstanceOf[js.Any], modulesInGroups = modulesInGroups.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleGroups]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleGroups] (val x: Self) extends AnyVal {
      
      inline def setGroups(value: Map[Double, Set[Double]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setModulesById(value: Map[Double, ModuleTransportLike]): Self = StObject.set(x, "modulesById", value.asInstanceOf[js.Any])
      
      inline def setModulesInGroups(value: Set[Double]): Self = StObject.set(x, "modulesInGroups", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleTransportLike extends StObject {
    
    val code: String
    
    val id: Double
    
    val map: MetroSourceMapOrMappings | Null
    
    val name: js.UndefOr[String] = js.undefined
    
    val sourcePath: String
  }
  object ModuleTransportLike {
    
    inline def apply(code: String, id: Double, sourcePath: String): ModuleTransportLike = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], map = null)
      __obj.asInstanceOf[ModuleTransportLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleTransportLike] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMap(value: MetroSourceMapOrMappings): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetroSourceMapSegmentTuple */ Any)*
      ): Self = StObject.set(x, "map", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleTransportLikeStrict extends StObject {
    
    val code: String
    
    val id: Double
    
    val map: MetroSourceMapOrMappings | Null
    
    val name: js.UndefOr[String] = js.undefined
    
    val sourcePath: String
  }
  object ModuleTransportLikeStrict {
    
    inline def apply(code: String, id: Double, sourcePath: String): ModuleTransportLikeStrict = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], map = null)
      __obj.asInstanceOf[ModuleTransportLikeStrict]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleTransportLikeStrict] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMap(value: MetroSourceMapOrMappings): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setMapVarargs(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MetroSourceMapSegmentTuple */ Any)*
      ): Self = StObject.set(x, "map", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSourcePath(value: String): Self = StObject.set(x, "sourcePath", value.asInstanceOf[js.Any])
    }
  }
  
  trait OutputOptions extends StObject {
    
    var bundleEncoding: js.UndefOr[utf8 | utf16le | ascii] = js.undefined
    
    var bundleOutput: String
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var indexedRamBundle: js.UndefOr[Boolean] = js.undefined
    
    var platform: String
    
    var sourcemapOutput: js.UndefOr[String] = js.undefined
    
    var sourcemapSourcesRoot: js.UndefOr[String] = js.undefined
    
    var sourcemapUseAbsolutePath: js.UndefOr[Boolean] = js.undefined
  }
  object OutputOptions {
    
    inline def apply(bundleOutput: String, platform: String): OutputOptions = {
      val __obj = js.Dynamic.literal(bundleOutput = bundleOutput.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutputOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutputOptions] (val x: Self) extends AnyVal {
      
      inline def setBundleEncoding(value: utf8 | utf16le | ascii): Self = StObject.set(x, "bundleEncoding", value.asInstanceOf[js.Any])
      
      inline def setBundleEncodingUndefined: Self = StObject.set(x, "bundleEncoding", js.undefined)
      
      inline def setBundleOutput(value: String): Self = StObject.set(x, "bundleOutput", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setIndexedRamBundle(value: Boolean): Self = StObject.set(x, "indexedRamBundle", value.asInstanceOf[js.Any])
      
      inline def setIndexedRamBundleUndefined: Self = StObject.set(x, "indexedRamBundle", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSourcemapOutput(value: String): Self = StObject.set(x, "sourcemapOutput", value.asInstanceOf[js.Any])
      
      inline def setSourcemapOutputUndefined: Self = StObject.set(x, "sourcemapOutput", js.undefined)
      
      inline def setSourcemapSourcesRoot(value: String): Self = StObject.set(x, "sourcemapSourcesRoot", value.asInstanceOf[js.Any])
      
      inline def setSourcemapSourcesRootUndefined: Self = StObject.set(x, "sourcemapSourcesRoot", js.undefined)
      
      inline def setSourcemapUseAbsolutePath(value: Boolean): Self = StObject.set(x, "sourcemapUseAbsolutePath", value.asInstanceOf[js.Any])
      
      inline def setSourcemapUseAbsolutePathUndefined: Self = StObject.set(x, "sourcemapUseAbsolutePath", js.undefined)
    }
  }
  
  trait RamModuleTransport
    extends StObject
       with ModuleTransportLikeStrict {
    
    val source: String
    
    val `type`: String
  }
  object RamModuleTransport {
    
    inline def apply(code: String, id: Double, source: String, sourcePath: String, `type`: String): RamModuleTransport = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourcePath = sourcePath.asInstanceOf[js.Any], map = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RamModuleTransport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RamModuleTransport] (val x: Self) extends AnyVal {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestOptions extends StObject {
    
    var createModuleIdFactory: js.UndefOr[js.Function0[js.Function1[/* path */ String, Double]]] = js.undefined
    
    var dev: js.UndefOr[Boolean] = js.undefined
    
    var entryFile: String
    
    var inlineSourceMap: js.UndefOr[Boolean] = js.undefined
    
    var minify: Boolean
    
    var onProgress: js.UndefOr[
        js.Function2[/* transformedFileCount */ Double, /* totalFileCount */ Double, Unit]
      ] = js.undefined
    
    var platform: String
    
    var sourceMapUrl: js.UndefOr[String] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(entryFile: String, minify: Boolean, platform: String): RequestOptions = {
      val __obj = js.Dynamic.literal(entryFile = entryFile.asInstanceOf[js.Any], minify = minify.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      inline def setCreateModuleIdFactory(value: () => js.Function1[/* path */ String, Double]): Self = StObject.set(x, "createModuleIdFactory", js.Any.fromFunction0(value))
      
      inline def setCreateModuleIdFactoryUndefined: Self = StObject.set(x, "createModuleIdFactory", js.undefined)
      
      inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setEntryFile(value: String): Self = StObject.set(x, "entryFile", value.asInstanceOf[js.Any])
      
      inline def setInlineSourceMap(value: Boolean): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
      
      inline def setInlineSourceMapUndefined: Self = StObject.set(x, "inlineSourceMap", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setOnProgress(value: (/* transformedFileCount */ Double, /* totalFileCount */ Double) => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrl(value: String): Self = StObject.set(x, "sourceMapUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrlUndefined: Self = StObject.set(x, "sourceMapUrl", js.undefined)
    }
  }
  
  trait ResolverInputOptions extends StObject {
    
    val customResolverOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolverOptions */ Any
      ] = js.undefined
  }
  object ResolverInputOptions {
    
    inline def apply(): ResolverInputOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResolverInputOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResolverInputOptions] (val x: Self) extends AnyVal {
      
      inline def setCustomResolverOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CustomResolverOptions */ Any
      ): Self = StObject.set(x, "customResolverOptions", value.asInstanceOf[js.Any])
      
      inline def setCustomResolverOptionsUndefined: Self = StObject.set(x, "customResolverOptions", js.undefined)
    }
  }
  
  trait SerializerOptions extends StObject {
    
    val excludeSource: Boolean
    
    val inlineSourceMap: Boolean
    
    val modulesOnly: Boolean
    
    val runModule: Boolean
    
    val sourceMapUrl: String | Null
    
    val sourceUrl: String | Null
  }
  object SerializerOptions {
    
    inline def apply(excludeSource: Boolean, inlineSourceMap: Boolean, modulesOnly: Boolean, runModule: Boolean): SerializerOptions = {
      val __obj = js.Dynamic.literal(excludeSource = excludeSource.asInstanceOf[js.Any], inlineSourceMap = inlineSourceMap.asInstanceOf[js.Any], modulesOnly = modulesOnly.asInstanceOf[js.Any], runModule = runModule.asInstanceOf[js.Any], sourceMapUrl = null, sourceUrl = null)
      __obj.asInstanceOf[SerializerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializerOptions] (val x: Self) extends AnyVal {
      
      inline def setExcludeSource(value: Boolean): Self = StObject.set(x, "excludeSource", value.asInstanceOf[js.Any])
      
      inline def setInlineSourceMap(value: Boolean): Self = StObject.set(x, "inlineSourceMap", value.asInstanceOf[js.Any])
      
      inline def setModulesOnly(value: Boolean): Self = StObject.set(x, "modulesOnly", value.asInstanceOf[js.Any])
      
      inline def setRunModule(value: Boolean): Self = StObject.set(x, "runModule", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrl(value: String): Self = StObject.set(x, "sourceMapUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceMapUrlNull: Self = StObject.set(x, "sourceMapUrl", null)
      
      inline def setSourceUrl(value: String): Self = StObject.set(x, "sourceUrl", value.asInstanceOf[js.Any])
      
      inline def setSourceUrlNull: Self = StObject.set(x, "sourceUrl", null)
    }
  }
  
  trait SplitBundleOptions extends StObject {
    
    val entryFile: String
    
    val graphOptions: GraphOptions
    
    val onProgress: (js.Function2[/* numProcessed */ Double, /* total */ Double, Any]) | Null
    
    val resolverOptions: ResolverInputOptions
    
    val serializerOptions: SerializerOptions
    
    val transformOptions: TransformInputOptions
  }
  object SplitBundleOptions {
    
    inline def apply(
      entryFile: String,
      graphOptions: GraphOptions,
      resolverOptions: ResolverInputOptions,
      serializerOptions: SerializerOptions,
      transformOptions: TransformInputOptions
    ): SplitBundleOptions = {
      val __obj = js.Dynamic.literal(entryFile = entryFile.asInstanceOf[js.Any], graphOptions = graphOptions.asInstanceOf[js.Any], resolverOptions = resolverOptions.asInstanceOf[js.Any], serializerOptions = serializerOptions.asInstanceOf[js.Any], transformOptions = transformOptions.asInstanceOf[js.Any], onProgress = null)
      __obj.asInstanceOf[SplitBundleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SplitBundleOptions] (val x: Self) extends AnyVal {
      
      inline def setEntryFile(value: String): Self = StObject.set(x, "entryFile", value.asInstanceOf[js.Any])
      
      inline def setGraphOptions(value: GraphOptions): Self = StObject.set(x, "graphOptions", value.asInstanceOf[js.Any])
      
      inline def setOnProgress(value: (/* numProcessed */ Double, /* total */ Double) => Any): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      inline def setOnProgressNull: Self = StObject.set(x, "onProgress", null)
      
      inline def setResolverOptions(value: ResolverInputOptions): Self = StObject.set(x, "resolverOptions", value.asInstanceOf[js.Any])
      
      inline def setSerializerOptions(value: SerializerOptions): Self = StObject.set(x, "serializerOptions", value.asInstanceOf[js.Any])
      
      inline def setTransformOptions(value: TransformInputOptions): Self = StObject.set(x, "transformOptions", value.asInstanceOf[js.Any])
    }
  }
}
