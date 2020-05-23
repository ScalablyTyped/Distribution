package typings.microsoftteams.microsoftTeams.authentication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateParameters extends js.Object {
  /**
    * A function that is called if the authentication fails, with the reason for the failure returned from the authentication pop-up.
    */
  var failureCallback: js.UndefOr[js.Function1[/* reason */ js.UndefOr[String], Unit]] = js.undefined
  /**
    * The preferred height for the pop-up. This value can be ignored if outside the acceptable bounds.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * A function that is called if the authentication succeeds, with the result returned from the authentication pop-up.
    */
  var successCallback: js.UndefOr[js.Function1[/* result */ js.UndefOr[String], Unit]] = js.undefined
  /**
    * The URL for the authentication pop-up.
    */
  var url: String
  /**
    * The preferred width for the pop-up. This value can be ignored if outside the acceptable bounds.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object AuthenticateParameters {
  @scala.inline
  def apply(
    url: String,
    failureCallback: /* reason */ js.UndefOr[String] => Unit = null,
    height: js.UndefOr[Double] = js.undefined,
    successCallback: /* result */ js.UndefOr[String] => Unit = null,
    width: js.UndefOr[Double] = js.undefined
  ): AuthenticateParameters = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (failureCallback != null) __obj.updateDynamic("failureCallback")(js.Any.fromFunction1(failureCallback))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (successCallback != null) __obj.updateDynamic("successCallback")(js.Any.fromFunction1(successCallback))
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateParameters]
  }
}

