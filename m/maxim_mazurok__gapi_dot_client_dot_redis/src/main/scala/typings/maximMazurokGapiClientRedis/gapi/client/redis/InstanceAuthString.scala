package typings.maximMazurokGapiClientRedis.gapi.client.redis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceAuthString extends StObject {
  
  /** AUTH string set on the instance. */
  var authString: js.UndefOr[String] = js.undefined
}
object InstanceAuthString {
  
  @scala.inline
  def apply(): InstanceAuthString = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceAuthString]
  }
  
  @scala.inline
  implicit class InstanceAuthStringMutableBuilder[Self <: InstanceAuthString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthString(value: String): Self = StObject.set(x, "authString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthStringUndefined: Self = StObject.set(x, "authString", js.undefined)
  }
}
