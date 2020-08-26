package typings.passportAzureAd.commonMod

import typings.passportAzureAd.passportAzureAdStrings.error
import typings.passportAzureAd.passportAzureAdStrings.info
import typings.passportAzureAd.passportAzureAdStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBaseStrategyOption extends js.Object {
  var clientID: String = js.native
  var clockSkew: js.UndefOr[Double] = js.native
  var identityMetadata: String = js.native
  var isB2C: js.UndefOr[Boolean] = js.native
  var issuer: js.UndefOr[String | js.Array[String]] = js.native
  var loggingLevel: js.UndefOr[info | warn | error] = js.native
  var loggingNoPII: js.UndefOr[Boolean] = js.native
  var validateIssuer: js.UndefOr[Boolean] = js.native
}

object IBaseStrategyOption {
  @scala.inline
  def apply(clientID: String, identityMetadata: String): IBaseStrategyOption = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBaseStrategyOption]
  }
  @scala.inline
  implicit class IBaseStrategyOptionOps[Self <: IBaseStrategyOption] (val x: Self) extends AnyVal {
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
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentityMetadata(value: String): Self = this.set("identityMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setClockSkew(value: Double): Self = this.set("clockSkew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClockSkew: Self = this.set("clockSkew", js.undefined)
    @scala.inline
    def setIsB2C(value: Boolean): Self = this.set("isB2C", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsB2C: Self = this.set("isB2C", js.undefined)
    @scala.inline
    def setIssuerVarargs(value: String*): Self = this.set("issuer", js.Array(value :_*))
    @scala.inline
    def setIssuer(value: String | js.Array[String]): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    @scala.inline
    def setLoggingLevel(value: info | warn | error): Self = this.set("loggingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingLevel: Self = this.set("loggingLevel", js.undefined)
    @scala.inline
    def setLoggingNoPII(value: Boolean): Self = this.set("loggingNoPII", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingNoPII: Self = this.set("loggingNoPII", js.undefined)
    @scala.inline
    def setValidateIssuer(value: Boolean): Self = this.set("validateIssuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateIssuer: Self = this.set("validateIssuer", js.undefined)
  }
  
}

