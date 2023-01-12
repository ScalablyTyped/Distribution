package typings.offlineJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OfflineCheck extends StObject {
  
  var url: String
}
object OfflineCheck {
  
  inline def apply(url: String): OfflineCheck = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfflineCheck] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
