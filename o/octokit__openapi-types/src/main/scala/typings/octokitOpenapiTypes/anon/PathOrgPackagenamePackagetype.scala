package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgPackagenamePackagetype extends StObject {
  
  var path: OrgPackagenamePackagetype
}
object PathOrgPackagenamePackagetype {
  
  inline def apply(path: OrgPackagenamePackagetype): PathOrgPackagenamePackagetype = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgPackagenamePackagetype]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgPackagenamePackagetype] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgPackagenamePackagetype): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
