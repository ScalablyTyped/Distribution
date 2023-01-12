package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathIssuenumberOwnerReactionid extends StObject {
  
  var path: IssuenumberOwnerReactionid
}
object PathIssuenumberOwnerReactionid {
  
  inline def apply(path: IssuenumberOwnerReactionid): PathIssuenumberOwnerReactionid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathIssuenumberOwnerReactionid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathIssuenumberOwnerReactionid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: IssuenumberOwnerReactionid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
