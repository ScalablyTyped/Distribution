package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathPatid extends StObject {
  
  var path: Patid
}
object PathPatid {
  
  inline def apply(path: Patid): PathPatid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathPatid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathPatid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Patid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
