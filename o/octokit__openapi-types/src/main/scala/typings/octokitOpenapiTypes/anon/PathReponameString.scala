package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReponameString extends StObject {
  
  var path: ReponameString
}
object PathReponameString {
  
  inline def apply(path: ReponameString): PathReponameString = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReponameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathReponameString] (val x: Self) extends AnyVal {
    
    inline def setPath(value: ReponameString): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
