package typings.paypalRestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  var amount: Amount = js.native
  val create_time: js.UndefOr[String] = js.native
  val fmf_details: js.UndefOr[FraudManagementFiltersDetails] = js.native
  val id: String = js.native
  val links: js.UndefOr[js.Array[Link]] = js.native
  val parent_payment: js.UndefOr[String] = js.native
  val payment_mode: js.UndefOr[String] = js.native
  val processor_response: js.UndefOr[js.Any] = js.native
  val protection_eligibility: js.UndefOr[String] = js.native
  val protection_eligibility_type: js.UndefOr[String] = js.native
  val reason_code: js.UndefOr[String] = js.native
  val receipt_id: js.UndefOr[String] = js.native
  val state: js.UndefOr[String] = js.native
  val update_time: js.UndefOr[String] = js.native
}

object Resource {
  @scala.inline
  def apply(amount: Amount, id: String): Resource = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
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
    def setAmount(value: Amount): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate_time(value: String): Self = this.set("create_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreate_time: Self = this.set("create_time", js.undefined)
    @scala.inline
    def setFmf_details(value: FraudManagementFiltersDetails): Self = this.set("fmf_details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFmf_details: Self = this.set("fmf_details", js.undefined)
    @scala.inline
    def setLinksVarargs(value: Link*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[Link]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setParent_payment(value: String): Self = this.set("parent_payment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent_payment: Self = this.set("parent_payment", js.undefined)
    @scala.inline
    def setPayment_mode(value: String): Self = this.set("payment_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayment_mode: Self = this.set("payment_mode", js.undefined)
    @scala.inline
    def setProcessor_response(value: js.Any): Self = this.set("processor_response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessor_response: Self = this.set("processor_response", js.undefined)
    @scala.inline
    def setProtection_eligibility(value: String): Self = this.set("protection_eligibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection_eligibility: Self = this.set("protection_eligibility", js.undefined)
    @scala.inline
    def setProtection_eligibility_type(value: String): Self = this.set("protection_eligibility_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection_eligibility_type: Self = this.set("protection_eligibility_type", js.undefined)
    @scala.inline
    def setReason_code(value: String): Self = this.set("reason_code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason_code: Self = this.set("reason_code", js.undefined)
    @scala.inline
    def setReceipt_id(value: String): Self = this.set("receipt_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceipt_id: Self = this.set("receipt_id", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setUpdate_time(value: String): Self = this.set("update_time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate_time: Self = this.set("update_time", js.undefined)
  }
  
}

