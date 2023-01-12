package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPullnumber extends StObject {
  
  var path: Pullnumber
}
object PathPullnumber {
  
  inline def apply(path: Pullnumber): PathPullnumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPullnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPullnumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Pullnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
