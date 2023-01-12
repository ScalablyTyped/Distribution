package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCheckrunid extends StObject {
  
  var path: Checkrunid
}
object PathCheckrunid {
  
  inline def apply(path: Checkrunid): PathCheckrunid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCheckrunid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCheckrunid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Checkrunid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
