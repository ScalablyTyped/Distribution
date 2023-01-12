package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwnerRepo extends StObject {
  
  var path: IssuenumberOwnerRepo
}
object PathIssuenumberOwnerRepo {
  
  inline def apply(path: IssuenumberOwnerRepo): PathIssuenumberOwnerRepo = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwnerRepo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathIssuenumberOwnerRepo] (val x: Self) extends AnyVal {
    
    inline def setPath(value: IssuenumberOwnerRepo): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
