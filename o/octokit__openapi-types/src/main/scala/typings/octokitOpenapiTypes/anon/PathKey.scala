package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathKey extends StObject {
  
  var path: Key
}
object PathKey {
  
  inline def apply(path: Key): PathKey = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathKey] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Key): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
