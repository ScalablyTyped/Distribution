package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeeredDnsDomain extends js.Object {
  
  /** The DNS domain name suffix e.g. `example.com.`. */
  var dnsSuffix: js.UndefOr[String] = js.native
  
  /**
    * User assigned name for this resource. Must be unique within the consumer network. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and
    * only contain lowercase letters, digits or dashes.
    */
  var name: js.UndefOr[String] = js.native
}
object PeeredDnsDomain {
  
  @scala.inline
  def apply(): PeeredDnsDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeredDnsDomain]
  }
  
  @scala.inline
  implicit class PeeredDnsDomainOps[Self <: PeeredDnsDomain] (val x: Self) extends AnyVal {
    
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
    def setDnsSuffix(value: String): Self = this.set("dnsSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsSuffix: Self = this.set("dnsSuffix", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
