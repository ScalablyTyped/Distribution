package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathGpgkeyid extends StObject {
  
  var path: Gpgkeyid
}
object PathGpgkeyid {
  
  inline def apply(path: Gpgkeyid): PathGpgkeyid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathGpgkeyid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathGpgkeyid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Gpgkeyid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
