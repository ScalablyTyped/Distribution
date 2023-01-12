package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientipRef extends StObject {
  
  /** An alternative IP for default location auto-detection, such as when proxying a request. */
  var client_ip: js.UndefOr[String] = js.undefined
  
  /** The branch or commit to check for a default devcontainer path. If not specified, the default branch will be checked. */
  var ref: js.UndefOr[String] = js.undefined
}
object ClientipRef {
  
  inline def apply(): ClientipRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientipRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientipRef] (val x: Self) extends AnyVal {
    
    inline def setClient_ip(value: String): Self = StObject.set(x, "client_ip", value.asInstanceOf[js.Any])
    
    inline def setClient_ipUndefined: Self = StObject.set(x, "client_ip", js.undefined)
    
    inline def setRef(value: String): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
