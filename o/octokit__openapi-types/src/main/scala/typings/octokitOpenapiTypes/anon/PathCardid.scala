package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCardid extends StObject {
  
  var path: Cardid
}
object PathCardid {
  
  inline def apply(path: Cardid): PathCardid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCardid]
  }
  
  extension [Self <: PathCardid](x: Self) {
    
    inline def setPath(value: Cardid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
