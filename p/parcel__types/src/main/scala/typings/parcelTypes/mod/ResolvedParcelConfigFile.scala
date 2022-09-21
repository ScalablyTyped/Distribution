package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedParcelConfigFile
  extends StObject
     with RawParcelConfig {
  
  val filePath: FilePath
  
  val resolveFrom: js.UndefOr[FilePath] = js.undefined
}
object ResolvedParcelConfigFile {
  
  inline def apply(filePath: FilePath): ResolvedParcelConfigFile = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedParcelConfigFile]
  }
  
  extension [Self <: ResolvedParcelConfigFile](x: Self) {
    
    inline def setFilePath(value: FilePath): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setResolveFrom(value: FilePath): Self = StObject.set(x, "resolveFrom", value.asInstanceOf[js.Any])
    
    inline def setResolveFromUndefined: Self = StObject.set(x, "resolveFrom", js.undefined)
  }
}
