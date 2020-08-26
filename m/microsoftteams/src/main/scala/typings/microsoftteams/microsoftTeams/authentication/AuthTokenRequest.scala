package typings.microsoftteams.microsoftTeams.authentication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthTokenRequest extends js.Object {
  /**
    * A function that is called if the token request fails, with the reason for the failure.
    */
  var failureCallback: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.native
  /**
    * An array of resource URIs identifying the target resources for which the token should be requested.
    */
  var resources: js.Array[String] = js.native
  /**
    * A function that is called if the token request succeeds, with the resulting token.
    */
  var successCallback: js.UndefOr[js.Function1[/* token */ String, Unit]] = js.native
}

object AuthTokenRequest {
  @scala.inline
  def apply(resources: js.Array[String]): AuthTokenRequest = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthTokenRequest]
  }
  @scala.inline
  implicit class AuthTokenRequestOps[Self <: AuthTokenRequest] (val x: Self) extends AnyVal {
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
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureCallback(value: /* reason */ String => Unit): Self = this.set("failureCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFailureCallback: Self = this.set("failureCallback", js.undefined)
    @scala.inline
    def setSuccessCallback(value: /* token */ String => Unit): Self = this.set("successCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccessCallback: Self = this.set("successCallback", js.undefined)
  }
  
}

