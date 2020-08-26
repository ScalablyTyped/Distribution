package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactName extends js.Object {
  var familyName: String = js.native
  var formatted: String = js.native
  var givenName: String = js.native
  var honorificPrefix: String = js.native
  var honorificSuffix: String = js.native
  var middleName: String = js.native
}

object ContactName {
  @scala.inline
  def apply(
    familyName: String,
    formatted: String,
    givenName: String,
    honorificPrefix: String,
    honorificSuffix: String,
    middleName: String
  ): ContactName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], honorificPrefix = honorificPrefix.asInstanceOf[js.Any], honorificSuffix = honorificSuffix.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactName]
  }
  @scala.inline
  implicit class ContactNameOps[Self <: ContactName] (val x: Self) extends AnyVal {
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
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormatted(value: String): Self = this.set("formatted", value.asInstanceOf[js.Any])
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def setHonorificPrefix(value: String): Self = this.set("honorificPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setHonorificSuffix(value: String): Self = this.set("honorificSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
  }
  
}

