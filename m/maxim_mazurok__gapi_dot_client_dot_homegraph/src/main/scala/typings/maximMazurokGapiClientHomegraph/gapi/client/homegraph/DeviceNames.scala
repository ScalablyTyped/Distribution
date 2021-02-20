package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceNames extends StObject {
  
  /** List of names provided by the manufacturer rather than the user, such as serial numbers, SKUs, etc. */
  var defaultNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Primary name of the device, generally provided by the user. */
  var name: js.UndefOr[String] = js.native
  
  /** Additional names provided by the user for the device. */
  var nicknames: js.UndefOr[js.Array[String]] = js.native
}
object DeviceNames {
  
  @scala.inline
  def apply(): DeviceNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceNames]
  }
  
  @scala.inline
  implicit class DeviceNamesMutableBuilder[Self <: DeviceNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultNames(value: js.Array[String]): Self = StObject.set(x, "defaultNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNamesUndefined: Self = StObject.set(x, "defaultNames", js.undefined)
    
    @scala.inline
    def setDefaultNamesVarargs(value: String*): Self = StObject.set(x, "defaultNames", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNicknames(value: js.Array[String]): Self = StObject.set(x, "nicknames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknamesUndefined: Self = StObject.set(x, "nicknames", js.undefined)
    
    @scala.inline
    def setNicknamesVarargs(value: String*): Self = StObject.set(x, "nicknames", js.Array(value :_*))
  }
}
