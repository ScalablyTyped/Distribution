package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Env extends StObject {
  
  var apiUrl: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var uaAddendum: js.UndefOr[String] = js.undefined
}
object Env {
  
  inline def apply(): Env = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Env]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Env] (val x: Self) extends AnyVal {
    
    inline def setApiUrl(value: String): Self = StObject.set(x, "apiUrl", value.asInstanceOf[js.Any])
    
    inline def setApiUrlUndefined: Self = StObject.set(x, "apiUrl", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUaAddendum(value: String): Self = StObject.set(x, "uaAddendum", value.asInstanceOf[js.Any])
    
    inline def setUaAddendumUndefined: Self = StObject.set(x, "uaAddendum", js.undefined)
  }
}
