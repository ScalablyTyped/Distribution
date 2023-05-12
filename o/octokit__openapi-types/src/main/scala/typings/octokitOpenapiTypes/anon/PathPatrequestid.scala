package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPatrequestid extends StObject {
  
  var path: Patrequestid
}
object PathPatrequestid {
  
  inline def apply(path: Patrequestid): PathPatrequestid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPatrequestid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPatrequestid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Patrequestid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
