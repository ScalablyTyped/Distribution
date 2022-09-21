package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterpriseRunnerid extends StObject {
  
  var path: EnterpriseRunnerid
}
object PathEnterpriseRunnerid {
  
  inline def apply(path: EnterpriseRunnerid): PathEnterpriseRunnerid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterpriseRunnerid]
  }
  
  extension [Self <: PathEnterpriseRunnerid](x: Self) {
    
    inline def setPath(value: EnterpriseRunnerid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
