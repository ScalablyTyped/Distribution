package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOrgPackagename extends StObject {
  
  var path: OrgPackagename
}
object PathOrgPackagename {
  
  inline def apply(path: OrgPackagename): PathOrgPackagename = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOrgPackagename]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOrgPackagename] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OrgPackagename): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
