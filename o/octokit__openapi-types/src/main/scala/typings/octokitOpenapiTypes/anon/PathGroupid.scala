package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGroupid extends StObject {
  
  var path: Groupid
}
object PathGroupid {
  
  inline def apply(path: Groupid): PathGroupid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGroupid]
  }
  
  extension [Self <: PathGroupid](x: Self) {
    
    inline def setPath(value: Groupid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
