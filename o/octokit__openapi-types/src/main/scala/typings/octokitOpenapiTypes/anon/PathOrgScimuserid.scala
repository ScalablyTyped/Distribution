package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgScimuserid extends StObject {
  
  var path: OrgScimuserid
}
object PathOrgScimuserid {
  
  inline def apply(path: OrgScimuserid): PathOrgScimuserid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgScimuserid]
  }
  
  extension [Self <: PathOrgScimuserid](x: Self) {
    
    inline def setPath(value: OrgScimuserid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
