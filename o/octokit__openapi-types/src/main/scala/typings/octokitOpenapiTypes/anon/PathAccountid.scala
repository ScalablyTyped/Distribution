package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAccountid extends StObject {
  
  var path: Accountid
}
object PathAccountid {
  
  inline def apply(path: Accountid): PathAccountid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAccountid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAccountid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Accountid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
