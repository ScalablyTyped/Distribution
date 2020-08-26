package typings.passportAuth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrategyOption extends js.Object {
  var callbackURL: String = js.native
  var clientID: String = js.native
  var clientSecret: String = js.native
  var domain: String = js.native
  var enableProof: js.UndefOr[Boolean] = js.native
  var profileFields: js.UndefOr[js.Array[String]] = js.native
  var scopeSeparator: js.UndefOr[String] = js.native
  var state: js.UndefOr[Boolean] = js.native
}

object StrategyOption {
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String, domain: String): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOption]
  }
  @scala.inline
  implicit class StrategyOptionOps[Self <: StrategyOption] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableProof(value: Boolean): Self = this.set("enableProof", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableProof: Self = this.set("enableProof", js.undefined)
    @scala.inline
    def setProfileFieldsVarargs(value: String*): Self = this.set("profileFields", js.Array(value :_*))
    @scala.inline
    def setProfileFields(value: js.Array[String]): Self = this.set("profileFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileFields: Self = this.set("profileFields", js.undefined)
    @scala.inline
    def setScopeSeparator(value: String): Self = this.set("scopeSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopeSeparator: Self = this.set("scopeSeparator", js.undefined)
    @scala.inline
    def setState(value: Boolean): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

