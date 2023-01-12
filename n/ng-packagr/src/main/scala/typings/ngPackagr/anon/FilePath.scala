package typings.ngPackagr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePath extends StObject {
  
  var content: String
  
  var filePath: String
}
object FilePath {
  
  inline def apply(content: String, filePath: String): FilePath = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilePath] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
