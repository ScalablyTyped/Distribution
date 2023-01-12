package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceNames extends StObject {
  
  /** List of names provided by the manufacturer rather than the user, such as serial numbers, SKUs, etc. */
  var defaultNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Primary name of the device, generally provided by the user. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Additional names provided by the user for the device. */
  var nicknames: js.UndefOr[js.Array[String]] = js.undefined
}
object DeviceNames {
  
  inline def apply(): DeviceNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceNames] (val x: Self) extends AnyVal {
    
    inline def setDefaultNames(value: js.Array[String]): Self = StObject.set(x, "defaultNames", value.asInstanceOf[js.Any])
    
    inline def setDefaultNamesUndefined: Self = StObject.set(x, "defaultNames", js.undefined)
    
    inline def setDefaultNamesVarargs(value: String*): Self = StObject.set(x, "defaultNames", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNicknames(value: js.Array[String]): Self = StObject.set(x, "nicknames", value.asInstanceOf[js.Any])
    
    inline def setNicknamesUndefined: Self = StObject.set(x, "nicknames", js.undefined)
    
    inline def setNicknamesVarargs(value: String*): Self = StObject.set(x, "nicknames", js.Array(value*))
  }
}
