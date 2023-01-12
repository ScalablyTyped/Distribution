package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwner extends StObject {
  
  var path: IssuenumberOwner
}
object PathIssuenumberOwner {
  
  inline def apply(path: IssuenumberOwner): PathIssuenumberOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathIssuenumberOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: IssuenumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
