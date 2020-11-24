package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedZoneDnsSecConfig extends js.Object {
  
  /** Specifies parameters for generating initial DnsKeys for this ManagedZone. Can only be changed while the state is OFF. */
  var defaultKeySpecs: js.UndefOr[js.Array[DnsKeySpec]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  /** Specifies the mechanism for authenticated denial-of-existence responses. Can only be changed while the state is OFF. */
  var nonExistence: js.UndefOr[String] = js.native
  
  /** Specifies whether DNSSEC is enabled, and what mode it is in. */
  var state: js.UndefOr[String] = js.native
}
object ManagedZoneDnsSecConfig {
  
  @scala.inline
  def apply(): ManagedZoneDnsSecConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedZoneDnsSecConfig]
  }
  
  @scala.inline
  implicit class ManagedZoneDnsSecConfigOps[Self <: ManagedZoneDnsSecConfig] (val x: Self) extends AnyVal {
    
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
    def setDefaultKeySpecsVarargs(value: DnsKeySpec*): Self = this.set("defaultKeySpecs", js.Array(value :_*))
    
    @scala.inline
    def setDefaultKeySpecs(value: js.Array[DnsKeySpec]): Self = this.set("defaultKeySpecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultKeySpecs: Self = this.set("defaultKeySpecs", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNonExistence(value: String): Self = this.set("nonExistence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonExistence: Self = this.set("nonExistence", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
