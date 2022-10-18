package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeepAlive extends StObject {
  
  var keepAlive: js.UndefOr[Boolean] = js.undefined
}
object KeepAlive {
  
  inline def apply(): KeepAlive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeepAlive]
  }
  
  extension [Self <: KeepAlive](x: Self) {
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
  }
}
