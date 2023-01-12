package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRoleid extends StObject {
  
  var path: Roleid
}
object PathRoleid {
  
  inline def apply(path: Roleid): PathRoleid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRoleid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRoleid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Roleid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
