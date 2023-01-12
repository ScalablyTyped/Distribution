package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCodespacenameString extends StObject {
  
  var path: CodespacenameString
}
object PathCodespacenameString {
  
  inline def apply(path: CodespacenameString): PathCodespacenameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCodespacenameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCodespacenameString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CodespacenameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
