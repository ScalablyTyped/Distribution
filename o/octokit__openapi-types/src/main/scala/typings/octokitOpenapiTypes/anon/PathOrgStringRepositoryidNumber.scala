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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgStringRepositoryidNumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgStringRepositoryidNumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
