package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgOwner extends StObject {
  
  var path: OrgOwner
}
object PathOrgOwner {
  
  inline def apply(path: OrgOwner): PathOrgOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgOwner]
  }
  
  extension [Self <: PathOrgOwner](x: Self) {
    
    inline def setPath(value: OrgOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
