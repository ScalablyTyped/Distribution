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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
