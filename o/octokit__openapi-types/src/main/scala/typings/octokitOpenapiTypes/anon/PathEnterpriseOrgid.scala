package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterpriseOrgid extends StObject {
  
  var path: EnterpriseOrgid
}
object PathEnterpriseOrgid {
  
  inline def apply(path: EnterpriseOrgid): PathEnterpriseOrgid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterpriseOrgid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnterpriseOrgid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnterpriseOrgid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
