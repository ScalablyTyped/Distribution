package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileInvalidation
  extends StObject
     with FileCreateInvalidation {
  
  var filePath: FilePath
}
object FileInvalidation {
  
  inline def apply(filePath: FilePath): FileInvalidation = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInvalidation]
  }
  
  extension [Self <: FileInvalidation](x: Self) {
    
    inline def setFilePath(value: FilePath): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
