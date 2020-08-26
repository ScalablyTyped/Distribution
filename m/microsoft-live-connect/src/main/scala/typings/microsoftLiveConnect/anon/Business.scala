package typings.microsoftLiveConnect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Business extends js.Object {
  /**
    * The contact's business email address.
    */
  var business: js.UndefOr[String] = js.native
  /**
    * The contact's "alternate" email address.
    */
  var other: js.UndefOr[String] = js.native
  /**
    * The contact's personal email address.
    */
  var personal: js.UndefOr[String] = js.native
  /**
    * The contact's preferred email address.
    */
  var preferred: js.UndefOr[String] = js.native
}

object Business {
  @scala.inline
  def apply(): Business = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Business]
  }
  @scala.inline
  implicit class BusinessOps[Self <: Business] (val x: Self) extends AnyVal {
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
    def setBusiness(value: String): Self = this.set("business", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusiness: Self = this.set("business", js.undefined)
    @scala.inline
    def setOther(value: String): Self = this.set("other", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOther: Self = this.set("other", js.undefined)
    @scala.inline
    def setPersonal(value: String): Self = this.set("personal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersonal: Self = this.set("personal", js.undefined)
    @scala.inline
    def setPreferred(value: String): Self = this.set("preferred", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferred: Self = this.set("preferred", js.undefined)
  }
  
}

