package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathDiscussionnumberOrg extends StObject {
  
  var path: DiscussionnumberOrg
}
object PathDiscussionnumberOrg {
  
  inline def apply(path: DiscussionnumberOrg): PathDiscussionnumberOrg = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathDiscussionnumberOrg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathDiscussionnumberOrg] (val x: Self) extends AnyVal {
    
    inline def setPath(value: DiscussionnumberOrg): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
