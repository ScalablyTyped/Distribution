package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgidNumber extends StObject {
  
  var path: OrgidNumber
}
object PathOrgidNumber {
  
  inline def apply(path: OrgidNumber): PathOrgidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgidNumber]
  }
  
  extension [Self <: PathOrgidNumber](x: Self) {
    
    inline def setPath(value: OrgidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
