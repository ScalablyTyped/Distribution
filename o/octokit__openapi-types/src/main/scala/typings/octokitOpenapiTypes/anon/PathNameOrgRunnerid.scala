package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameOrgRunnerid extends StObject {
  
  var path: NameOrgRunnerid
}
object PathNameOrgRunnerid {
  
  inline def apply(path: NameOrgRunnerid): PathNameOrgRunnerid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameOrgRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathNameOrgRunnerid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: NameOrgRunnerid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
