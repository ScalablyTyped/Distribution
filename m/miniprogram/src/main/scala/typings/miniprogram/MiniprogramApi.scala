package typings.miniprogram

import typings.miniprogram.anon.Address
import typings.miniprogram.anon.AppId
import typings.miniprogram.anon.AuthSetting
import typings.miniprogram.anon.AuthSettingCamera
import typings.miniprogram.anon.Available
import typings.miniprogram.anon.Brightness
import typings.miniprogram.anon.CanPullDown
import typings.miniprogram.anon.Connected
import typings.miniprogram.anon.DataAny
import typings.miniprogram.anon.DataKey
import typings.miniprogram.anon.Devices
import typings.miniprogram.anon.Direction
import typings.miniprogram.anon.IsBuffer
import typings.miniprogram.anon.IsCharging
import typings.miniprogram.anon.Key
import typings.miniprogram.anon.Level
import typings.miniprogram.anon.Number
import typings.miniprogram.anon.PartialAddPhoneContactArg
import typings.miniprogram.anon.Time
import typings.miniprogram.anon.X
import typings.miniprogram.anon.deviceIdstringAsyncCallba
import typings.miniprogram.anon.deviceIdstringAsyncCallbaComplete
import typings.miniprogram.anon.deviceIdstringserviceIdst
import typings.miniprogram.anon.deviceIdstringserviceIdstCharacteristicId
import typings.miniprogram.anon.filePathstringfileTypestr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MiniprogramApi extends StObject {
  
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
    * Open the built-in map to choose a location.
    *
    * https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_location_chooselocation#ZxibZ
    */
  def chooseLocation(args: AsyncCallback[Address]): Unit = js.native
  
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
  def clearStorage(args: AsyncCallback[Any]): Unit = js.native
  
  /**
    * Clear local data cache synchronously.
    *
    * This is a synchronous interface.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_storage_clearstoragesync)
    */
  def clearStorageSync(): Unit = js.native
  
  /**
    * Use this API to close the Bluetooth module in the mini program.
    * You can call the following mini program API and receive event callbacks that are related to the Bluetooth module in the effective period when you the API my.openBluetoothAdapter is called.
    * The effective period is ended when the API my.closeBluetoothAdapter is called.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_bluetooth_closebluetoothadapter#Parameters)
    */
  def closeBluetoothAdapter(): Unit = js.native
  def closeBluetoothAdapter(args: AsyncCallback[Any]): Unit = js.native
  
  /**
    * Use this API to disable the WebSocket connection.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_closesocket)
    */
  def closeSocket(): Unit = js.native
  def closeSocket(args: AsyncCallback[Any]): Unit = js.native
  
  /**
    * Confirm box.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_feedback_confirm)
    */
  def confirm(args: ConfirmArgs): Unit = js.native
  
  /**
    * Use this API to connect to a Bluetooth Low Energy (BLE) device.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_ble_connectbledevice)
    */
  def connectBLEDevice(args: deviceIdstringAsyncCallba): Unit = js.native
  
  /**
    * Use this API to create a WebSocket connection. An Mini Program can only have one WebSocket connection at a time.
    * If a WebSocket connection already exists when a new one is created, the existing one will be automatically disabled.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_connectsocket)
    */
  def connectSocket(): Unit = js.native
  def connectSocket(args: ConnectSocketArgs): Unit = js.native
  
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
    * Use this API to open the date selection list.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_choose-date_datepicker)
    */
  def datePicker(): Unit = js.native
  def datePicker(args: DatePickerArgs): Unit = js.native
  
  /**
    * Use this API to disconnect from a Bluetooth Low Energy (BLE) device.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_ble_disconnectbledevice)
    */
  def disconnectBLEDevice(args: deviceIdstringAsyncCallba): Unit = js.native
  
  /**
    * Download a file resource to a local location.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_downloadfile)
    */
  def downloadFile(args: DownloadFileArgs): Unit = js.native
  
  /**
    * Use this API to obtain the Mini Program App ID synchronously.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_basic_getappidsync)
    */
  def getAppIdSync(): AppId = js.native
  
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
    * Use this API to obtain all characteristics in a Bluetooth device that is connected to the native.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_ble_getbledevicecharacteristics)
    */
  def getBLEDeviceCharacteristics(args: deviceIdstringserviceIdst): Unit = js.native
  
  /**
    * Use this API to obtain all services of Bluetooth devices that are connected to the native.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_ble_getbledeviceservices)
    */
  def getBLEDeviceServices(args: deviceIdstringAsyncCallbaComplete): Unit = js.native
  
  /**
    * Use this API to asynchronously obtain the battery level and the charging state of the current device. No parameters are required.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_battery_getbatteryinfo)
    */
  def getBatteryInfo(): Unit = js.native
  def getBatteryInfo(args: AsyncCallback[IsCharging]): Unit = js.native
  
  /**
    * Use this API to synchronously obtain the battery level and the charging state of the current device. No parameters are required.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_battery_getbatteryinfosync)
    */
  def getBatteryInfoSync(): IsCharging = js.native
  
  /**
    * Use this API to check the Bluetooth adapter status in the Mini Program.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_bluetooth_getbluetoothadapterstate#9097f31e)
    */
  def getBluetoothAdapterState(args: AsyncCallback[Available]): Unit = js.native
  
  /**
    * Use this API to get all the bluetooth devices that are discovered, including those that are connected to the current device.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_bluetooth_getbluetoothdevices)
    */
  def getBluetoothDevices(args: AsyncCallback[Devices]): Unit = js.native
  
  /**
    * Get the clipboard data.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_clipboard_getclipboard)
    */
  def getClipboard(args: GetClipboardArgs): Unit = js.native
  
  /**
    * Use this API to get the bluetooth devices that are connected.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_bluetooth_getconnectedbluetoothdevices)
    */
  def getConnectedBluetoothDevices(args: deviceIdstringAsyncCallba): Unit = js.native
  
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
    * Use this API to obtain the user's current settings. Only the permissions that have been requested by the Mini Program from the user are returned.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_setting_getsetting)
    */
  def getSetting(): Unit = js.native
  def getSetting(args: AsyncCallback[AuthSetting]): Unit = js.native
  
  /**
    * Use this API to obtain the site information assigned by Alipay
    *  Connect which is used in Alipay Connect business, such as the site name.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_alipay-connect_getsiteinfo)
    */
  def getSiteInfo(args: AsyncCallback[GetSiteInfoCallbackValue]): Unit = js.native
  
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
  
  def getSystemInfoSync(): GetSystemInfoCallbackValue = js.native
  
  /**
    * Use this API to hide the home button in the top navigation bar, and the return-home option in the tab bar in the upper right corner.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_navigationbar_hidebackhome)
    */
  def hideBackHome(): Unit = js.native
  
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
  def hideToast(args: AsyncCallback[Any]): Unit = js.native
  
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
    * Use this API enable notification on change of Bluetooth Low Energy (BLE) device characteristics.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_ble_notifyblecharacteristicvaluechange#Parameters)
    */
  def notifyBLECharacteristicValueChange(args: deviceIdstringserviceIdstCharacteristicId): Unit = js.native
  
  /**
    * Use this API to stop listening to acceleration data event.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_accelerometer_offaccelerometerchange)
    */
  def offAccelerometerChange(): Unit = js.native
  def offAccelerometerChange(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Use this API to unlisten to the BLE device characteristic change event.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_ble_offblecharacteristicvaluechange)
    */
  def offBLECharacteristicValueChange(): Unit = js.native
  def offBLECharacteristicValueChange(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Use this API to unlisten to the Bluetooth Low Energy (BLE) connection status change event.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_ble_offbleconnectionstatechanged#a4bc819d)
    */
  def offBLEConnectionStateChanged(): Unit = js.native
  def offBLEConnectionStateChanged(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Use this API to remove the bluetooth adapter with a state change.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_bluetooth_offbluetoothadapterstatechange)
    */
  def offBluetoothAdapterStateChange(): Unit = js.native
  def offBluetoothAdapterStateChange(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Use this API to remove the bluetooth devices that are found.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_bluetooth_offbluetoothadapterstatechange)
    */
  def offBluetoothDeviceFound(): Unit = js.native
  def offBluetoothDeviceFound(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Use this API to unlisten to the compass data.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_compass_offcompasschange)
    */
  def offCompassChange(): Unit = js.native
  def offCompassChange(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Use this API to unlisten to the insufficient memory alarm event. Ensure that the parameter (callback) is the same object as the one in onMemoryWarning.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_memory-warning_offmemorywarning)
    */
  def offMemoryWarning(): Unit = js.native
  def offMemoryWarning(arg: js.Function1[/* arg */ Level, Unit]): Unit = js.native
  
  /**
    * Use this API to unlisten to the event of disabling the WebSocket connection.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_offsocketclose)
    */
  def offSocketClose(): Unit = js.native
  def offSocketClose(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Use this API to unlisten to WebSocket error events.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_onsocketerror)
    */
  def offSocketError(): Unit = js.native
  def offSocketError(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Use this API to unlisten to the event of receiving server messages by WebSocket.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_offsocketmessage)
    */
  def offSocketMessage(): Unit = js.native
  def offSocketMessage(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Use this API to unlisten to the event of enabling the WebSocket connection.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_offsocketopen)
    */
  def offSocketOpen(): Unit = js.native
  def offSocketOpen(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Cancel screen capture listener event. This is usually paired
    * with `my.onUserCaptureScreen`.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_capture_offusercapturescreen)
    */
  def offUserCaptureScreen(): Unit = js.native
  def offUserCaptureScreen(args: js.Function0[Unit]): Unit = js.native
  
  /**
    * Use this API to listen to the acceleration data event. The callback interval is 500ms. After the interface is called, the listening is automatically started.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_accelerometer_onaccelerometerchange)
    */
  def onAccelerometerChange(args: js.Function1[/* arg */ X, Unit]): Unit = js.native
  
  /**
    * Use this API to listen to the Bluetooth Low Energy (BLE) device characteristic change event.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_ble_onblecharacteristicvaluechange)
    */
  def onBLECharacteristicValueChange(args: js.Function1[/* arg */ Connected, Unit]): Unit = js.native
  
  /**
    * Use this API to listen to the Bluetooth Low Energy (BLE) connection error event, including device loss and unusual disconnections.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_ble_onbleconnectionstatechanged)
    */
  def onBLEConnectionStateChanged(args: js.Function1[/* arg */ Connected, Unit]): Unit = js.native
  
  /**
    * Use this API to monitor the bluetooth adapter state changes.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_bluetooth_onbluetoothadapterstatechange#9097f31e)
    */
  def onBluetoothAdapterStateChange(): Unit = js.native
  def onBluetoothAdapterStateChange(args: AsyncCallback[Available]): Unit = js.native
  
  /**
    * Use this API when a new Bluetooth device is found.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_bluetooth_offbluetoothadapterstatechange)
    */
  def onBluetoothDeviceFound(args: AsyncCallback[Devices]): Unit = js.native
  
  /**
    * Use this API to listen to the compass data change event. After the interface call, listening is automatically started. The callback interval is 500ms.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_compass_oncompasschange)
    */
  def onCompassChange(): Unit = js.native
  def onCompassChange(args: js.Function1[/* arg */ Direction, Unit]): Unit = js.native
  
  /**
    * Use this API to listen to the insufficient memory alarm event.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_memory-warning_onmemorywarning)
    */
  def onMemoryWarning(arg: js.Function1[/* arg */ Level, Unit]): Unit = js.native
  
  /**
    * Use this API to listen to the event of disabling the WebSocket connection.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_onsocketclose)
    */
  def onSocketClose(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Use this API to listen to WebSocket error events.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_onsocketerror)
    */
  def onSocketError(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Use this API to listen to the event of receiving server messages by WebSocket.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_onsocketmessage)
    */
  def onSocketMessage(args: js.Function1[/* arg */ IsBuffer, Unit]): Unit = js.native
  
  /**
    * Use this API to listen to the event of enabling the WebSocket connection.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_onsocketopen)
    */
  def onSocketOpen(args: js.Function1[/* arg */ Any, Unit]): Unit = js.native
  
  /**
    * Listen to the user-initiated active screen capture event. This
    * will receive all the screen capture event notification of the system or a third-party tool.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_capture_onusercapturescreen)
    */
  def onUserCaptureScreen(args: js.Function0[Unit]): Unit = js.native
  
  /**
    * Use this API to initialize the Bluetooth module in the mini program.
    * You can call the following mini program API and receive event callbacks that are related to the Bluetooth module in the effective period when you the API my.openBluetoothAdapter is called.
    * The effective period is ended when the API my.closeBluetoothAdapter is called.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_bluetooth_openbluetoothadapter)
    */
  def openBluetoothAdapter(args: AsyncCallback[Any]): Unit = js.native
  
  /**
    * The my.openDocument API enables users to preview a PDF file within the mini program.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_file_myopendocument)
    */
  def openDocument(args: filePathstringfileTypestr): Unit = js.native
  
  /**
    * View the location on the built-in map.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_location_openlocation)
    */
  def openLocation(args: OpenLocationArgs): Unit = js.native
  
  /**
    * Use this API to open the Mini Program settings page and returns permission setting results.
    * Only the permissions that have been requested by the Mini Program from the user are displayed on the settings page.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_setting_opensetting)
    */
  def openSetting(): Unit = js.native
  def openSetting(args: AsyncCallback[AuthSettingCamera]): Unit = js.native
  
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
    * Use this API to read the data of Bluetooth Low Energy (BLE) device characteristics.
    * The returned information must be obtained by using the callback in the my.onBLECharacteristicValueChange.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_ble_readblecharacteristicvalue)
    */
  def readBLECharacteristicValue(args: ReadBLECharacteristicValueArgs): Unit = js.native
  
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
    * Use this API to send data over WebSocket connection. Call my.connectSocket first and send data after the my.onSocketOpen callback.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_network_sendsocketmessage)
    */
  def sendSocketMessage(): Unit = js.native
  def sendSocketMessage(args: SendSocketMessageArgs): Unit = js.native
  
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
    * Use this API to set the overall style of the tab bar, such as the text color, background color and border style.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_tabbar_settabbarstyle)
    */
  def setTabBarStyle(args: SetTabBarStyleArgs): Unit = js.native
  
  /**
    * Use this API to display the operation menu.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_feedback_showactionsheet)
    */
  def showActionSheet(args: ShowActionSheetArgs): Unit = js.native
  
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
  def signContract(args: SignContractArgs): Unit = js.native
  
  /**
    * Use this API to start discovering bluetooth devices. You can find the results in the API my.onBluetoothDeviceFound.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_bluetooth_startbluetoothdevicesdiscovery)
    */
  def startBluetoothDevicesDiscovery(): Unit = js.native
  def startBluetoothDevicesDiscovery(args: StartBluetoothDevicesDiscoveryArgs): Unit = js.native
  
  /**
    * Start the pull-to-refresh function. The pull-to-refresh animation
    * is triggered upon the code execution, which is consistent with the manual pull-to-refresh effect.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_pulldown_startpulldownrefresh)
    */
  def startPullDownRefresh(): Unit = js.native
  def startPullDownRefresh(args: AsyncCallback[Any]): Unit = js.native
  
  /**
    * Use this API to stop discovering bluetooth devices.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_bluetooth_stopbluetoothdevicesdiscovery)
    */
  def stopBluetoothDevicesDiscovery(): Unit = js.native
  def stopBluetoothDevicesDiscovery(args: AsyncCallback[Any]): Unit = js.native
  
  /**
    * Stop the pull-to-refresh for the current page.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_ui_pulldown_stoppulldownrefresh)
    */
  def stopPullDownRefresh(): Unit = js.native
  def stopPullDownRefresh(args: AsyncCallback[Any]): Unit = js.native
  
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
  
  /**
    * The watchshake function. Every time this API is called, a callback is triggered after the mobile phone is shaken. You must call this API again to continue to listen to this event.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_watch-shake_watchshake)
    */
  def watchShake(): Unit = js.native
  def watchShake(args: AsyncCallback[Any]): Unit = js.native
  
  /**
    * Use this API to write data to Bluetooth Low Energy (BLE) device characteristics.
    *
    * [Docs Link](https://miniprogram.alipay.com/docs/miniprogram/mpdev/api_device_bluetooth_ble_writeblecharacteristicvalue)
    */
  def writeBLECharacteristicValue(args: WriteBLECharacteristicValueArgs): Unit = js.native
}
