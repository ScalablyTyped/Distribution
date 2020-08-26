package typings.passportVkontakte.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOptions extends js.Object {
  var apiVersion: js.UndefOr[String] = js.native
  var callbackURL: String = js.native
  var clientID: String = js.native
  var clientSecret: String = js.native
  var lang: js.UndefOr[String] = js.native
  var profileFields: js.UndefOr[js.Array[String]] = js.native
}

object StrategyOptions {
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String): StrategyOptions = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptions]
  }
  @scala.inline
  implicit class StrategyOptionsOps[Self <: StrategyOptions] (val x: Self) extends AnyVal {
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
    def setCallbackURL(value: String): Self = this.set("callbackURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setProfileFieldsVarargs(value: String*): Self = this.set("profileFields", js.Array(value :_*))
    @scala.inline
    def setProfileFields(value: js.Array[String]): Self = this.set("profileFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileFields: Self = this.set("profileFields", js.undefined)
  }
  
}

