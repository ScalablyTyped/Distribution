package typings.miniprogram

import typings.miniprogram.anon.Brightness
import typings.miniprogram.anon.CanPullDown
import typings.miniprogram.anon.DataAny
import typings.miniprogram.anon.DataKey
import typings.miniprogram.anon.Key
import typings.miniprogram.anon.Number
import typings.miniprogram.anon.PartialAddPhoneContactArg
import typings.miniprogram.anon.SiteName
import typings.miniprogram.anon.Time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiniprogramApi extends js.Object {
  
  /**
    * Get the version of basic library (for reference only). Do not rely on this value for code logic.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_sdk_sdkversion)
    */
  var SDKVersion: String = js.native
  
  /**
    * This form enables the user to write the form into phone contacts
    * via create contacts or add to existing contacts
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_add-contact_addphonecontact)
    */
  def addPhoneContact(args: PartialAddPhoneContactArg): Unit = js.native
  
  /**
    * Alert box
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_feedback_alert)
    */
  def alert(): Unit = js.native
  def alert(args: AlertArgs): Unit = js.native
  
  /**
    * Check whether the current Mini Program API, incoming parameter
    *  or return value, component, attribute, etc. are supported in the current version.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_caniuse_caniuse)
    */
  def canIUse(value: String): Boolean = js.native
  
  /**
    * Choose an image from the camera or gallery of a device.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_media_image_chooseimage)
    */
  def chooseImage(args: ChooseImageArgs): Unit = js.native
  
  /**
    * Select the phone number of a contact in the local system directory.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_contact_choosephonecontact)
    */
  def choosePhoneContact(args: ChoosePhoneContactArgs): Unit = js.native
  
  /**
    * Clear local data cache.
    *
    * This is an asynchronous interface.
    *
    * Clearing the webview embedded storage data will not clear the storage data of the Mini Program.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_storage_clearstorage)
    */
  def clearStorage(): Unit = js.native
  
  /**
    * Clear local data cache synchronously.
    *
    * This is a synchronous interface.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_storage_clearstoragesync)
    */
  def clearStorageSync(): Unit = js.native
  
  /**
    * Confirm box.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_feedback_confirm)
    */
  def confirm(args: ConfirmArgs): Unit = js.native
  
  /**
    * Create an animation instance. Call the instance method to
    * describe animation, and then use the `export` method of
    * animation instance to export the animation data and transfer
    * to the component `animation` attribute.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_animation_createanimation)
    */
  def createAnimation(): Animation = js.native
  def createAnimation(args: CreateAnimationArgs): Animation = js.native
  
  /**
    * Create [canvas](https://miniprogram.alipay.com/docs/miniprogram/mpdev/component_canvas_canvas)
    * context This canvas context works on the `<canvas/>` of the corresponding `canvasId` only.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_canvas_createcanvascontext)
    */
  def createCanvasContext(canvasId: String): CanvasContext = js.native
  
  /**
    * Return a [SelectorQuery](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_query_selectorquery-overview) object instance.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_selector-query_createselectorquery)
    */
  def createSelectorQuery(): SelectorQuery = js.native
  
  /**
    * By creating `webviewContext`, it creates the capability to send
    * messages from Mini Program to `web-view`. Create and return
    * `web-view` context `webViewContext` object.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_web-view_createwebviewcontext)
    */
  def createWebViewContext(id: String): WebViewContext = js.native
  
  /**
    * Download a file resource to a local location.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_downloadfile)
    */
  def downloadFile(args: DownloadFileArgs): Unit = js.native
  
  /**
    * Call the API to obtain the authorization code (authCode).
    * The authorization code can be used to obtain access token,
    * so as to easily obtain the app user userId, nickname, etc.
    *
    * For more information, please refer to the [user authorization](https://miniprogram.alipay.com/docs/miniprogram/mpdev/API_OpenAPI_userAuthorization)
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_openapi_getauthcode)
    */
  def getAuthCode(args: GetAuthCodeArgs): Unit = js.native
  
  /**
    * Get the clipboard data.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_clipboard_getclipboard)
    */
  def getClipboard(args: GetClipboardArgs): Unit = js.native
  
  /**
    * Get file information.
    *
    * https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_file_getfileinfo
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_file_getfileinfo)
    */
  def getFileInfo(args: GetFileArgs): Unit = js.native
  
  /**
    * Get picture information.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_media_image_getimageinfo)
    */
  def getImageInfo(args: GetImageInfo): Unit = js.native
  
  /**
    * Get the current geographical location of the user.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_location_getlocation)
    */
  def getLocation(args: GetLocationArgs): Unit = js.native
  
  /**
    * Get the current network status.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_network_getnetworktype)
    */
  def getNetworkType(args: GetNetworkTypeArgs): Unit = js.native
  
  /**
    * Get the basic information about a user. This feature requires
    * the user to deliberately trigger to activate the function.
    * This function is not directly called by the API but rather waits
    * for when the user has activated it by clicking a `<button>` component.
    * If the Mini Program wants to get userId, please call `my.getAuthCode` .
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_openapi_getopenuserinfo)
    */
  def getOpenUserInfo(args: GetOpenUserInfoArgs): Unit = js.native
  
  /**
    * Get saved file information.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_file_getsavedfileinfo)
    */
  def getSavedFileInfo(args: GetSavedFileInfo): Unit = js.native
  
  /**
    * Get information of all saved files.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_file_getsavedfilelist)
    */
  def getSavedFileList(args: GetSavedFileListArgs): Unit = js.native
  
  /**
    * Version requirements: Basic library 1.4.0 or higher version.
    * If the version is low, you can programmatically check for Compatibility.
    *
    * Get screen brightness
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_screen_getscreenbrightness)
    */
  def getScreenBrightness(args: AsyncCallback[Brightness]): Unit = js.native
  
  /**
    * Get current server time in milliseconds
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_server_getservertime)
    */
  def getServerTime(args: AsyncCallback[Time]): Unit = js.native
  
  /**
    * Use this API to obtain the site information assigned by Alipay
    *  Connect which is used in Alipay Connect business, such as the site name.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_alipay-connect_getsiteinfo)
    */
  def getSiteInfo(args: AsyncCallback[SiteName]): Unit = js.native
  
  /**
    * Get cached data.
    *
    * This is an asynchronous interface.
    *
    * support the isolation between embedded webview cache and Mini Program
    * cache. Getting the cache of the specified key of embedded webview
    * ill not return the cached data of the same key of the Mini Program.
    *
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_storage_getstorage)
    */
  def getStorage(args: GetStorage): Unit = js.native
  
  /**
    * Get cached data synchronously.
    *
    * This is a synchronous interface.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_storage_getstoragesync)
    */
  def getStorageSync(args: Key): DataAny = js.native
  
  /**
    * Get system information
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_system_getsysteminfo)
    */
  def getSystemInfo(args: GetSystemInfoArgs): Unit = js.native
  
  /**
    * Hide the keyboard.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_keyboard_hidekeyboard)
    */
  def hideKeyboard(): Unit = js.native
  
  /**
    * Hide the loading dialog.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_feedback_hideloading)
    */
  def hideLoading(): Unit = js.native
  def hideLoading(args: HideLoadingArgs): Unit = js.native
  
  /**
    * hideNavigationBarLoading
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_navigationbar_hidenavigationbarloading)
    */
  def hideNavigationBarLoading(): Unit = js.native
  
  /**
    * Hide tabbar.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_tabbar_hidetabbar)
    */
  def hideTabBar(args: HideTabBarArgs): Unit = js.native
  
  /**
    * Hide the toast dialog.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_feedback_hidetoast)
    */
  def hideToast(): Unit = js.native
  
  /**
    * Make a phone call.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_call_makephonecall)
    */
  def makePhoneCall(args: Number): Unit = js.native
  
  /**
    * Cascade selection function, mainly used for selecting several
    *  levels of associated data, such as province, city and district.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_multi-level-select_multilevelselect)
    */
  def multiLevelSelect(args: MultiLevelSelectArgs): Unit = js.native
  
  /**
    * Close the current page and return to the previous one or more
    * pages. It is possible to use `getCurrentPages` to get the
    * current page stack information and decide how many levels to return.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_route_navigateback)
    */
  def navigateBack(args: NavigateBackArgs): Unit = js.native
  
  /**
    * Return to the previous Mini Program. Only used for when another Mini Program jumps back to the foregrounded Mini Program.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_openapi_navigatebackminiprogram)
    */
  def navigateBackMiniProgram(args: NavigateBackMiniProgramArgs): Unit = js.native
  
  /**
    * Maintain the current page and jump to the specified page within
    * the application. Use `my.navigateBack` to return to the original page.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_route_navigateto)
    */
  def navigateTo(args: NavigateToArgs): Unit = js.native
  
  /**
    * Jump to another Mini Program.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_openapi_navigatetominiprogram)
    */
  def navigateToMiniProgram(args: NavigateToMiniProgramArgs): Unit = js.native
  
  /**
    * Cancel screen capture listener event. This is usually paired
    * with `my.onUserCaptureScreen`.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_capture_offusercapturescreen)
    */
  def offUserCaptureScreen(): Unit = js.native
  def offUserCaptureScreen(args: js.Function0[Unit]): Unit = js.native
  
  /**
    * Listen to the user-initiated active screen capture event. This
    * will receive all the screen capture event notification of the system or a third-party tool.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_capture_onusercapturescreen)
    */
  def onUserCaptureScreen(args: js.Function0[Unit]): Unit = js.native
  
  /**
    * Scroll to the target position on the page
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_scroll_pagescrollto)
    */
  def pageScrollTo(args: PageScrollToArgs): Unit = js.native
  
  /**
    * The Preview image's "local image path" is not supported.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_media_image_previewimage)
    */
  def previewImage(args: PreviewImageArgs): Unit = js.native
  
  /**
    * Pop up a dialog to show the prompt message.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_feedback_prompt)
    */
  def prompt(args: PromptArgs): Unit = js.native
  
  /**
    * Close all current pages and jump to the specified page within
    * the application.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_route_relaunch)
    */
  def reLaunch(args: ReLaunchArgs): Unit = js.native
  
  /**
    * Close the current page and jump to the specified page within the application.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_route_redirectto)
    */
  def redirectTo(args: RedirectToArgs): Unit = js.native
  
  /**
    * Delete a saved file.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_file_removesavedfile)
    */
  def removeSavedFile(args: RemoveSavedFileArgs): Unit = js.native
  
  /**
    * Remove cached data.
    *
    * This is an asynchronous interface.
    *
    * Removing the webview embedded storage data will not remove the
    * storage data of the Mini Program.
    */
  def removeStorage(args: RemoveStorageArgs): Unit = js.native
  
  /**
    * Remove cached data synchronously.
    *
    * This is a synchronous interface.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_storage_removestoragesync)
    */
  def removeStorageSync(args: Key): Unit = js.native
  
  /**
    * Network request of a Mini Program.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_request)
    */
  def request(args: RequestArgs): Unit = js.native
  
  /**
    * Save file in a local position (total capacity of local file size is limited to 10 MB).
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_file_savefile)
    */
  def saveFile(args: SaveFileArgs): Unit = js.native
  
  /**
    * Save the online images to a device camera gallery.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_media_image_saveimage)
    */
  def saveImage(args: SaveImageArgs): Unit = js.native
  
  /**
    * Call the scan QR code or bar code function.
    *
    * Hint: after calling my.scan API, the `onHide()` and `onShow()` lifecycle
    * callback function of `App` and `Page` will be executed.
    * The following is the executing sequence:
    *
    * `App.onHide()` -> `Page.onHide()` -> `App.onShow()` -> `Page.onShow()`.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_scan_scan)
    */
  def scan(args: ScanArgs): Unit = js.native
  
  /**
    * Dynamically set window background color.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_set-background_setbackgroundcolor)
    */
  def setBackgroundColor(args: SetBackgroundColorArgs): Unit = js.native
  
  /**
    * Set whether to support pull-down on the page (supported by
    * default on Mini Program pages).
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_set-pulldown_setcanpulldown)
    */
  def setCanPullDown(args: CanPullDown): Unit = js.native
  
  /**
    * Set the clipboard data.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_clipboard_setclipboard)
    */
  def setClipboard(args: SetClipboardArgs): Unit = js.native
  
  /**
    * Version requirements: Basic library 1.3.0 or higher version.
    * If the version is low, you can programmatically check for Compatibility.
    *
    * Set whether to keep screen on Takes effect in the current Mini Program only
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_screen_setkeepscreenon)
    */
  def setKeepScreenOn(args: SetKeepScreenOnArgs): Unit = js.native
  
  /**
    * Set the navigation bar text and style.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_navigationbar_setnavigationbar)
    */
  def setNavigationBar(args: SetNavigationBarArgs): Unit = js.native
  
  /**
    * Version requirements: Basic library 1.4.0 or higher version.
    *  If the version is low, you can programmatically check for Compatibility.
    *
    * Set screen brightness
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_screen_setscreenbrightness)
    */
  def setScreenBrightness(args: SetScreenBrightnessArgs): Unit = js.native
  
  /**
    * Store the data with a specified key in the local cache. This
    * will overlaps\ the original data using the same key.
    *
    * This is an asynchronous interface.
    *
    * Support the isolation of webview-embedded storage and the Mini Program
    *  storage. Specifying key storage data in embedded  webview does not
    *  overlap the data corresponding to the same key of the Mini Program itself.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_storage_setstorage)
    */
  def setStorage(args: SetStorage): Unit = js.native
  
  /**
    * Store synchronously the data in the specified key in the local cache.
    *
    * This is a synchronous interface.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_storage_setstoragesync)
    */
  def setStorageSync(args: DataKey): Unit = js.native
  
  /**
    * Pop up dialog for user in form of (image, text, etc.) via the
    * permission guide module. To advice the user to turn on the
    * related permission. The permission guide is used to advice rather
    * than to validate the permission. The call timing is when the
    * service party confirms the required permission is limited. In
    *  addition, the permission guide pop-up is subject to fatigue and other factors.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_permission_showauthguide)
    */
  def showAuthGuide(args: ShowAuthGuideArgs): Unit = js.native
  
  /**
    * Show the loading dialog.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_feedback_showloading)
    */
  def showLoading(): Unit = js.native
  def showLoading(args: ShowLoadingArgs): Unit = js.native
  
  /**
    * Show the navigation bar loading
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_navigationbar_shownavigationbarloading)
    */
  def showNavigationBarLoading(): Unit = js.native
  
  /**
    * Show the toast dialog, which disappears with the specified duration.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_feedback_showtoast)
    */
  def showToast(): Unit = js.native
  def showToast(args: ShowToastArgs): Unit = js.native
  
  /**
    * Use this API to redirect the user to the authorization page
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_openapi_signcontract)
    */
  def signContract(args: SignContract): Unit = js.native
  
  /**
    * Start the pull-to-refresh function. The pull-to-refresh animation
    * is triggered upon the code execution, which is consistent with the manual pull-to-refresh effect.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_pulldown_startpulldownrefresh)
    */
  def startPullDownRefresh(): Unit = js.native
  
  /**
    * Stop the pull-to-refresh for the current page.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_pulldown_stoppulldownrefresh)
    */
  def stopPullDownRefresh(): Unit = js.native
  
  /**
    * Jump to the specified tabBar page and close all other pages that are not tabBar.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_route_switchtab)
    */
  def switchTab(args: SwitchTabArgs): Unit = js.native
  
  /**
    * Start a payment transaction.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_openapi_tradepay)
    */
  def tradePay(args: TradePayArgs): Unit = js.native
  
  /**
    * Upload the local resource to the server.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_uploadfile)
    */
  def uploadFile(args: UploadFileArgs): Unit = js.native
  
  /**
    * Call the device vibrate function
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_vibrate_vibrate)
    */
  def vibrate(args: AsyncCallback[Unit]): Unit = js.native
}
