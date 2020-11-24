package typings.mmdbLib.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsnResponse extends Response {
  
  val autonomous_system_number: Double = js.native
  
  val autonomous_system_organization: String = js.native
  
  var ip_address: js.UndefOr[String] = js.native
}
object AsnResponse {
  
  @scala.inline
  def apply(autonomous_system_number: Double, autonomous_system_organization: String): AsnResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsnResponse]
  }
  
  @scala.inline
  implicit class AsnResponseOps[Self <: AsnResponse] (val x: Self) extends AnyVal {
    
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
    def setAutonomous_system_number(value: Double): Self = this.set("autonomous_system_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutonomous_system_organization(value: String): Self = this.set("autonomous_system_organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp_address(value: String): Self = this.set("ip_address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp_address: Self = this.set("ip_address", js.undefined)
  }
}
