package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrganizationid extends StObject {
  
  var path: Organizationid
}
object PathOrganizationid {
  
  inline def apply(path: Organizationid): PathOrganizationid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrganizationid]
  }
  
  extension [Self <: PathOrganizationid](x: Self) {
    
    inline def setPath(value: Organizationid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
