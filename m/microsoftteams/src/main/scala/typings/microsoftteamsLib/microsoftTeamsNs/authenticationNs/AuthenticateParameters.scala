package typings
package microsoftteamsLib.microsoftTeamsNs.authenticationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateParameters extends js.Object {
  /**
    * A function that is called if the authentication fails, with the reason for the failure returned from the authentication pop-up.
    */
  var failureCallback: js.UndefOr[js.Function1[/* reason */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /**
    * The preferred height for the pop-up. This value can be ignored if outside the acceptable bounds.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * A function that is called if the authentication succeeds, with the result returned from the authentication pop-up.
    */
  var successCallback: js.UndefOr[js.Function1[/* result */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /**
    * The URL for the authentication pop-up.
    */
  var url: java.lang.String
  /**
    * The preferred width for the pop-up. This value can be ignored if outside the acceptable bounds.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object AuthenticateParameters {
  @scala.inline
  def apply(
    url: java.lang.String,
    failureCallback: js.Function1[/* reason */ js.UndefOr[java.lang.String], scala.Unit] = null,
    height: scala.Int | scala.Double = null,
    successCallback: js.Function1[/* result */ js.UndefOr[java.lang.String], scala.Unit] = null,
    width: scala.Int | scala.Double = null
  ): AuthenticateParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    if (failureCallback != null) __obj.updateDynamic("failureCallback")(failureCallback)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (successCallback != null) __obj.updateDynamic("successCallback")(successCallback)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateParameters]
  }
}

