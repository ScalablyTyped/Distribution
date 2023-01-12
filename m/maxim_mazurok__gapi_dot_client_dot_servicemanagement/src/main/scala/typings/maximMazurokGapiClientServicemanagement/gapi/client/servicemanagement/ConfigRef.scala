package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigRef extends StObject {
  
  /** Resource name of a service config. It must have the following format: "services/{service name}/configs/{config id}". */
  var name: js.UndefOr[String] = js.undefined
}
object ConfigRef {
  
  inline def apply(): ConfigRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigRef] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
