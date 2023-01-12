package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerPullnumber extends StObject {
  
  var path: OwnerPullnumber
}
object PathOwnerPullnumber {
  
  inline def apply(path: OwnerPullnumber): PathOwnerPullnumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerPullnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerPullnumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerPullnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
