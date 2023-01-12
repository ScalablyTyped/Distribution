package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathKeyidOwner extends StObject {
  
  var path: KeyidOwner
}
object PathKeyidOwner {
  
  inline def apply(path: KeyidOwner): PathKeyidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathKeyidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathKeyidOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: KeyidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
