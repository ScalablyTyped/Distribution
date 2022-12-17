package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAccountid extends StObject {
  
  var path: Accountid
}
object PathAccountid {
  
  inline def apply(path: Accountid): PathAccountid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAccountid]
  }
  
  extension [Self <: PathAccountid](x: Self) {
    
    inline def setPath(value: Accountid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
