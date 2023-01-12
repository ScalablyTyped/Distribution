package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAlertnumber extends StObject {
  
  var path: Alertnumber
}
object PathAlertnumber {
  
  inline def apply(path: Alertnumber): PathAlertnumber = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAlertnumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAlertnumber] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Alertnumber): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
