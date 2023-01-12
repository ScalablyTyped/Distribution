package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerRepo extends StObject {
  
  var path: OwnerRepo
}
object PathOwnerRepo {
  
  inline def apply(path: OwnerRepo): PathOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
