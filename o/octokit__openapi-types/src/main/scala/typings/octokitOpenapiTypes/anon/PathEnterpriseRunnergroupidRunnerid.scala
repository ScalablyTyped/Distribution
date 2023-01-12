package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathEnterpriseRunnergroupidRunnerid extends StObject {
  
  var path: EnterpriseRunnergroupidRunnerid
}
object PathEnterpriseRunnergroupidRunnerid {
  
  inline def apply(path: EnterpriseRunnergroupidRunnerid): PathEnterpriseRunnergroupidRunnerid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathEnterpriseRunnergroupidRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathEnterpriseRunnergroupidRunnerid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: EnterpriseRunnergroupidRunnerid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
