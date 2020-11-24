package typings.passportLocalMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassportLocalOptions extends js.Object {
  
  var attemptsField: js.UndefOr[String] = js.native
  
  var digestAlgorithm: js.UndefOr[String] = js.native
  
  var encoding: js.UndefOr[String] = js.native
  
  var errorMessages: js.UndefOr[PassportLocalErrorMessages] = js.native
  
  var hashField: js.UndefOr[String] = js.native
  
  var interval: js.UndefOr[Double] = js.native
  
  var iterations: js.UndefOr[Double] = js.native
  
  var keylen: js.UndefOr[Double] = js.native
  
  var lastLoginField: js.UndefOr[String] = js.native
  
  var limitAttempts: js.UndefOr[Boolean] = js.native
  
  var maxAttempts: js.UndefOr[Double] = js.native
  
  var maxInterval: js.UndefOr[Double] = js.native
  
  var passwordValidator: js.UndefOr[
    js.Function2[/* password */ String, /* cb */ js.Function1[/* err */ js.Any, Unit], Unit]
  ] = js.native
  
  var populateFields: js.UndefOr[String] = js.native
  
  var saltField: js.UndefOr[String] = js.native
  
  var saltlen: js.UndefOr[Double] = js.native
  
  var selectFields: js.UndefOr[String] = js.native
  
  var usernameField: js.UndefOr[String] = js.native
  
  var usernameLowerCase: js.UndefOr[Boolean] = js.native
  
  var usernameQueryFields: js.Array[String] = js.native
  
  var usernameUnique: js.UndefOr[Boolean] = js.native
}
object PassportLocalOptions {
  
  @scala.inline
  def apply(usernameQueryFields: js.Array[String]): PassportLocalOptions = {
    val __obj = js.Dynamic.literal(usernameQueryFields = usernameQueryFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassportLocalOptions]
  }
  
  @scala.inline
  implicit class PassportLocalOptionsOps[Self <: PassportLocalOptions] (val x: Self) extends AnyVal {
    
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
    def setUsernameQueryFieldsVarargs(value: String*): Self = this.set("usernameQueryFields", js.Array(value :_*))
    
    @scala.inline
    def setUsernameQueryFields(value: js.Array[String]): Self = this.set("usernameQueryFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptsField(value: String): Self = this.set("attemptsField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttemptsField: Self = this.set("attemptsField", js.undefined)
    
    @scala.inline
    def setDigestAlgorithm(value: String): Self = this.set("digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigestAlgorithm: Self = this.set("digestAlgorithm", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setErrorMessages(value: PassportLocalErrorMessages): Self = this.set("errorMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessages: Self = this.set("errorMessages", js.undefined)
    
    @scala.inline
    def setHashField(value: String): Self = this.set("hashField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashField: Self = this.set("hashField", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setIterations(value: Double): Self = this.set("iterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterations: Self = this.set("iterations", js.undefined)
    
    @scala.inline
    def setKeylen(value: Double): Self = this.set("keylen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeylen: Self = this.set("keylen", js.undefined)
    
    @scala.inline
    def setLastLoginField(value: String): Self = this.set("lastLoginField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastLoginField: Self = this.set("lastLoginField", js.undefined)
    
    @scala.inline
    def setLimitAttempts(value: Boolean): Self = this.set("limitAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitAttempts: Self = this.set("limitAttempts", js.undefined)
    
    @scala.inline
    def setMaxAttempts(value: Double): Self = this.set("maxAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAttempts: Self = this.set("maxAttempts", js.undefined)
    
    @scala.inline
    def setMaxInterval(value: Double): Self = this.set("maxInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInterval: Self = this.set("maxInterval", js.undefined)
    
    @scala.inline
    def setPasswordValidator(value: (/* password */ String, /* cb */ js.Function1[/* err */ js.Any, Unit]) => Unit): Self = this.set("passwordValidator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePasswordValidator: Self = this.set("passwordValidator", js.undefined)
    
    @scala.inline
    def setPopulateFields(value: String): Self = this.set("populateFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopulateFields: Self = this.set("populateFields", js.undefined)
    
    @scala.inline
    def setSaltField(value: String): Self = this.set("saltField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaltField: Self = this.set("saltField", js.undefined)
    
    @scala.inline
    def setSaltlen(value: Double): Self = this.set("saltlen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaltlen: Self = this.set("saltlen", js.undefined)
    
    @scala.inline
    def setSelectFields(value: String): Self = this.set("selectFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectFields: Self = this.set("selectFields", js.undefined)
    
    @scala.inline
    def setUsernameField(value: String): Self = this.set("usernameField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameField: Self = this.set("usernameField", js.undefined)
    
    @scala.inline
    def setUsernameLowerCase(value: Boolean): Self = this.set("usernameLowerCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameLowerCase: Self = this.set("usernameLowerCase", js.undefined)
    
    @scala.inline
    def setUsernameUnique(value: Boolean): Self = this.set("usernameUnique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsernameUnique: Self = this.set("usernameUnique", js.undefined)
  }
}
