package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgid extends StObject {
  
  var path: Orgid
}
object PathOrgid {
  
  inline def apply(path: Orgid): PathOrgid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Orgid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
