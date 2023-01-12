package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommentnumberDiscussionnumberOrg extends StObject {
  
  var path: CommentnumberDiscussionnumberOrg
}
object PathCommentnumberDiscussionnumberOrg {
  
  inline def apply(path: CommentnumberDiscussionnumberOrg): PathCommentnumberDiscussionnumberOrg = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommentnumberDiscussionnumberOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCommentnumberDiscussionnumberOrg] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CommentnumberDiscussionnumberOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
