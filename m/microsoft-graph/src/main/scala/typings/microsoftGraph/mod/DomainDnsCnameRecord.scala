package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDnsCnameRecord extends DomainDnsRecord {
  // The canonical name of the CNAME record. Used to configure the CNAME record at the DNS host.
  var canonicalName: js.UndefOr[String] = js.native
}

object DomainDnsCnameRecord {
  @scala.inline
  def apply(): DomainDnsCnameRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsCnameRecord]
  }
  @scala.inline
  implicit class DomainDnsCnameRecordOps[Self <: DomainDnsCnameRecord] (val x: Self) extends AnyVal {
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
    def setCanonicalName(value: String): Self = this.set("canonicalName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanonicalName: Self = this.set("canonicalName", js.undefined)
  }
  
}

