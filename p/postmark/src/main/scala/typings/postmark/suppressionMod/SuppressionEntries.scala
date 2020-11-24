package typings.postmark.suppressionMod

import typings.postmark.anon.EmailAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuppressionEntries extends js.Object {
  
  var Suppressions: js.Array[EmailAddress] = js.native
}
object SuppressionEntries {
  
  @scala.inline
  def apply(Suppressions: js.Array[EmailAddress]): SuppressionEntries = {
    val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressionEntries]
  }
  
  @scala.inline
  implicit class SuppressionEntriesOps[Self <: SuppressionEntries] (val x: Self) extends AnyVal {
    
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
    def setSuppressionsVarargs(value: EmailAddress*): Self = this.set("Suppressions", js.Array(value :_*))
    
    @scala.inline
    def setSuppressions(value: js.Array[EmailAddress]): Self = this.set("Suppressions", value.asInstanceOf[js.Any])
  }
}
