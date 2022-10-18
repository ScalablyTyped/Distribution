package typings.parcelTypes.mod

import typings.parcelPackageManager.libTypesMod.PackageManager
import typings.parcelTypes.parcelTypesBooleans.`false`
import typings.std.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginOptions extends StObject {
  
  val cacheDir: FilePath
  
  val detailedReport: js.UndefOr[DetailedReportOptions | Null] = js.undefined
  
  val env: EnvMap
  
  val hmrOptions: js.UndefOr[HMROptions | Null] = js.undefined
  
  val inputFS: FileSystem
  
  val instanceId: String
  
  val logLevel: LogLevel
  
  val mode: BuildMode
  
  val outputFS: FileSystem
  
  val packageManager: PackageManager
  
  val projectRoot: FilePath
  
  val serveOptions: ServerOptions | `false`
  
  val shouldAutoInstall: Boolean
  
  val shouldBuildLazily: Boolean
}
object PluginOptions {
  
  inline def apply(
    cacheDir: FilePath,
    env: EnvMap,
    inputFS: FileSystem,
    instanceId: String,
    logLevel: LogLevel,
    mode: BuildMode,
    outputFS: FileSystem,
    packageManager: PackageManager,
    projectRoot: FilePath,
    serveOptions: ServerOptions | `false`,
    shouldAutoInstall: Boolean,
    shouldBuildLazily: Boolean
  ): PluginOptions = {
    val __obj = js.Dynamic.literal(cacheDir = cacheDir.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], inputFS = inputFS.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], logLevel = logLevel.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], outputFS = outputFS.asInstanceOf[js.Any], packageManager = packageManager.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any], serveOptions = serveOptions.asInstanceOf[js.Any], shouldAutoInstall = shouldAutoInstall.asInstanceOf[js.Any], shouldBuildLazily = shouldBuildLazily.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOptions]
  }
  
  extension [Self <: PluginOptions](x: Self) {
    
    inline def setCacheDir(value: FilePath): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
    
    inline def setDetailedReport(value: DetailedReportOptions): Self = StObject.set(x, "detailedReport", value.asInstanceOf[js.Any])
    
    inline def setDetailedReportNull: Self = StObject.set(x, "detailedReport", null)
    
    inline def setDetailedReportUndefined: Self = StObject.set(x, "detailedReport", js.undefined)
    
    inline def setEnv(value: EnvMap): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setHmrOptions(value: HMROptions): Self = StObject.set(x, "hmrOptions", value.asInstanceOf[js.Any])
    
    inline def setHmrOptionsNull: Self = StObject.set(x, "hmrOptions", null)
    
    inline def setHmrOptionsUndefined: Self = StObject.set(x, "hmrOptions", js.undefined)
    
    inline def setInputFS(value: FileSystem): Self = StObject.set(x, "inputFS", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setLogLevel(value: LogLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setMode(value: BuildMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOutputFS(value: FileSystem): Self = StObject.set(x, "outputFS", value.asInstanceOf[js.Any])
    
    inline def setPackageManager(value: PackageManager): Self = StObject.set(x, "packageManager", value.asInstanceOf[js.Any])
    
    inline def setProjectRoot(value: FilePath): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
    
    inline def setServeOptions(value: ServerOptions | `false`): Self = StObject.set(x, "serveOptions", value.asInstanceOf[js.Any])
    
    inline def setShouldAutoInstall(value: Boolean): Self = StObject.set(x, "shouldAutoInstall", value.asInstanceOf[js.Any])
    
    inline def setShouldBuildLazily(value: Boolean): Self = StObject.set(x, "shouldBuildLazily", value.asInstanceOf[js.Any])
  }
}
