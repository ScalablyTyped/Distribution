package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathName extends StObject {
  
  var path: Name
}
object PathName {
  
  inline def apply(path: Name): PathName = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathName] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Name): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
