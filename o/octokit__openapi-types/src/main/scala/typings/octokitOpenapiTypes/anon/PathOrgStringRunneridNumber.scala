package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgStringRunneridNumber extends StObject {
  
  var path: OrgStringRunneridNumber
}
object PathOrgStringRunneridNumber {
  
  inline def apply(path: OrgStringRunneridNumber): PathOrgStringRunneridNumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgStringRunneridNumber]
  }
  
  extension [Self <: PathOrgStringRunneridNumber](x: Self) {
    
    inline def setPath(value: OrgStringRunneridNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
