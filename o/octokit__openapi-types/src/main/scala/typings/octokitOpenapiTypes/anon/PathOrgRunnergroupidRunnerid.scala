package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRunnergroupidRunnerid extends StObject {
  
  var path: OrgRunnergroupidRunnerid
}
object PathOrgRunnergroupidRunnerid {
  
  inline def apply(path: OrgRunnergroupidRunnerid): PathOrgRunnergroupidRunnerid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRunnergroupidRunnerid]
  }
  
  extension [Self <: PathOrgRunnergroupidRunnerid](x: Self) {
    
    inline def setPath(value: OrgRunnergroupidRunnerid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
