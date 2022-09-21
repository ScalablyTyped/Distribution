package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgStringRepositoryidNumber extends StObject {
  
  var path: OrgStringRepositoryidNumber
}
object PathOrgStringRepositoryidNumber {
  
  inline def apply(path: OrgStringRepositoryidNumber): PathOrgStringRepositoryidNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgStringRepositoryidNumber]
  }
  
  extension [Self <: PathOrgStringRepositoryidNumber](x: Self) {
    
    inline def setPath(value: OrgStringRepositoryidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
