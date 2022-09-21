package typings.ngPackagr.anon

import typings.angularCompilerCli.performCompileMod.ParsedConfiguration
import typings.ngPackagr.entryPointMod.NgEntryPoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationFiles extends StObject {
  
  var destinationFiles: typings.ngPackagr.entryPointMod.DestinationFiles
  
  var entryPoint: NgEntryPoint
  
  var tsConfig: js.UndefOr[ParsedConfiguration] = js.undefined
}
object DestinationFiles {
  
  inline def apply(destinationFiles: typings.ngPackagr.entryPointMod.DestinationFiles, entryPoint: NgEntryPoint): DestinationFiles = {
    val __obj = js.Dynamic.literal(destinationFiles = destinationFiles.asInstanceOf[js.Any], entryPoint = entryPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationFiles]
  }
  
  extension [Self <: DestinationFiles](x: Self) {
    
    inline def setDestinationFiles(value: typings.ngPackagr.entryPointMod.DestinationFiles): Self = StObject.set(x, "destinationFiles", value.asInstanceOf[js.Any])
    
    inline def setEntryPoint(value: NgEntryPoint): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setTsConfig(value: ParsedConfiguration): Self = StObject.set(x, "tsConfig", value.asInstanceOf[js.Any])
    
    inline def setTsConfigUndefined: Self = StObject.set(x, "tsConfig", js.undefined)
  }
}
