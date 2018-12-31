package typings
package phonegapDashFacebookDashPluginLib.PhonegapFacebookPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region API Methods
@js.native
trait FacebookConnectPluginStatic extends js.Object {
  /**
    * Allows access to the Facebook Graph API. This API allows for additional permission because, unlike login, the Graph API can
    * accept multiple permissions. In order to make calls to the Graph API on behalf of a user, the user has to be logged into your
    * app using Facebook login.
    *
    * @param graphPath The graph API path to use for the query.
    * @param permissions The permissions to request.
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def api(graphPath: java.lang.String, permissions: js.Array[java.lang.String]): scala.Unit = js.native
  def api(
    graphPath: java.lang.String,
    permissions: js.Array[java.lang.String],
    successCallback: js.Function1[/* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def api(
    graphPath: java.lang.String,
    permissions: js.Array[java.lang.String],
    successCallback: js.Function1[/* result */ js.Any, scala.Unit],
    failureCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Used to retreive the access token for the current user.
    *
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def getAccessToken(): scala.Unit = js.native
  def getAccessToken(successCallback: js.Function1[/* token */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getAccessToken(
    successCallback: js.Function1[/* token */ java.lang.String, scala.Unit],
    failureCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Used to get the login status for the current user.
    *
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def getLoginStatus(): scala.Unit = js.native
  def getLoginStatus(successCallback: js.Function1[/* status */ LoginResult, scala.Unit]): scala.Unit = js.native
  def getLoginStatus(
    successCallback: js.Function1[/* status */ LoginResult, scala.Unit],
    failureCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Used to log an event.
    *
    * @param name Name of the event.
    * @param params Extra data to log with the event (optional).
    * @param valueToSum a property which is an arbitrary number that can represent any value (e.g., a price or a quantity).
    *          When reported, all of the valueToSum properties will be summed together. For example, if 10 people each purchased
    *          one item that cost $10 (and passed in valueToSum) then they would be summed to report a number of $100. (optional)
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def logEvent(name: java.lang.String): scala.Unit = js.native
  def logEvent(name: java.lang.String, params: js.Any): scala.Unit = js.native
  def logEvent(name: java.lang.String, params: js.Any, valueToSum: scala.Double): scala.Unit = js.native
  def logEvent(
    name: java.lang.String,
    params: js.Any,
    valueToSum: scala.Double,
    successCallback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def logEvent(
    name: java.lang.String,
    params: js.Any,
    valueToSum: scala.Double,
    successCallback: js.Function0[scala.Unit],
    failureCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Used to log a purchase.
    *
    * @param value The value of the purchase.
    * @param currency An ISO-4217 currency code.
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def logPurchase(value: scala.Double, currency: java.lang.String): scala.Unit = js.native
  def logPurchase(value: scala.Double, currency: java.lang.String, successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def logPurchase(
    value: scala.Double,
    currency: java.lang.String,
    successCallback: js.Function0[scala.Unit],
    failureCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Used to log the user in via Facebook. Calling this will result in a Facebook login dialog (or external
    * webpage) launching. Once the user completes the flow, one of the two callbacks will be executed.
    *
    * @param permissions The permissions to request during login.
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def login(permissions: js.Array[java.lang.String]): scala.Unit = js.native
  def login(
    permissions: js.Array[java.lang.String],
    successCallback: js.Function1[/* result */ LoginResult, scala.Unit]
  ): scala.Unit = js.native
  def login(
    permissions: js.Array[java.lang.String],
    successCallback: js.Function1[/* result */ LoginResult, scala.Unit],
    failureCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Used to log the user out of Facebook. This will invalidate their access token.
    *
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def logout(): scala.Unit = js.native
  def logout(successCallback: js.Function0[scala.Unit]): scala.Unit = js.native
  def logout(
    successCallback: js.Function0[scala.Unit],
    failureCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Used to open a Facebook dialog.
    *
    * @param options The options that control the dialog and it's behavior.
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def showDialog(options: BaseDialogOptions): scala.Unit = js.native
  def showDialog(
    options: BaseDialogOptions,
    successCallback: js.Function1[/* status */ BaseDialogResult, scala.Unit]
  ): scala.Unit = js.native
  def showDialog(
    options: BaseDialogOptions,
    successCallback: js.Function1[/* status */ BaseDialogResult, scala.Unit],
    failureCallback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

