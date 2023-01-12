package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileAboveInvalidation
  extends StObject
     with FileCreateInvalidation {
  
  var aboveFilePath: FilePath
  
  var fileName: String
}
object FileAboveInvalidation {
  
  inline def apply(aboveFilePath: FilePath, fileName: String): FileAboveInvalidation = {
    val __obj = js.Dynamic.literal(aboveFilePath = aboveFilePath.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileAboveInvalidation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileAboveInvalidation] (val x: Self) extends AnyVal {
    
    inline def setAboveFilePath(value: FilePath): Self = StObject.set(x, "aboveFilePath", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
  }
}
