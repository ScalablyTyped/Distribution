package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathOwnerReleaseid extends StObject {
  
  var path: OwnerReleaseid
}
object PathOwnerReleaseid {
  
  inline def apply(path: OwnerReleaseid): PathOwnerReleaseid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOwnerReleaseid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathOwnerReleaseid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: OwnerReleaseid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
