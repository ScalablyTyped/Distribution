package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathNameOwnerRepo extends StObject {
  
  var path: NameOwnerRepo
}
object PathNameOwnerRepo {
  
  inline def apply(path: NameOwnerRepo): PathNameOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathNameOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathNameOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: NameOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
