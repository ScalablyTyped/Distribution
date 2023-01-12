package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCheckrunidOwner extends StObject {
  
  var path: CheckrunidOwner
}
object PathCheckrunidOwner {
  
  inline def apply(path: CheckrunidOwner): PathCheckrunidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCheckrunidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathCheckrunidOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: CheckrunidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
