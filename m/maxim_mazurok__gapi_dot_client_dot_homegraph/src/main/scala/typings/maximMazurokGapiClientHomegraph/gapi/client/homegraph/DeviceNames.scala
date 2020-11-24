package typings.maximMazurokGapiClientHomegraph.gapi.client.homegraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceNames extends js.Object {
  
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
  implicit class DeviceNamesOps[Self <: DeviceNames] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultNamesVarargs(value: String*): Self = this.set("defaultNames", js.Array(value :_*))
    
    @scala.inline
    def setDefaultNames(value: js.Array[String]): Self = this.set("defaultNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultNames: Self = this.set("defaultNames", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNicknamesVarargs(value: String*): Self = this.set("nicknames", js.Array(value :_*))
    
    @scala.inline
    def setNicknames(value: js.Array[String]): Self = this.set("nicknames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNicknames: Self = this.set("nicknames", js.undefined)
  }
}
