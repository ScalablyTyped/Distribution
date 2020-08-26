package typings.microsoftteams.microsoftTeams.authentication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateParameters extends js.Object {
  /**
    * A function that is called if the authentication fails, with the reason for the failure returned from the authentication pop-up.
    */
  var failureCallback: js.UndefOr[js.Function1[/* reason */ js.UndefOr[String], Unit]] = js.native
  /**
    * The preferred height for the pop-up. This value can be ignored if outside the acceptable bounds.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * A function that is called if the authentication succeeds, with the result returned from the authentication pop-up.
    */
  var successCallback: js.UndefOr[js.Function1[/* result */ js.UndefOr[String], Unit]] = js.native
  /**
    * The URL for the authentication pop-up.
    */
  var url: String = js.native
  /**
    * The preferred width for the pop-up. This value can be ignored if outside the acceptable bounds.
    */
  var width: js.UndefOr[Double] = js.native
}

object AuthenticateParameters {
  @scala.inline
  def apply(url: String): AuthenticateParameters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateParameters]
  }
  @scala.inline
  implicit class AuthenticateParametersOps[Self <: AuthenticateParameters] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureCallback(value: /* reason */ js.UndefOr[String] => Unit): Self = this.set("failureCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFailureCallback: Self = this.set("failureCallback", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setSuccessCallback(value: /* result */ js.UndefOr[String] => Unit): Self = this.set("successCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccessCallback: Self = this.set("successCallback", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

