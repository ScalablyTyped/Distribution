package typings.metroFileMap

import typings.metroFileMap.srcCacheDiskCacheManagerMod.DiskCacheConfig
import typings.metroFileMap.srcFlowTypesMod.BuildParameters
import typings.metroFileMap.srcFlowTypesMod.BuildResult
import typings.metroFileMap.srcFlowTypesMod.CacheData
import typings.metroFileMap.srcFlowTypesMod.CacheManager
import typings.metroFileMap.srcFlowTypesMod.CacheManagerFactory
import typings.metroFileMap.srcFlowTypesMod.Console
import typings.metroFileMap.srcFlowTypesMod.DuplicatesSet
import typings.metroFileMap.srcFlowTypesMod.Path
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("metro-file-map/src", JSImport.Default)
  @js.native
  open class default protected () extends HasteMap {
    def this(options: InputOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("metro-file-map/src", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: InputOptions): HasteMap = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[HasteMap]
  }
  
  @JSImport("metro-file-map/src", "DiskCacheManager")
  @js.native
  open class DiskCacheManager protected ()
    extends typings.metroFileMap.srcCacheDiskCacheManagerMod.DiskCacheManager {
    def this(options: DiskCacheConfig) = this()
  }
  /* static members */
  object DiskCacheManager {
    
    @JSImport("metro-file-map/src", "DiskCacheManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCacheFilePath(buildParameters: BuildParameters): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheFilePath")(buildParameters.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getCacheFilePath(buildParameters: BuildParameters, cacheFilePrefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheFilePath")(buildParameters.asInstanceOf[js.Any], cacheFilePrefix.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getCacheFilePath(buildParameters: BuildParameters, cacheFilePrefix: String, cacheDirectory: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheFilePath")(buildParameters.asInstanceOf[js.Any], cacheFilePrefix.asInstanceOf[js.Any], cacheDirectory.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getCacheFilePath(buildParameters: BuildParameters, cacheFilePrefix: Null, cacheDirectory: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheFilePath")(buildParameters.asInstanceOf[js.Any], cacheFilePrefix.asInstanceOf[js.Any], cacheDirectory.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def getCacheFilePath(buildParameters: BuildParameters, cacheFilePrefix: Unit, cacheDirectory: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getCacheFilePath")(buildParameters.asInstanceOf[js.Any], cacheFilePrefix.asInstanceOf[js.Any], cacheDirectory.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  @JSImport("metro-file-map/src", "DuplicateError")
  @js.native
  open class DuplicateError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("metro-file-map/src", "DuplicateHasteCandidatesError")
  @js.native
  open class DuplicateHasteCandidatesError protected ()
    extends typings.metroFileMap.srcLibDuplicateHasteCandidatesErrorMod.DuplicateHasteCandidatesError {
    def this(name: String, platform: String, supportsNativePlatform: Boolean, duplicatesSet: DuplicatesSet) = this()
  }
  
  @JSImport("metro-file-map/src", "HasteMap")
  @js.native
  open class HasteMap protected () extends EventEmitter {
    def this(options: InputOptions) = this()
    
    def build(): js.Promise[BuildResult] = js.native
    
    def read(): js.Promise[CacheData | Null] = js.native
  }
  /* static members */
  object HasteMap {
    
    @JSImport("metro-file-map/src", "HasteMap")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: InputOptions): HasteMap = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[HasteMap]
  }
  
  @JSImport("metro-file-map/src", "ModuleMap")
  @js.native
  open class ModuleMap ()
    extends typings.metroFileMap.srcModuleMapMod.default
  /* static members */
  object ModuleMap {
    
    @JSImport("metro-file-map/src", "ModuleMap")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(rootDir: Path): typings.metroFileMap.srcModuleMapMod.ModuleMap = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rootDir.asInstanceOf[js.Any]).asInstanceOf[typings.metroFileMap.srcModuleMapMod.ModuleMap]
  }
  
  /* Inlined std.Readonly<{  enabled :boolean,   interval :number,   timeout :number,   filePrefix :string}> */
  trait HealthCheckOptions extends StObject {
    
    val enabled: Boolean
    
    val filePrefix: String
    
    val interval: Double
    
    val timeout: Double
  }
  object HealthCheckOptions {
    
    inline def apply(enabled: Boolean, filePrefix: String, interval: Double, timeout: Double): HealthCheckOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], filePrefix = filePrefix.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[HealthCheckOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HealthCheckOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setFilePrefix(value: String): Self = StObject.set(x, "filePrefix", value.asInstanceOf[js.Any])
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Readonly<{  computeDependencies :boolean | null | undefined,   computeSha1 :boolean | null | undefined,   enableSymlinks :boolean | null | undefined,   extensions :std.ReadonlyArray<string>,   forceNodeFilesystemAPI :boolean | null | undefined,   ignorePattern :std.RegExp | null | undefined,   mocksPattern :string | null | undefined,   platforms :std.ReadonlyArray<string>,   retainAllFiles :boolean,   rootDir :string,   roots :std.ReadonlyArray<string>,   skipPackageJson :boolean | null | undefined,   dependencyExtractor :string | null | undefined,   hasteImplModulePath :string | null | undefined,   perfLoggerFactory :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PerfLoggerFactory * / any | null | undefined,   resetCache :boolean | null | undefined,   maxWorkers :number,   throwOnModuleCollision :boolean | null | undefined,   useWatchman :boolean | null | undefined,   watchmanDeferStates :std.ReadonlyArray<string> | undefined,   watch :boolean | null | undefined,   console :metro-file-map.metro-file-map/src/flow-types.Console | undefined,   cacheManagerFactory :metro-file-map.metro-file-map/src/flow-types.CacheManagerFactory | null | undefined,   healthCheck :metro-file-map.metro-file-map/src.HealthCheckOptions}> */
  trait InputOptions extends StObject {
    
    val cacheManagerFactory: js.UndefOr[CacheManagerFactory | Null] = js.undefined
    
    val computeDependencies: js.UndefOr[Boolean | Null] = js.undefined
    
    val computeSha1: js.UndefOr[Boolean | Null] = js.undefined
    
    val console: js.UndefOr[Console] = js.undefined
    
    val dependencyExtractor: js.UndefOr[String | Null] = js.undefined
    
    val enableSymlinks: js.UndefOr[Boolean | Null] = js.undefined
    
    val extensions: js.Array[String]
    
    val forceNodeFilesystemAPI: js.UndefOr[Boolean | Null] = js.undefined
    
    val hasteImplModulePath: js.UndefOr[String | Null] = js.undefined
    
    val healthCheck: HealthCheckOptions
    
    val ignorePattern: js.UndefOr[js.RegExp | Null] = js.undefined
    
    val maxWorkers: Double
    
    val mocksPattern: js.UndefOr[String | Null] = js.undefined
    
    val perfLoggerFactory: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PerfLoggerFactory */ Any) | Null
      ] = js.undefined
    
    val platforms: js.Array[String]
    
    val resetCache: js.UndefOr[Boolean | Null] = js.undefined
    
    val retainAllFiles: Boolean
    
    val rootDir: String
    
    val roots: js.Array[String]
    
    val skipPackageJson: js.UndefOr[Boolean | Null] = js.undefined
    
    val throwOnModuleCollision: js.UndefOr[Boolean | Null] = js.undefined
    
    val useWatchman: js.UndefOr[Boolean | Null] = js.undefined
    
    val watch: js.UndefOr[Boolean | Null] = js.undefined
    
    val watchmanDeferStates: js.UndefOr[js.Array[String]] = js.undefined
  }
  object InputOptions {
    
    inline def apply(
      extensions: js.Array[String],
      healthCheck: HealthCheckOptions,
      maxWorkers: Double,
      platforms: js.Array[String],
      retainAllFiles: Boolean,
      rootDir: String,
      roots: js.Array[String]
    ): InputOptions = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], healthCheck = healthCheck.asInstanceOf[js.Any], maxWorkers = maxWorkers.asInstanceOf[js.Any], platforms = platforms.asInstanceOf[js.Any], retainAllFiles = retainAllFiles.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any], roots = roots.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputOptions] (val x: Self) extends AnyVal {
      
      inline def setCacheManagerFactory(value: /* buildParameters */ BuildParameters => CacheManager): Self = StObject.set(x, "cacheManagerFactory", js.Any.fromFunction1(value))
      
      inline def setCacheManagerFactoryNull: Self = StObject.set(x, "cacheManagerFactory", null)
      
      inline def setCacheManagerFactoryUndefined: Self = StObject.set(x, "cacheManagerFactory", js.undefined)
      
      inline def setComputeDependencies(value: Boolean): Self = StObject.set(x, "computeDependencies", value.asInstanceOf[js.Any])
      
      inline def setComputeDependenciesNull: Self = StObject.set(x, "computeDependencies", null)
      
      inline def setComputeDependenciesUndefined: Self = StObject.set(x, "computeDependencies", js.undefined)
      
      inline def setComputeSha1(value: Boolean): Self = StObject.set(x, "computeSha1", value.asInstanceOf[js.Any])
      
      inline def setComputeSha1Null: Self = StObject.set(x, "computeSha1", null)
      
      inline def setComputeSha1Undefined: Self = StObject.set(x, "computeSha1", js.undefined)
      
      inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setDependencyExtractor(value: String): Self = StObject.set(x, "dependencyExtractor", value.asInstanceOf[js.Any])
      
      inline def setDependencyExtractorNull: Self = StObject.set(x, "dependencyExtractor", null)
      
      inline def setDependencyExtractorUndefined: Self = StObject.set(x, "dependencyExtractor", js.undefined)
      
      inline def setEnableSymlinks(value: Boolean): Self = StObject.set(x, "enableSymlinks", value.asInstanceOf[js.Any])
      
      inline def setEnableSymlinksNull: Self = StObject.set(x, "enableSymlinks", null)
      
      inline def setEnableSymlinksUndefined: Self = StObject.set(x, "enableSymlinks", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setForceNodeFilesystemAPI(value: Boolean): Self = StObject.set(x, "forceNodeFilesystemAPI", value.asInstanceOf[js.Any])
      
      inline def setForceNodeFilesystemAPINull: Self = StObject.set(x, "forceNodeFilesystemAPI", null)
      
      inline def setForceNodeFilesystemAPIUndefined: Self = StObject.set(x, "forceNodeFilesystemAPI", js.undefined)
      
      inline def setHasteImplModulePath(value: String): Self = StObject.set(x, "hasteImplModulePath", value.asInstanceOf[js.Any])
      
      inline def setHasteImplModulePathNull: Self = StObject.set(x, "hasteImplModulePath", null)
      
      inline def setHasteImplModulePathUndefined: Self = StObject.set(x, "hasteImplModulePath", js.undefined)
      
      inline def setHealthCheck(value: HealthCheckOptions): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
      
      inline def setIgnorePattern(value: js.RegExp): Self = StObject.set(x, "ignorePattern", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternNull: Self = StObject.set(x, "ignorePattern", null)
      
      inline def setIgnorePatternUndefined: Self = StObject.set(x, "ignorePattern", js.undefined)
      
      inline def setMaxWorkers(value: Double): Self = StObject.set(x, "maxWorkers", value.asInstanceOf[js.Any])
      
      inline def setMocksPattern(value: String): Self = StObject.set(x, "mocksPattern", value.asInstanceOf[js.Any])
      
      inline def setMocksPatternNull: Self = StObject.set(x, "mocksPattern", null)
      
      inline def setMocksPatternUndefined: Self = StObject.set(x, "mocksPattern", js.undefined)
      
      inline def setPerfLoggerFactory(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PerfLoggerFactory */ Any
      ): Self = StObject.set(x, "perfLoggerFactory", value.asInstanceOf[js.Any])
      
      inline def setPerfLoggerFactoryNull: Self = StObject.set(x, "perfLoggerFactory", null)
      
      inline def setPerfLoggerFactoryUndefined: Self = StObject.set(x, "perfLoggerFactory", js.undefined)
      
      inline def setPlatforms(value: js.Array[String]): Self = StObject.set(x, "platforms", value.asInstanceOf[js.Any])
      
      inline def setPlatformsVarargs(value: String*): Self = StObject.set(x, "platforms", js.Array(value*))
      
      inline def setResetCache(value: Boolean): Self = StObject.set(x, "resetCache", value.asInstanceOf[js.Any])
      
      inline def setResetCacheNull: Self = StObject.set(x, "resetCache", null)
      
      inline def setResetCacheUndefined: Self = StObject.set(x, "resetCache", js.undefined)
      
      inline def setRetainAllFiles(value: Boolean): Self = StObject.set(x, "retainAllFiles", value.asInstanceOf[js.Any])
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setRoots(value: js.Array[String]): Self = StObject.set(x, "roots", value.asInstanceOf[js.Any])
      
      inline def setRootsVarargs(value: String*): Self = StObject.set(x, "roots", js.Array(value*))
      
      inline def setSkipPackageJson(value: Boolean): Self = StObject.set(x, "skipPackageJson", value.asInstanceOf[js.Any])
      
      inline def setSkipPackageJsonNull: Self = StObject.set(x, "skipPackageJson", null)
      
      inline def setSkipPackageJsonUndefined: Self = StObject.set(x, "skipPackageJson", js.undefined)
      
      inline def setThrowOnModuleCollision(value: Boolean): Self = StObject.set(x, "throwOnModuleCollision", value.asInstanceOf[js.Any])
      
      inline def setThrowOnModuleCollisionNull: Self = StObject.set(x, "throwOnModuleCollision", null)
      
      inline def setThrowOnModuleCollisionUndefined: Self = StObject.set(x, "throwOnModuleCollision", js.undefined)
      
      inline def setUseWatchman(value: Boolean): Self = StObject.set(x, "useWatchman", value.asInstanceOf[js.Any])
      
      inline def setUseWatchmanNull: Self = StObject.set(x, "useWatchman", null)
      
      inline def setUseWatchmanUndefined: Self = StObject.set(x, "useWatchman", js.undefined)
      
      inline def setWatch(value: Boolean): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchNull: Self = StObject.set(x, "watch", null)
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
      
      inline def setWatchmanDeferStates(value: js.Array[String]): Self = StObject.set(x, "watchmanDeferStates", value.asInstanceOf[js.Any])
      
      inline def setWatchmanDeferStatesUndefined: Self = StObject.set(x, "watchmanDeferStates", js.undefined)
      
      inline def setWatchmanDeferStatesVarargs(value: String*): Self = StObject.set(x, "watchmanDeferStates", js.Array(value*))
    }
  }
}
