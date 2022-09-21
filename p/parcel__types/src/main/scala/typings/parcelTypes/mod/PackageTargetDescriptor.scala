package typings.parcelTypes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageTargetDescriptor extends StObject {
  
  val context: js.UndefOr[EnvironmentContext] = js.undefined
  
  val distDir: js.UndefOr[FilePath] = js.undefined
  
  val engines: js.UndefOr[Engines] = js.undefined
  
  val includeNodeModules: js.UndefOr[Boolean | js.Array[PackageName] | (Record[PackageName, Boolean])] = js.undefined
  
  val isLibrary: js.UndefOr[Boolean] = js.undefined
  
  val optimize: js.UndefOr[Boolean] = js.undefined
  
  val outputFormat: js.UndefOr[OutputFormat] = js.undefined
  
  val publicUrl: js.UndefOr[String] = js.undefined
  
  val scopeHoist: js.UndefOr[Boolean] = js.undefined
  
  val source: js.UndefOr[FilePath | js.Array[FilePath]] = js.undefined
  
  val sourceMap: js.UndefOr[Boolean | TargetSourceMapOptions] = js.undefined
}
object PackageTargetDescriptor {
  
  inline def apply(): PackageTargetDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageTargetDescriptor]
  }
  
  extension [Self <: PackageTargetDescriptor](x: Self) {
    
    inline def setContext(value: EnvironmentContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setDistDir(value: FilePath): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setDistDirUndefined: Self = StObject.set(x, "distDir", js.undefined)
    
    inline def setEngines(value: Engines): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
    
    inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
    
    inline def setIncludeNodeModules(value: Boolean | js.Array[PackageName] | (Record[PackageName, Boolean])): Self = StObject.set(x, "includeNodeModules", value.asInstanceOf[js.Any])
    
    inline def setIncludeNodeModulesUndefined: Self = StObject.set(x, "includeNodeModules", js.undefined)
    
    inline def setIncludeNodeModulesVarargs(value: PackageName*): Self = StObject.set(x, "includeNodeModules", js.Array(value*))
    
    inline def setIsLibrary(value: Boolean): Self = StObject.set(x, "isLibrary", value.asInstanceOf[js.Any])
    
    inline def setIsLibraryUndefined: Self = StObject.set(x, "isLibrary", js.undefined)
    
    inline def setOptimize(value: Boolean): Self = StObject.set(x, "optimize", value.asInstanceOf[js.Any])
    
    inline def setOptimizeUndefined: Self = StObject.set(x, "optimize", js.undefined)
    
    inline def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    
    inline def setPublicUrl(value: String): Self = StObject.set(x, "publicUrl", value.asInstanceOf[js.Any])
    
    inline def setPublicUrlUndefined: Self = StObject.set(x, "publicUrl", js.undefined)
    
    inline def setScopeHoist(value: Boolean): Self = StObject.set(x, "scopeHoist", value.asInstanceOf[js.Any])
    
    inline def setScopeHoistUndefined: Self = StObject.set(x, "scopeHoist", js.undefined)
    
    inline def setSource(value: FilePath | js.Array[FilePath]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceMap(value: Boolean | TargetSourceMapOptions): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: FilePath*): Self = StObject.set(x, "source", js.Array(value*))
  }
}
