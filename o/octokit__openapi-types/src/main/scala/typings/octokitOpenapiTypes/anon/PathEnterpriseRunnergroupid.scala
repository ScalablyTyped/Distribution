package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterpriseRunnergroupid extends StObject {
  
  var path: EnterpriseRunnergroupid
}
object PathEnterpriseRunnergroupid {
  
  inline def apply(path: EnterpriseRunnergroupid): PathEnterpriseRunnergroupid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterpriseRunnergroupid]
  }
  
  extension [Self <: PathEnterpriseRunnergroupid](x: Self) {
    
    inline def setPath(value: EnterpriseRunnergroupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
