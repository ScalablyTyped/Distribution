package typings.phonegapFacebookPlugin.PhonegapFacebookPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def api(graphPath: String, permissions: js.Array[String]): Unit = js.native
  def api(
    graphPath: String,
    permissions: js.Array[String],
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def api(
    graphPath: String,
    permissions: js.Array[String],
    successCallback: js.Function1[/* result */ js.Any, Unit]
  ): Unit = js.native
  def api(
    graphPath: String,
    permissions: js.Array[String],
    successCallback: js.Function1[/* result */ js.Any, Unit],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  
  /**
    * Used to retreive the access token for the current user.
    *
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def getAccessToken(): Unit = js.native
  def getAccessToken(
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def getAccessToken(successCallback: js.Function1[/* token */ String, Unit]): Unit = js.native
  def getAccessToken(
    successCallback: js.Function1[/* token */ String, Unit],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  
  /**
    * Used to get the login status for the current user.
    *
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def getLoginStatus(): Unit = js.native
  def getLoginStatus(
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def getLoginStatus(successCallback: js.Function1[/* status */ LoginResult, Unit]): Unit = js.native
  def getLoginStatus(
    successCallback: js.Function1[/* status */ LoginResult, Unit],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  
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
  def logEvent(name: String): Unit = js.native
  def logEvent(
    name: String,
    params: js.UndefOr[scala.Nothing],
    valueToSum: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def logEvent(
    name: String,
    params: js.UndefOr[scala.Nothing],
    valueToSum: js.UndefOr[scala.Nothing],
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def logEvent(
    name: String,
    params: js.UndefOr[scala.Nothing],
    valueToSum: js.UndefOr[scala.Nothing],
    successCallback: js.Function0[Unit],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def logEvent(name: String, params: js.UndefOr[scala.Nothing], valueToSum: Double): Unit = js.native
  def logEvent(
    name: String,
    params: js.UndefOr[scala.Nothing],
    valueToSum: Double,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def logEvent(
    name: String,
    params: js.UndefOr[scala.Nothing],
    valueToSum: Double,
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def logEvent(
    name: String,
    params: js.UndefOr[scala.Nothing],
    valueToSum: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def logEvent(name: String, params: js.Any): Unit = js.native
  def logEvent(
    name: String,
    params: js.Any,
    valueToSum: js.UndefOr[scala.Nothing],
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def logEvent(
    name: String,
    params: js.Any,
    valueToSum: js.UndefOr[scala.Nothing],
    successCallback: js.Function0[Unit]
  ): Unit = js.native
  def logEvent(
    name: String,
    params: js.Any,
    valueToSum: js.UndefOr[scala.Nothing],
    successCallback: js.Function0[Unit],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def logEvent(name: String, params: js.Any, valueToSum: Double): Unit = js.native
  def logEvent(
    name: String,
    params: js.Any,
    valueToSum: Double,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def logEvent(name: String, params: js.Any, valueToSum: Double, successCallback: js.Function0[Unit]): Unit = js.native
  def logEvent(
    name: String,
    params: js.Any,
    valueToSum: Double,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  
  /**
    * Used to log a purchase.
    *
    * @param value The value of the purchase.
    * @param currency An ISO-4217 currency code.
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def logPurchase(value: Double, currency: String): Unit = js.native
  def logPurchase(
    value: Double,
    currency: String,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def logPurchase(value: Double, currency: String, successCallback: js.Function0[Unit]): Unit = js.native
  def logPurchase(
    value: Double,
    currency: String,
    successCallback: js.Function0[Unit],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  
  /**
    * Used to log the user in via Facebook. Calling this will result in a Facebook login dialog (or external
    * webpage) launching. Once the user completes the flow, one of the two callbacks will be executed.
    *
    * @param permissions The permissions to request during login.
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def login(permissions: js.Array[String]): Unit = js.native
  def login(
    permissions: js.Array[String],
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def login(permissions: js.Array[String], successCallback: js.Function1[/* result */ LoginResult, Unit]): Unit = js.native
  def login(
    permissions: js.Array[String],
    successCallback: js.Function1[/* result */ LoginResult, Unit],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  
  /**
    * Used to log the user out of Facebook. This will invalidate their access token.
    *
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def logout(): Unit = js.native
  def logout(
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def logout(successCallback: js.Function0[Unit]): Unit = js.native
  def logout(successCallback: js.Function0[Unit], failureCallback: js.Function1[/* error */ String, Unit]): Unit = js.native
  
  /**
    * Used to open a Facebook dialog.
    *
    * @param options The options that control the dialog and it's behavior.
    * @param successCallback The callback to be executed when the call completes successfully.
    * @param failureCallback The callback to be executed when the call fails.
    */
  def showDialog(options: BaseDialogOptions): Unit = js.native
  def showDialog(
    options: BaseDialogOptions,
    successCallback: js.UndefOr[scala.Nothing],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
  def showDialog(options: BaseDialogOptions, successCallback: js.Function1[/* status */ BaseDialogResult, Unit]): Unit = js.native
  def showDialog(
    options: BaseDialogOptions,
    successCallback: js.Function1[/* status */ BaseDialogResult, Unit],
    failureCallback: js.Function1[/* error */ String, Unit]
  ): Unit = js.native
}
