package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDnsUnavailableRecord extends DomainDnsRecord {
  
  // Provides the reason why the DomainDnsUnavailableRecord entity is returned.
  var description: js.UndefOr[NullableOption[String]] = js.native
}
object DomainDnsUnavailableRecord {
  
  @scala.inline
  def apply(): DomainDnsUnavailableRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsUnavailableRecord]
  }
  
  @scala.inline
  implicit class DomainDnsUnavailableRecordOps[Self <: DomainDnsUnavailableRecord] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
  }
}
