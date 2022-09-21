package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.parcelTypes.mod.FileInvalidation
  - typings.parcelTypes.mod.GlobInvalidation
  - typings.parcelTypes.mod.FileAboveInvalidation
*/
trait FileCreateInvalidation extends StObject
object FileCreateInvalidation {
  
  inline def FileAboveInvalidation(aboveFilePath: FilePath, fileName: String): typings.parcelTypes.mod.FileAboveInvalidation = {
    val __obj = js.Dynamic.literal(aboveFilePath = aboveFilePath.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parcelTypes.mod.FileAboveInvalidation]
  }
  
  inline def FileInvalidation(filePath: FilePath): typings.parcelTypes.mod.FileInvalidation = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parcelTypes.mod.FileInvalidation]
  }
  
  inline def GlobInvalidation(glob: Glob): typings.parcelTypes.mod.GlobInvalidation = {
    val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.parcelTypes.mod.GlobInvalidation]
  }
}
