package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEventid extends StObject {
  
  var path: Eventid
}
object PathEventid {
  
  inline def apply(path: Eventid): PathEventid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEventid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEventid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Eventid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
