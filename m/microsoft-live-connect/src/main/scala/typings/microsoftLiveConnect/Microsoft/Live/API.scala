package typings.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Live Connect JavaScript API (Windows 8 and web), together with the
  * REST API, enables apps to read, update, and share user data by using the
  * JavaScript programming language. The JavaScript API (Windows 8 and web)
  * provides methods for signing users in and out, getting user status,
  * subscribing to events, creating UI controls, and calling the
  * Representational State Transfer (REST) API.
  */
@js.native
trait API extends js.Object {
  var Event: IEventAPI = js.native
  /**
    * Makes a call to the Live Connect Representational State Transfer
    * (REST) API. This method encapsulates a REST API request, and then
    * calls a callback function to process the response.
    * @param properties Required. A JSON object that contains properties
    *   that are necessary to make the REST API call.
    * @param callback Specifies a callback function that is executed when
    *   the REST API call is complete. The callback function takes the API
    *   response object as a parameter. The response object exposes the
    *   data returned from Live Connect, or, if an error occurs, an error
    *   property that contains the error code.
    * @returns Returns a Promise object. This object's then method provides
    *   the onSuccess, onError, and onProgress parameters to enable your
    *   code to handle a successful, failed, and in-progress call to the
    *   corresponding WL.api method, respectively.
    */
  def api[T](properties: IAPIProperties): IPromise[T] = js.native
  def api[T](properties: IAPIProperties, callback: js.Function1[/* response */ js.Any, Unit]): IPromise[T] = js.native
  /**
    * Makes a call to download a file from Microsoft SkyDrive.
    *
    * **Important**:  WL.backgroundDownload is supported only for use with
    * Windows Store apps using JavaScript. If you are writing a web app,
    * use WL.download instead.
    * @param properties Required. A JSON object that contains properties
    *   that are necessary to make the REST API call.
    * @param Optional. Specifies a callback function that is executed when
    *   the REST API call is complete. The callback function takes the API
    *   response object as a parameter. The response object exposes the
    *   data that is returned from Live Connect, or, if an error occurs, an
    *   error property that contains the error code.
    * @returns Returns a Promise object. This object's then method accepts
    *   callback functions for onSuccess, onError, and onProgress to enable
    *   your code to handle a successful, failed, and in-progress call to
    *   the corresponding WL.download method, respectively.
    *   The onSuccess callback is passed a response object that contains
    *   content_type and stream properties, representing the downloaded
    *   file's content type and file stream, respectively.
    */
  def backgroundDownload[T](properties: IBackgroundDownloadProperties): IPromise[T] = js.native
  def backgroundDownload[T](properties: IBackgroundDownloadProperties, callback: js.Function1[/* response */ js.Any, Unit]): IPromise[T] = js.native
  /**
    * Makes a call to upload a file to Microsoft SkyDrive.
    *
    * **Important**: WL.backgroundUpload is supported only for use with
    * Windows Store apps using JavaScript. If you are writing a web app,
    * use WL.upload instead.
    * @param properties Required. A JSON object that contains properties
    *   that are necessary to make the REST API call.
    * @param callback Optional. Specifies a callback function that is
    *   executed when the REST API call is complete. The callback function
    *   takes the API response object as a parameter. The response object
    *   exposes the data returned from Live Connect, or if an error occurs,
    *   an error property that contains the error code.
    * @returns Returns a Promise object. For Windows Store apps using
    *   JavaScript, this object's then method accepts callback functions
    *   for onSuccess, onError, and onProgress to enable your code to
    *   handle a successful, failed, and in-progress call to the
    *   corresponding WL.backgroudUpload method, respectively.
    */
  def backgroundUpload[T](properties: IBackgroundUploadProperties): IPromise[T] = js.native
  def backgroundUpload[T](properties: IBackgroundUploadProperties, callback: js.Function1[/* response */ js.Any, Unit]): IPromise[T] = js.native
  /**
    * Specifies whether the current user can be signed out of their
    * Microsoft account.
    *
    * For Windows Store apps using JavaScript, you can use this function to
    * determine whether you should display a control to the user to enable
    * them to sign out of their Microsoft account. If this
    * function returns true, you should display the control. However, if
    * this function returns false, you should not display this control, as
    * attempting to sign out the user in this case will have no effect.
    *
    * For web apps, this function always returns true.
    * @returns Returns true if the user can be signed out; otherwise,
    *   returns false if the user can't be signed out.
    */
  def canLogout(): Boolean = js.native
  /**
    * Makes a call to download a file from Microsoft SkyDrive.
    *
    * **Important**: WL.download is supported only for use with web apps.
    * If you are writing a Windows Store app using JavaScript, use
    * WL.backgroundDownload instead.
    * @param properties Required. A JSON object that contains properties
    *   that are necessary to make the REST API call.
    * @param callback Specifies a callback function that is executed when
    *   the REST API call is complete. The callback function takes the API
    *   response object as a parameter. The response object exposes the
    *   data that is returned from Live Connect, or, if an error occurs, an
    *   error property that contains the error code.
    * @returns Returns a Promise object. This object's then method provides
    *   the onError parameter to enable your code to handle a failed call
    *   to the corresponding WL.download method.
    */
  def download(properties: IDownloadProperties): IPromise[Unit] = js.native
  def download(properties: IDownloadProperties, callback: js.Function1[/* response */ js.Any, Unit]): IPromise[Unit] = js.native
  /**
    * Displays the Microsoft SkyDrive file picker, which enables
    * JavaScript-based web apps to display a pre-built, consistent user
    * interface that enables a user to select files to upload and download
    * to and from their SkyDrive storage location.
    * @param properties Required. A JSON object containing properties for
    *   displaying the button.
    * @param callback Optional. A callback function that is executed after
    *   the user finishes interacting with the SkyDrive file picker.
    * @returns Returns a Promise object. This object's then method provides
    *   the onSuccess and onError parameters to enable your code to handle
    *   a successful and failed call to the corresponding WL.fileDialog
    *   method, respectively.
    */
  def fileDialog(properties: IFileDialogProperties): IPromise[IFilePickerResult] = js.native
  def fileDialog(properties: IFileDialogProperties, callback: js.Function1[/* response */ js.Any, Unit]): IPromise[IFilePickerResult] = js.native
  /**
    * Returns the sign-in status of the current user. If the user is signed
    * in and connected to your app, this function returns the session
    * object. This is an asynchronous function that returns the user's
    * status by contacting the Live Connect authentication web service.
    * @param callback Returns the sign-in status of the current user. If
    *   the user is signed in and connected to your app, this function
    *   returns the session object. This is an asynchronous function that
    *   returns the user's status by contacting the Live Connect
    *   authentication web service.
    * @param force Optional. If set to "true", the function contacts the
    *   Live Connect authentication web service to determine the user's
    *   status. If set to "false" (the default), the function can return
    *   the user status that is currently in memory, if there is one. If
    *   the user's status has already been retrieved, the library can
    *   return the cached value. However, you can force the library to
    *   retrieve current status by setting the force parameter to "true".
    * @returns Returns a Promise object. This object's then method provides
    *   the onSuccess and onError parameters to enable your code to handle
    *   a successful and failed call to the corresponding WL.getLoginStatus
    *   method, respectively.
    *   In the body of the onSuccess function, a status object is returned,
    *   which contains the user's sign-in status and the session object.
    */
  def getLoginStatus(): IPromise[ILoginStatus] = js.native
  def getLoginStatus(callback: js.Function1[/* status */ ILoginStatus, Unit]): IPromise[ILoginStatus] = js.native
  def getLoginStatus(callback: js.Function1[/* status */ ILoginStatus, Unit], force: Boolean): IPromise[ILoginStatus] = js.native
  /**
    * Retrieves the current session object synchronously, if a session
    * object exists. For situations in which performance is critical, such
    * as page loads, use the asynchronous WL.getLoginStatus method instead.
    * @returns Returns the current session as a session object instance.
    */
  def getSession(): ISession = js.native
  /**
    * Initializes the JavaScript library. An app must call this function on
    * every page before making other function calls in the library. The app
    * should call this function before making function calls that subscribe
    * to events. If the JavaScript library has already been initialized on
    * the page, calling this function succeeds silently; the client_id and
    * redirect_uri parameters are not validated.
    * @param properties Required. A JSON object with initialization
    *   properties.
    * @returns Returns a Promise object. This object's then method provides
    *   the onSuccess and onError parameters to enable your code to handle
    *   a successful and failed call to the corresponding WL.init method,
    *   respectively.
    *   When the onSuccess callback is invoked, a login status object is
    *   passed in as parameter that indicates the current user's login
    *   status.
    */
  def init(properties: IInitProperties): IPromise[ILoginStatus] = js.native
  /**
    * Signs in the user or expands the user's list of scopes. Because this
    * function can result in launching the consent page prompt, you should
    * call it only in response to a user action, such as clicking a button.
    * Otherwise, the user's web browser might block the popup.
    *
    * Typically, this function is used by apps that define their own
    * sign-in controls, or by apps that ask users to grant additional
    * permissions during an activity. For example, to enable a user to post
    * their status to Live Connect, your app may have to prompt the
    * user for permission and call this function with an expanded scope.
    *
    * If you call this function when the user has already consented to the
    * requested scope and is already signed in, the callback function is
    * invoked immediately with the current session.
    * This function logs errors to the web browser console.
    * @param properties Required. A JSON object with login properties.
    * @param callback Optional. Specifies a callback function to execute
    *   when sign-in is complete. The callback function takes the status
    *   object as a parameter. For a description of the status object, see
    *   WL.getLoginStatus. If you do not specify a callback function, your
    *   app can still get the sign-in callback info by listening for an
    *   auth.sessionChange or auth.statusChange event.
    * @returns Returns a Promise object. This object's then method provides
    *   the onSuccess, onError, and onProgress parameters to enable your
    *   code to handle a successful, failed, and in-progress call to the
    *   corresponding WL.login method, respectively.
    */
  def login(properties: ILoginProperties): IPromise[ILoginStatus] = js.native
  def login(properties: ILoginProperties, callback: js.Function1[/* status */ js.Any, Unit]): IPromise[ILoginStatus] = js.native
  /**
    * Signs the user out of Live Connect and clears any user state that is
    * maintained by the JavaScript library, such as cookies. If the user
    * account is connected, this function logs out the user from the app,
    * but not from the PC. This function is useful primarily for websites
    * that do not use the sign-in control.
    * @param callback Optional. Specifies a callback function that is
    *   executed when sign-out is complete. The callback function takes the
    *   status object as a parameter. For a description of the status
    *   object, see WL.getLoginStatus. If you do not specify a callback
    *   function, your app can still get the sign-out callback info by
    *   listening for an auth.sessionChange or auth.statusChange event.
    * @returns Returns a Promise object. This object's then method provides
    *   the onSuccess, onError, and onProgress parameters to enable your
    *   code to handle a successful, failed, and in-progress call to the
    *   corresponding WL.logout method, respectively.
    */
  def logout(): IPromise[ILoginStatus] = js.native
  def logout(callback: js.Function1[/* status */ ILoginStatus, Unit]): IPromise[ILoginStatus] = js.native
  /**
    * Displays either the Live Connect sign-in button or the Microsoft
    * SkyDrive file picker button. The sign-in button either prompts the
    * user for their Microsoft account credentials if they are not
    * signed in or else signs out the user if they are signed in. The
    * file picker button displays the SkyDrive file picker to help the user
    * select files to upload or download to or from their SkyDrive
    * storage location.
    * @param properties Required. A JSON object containing properties for
    *   displaying the button.
    * @param callback Optional. A callback function that is executed after
    *   the sign-in button or file picker button is displayed.
    *   Note: Do not use the callback parameter to run code after the user
    *   finishes interacting with the sign-in button or file picker. Use a
    *   combination of the onselected, onloggedin, onloggedout, and onerror
    *   properties as previously described.
    */
  def ui(properties: IUIProperties): Unit = js.native
  def ui(properties: IUIProperties, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Makes a call to upload a file to Microsoft SkyDrive.
    *
    * **Important**: WL.upload is supported only for use with web apps. If
    * you are writing a Windows Store app using JavaScript, use
    * WL.backgroundUpload instead.
    * @param properties Required. A JSON object that contains properties
    *   that are necessary to make the REST API call.
    * @param callback Optional. Specifies a callback function that is
    *   executed when the REST API call is complete. The callback function
    *   takes the API response object as a parameter. The response object
    *   exposes the data returned from Live Connect, or if an error occurs,
    *   an error property that contains the error code.
    * @returns Returns a Promise object. This object's then method provides
    *   the onSuccess, onError, and onProgress parameters to enable your
    *   code to handle a successful, failed, and in-progress call to the
    *   corresponding WL.upload method, respectively; however, the
    *   onProgress parameter applies to newer web browsers such as Internet
    *   Explorer 10 only.
    */
  def upload[T](properties: IUploadProperties): IPromise[T] = js.native
  def upload[T](properties: IUploadProperties, callback: js.Function1[/* response */ js.Any, Unit]): IPromise[T] = js.native
}

