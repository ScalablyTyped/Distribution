package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRunnerid extends StObject {
  
  var path: OrgRunnerid
}
object PathOrgRunnerid {
  
  inline def apply(path: OrgRunnerid): PathOrgRunnerid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRunnerid]
  }
  
  extension [Self <: PathOrgRunnerid](x: Self) {
    
    inline def setPath(value: OrgRunnerid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
