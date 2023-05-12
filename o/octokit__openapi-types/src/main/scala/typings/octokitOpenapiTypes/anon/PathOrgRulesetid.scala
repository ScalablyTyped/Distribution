package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgRulesetid extends StObject {
  
  var path: OrgRulesetid
}
object PathOrgRulesetid {
  
  inline def apply(path: OrgRulesetid): PathOrgRulesetid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgRulesetid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgRulesetid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgRulesetid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
