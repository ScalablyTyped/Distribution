package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgSecretname extends StObject {
  
  var path: OrgSecretname
}
object PathOrgSecretname {
  
  inline def apply(path: OrgSecretname): PathOrgSecretname = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgSecretname]
  }
  
  extension [Self <: PathOrgSecretname](x: Self) {
    
    inline def setPath(value: OrgSecretname): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
