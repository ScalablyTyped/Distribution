package typings.postmark.suppressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Suppression extends js.Object {
  
  var CreatedAt: String = js.native
  
  var EmailAddress: String = js.native
  
  var Origin: String = js.native
  
  var SuppressionReason: String = js.native
}
object Suppression {
  
  @scala.inline
  def apply(CreatedAt: String, EmailAddress: String, Origin: String, SuppressionReason: String): Suppression = {
    val __obj = js.Dynamic.literal(CreatedAt = CreatedAt.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], Origin = Origin.asInstanceOf[js.Any], SuppressionReason = SuppressionReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suppression]
  }
  
  @scala.inline
  implicit class SuppressionOps[Self <: Suppression] (val x: Self) extends AnyVal {
    
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
    def setCreatedAt(value: String): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = this.set("Origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressionReason(value: String): Self = this.set("SuppressionReason", value.asInstanceOf[js.Any])
  }
}
