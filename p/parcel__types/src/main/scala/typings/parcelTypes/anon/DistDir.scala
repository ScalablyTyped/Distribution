package typings.parcelTypes.anon

import typings.parcelTypes.mod.Engines
import typings.parcelTypes.mod.FilePath
import typings.parcelTypes.mod.OutputFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistDir extends StObject {
  
  val distDir: js.UndefOr[FilePath] = js.undefined
  
  val engines: js.UndefOr[Engines] = js.undefined
  
  val isLibrary: js.UndefOr[Boolean] = js.undefined
  
  val outputFormat: js.UndefOr[OutputFormat] = js.undefined
  
  val publicUrl: js.UndefOr[String] = js.undefined
  
  val shouldOptimize: js.UndefOr[Boolean] = js.undefined
  
  val shouldScopeHoist: js.UndefOr[Boolean] = js.undefined
  
  val sourceMaps: js.UndefOr[Boolean] = js.undefined
}
object DistDir {
  
  inline def apply(): DistDir = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistDir]
  }
  
  extension [Self <: DistDir](x: Self) {
    
    inline def setDistDir(value: FilePath): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setDistDirUndefined: Self = StObject.set(x, "distDir", js.undefined)
    
    inline def setEngines(value: Engines): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
    
    inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
    
    inline def setIsLibrary(value: Boolean): Self = StObject.set(x, "isLibrary", value.asInstanceOf[js.Any])
    
    inline def setIsLibraryUndefined: Self = StObject.set(x, "isLibrary", js.undefined)
    
    inline def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    
    inline def setPublicUrl(value: String): Self = StObject.set(x, "publicUrl", value.asInstanceOf[js.Any])
    
    inline def setPublicUrlUndefined: Self = StObject.set(x, "publicUrl", js.undefined)
    
    inline def setShouldOptimize(value: Boolean): Self = StObject.set(x, "shouldOptimize", value.asInstanceOf[js.Any])
    
    inline def setShouldOptimizeUndefined: Self = StObject.set(x, "shouldOptimize", js.undefined)
    
    inline def setShouldScopeHoist(value: Boolean): Self = StObject.set(x, "shouldScopeHoist", value.asInstanceOf[js.Any])
    
    inline def setShouldScopeHoistUndefined: Self = StObject.set(x, "shouldScopeHoist", js.undefined)
    
    inline def setSourceMaps(value: Boolean): Self = StObject.set(x, "sourceMaps", value.asInstanceOf[js.Any])
    
    inline def setSourceMapsUndefined: Self = StObject.set(x, "sourceMaps", js.undefined)
  }
}
