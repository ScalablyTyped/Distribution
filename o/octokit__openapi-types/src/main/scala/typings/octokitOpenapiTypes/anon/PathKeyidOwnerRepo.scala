package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathKeyidOwnerRepo extends StObject {
  
  var path: KeyidOwnerRepo
}
object PathKeyidOwnerRepo {
  
  inline def apply(path: KeyidOwnerRepo): PathKeyidOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathKeyidOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathKeyidOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: KeyidOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
