package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDnsMxRecord extends DomainDnsRecord {
  // Value used when configuring the answer/destination/value of the MX record at the DNS host.
  var mailExchange: js.UndefOr[String] = js.native
  // Value used when configuring the Preference/Priority property of the MX record at the DNS host.
  var preference: js.UndefOr[Double] = js.native
}

object DomainDnsMxRecord {
  @scala.inline
  def apply(): DomainDnsMxRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsMxRecord]
  }
  @scala.inline
  implicit class DomainDnsMxRecordOps[Self <: DomainDnsMxRecord] (val x: Self) extends AnyVal {
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
    def setMailExchange(value: String): Self = this.set("mailExchange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailExchange: Self = this.set("mailExchange", js.undefined)
    @scala.inline
    def setPreference(value: Double): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
  }
  
}

