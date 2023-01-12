package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRunnergroupidRunnerid extends StObject {
  
  var path: RunnergroupidRunnerid
}
object PathRunnergroupidRunnerid {
  
  inline def apply(path: RunnergroupidRunnerid): PathRunnergroupidRunnerid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRunnergroupidRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRunnergroupidRunnerid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RunnergroupidRunnerid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
