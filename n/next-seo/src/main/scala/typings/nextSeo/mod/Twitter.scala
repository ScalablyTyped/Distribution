package typings.nextSeo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Twitter extends js.Object {
  var cardType: js.UndefOr[String] = js.native
  var handle: js.UndefOr[String] = js.native
  var site: js.UndefOr[String] = js.native
}

object Twitter {
  @scala.inline
  def apply(): Twitter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Twitter]
  }
  @scala.inline
  implicit class TwitterOps[Self <: Twitter] (val x: Self) extends AnyVal {
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
    def setCardType(value: String): Self = this.set("cardType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardType: Self = this.set("cardType", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setSite(value: String): Self = this.set("site", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSite: Self = this.set("site", js.undefined)
  }
  
}

