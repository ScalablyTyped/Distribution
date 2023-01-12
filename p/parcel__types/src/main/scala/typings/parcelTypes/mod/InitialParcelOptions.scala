package typings.parcelTypes.mod

import typings.parcelPackageManager.libTypesMod.PackageManager
import typings.parcelTypes.anon.DistDir
import typings.parcelTypes.parcelTypesBooleans.`false`
import typings.parcelWorkers.mod.default
import typings.std.Cache
import typings.std.FileSystem
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialParcelOptions extends StObject {
  
  val additionalReporters: js.UndefOr[js.Array[typings.parcelTypes.anon.PackageName]] = js.undefined
  
  val cache: js.UndefOr[Cache] = js.undefined
  
  val cacheDir: js.UndefOr[FilePath] = js.undefined
  
  val config: js.UndefOr[DependencySpecifier] = js.undefined
  
  val defaultConfig: js.UndefOr[DependencySpecifier] = js.undefined
  
  val defaultTargetOptions: js.UndefOr[DistDir] = js.undefined
  
  val detailedReport: js.UndefOr[DetailedReportOptions | Null] = js.undefined
  
  val entries: js.UndefOr[FilePath | js.Array[FilePath]] = js.undefined
  
  val env: js.UndefOr[EnvMap] = js.undefined
  
  val hmrOptions: js.UndefOr[HMROptions | Null] = js.undefined
  
  val inputFS: js.UndefOr[FileSystem] = js.undefined
  
  val logLevel: js.UndefOr[LogLevel] = js.undefined
  
  val mode: js.UndefOr[BuildMode] = js.undefined
  
  val outputFS: js.UndefOr[FileSystem] = js.undefined
  
  val packageManager: js.UndefOr[PackageManager] = js.undefined
  
  val serveOptions: js.UndefOr[InitialServerOptions | `false`] = js.undefined
  
  val shouldAutoInstall: js.UndefOr[Boolean] = js.undefined
  
  val shouldBuildLazily: js.UndefOr[Boolean] = js.undefined
  
  val shouldBundleIncrementally: js.UndefOr[Boolean] = js.undefined
  
  val shouldContentHash: js.UndefOr[Boolean] = js.undefined
  
  val shouldDisableCache: js.UndefOr[Boolean] = js.undefined
  
  val shouldPatchConsole: js.UndefOr[Boolean] = js.undefined
  
  val shouldProfile: js.UndefOr[Boolean] = js.undefined
  
  val targets: js.UndefOr[js.Array[String] | (Record[String, TargetDescriptor]) | Null] = js.undefined
  
  val workerFarm: js.UndefOr[default] = js.undefined
}
object InitialParcelOptions {
  
  inline def apply(): InitialParcelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialParcelOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitialParcelOptions] (val x: Self) extends AnyVal {
    
    inline def setAdditionalReporters(value: js.Array[typings.parcelTypes.anon.PackageName]): Self = StObject.set(x, "additionalReporters", value.asInstanceOf[js.Any])
    
    inline def setAdditionalReportersUndefined: Self = StObject.set(x, "additionalReporters", js.undefined)
    
    inline def setAdditionalReportersVarargs(value: typings.parcelTypes.anon.PackageName*): Self = StObject.set(x, "additionalReporters", js.Array(value*))
    
    inline def setCache(value: Cache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheDir(value: FilePath): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
    
    inline def setCacheDirUndefined: Self = StObject.set(x, "cacheDir", js.undefined)
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setConfig(value: DependencySpecifier): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setDefaultConfig(value: DependencySpecifier): Self = StObject.set(x, "defaultConfig", value.asInstanceOf[js.Any])
    
    inline def setDefaultConfigUndefined: Self = StObject.set(x, "defaultConfig", js.undefined)
    
    inline def setDefaultTargetOptions(value: DistDir): Self = StObject.set(x, "defaultTargetOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultTargetOptionsUndefined: Self = StObject.set(x, "defaultTargetOptions", js.undefined)
    
    inline def setDetailedReport(value: DetailedReportOptions): Self = StObject.set(x, "detailedReport", value.asInstanceOf[js.Any])
    
    inline def setDetailedReportNull: Self = StObject.set(x, "detailedReport", null)
    
    inline def setDetailedReportUndefined: Self = StObject.set(x, "detailedReport", js.undefined)
    
    inline def setEntries(value: FilePath | js.Array[FilePath]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: FilePath*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setEnv(value: EnvMap): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setHmrOptions(value: HMROptions): Self = StObject.set(x, "hmrOptions", value.asInstanceOf[js.Any])
    
    inline def setHmrOptionsNull: Self = StObject.set(x, "hmrOptions", null)
    
    inline def setHmrOptionsUndefined: Self = StObject.set(x, "hmrOptions", js.undefined)
    
    inline def setInputFS(value: FileSystem): Self = StObject.set(x, "inputFS", value.asInstanceOf[js.Any])
    
    inline def setInputFSUndefined: Self = StObject.set(x, "inputFS", js.undefined)
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setMode(value: BuildMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOutputFS(value: FileSystem): Self = StObject.set(x, "outputFS", value.asInstanceOf[js.Any])
    
    inline def setOutputFSUndefined: Self = StObject.set(x, "outputFS", js.undefined)
    
    inline def setPackageManager(value: PackageManager): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setPackageManagerUndefined: Self = StObject.set(x, "packageManager", js.undefined)
    
    inline def setServeOptions(value: InitialServerOptions | `false`): Self = StObject.set(x, "serveOptions", value.asInstanceOf[js.Any])
    
    inline def setServeOptionsUndefined: Self = StObject.set(x, "serveOptions", js.undefined)
    
    inline def setShouldAutoInstall(value: Boolean): Self = StObject.set(x, "shouldAutoInstall", value.asInstanceOf[js.Any])
    
    inline def setShouldAutoInstallUndefined: Self = StObject.set(x, "shouldAutoInstall", js.undefined)
    
    inline def setShouldBuildLazily(value: Boolean): Self = StObject.set(x, "shouldBuildLazily", value.asInstanceOf[js.Any])
    
    inline def setShouldBuildLazilyUndefined: Self = StObject.set(x, "shouldBuildLazily", js.undefined)
    
    inline def setShouldBundleIncrementally(value: Boolean): Self = StObject.set(x, "shouldBundleIncrementally", value.asInstanceOf[js.Any])
    
    inline def setShouldBundleIncrementallyUndefined: Self = StObject.set(x, "shouldBundleIncrementally", js.undefined)
    
    inline def setShouldContentHash(value: Boolean): Self = StObject.set(x, "shouldContentHash", value.asInstanceOf[js.Any])
    
    inline def setShouldContentHashUndefined: Self = StObject.set(x, "shouldContentHash", js.undefined)
    
    inline def setShouldDisableCache(value: Boolean): Self = StObject.set(x, "shouldDisableCache", value.asInstanceOf[js.Any])
    
    inline def setShouldDisableCacheUndefined: Self = StObject.set(x, "shouldDisableCache", js.undefined)
    
    inline def setShouldPatchConsole(value: Boolean): Self = StObject.set(x, "shouldPatchConsole", value.asInstanceOf[js.Any])
    
    inline def setShouldPatchConsoleUndefined: Self = StObject.set(x, "shouldPatchConsole", js.undefined)
    
    inline def setShouldProfile(value: Boolean): Self = StObject.set(x, "shouldProfile", value.asInstanceOf[js.Any])
    
    inline def setShouldProfileUndefined: Self = StObject.set(x, "shouldProfile", js.undefined)
    
    inline def setTargets(value: js.Array[String] | (Record[String, TargetDescriptor])): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsNull: Self = StObject.set(x, "targets", null)
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
    
    inline def setTargetsVarargs(value: String*): Self = StObject.set(x, "targets", js.Array(value*))
    
    inline def setWorkerFarm(value: default): Self = StObject.set(x, "workerFarm", value.asInstanceOf[js.Any])
    
    inline def setWorkerFarmUndefined: Self = StObject.set(x, "workerFarm", js.undefined)
  }
}
