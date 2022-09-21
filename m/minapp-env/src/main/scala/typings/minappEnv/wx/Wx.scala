package typings.minappEnv.wx

import typings.minappEnv.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wx extends StObject {
  
  /** [wx.addCard(Object object)](wx.addCard.md)
  *
  * 批量添加卡券。只有通过 [认证](https://developers.weixin.qq.com/miniprogram/product/renzheng.html) 的小程序才能使用。更多文档请参考 [微信卡券接口文档](https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=1490190158&version=1&lang=zh_CN&platform=2)。
  *
  * **cardExt 说明**
  *
  *
  * cardExt 是卡券的扩展参数，其值是一个 JSON 字符串。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.addCard({
    cardList: [
    {
    cardId: '',
    cardExt: '{"code": "", "openid": "", "timestamp": "", "signature":""}'
    }, {
    cardId: '',
    cardExt: '{"code": "", "openid": "", "timestamp": "", "signature":""}'
    }
    ],
    success (res) {
    console.log(res.cardList) // 卡券添加结果
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def addCard(option: AddCardOption): Unit = js.native
  
  /** [wx.addPhoneContact(Object object)](wx.addPhoneContact.md)
    *
    * 添加手机通讯录联系人。用户可以选择将该表单以「新增联系人」或「添加到已有联系人」的方式，写入手机系统通讯录。
    *
    * 最低基础库： `1.2.0` */
  def addPhoneContact(option: AddPhoneContactOption): Unit = js.native
  
  /** [wx.authorize(Object object)](wx.authorize.md)
  *
  * 提前向用户发起授权请求。调用后会立刻弹窗询问用户是否同意授权小程序使用某项功能或获取用户的某些数据，但不会实际调用对应接口。如果用户之前已经同意授权，则不会出现弹窗，直接返回成功。更多用法详见 [用户授权]((authorize))。
  *
  * **示例代码**
  *
  *
  * ```js
  // 可以通过 wx.getSetting 先查询一下用户是否授权了 "scope.record" 这个 scope
  wx.getSetting({
    success(res) {
    if (!res.authSetting['scope.record']) {
    wx.authorize({
    scope: 'scope.record',
    success () {
    // 用户已经同意小程序使用录音功能，后续调用 wx.startRecord 接口不会弹窗询问
    wx.startRecord()
    }
    })
    }
    }
  })
  ```
  *
  * 最低基础库： `1.2.0` */
  def authorize(option: AuthorizeOption): Unit = js.native
  
  /** [boolean wx.canIUse(string schema)](wx.canIUse.md)
  *
  * 判断小程序的API，回调，参数，组件等是否在当前版本可用。
  *
  * **参数说明**
  *
  *
  * - `${API}` 代表 API 名字
  * - `${method}` 代表调用方式，有效值为return, success, object, callback
  * - `${param}` 代表参数或者返回值
  * - `${options}` 代表参数的可选值
  * - `${component}` 代表组件名字
  * - `${attribute}` 代表组件属性
  * - `${option}` 代表组件属性的可选值
  *
  * **示例代码**
  *
  *
  * ```js
  wx.canIUse('openBluetoothAdapter')
  wx.canIUse('getSystemInfoSync.return.screenWidth')
  wx.canIUse('getSystemInfo.success.screenWidth')
  wx.canIUse('showToast.object.image')
  wx.canIUse('onCompassChange.callback.direction')
  wx.canIUse('request.object.method.GET')
    
  wx.canIUse('live-player')
  wx.canIUse('text.selectable')
  wx.canIUse('button.open-type.contact')
  ```
  *
  * 最低基础库： `1.1.1` */
  def canIUse(
    /** 使用 `${API}.${method}.${param}.${options}` 或者 `${component}.${attribute}.${option}` 方式来调用 */
  schema: String
  ): Boolean = js.native
  
  /** [wx.canvasGetImageData(Object object, Object this)](wx.canvasGetImageData.md)
  *
  * 获取 canvas 区域隐含的像素数据。
  *
  * **示例代码**
  *
  *
  * {% minicode('GlCRTlmS7n27') %}
  *
  * ```js
  wx.canvasGetImageData({
    canvasId: 'myCanvas',
    x: 0,
    y: 0,
    width: 100,
    height: 100,
    success(res) {
    console.log(res.width) // 100
    console.log(res.height) // 100
    console.log(res.data instanceof Uint8ClampedArray) // true
    console.log(res.data.length) // 100 * 100 * 4
    }
  })
  ```
  *
  * 最低基础库： `1.9.0` */
  def canvasGetImageData(option: CanvasGetImageDataOption): Unit = js.native
  def canvasGetImageData(option: CanvasGetImageDataOption, /** 在自定义组件下，当前组件实例的this，以操作组件内 `<canvas/>` 组件 */
  component: Any): Unit = js.native
  
  /** [wx.canvasPutImageData(Object object, Object this)](wx.canvasPutImageData.md)
    *
    * 将像素数据绘制到画布。在自定义组件下，第二个参数传入自定义组件实例 this，以操作组件内 <canvas> 组件
    *
    * 最低基础库： `1.9.0` */
  def canvasPutImageData(option: CanvasPutImageDataOption): Unit = js.native
  def canvasPutImageData(option: CanvasPutImageDataOption, /** 在自定义组件下，当前组件实例的this，以操作组件内 `<canvas/>` 组件 */
  component: Any): Unit = js.native
  
  /** [wx.canvasToTempFilePath(Object object, Object this)](wx.canvasToTempFilePath.md)
    *
    * 把当前画布指定区域的内容导出生成指定大小的图片。在 `draw()` 回调里调用该方法才能保证图片导出成功。 */
  def canvasToTempFilePath(option: CanvasToTempFilePathOption): Unit = js.native
  def canvasToTempFilePath(
    option: CanvasToTempFilePathOption,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 `<canvas/>` 组件 */
  component: Any
  ): Unit = js.native
  
  /** [wx.checkIsSoterEnrolledInDevice(Object object)](wx.checkIsSoterEnrolledInDevice.md)
  *
  * 获取设备内是否录入如指纹等生物信息的接口
  *
  * **示例代码**
  *
  *
  * ```js
  wx.checkIsSoterEnrolledInDevice({
    checkAuthMode: 'fingerPrint',
    success(res) {
    console.log(res.isEnrolled)
    }
  })
  ```
  *
  * 最低基础库： `1.6.0` */
  def checkIsSoterEnrolledInDevice(option: CheckIsSoterEnrolledInDeviceOption): Unit = js.native
  
  /** [wx.checkIsSupportSoterAuthentication(Object object)](wx.checkIsSupportSoterAuthentication.md)
  *
  * 获取本机支持的 SOTER 生物认证方式
  *
  * **示例代码**
  *
  *
  * ```js
  wx.checkIsSupportSoterAuthentication({
    success(res) {
    // res.supportMode = [] 不具备任何被SOTER支持的生物识别方式
    // res.supportMode = ['fingerPrint'] 只支持指纹识别
    // res.supportMode = ['fingerPrint', 'facial'] 支持指纹识别和人脸识别
    }
  })
  ```
  *
  * 最低基础库： `1.5.0` */
  def checkIsSupportSoterAuthentication(): Unit = js.native
  def checkIsSupportSoterAuthentication(option: CheckIsSupportSoterAuthenticationOption): Unit = js.native
  
  /** [wx.checkSession(Object object)](wx.checkSession.md)
  *
  * 检查登录态是否过期。
  *
  * 通过 wx.login 接口获得的用户登录态拥有一定的时效性。用户越久未使用小程序，用户登录态越有可能失效。反之如果用户一直在使用小程序，则用户登录态一直保持有效。具体时效逻辑由微信维护，对开发者透明。开发者只需要调用 wx.checkSession 接口检测当前用户登录态是否有效。
  *
  * 登录态过期后开发者可以再调用 wx.login 获取新的用户登录态。调用成功说明当前 session_key 未过期，调用失败说明 session_key 已过期。更多使用方法详见 [小程序登录]((login))。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.checkSession({
    success () {
    //session_key 未过期，并且在本生命周期一直有效
    },
    fail () {
    // session_key 已经失效，需要重新执行登录流程
    wx.login() //重新登录
    }
  })
  ``` */
  def checkSession(): Unit = js.native
  def checkSession(option: CheckSessionOption): Unit = js.native
  
  /** [wx.chooseAddress(Object object)](wx.chooseAddress.md)
  *
  * 获取用户收货地址。调起用户编辑收货地址原生界面，并在编辑完成后返回用户选择的地址。
  *
  * **示例代码**
  *
  *
  * {% minicode('024hHnmd772y') %}
  * ```js
  wx.chooseAddress({
    success (res) {
    console.log(res.userName)
    console.log(res.postalCode)
    console.log(res.provinceName)
    console.log(res.cityName)
    console.log(res.countyName)
    console.log(res.detailInfo)
    console.log(res.nationalCode)
    console.log(res.telNumber)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def chooseAddress(): Unit = js.native
  def chooseAddress(option: ChooseAddressOption): Unit = js.native
  
  /** [wx.chooseImage(Object object)](wx.chooseImage.md)
  *
  * 从本地相册选择图片或使用相机拍照。
  *
  * **示例代码**
  *
  * ```js
  wx.chooseImage({
    count: 1,
    sizeType: ['original', 'compressed'],
    sourceType: ['album', 'camera'],
    success (res) {
    // tempFilePath可以作为img标签的src属性显示图片
    const tempFilePaths = res.tempFilePaths
    }
  })
  ``` */
  def chooseImage(option: ChooseImageOption): Unit = js.native
  
  /** [wx.chooseInvoice(Object object)](wx.chooseInvoice.md)
    *
    * 选择用户已有的发票
    *
    * **通过 cardId 和 encryptCode 获得报销发票的信息**
    *
    *
    * 请参考[微信电子发票文档](https://mp.weixin.qq.com/wiki?t=resource/res_main&id=21517918939oae3U)中，「查询报销发票信息」部分。
    * 其中 `access_token` 的获取请参考[getAccessToken]((getAccessToken))文档
    *
    * 最低基础库： `2.3.0` */
  def chooseInvoice(): Unit = js.native
  def chooseInvoice(option: ChooseInvoiceOption): Unit = js.native
  
  /** [wx.chooseInvoiceTitle(Object object)](wx.chooseInvoiceTitle.md)
  *
  * 选择用户的发票抬头
  *
  * **示例代码**
  *
  *
  * {% minicode('GJ4S9nmQ7x2E') %}
  *
  * ```js
  wx.chooseInvoiceTitle({
    success(res) {}
  })
  ```
  *
  * 最低基础库： `1.5.0` */
  def chooseInvoiceTitle(): Unit = js.native
  def chooseInvoiceTitle(option: ChooseInvoiceTitleOption): Unit = js.native
  
  /** [wx.chooseLocation(Object object)](wx.chooseLocation.md)
    *
    * 打开地图选择位置。 */
  def chooseLocation(): Unit = js.native
  def chooseLocation(option: ChooseLocationOption): Unit = js.native
  
  /** [wx.chooseVideo(Object object)](wx.chooseVideo.md)
  *
  * 拍摄视频或从手机相册中选视频。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.chooseVideo({
    sourceType: ['album','camera'],
    maxDuration: 60,
    camera: 'back',
    success(res) {
    console.log(res.tempFilePath)
    }
  })
  ``` */
  def chooseVideo(option: ChooseVideoOption): Unit = js.native
  
  /** [wx.clearStorage(Object object)](wx.clearStorage.md)
  *
  * 清理本地数据缓存
  *
  * **示例代码**
  *
  *
  * ```js
  wx.clearStorage()
  ```
  *
  * ```js
  try {
    wx.clearStorageSync()
  } catch(e) {
    // Do something when catch error
  }
  ``` */
  def clearStorage(): Unit = js.native
  def clearStorage(option: ClearStorageOption): Unit = js.native
  
  /** [wx.clearStorageSync()](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.clearStorageSync.html)
  *
  * [wx.clearStorage](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.clearStorage.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.clearStorage()
  ```
  *
  * ```js
  try {
    wx.clearStorageSync()
  } catch(e) {
    // Do something when catch error
  }
  ``` */
  def clearStorageSync(): Unit = js.native
  
  /** [wx.closeBLEConnection(Object object)](wx.closeBLEConnection.md)
  *
  * 断开与低功耗蓝牙设备的连接。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  wx.closeBLEConnection({
    deviceId,
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def closeBLEConnection(option: CloseBLEConnectionOption): Unit = js.native
  
  /** [wx.closeBluetoothAdapter(Object object)](wx.closeBluetoothAdapter.md)
  *
  * 关闭蓝牙模块。调用该方法将断开所有已建立的连接并释放系统资源。建议在使用蓝牙流程后，与 `wx.openBluetoothAdapter` 成对调用。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  wx.closeBluetoothAdapter({
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def closeBluetoothAdapter(): Unit = js.native
  def closeBluetoothAdapter(option: CloseBluetoothAdapterOption): Unit = js.native
  
  /** [wx.closeSocket(Object object)](wx.closeSocket.md)
  *
  * 关闭 WebSocket 连接
  *
  * **示例代码**
  *
  *
  * ```js
  wx.connectSocket({
    url: 'test.php'
  })
    
  //注意这里有时序问题，
  //如果 wx.connectSocket 还没回调 wx.onSocketOpen，而先调用 wx.closeSocket，那么就做不到关闭 WebSocket 的目的。
  //必须在 WebSocket 打开期间调用 wx.closeSocket 才能关闭。
  wx.onSocketOpen(function() {
    wx.closeSocket()
  })
    
  wx.onSocketClose(function(res) {
    console.log('WebSocket 已关闭！')
  })
  ``` */
  def closeSocket(option: CloseSocketOption): Unit = js.native
  
  /** [wx.compressImage(Object object)](wx.compressImage.md)
  *
  * 压缩图片接口，可选压缩质量
  *
  * **示例代码**
  *
  *
  * ```js
  wx.compressImage({
    src: '', // 图片路径
    quality: 80 // 压缩质量
  })
  ```
  *
  * 最低基础库： `2.4.0` */
  def compressImage(option: CompressImageOption): Unit = js.native
  
  /** [[SocketTask](https://developers.weixin.qq.com/miniprogram/dev/api/network/websocket/SocketTask.html) wx.connectSocket(Object object)](wx.connectSocket.md)
  *
  * 创建一个 WebSocket 连接。使用前请注意阅读[相关说明]((network))。
  *
  * **并发数**
  *
  *
  * - 1.7.0 及以上版本，最多可以同时存在 5（小游戏）/2（小程序）个 WebSocket 连接。
  * - 1.7.0 以下版本，一个小程序同时只能有一个 WebSocket 连接，如果当前已存在一个 WebSocket 连接，会自动关闭该连接，并重新创建一个 WebSocket 连接。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.connectSocket({
    url: 'wss://example.qq.com',
    data:{
    x: '',
    y: ''
    },
    header:{
    'content-type': 'application/json'
    },
    protocols: ['protocol1'],
    method:"GET"
  })
  ``` */
  def connectSocket(option: ConnectSocketOption): SocketTask = js.native
  
  /** [wx.connectWifi(Object object)](wx.connectWifi.md)
  *
  * 连接 Wi-Fi。若已知 Wi-Fi 信息，可以直接利用该接口连接。仅 Android 与 iOS 11 以上版本支持。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.connectWifi({
    SSID: '',
    BSSID: '',
    success (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.6.0` */
  def connectWifi(option: ConnectWifiOption): Unit = js.native
  
  /** [[Animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html) wx.createAnimation(Object object)](wx.createAnimation.md)
    *
    * 创建一个动画实例 [animation](https://developers.weixin.qq.com/miniprogram/dev/api/ui/animation/Animation.html)。调用实例的方法来描述动画。最后通过动画实例的 export 方法导出动画数据传递给组件的 animation 属性。 */
  def createAnimation(option: CreateAnimationOption): Animation = js.native
  
  /** [[AudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/AudioContext.html) wx.createAudioContext(string id, Object this)](wx.createAudioContext.md)
    *
    * 创建 `audio` 上下文 `AudioContext` 对象。 */
  def createAudioContext(/** `<audio/>` 组件的 id */
  id: String): AudioContext = js.native
  def createAudioContext(
    /** `<audio/>` 组件的 id */
  id: String,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 `<audio/>` 组件 */
  component: Any
  ): AudioContext = js.native
  
  /** [wx.createBLEConnection(Object object)](wx.createBLEConnection.md)
  *
  * 连接低功耗蓝牙设备。
  *
  * 若小程序在之前已有搜索过某个蓝牙设备，并成功建立连接，可直接传入之前搜索获取的 deviceId 直接尝试连接该设备，无需进行搜索操作。
  *
  * **注意**
  *
  *
  * - 请保证尽量成对的调用 `createBLEConnection` 和 `closeBLEConnection` 接口。安卓如果多次调用 `createBLEConnection` 创建连接，有可能导致系统持有同一设备多个连接的实例，导致调用 `closeBLEConnection` 的时候并不能真正的断开与设备的连接。
  * - 蓝牙连接随时可能断开，建议监听 `wx.onBLEConnectionStateChange` 回调事件，当蓝牙设备断开时按需执行重连操作
  * - 若对未连接的设备或已断开连接的设备调用数据读写操作的接口，会返回 10006 错误，建议进行重连操作。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  wx.createBLEConnection({
    // 这里的 deviceId 需要已经通过 createBLEConnection 与对应设备建立链接
    deviceId,
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def createBLEConnection(option: CreateBLEConnectionOption): Unit = js.native
  
  /** [[CameraContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/camera/CameraContext.html) wx.createCameraContext()](wx.createCameraContext.md)
    *
    * 创建 `camera` 上下文 `CameraContext` 对象。
    *
    * 最低基础库： `1.6.0` */
  def createCameraContext(): CameraContext = js.native
  
  /** [[CanvasContext](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/CanvasContext.html) wx.createCanvasContext(string canvasId, Object this)](wx.createCanvasContext.md)
    *
    * 创建 canvas 的绘图上下文 `CanvasContext` 对象 */
  def createCanvasContext(/** 要获取上下文的 `<canvas>` 组件 canvas-id 属性 */
  canvasId: String): CanvasContext = js.native
  def createCanvasContext(
    /** 要获取上下文的 `<canvas>` 组件 canvas-id 属性 */
  canvasId: String,
    /** 在自定义组件下，当前组件实例的this，表示在这个自定义组件下查找拥有 canvas-id 的 `<canvas/>` ，如果省略则不在任何自定义组件内查找 */
  component: Any
  ): CanvasContext = js.native
  
  /** [[InnerAudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.html) wx.createInnerAudioContext()](wx.createInnerAudioContext.md)
    *
    * 创建内部 `audio` 上下文 `InnerAudioContext` 对象。
    *
    * 最低基础库： `1.6.0` */
  def createInnerAudioContext(): InnerAudioContext = js.native
  
  /** [[IntersectionObserver](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/IntersectionObserver.html) wx.createIntersectionObserver(Object this, Object options)](wx.createIntersectionObserver.md)
    *
    * 创建并返回一个 IntersectionObserver 对象实例。在自定义组件中，可以使用 `this.createIntersectionObserver([options])` 来代替。
    *
    * **示例代码**
    *
    *
    * {% minicode('LAbMxkmI7F2A') %}
    *
    * 最低基础库： `1.9.3` */
  def createIntersectionObserver(/** 自定义组件实例 */
  component: Any, /** 选项 */
  options: CreateIntersectionObserverOption): IntersectionObserver = js.native
  /** [[IntersectionObserver](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/IntersectionObserver.html) wx.createIntersectionObserver(Object this, Object options)](wx.createIntersectionObserver.md)
    *
    * 创建并返回一个 IntersectionObserver 对象实例。在自定义组件中，可以使用 `this.createIntersectionObserver([options])` 来代替。
    *
    * **示例代码**
    *
    *
    * {% minicode('LAbMxkmI7F2A') %}
    *
    * 最低基础库： `1.9.3` */
  def createIntersectionObserver(/** 选项 */
  options: CreateIntersectionObserverOption): IntersectionObserver = js.native
  
  /** [[LivePlayerContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePlayerContext.html) wx.createLivePlayerContext(string id, Object this)](wx.createLivePlayerContext.md)
    *
    * 创建 `live-player` 上下文 `LivePlayerContext` 对象。
    *
    * 最低基础库： `1.7.0` */
  def createLivePlayerContext(/** `<live-player/>` 组件的 id */
  id: String): LivePlayerContext = js.native
  def createLivePlayerContext(
    /** `<live-player/>` 组件的 id */
  id: String,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 `<live-player/>` 组件 */
  component: Any
  ): LivePlayerContext = js.native
  
  /** [[LivePusherContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/live/LivePusherContext.html) wx.createLivePusherContext()](wx.createLivePusherContext.md)
    *
    * 创建 `live-pusher` 上下文 `LivePusherContext` 对象。
    *
    * 最低基础库： `1.7.0` */
  def createLivePusherContext(): LivePusherContext = js.native
  
  /** [[MapContext](https://developers.weixin.qq.com/miniprogram/dev/api/map/MapContext.html) wx.createMapContext(string mapId, Object this)](wx.createMapContext.md)
    *
    * 创建 `map` 上下文 `MapContext` 对象。 */
  def createMapContext(/** `<map/>` 组件的 id */
  mapId: String): MapContext = js.native
  def createMapContext(/** `<map/>` 组件的 id */
  mapId: String, /** 在自定义组件下，当前组件实例的this，以操作组件内 `<map/>` 组件 */
  component: Any): MapContext = js.native
  
  /** [[SelectorQuery](https://developers.weixin.qq.com/miniprogram/dev/api/wxml/SelectorQuery.html) wx.createSelectorQuery()](wx.createSelectorQuery.md)
  *
  * 返回一个 SelectorQuery 对象实例。
  *
  * **示例代码**
  *
  *
  * ```js
  const query = wx.createSelectorQuery()
  query.select('#the-id').boundingClientRect()
  query.selectViewport().scrollOffset()
  query.exec(function(res){
    res[0].top       // #the-id节点的上边界坐标
    res[1].scrollTop // 显示区域的竖直滚动位置
  })
  ```
  *
  * 最低基础库： `1.4.0` */
  def createSelectorQuery(): SelectorQuery = js.native
  
  /** [[VideoContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/video/VideoContext.html) wx.createVideoContext(string id, Object this)](wx.createVideoContext.md)
    *
    * 创建 `video` 上下文 `VideoContext` 对象。 */
  def createVideoContext(/** `<video/>` 组件的 id */
  id: String): VideoContext = js.native
  def createVideoContext(
    /** `<video/>` 组件的 id */
  id: String,
    /** 在自定义组件下，当前组件实例的this，以操作组件内 `<video/>` 组件 */
  component: Any
  ): VideoContext = js.native
  
  /** [[Worker](https://developers.weixin.qq.com/miniprogram/dev/api/worker/wx.createWorker.html) wx.createWorker(string scriptPath)](wx.createWorker.md)
    *
    * 创建一个 [Worker 线程]((多线程 Worker))。目前限制最多只能创建一个 Worker，创建下一个 Worker 前请先调用 [Worker.terminate](https://developers.weixin.qq.com/miniprogram/dev/api/worker/Worker.terminate.html)
    *
    * 最低基础库： `1.9.90` */
  def createWorker(/** worker 入口文件的**绝对路径** */
  scriptPath: String): Worker = js.native
  
  /** [[DownloadTask](https://developers.weixin.qq.com/miniprogram/dev/api/network/download/DownloadTask.html) wx.downloadFile(Object object)](wx.downloadFile.md)
  *
  * 下载文件资源到本地。客户端直接发起一个 HTTPS GET 请求，返回文件的本地临时路径。使用前请注意阅读[相关说明]((network))。
  *
  * 注意：请在服务端响应的 header 中指定合理的 `Content-Type` 字段，以保证客户端正确处理文件类型。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.downloadFile({
    url: 'https://example.com/audio/123', //仅为示例，并非真实的资源
    success (res) {
    // 只要服务器有响应数据，就会把响应内容写入文件并进入 success 回调，业务需要自行判断是否下载到了想要的内容
    if (res.statusCode === 200) {
    wx.playVoice({
    filePath: res.tempFilePath
    })
    }
    }
  })
  ``` */
  def downloadFile(option: DownloadFileOption): DownloadTask = js.native
  
  /** [Object wx.getAccountInfoSync()](wx.getAccountInfoSync.md)
  *
  * 获取当前帐号信息
  *
  * **示例代码**
  *
  *
  * ```js
  const accountInfo = wx.getAccountInfoSync();
  console.log(accountInfo.miniProgram.appId) // 小程序 appId
  console.log(accountInfo.plugin.appId) // 插件 appId
  console.log(accountInfo.plugin.version) // 插件版本号， 'a.b.c' 这样的形式
  ```
  *
  * 最低基础库： `2.2.2` */
  def getAccountInfoSync(): AccountInfo = js.native
  
  /** [wx.getAvailableAudioSources(Object object)](wx.getAvailableAudioSources.md)
    *
    * 获取当前支持的音频输入源
    *
    * 最低基础库： `2.1.0` */
  def getAvailableAudioSources(): Unit = js.native
  def getAvailableAudioSources(option: GetAvailableAudioSourcesOption): Unit = js.native
  
  /** [wx.getBLEDeviceCharacteristics(Object object)](wx.getBLEDeviceCharacteristics.md)
  *
  * 获取蓝牙设备某个服务中所有特征值(characteristic)。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  wx.getBLEDeviceCharacteristics({
    // 这里的 deviceId 需要已经通过 createBLEConnection 与对应设备建立链接
    deviceId,
    // 这里的 serviceId 需要在 getBLEDeviceServices 接口中获取
    serviceId,
    success (res) {
    console.log('device getBLEDeviceCharacteristics:', res.characteristics)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def getBLEDeviceCharacteristics(option: GetBLEDeviceCharacteristicsOption): Unit = js.native
  
  /** [wx.getBLEDeviceServices(Object object)](wx.getBLEDeviceServices.md)
  *
  * 获取蓝牙设备所有服务(service)。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  wx.getBLEDeviceServices({
    // 这里的 deviceId 需要已经通过 createBLEConnection 与对应设备建立链接
    deviceId,
    success (res) {
    console.log('device services:', res.services)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def getBLEDeviceServices(option: GetBLEDeviceServicesOption): Unit = js.native
  
  /** [[BackgroundAudioManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/background-audio/BackgroundAudioManager.html) wx.getBackgroundAudioManager()](wx.getBackgroundAudioManager.md)
    *
    * 获取**全局唯一**的背景音频管理器。
    * 小程序切入后台，如果音频处于播放状态，可以继续播放。但是后台状态不能通过调用API操纵音频的播放状态。
    *
    * 从微信客户端6.7.2版本开始，若需要在小程序切后台后继续播放音频，需要在 [app.json]((全局配置)) 中配置 `requiredBackgroundModes` 属性。开发版和体验版上可以直接生效，正式版还需通过审核。
    *
    * 最低基础库： `1.2.0` */
  def getBackgroundAudioManager(): BackgroundAudioManager = js.native
  
  /** [wx.getBackgroundAudioPlayerState(Object object)](wx.getBackgroundAudioPlayerState.md)
  *
  * 获取后台音乐播放状态。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getBackgroundAudioPlayerState({
    success (res) {
    const status = res.status
    const dataUrl = res.dataUrl
    const currentPosition = res.currentPosition
    const duration = res.duration
    const downloadPercent = res.downloadPercent
    }
  })
  ``` */
  def getBackgroundAudioPlayerState(): Unit = js.native
  def getBackgroundAudioPlayerState(option: GetBackgroundAudioPlayerStateOption): Unit = js.native
  
  /** [wx.getBatteryInfo(Object object)](wx.getBatteryInfo.md)
    *
    * 获取设备电量。同步 API [wx.getBatteryInfoSync](https://developers.weixin.qq.com/miniprogram/dev/api/device/battery/wx.getBatteryInfoSync.html) 在 iOS 上不可用。 */
  def getBatteryInfo(): Unit = js.native
  def getBatteryInfo(option: GetBatteryInfoOption): Unit = js.native
  
  /** [Object wx.getBatteryInfoSync()](https://developers.weixin.qq.com/miniprogram/dev/api/device/battery/wx.getBatteryInfoSync.html)
    *
    * [wx.getBatteryInfo](https://developers.weixin.qq.com/miniprogram/dev/api/device/battery/wx.getBatteryInfo.html) 的同步版本 */
  def getBatteryInfoSync(): GetBatteryInfoSyncResult = js.native
  
  /** [wx.getBeacons(Object object)](wx.getBeacons.md)
    *
    * 获取所有已搜索到的 iBeacon 设备
    *
    * 最低基础库： `1.2.0` */
  def getBeacons(): Unit = js.native
  def getBeacons(option: GetBeaconsOption): Unit = js.native
  
  /** [wx.getBluetoothAdapterState(Object object)](wx.getBluetoothAdapterState.md)
  *
  * 获取本机蓝牙适配器状态。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  wx.getBluetoothAdapterState({
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def getBluetoothAdapterState(): Unit = js.native
  def getBluetoothAdapterState(option: GetBluetoothAdapterStateOption): Unit = js.native
  
  /** [wx.getBluetoothDevices(Object object)](wx.getBluetoothDevices.md)
  *
  * 获取在蓝牙模块生效期间所有已发现的蓝牙设备。包括已经和本机处于连接状态的设备。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  *
  * ```js
  // ArrayBuffer转16进度字符串示例
  function ab2hex(buffer) {
    var hexArr = Array.prototype.map.call(
    new Uint8Array(buffer),
    function(bit) {
    return ('00' + bit.toString(16)).slice(-2)
    }
    )
    return hexArr.join('');
  }
  wx.getBluetoothDevices({
    success: function (res) {
    console.log(res)
    if (res.devices[0]) {
    console.log(ab2hex(res.devices[0].advertisData))
    }
    }
  })
  ```
  *
  * **注意事项**
  *
  *
  * - 该接口获取到的设备列表为**蓝牙模块生效期间所有搜索到的蓝牙设备**，若在蓝牙模块使用流程结束后未及时调用 `wx.closeBluetoothAdapter` 释放资源，会存在调用该接口会返回之前的蓝牙使用流程中搜索到的蓝牙设备，可能设备已经不在用户身边，无法连接。
  * - 蓝牙设备在被搜索到时，系统返回的 name 字段一般为广播包中的 LocalName 字段中的设备名称，而如果与蓝牙设备建立连接，系统返回的 name 字段会改为从蓝牙设备上获取到的 `GattName`。若需要动态改变设备名称并展示，建议使用 `localName` 字段。
  *
  * 最低基础库： `1.1.0` */
  def getBluetoothDevices(): Unit = js.native
  def getBluetoothDevices(option: GetBluetoothDevicesOption): Unit = js.native
  
  /** [wx.getClipboardData(Object object)](wx.getClipboardData.md)
  *
  * 获取系统剪贴板的内容
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getClipboardData({
    success (res){
    console.log(res.data)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def getClipboardData(): Unit = js.native
  def getClipboardData(option: GetClipboardDataOption): Unit = js.native
  
  /** [wx.getConnectedBluetoothDevices(Object object)](wx.getConnectedBluetoothDevices.md)
  *
  * 根据 uuid 获取处于已连接状态的设备。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  wx.getConnectedBluetoothDevices({
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def getConnectedBluetoothDevices(option: GetConnectedBluetoothDevicesOption): Unit = js.native
  
  /** [wx.getConnectedWifi(Object object)](wx.getConnectedWifi.md)
    *
    * 获取已连接中的 Wi-Fi 信息。
    *
    * 最低基础库： `1.6.0` */
  def getConnectedWifi(): Unit = js.native
  def getConnectedWifi(option: GetConnectedWifiOption): Unit = js.native
  
  /** [wx.getExtConfig(Object object)](wx.getExtConfig.md)
  *
  * 获取[第三方平台]((devtools/ext))自定义的数据字段。
  *
  * **Tips**
  *
  *
  * 1. 本接口暂时无法通过 `wx.canIUse` 判断是否兼容，开发者需要自行判断 `wx.getExtConfig` 是否存在来兼容
  *
  * **示例代码**
  *
  * ```js
  if (wx.getExtConfig) {
    wx.getExtConfig({
    success (res) {
    console.log(res.extConfig)
    }
    })
  }
  ```
  *
  * 最低基础库： `1.1.0` */
  def getExtConfig(): Unit = js.native
  def getExtConfig(option: GetExtConfigOption): Unit = js.native
  
  /** [Object wx.getExtConfigSync()](wx.getExtConfigSync.md)
  *
  * [wx.getExtConfig](https://developers.weixin.qq.com/miniprogram/dev/api/ext/wx.getExtConfig.html) 的同步版本。
  *
  * **Tips**
  *
  *
  * 1. 本接口暂时无法通过 `wx.canIUse` 判断是否兼容，开发者需要自行判断 `wx.getExtConfigSync` 是否存在来兼容
  *
  * **示例代码**
  *
  * ```js
  let extConfig = wx.getExtConfigSync? wx.getExtConfigSync(): {}
  console.log(extConfig)
  ```
  *
  * 最低基础库： `1.1.0` */
  def getExtConfigSync(): ExtInfo = js.native
  
  /** [wx.getFileInfo(Object object)](wx.getFileInfo.md)
  *
  * 获取文件信息
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getFileInfo({
    success (res) {
    console.log(res.size)
    console.log(res.digest)
    }
  })
  ```
  *
  * 最低基础库： `1.4.0` */
  def getFileInfo(option: WxGetFileInfoOption): Unit = js.native
  
  /** [[FileSystemManager](https://developers.weixin.qq.com/miniprogram/dev/api/file/FileSystemManager.html) wx.getFileSystemManager()](wx.getFileSystemManager.md)
    *
    * 获取全局唯一的文件管理器
    *
    * 最低基础库： `1.9.9` */
  def getFileSystemManager(): FileSystemManager = js.native
  
  /** [wx.getHCEState(Object object)](wx.getHCEState.md)
  *
  * 判断当前设备是否支持 HCE 能力。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getHCEState({
    success (res) {
    console.log(res.errCode)
    }
  })
  ```
  *
  * 最低基础库： `1.7.0` */
  def getHCEState(): Unit = js.native
  def getHCEState(option: GetHCEStateOption): Unit = js.native
  
  /** [wx.getImageInfo(Object object)](wx.getImageInfo.md)
  *
  * 获取图片信息。网络图片需先配置download域名才能生效。
  *
  * **示例代码**
  *
  *
  * {% minicode('Kd47Sbmr6yYu') %}
  *
  * ```js
  wx.getImageInfo({
    src: 'images/a.jpg',
    success (res) {
    console.log(res.width)
    console.log(res.height)
    }
  })
    
  wx.chooseImage({
    success (res) {
    wx.getImageInfo({
    src: res.tempFilePaths[0],
    success (res) {
    console.log(res.width)
    console.log(res.height)
    }
    })
    }
  })
  ``` */
  def getImageInfo(option: GetImageInfoOption): Unit = js.native
  
  /** [Object wx.getLaunchOptionsSync()](wx.getLaunchOptionsSync.md)
    *
    * 获取小程序启动时的参数。与 [`App.onLaunch`]((app-service/app#onlaunchobject)) 的回调参数一致。
    *
    * **返回有效 referrerInfo 的场景**
    *
    *
    * | 场景值 | 场景                            | appId含义  |
    * | ------ | ------------------------------- | ---------- |
    * | 1020   | 公众号 profile 页相关小程序列表 | 来源公众号 |
    * | 1035   | 公众号自定义菜单                | 来源公众号 |
    * | 1036   | App 分享消息卡片                | 来源App    |
    * | 1037   | 小程序打开小程序                | 来源小程序 |
    * | 1038   | 从另一个小程序返回              | 来源小程序 |
    * | 1043   | 公众号模板消息                  | 来源公众号 |
    *
    * **注意**
    *
    *
    * 部分版本在无`referrerInfo`的时候会返回 `undefined`，建议使用 `options.referrerInfo && options.referrerInfo.appId` 进行判断。
    *
    * 最低基础库： `2.1.2` */
  def getLaunchOptionsSync(): LaunchOptionsApp = js.native
  
  /** [wx.getLocation(Object object)](wx.getLocation.md)
  *
  * 获取当前的地理位置、速度。当用户离开小程序后，此接口无法调用。
  *
  * **示例代码**
  *
  *
  *  ```js
    wx.getLocation({
    type: 'wgs84',
    success (res) {
    const latitude = res.latitude
    const longitude = res.longitude
    const speed = res.speed
    const accuracy = res.accuracy
    }
  })
    ```
  *
  * **注意**
  *
  *
  * - 工具中定位模拟使用IP定位，可能会有一定误差。且工具目前仅支持 gcj02 坐标。
  * - 使用第三方服务进行逆地址解析时，请确认第三方服务默认的坐标系，正确进行坐标转换。 */
  def getLocation(option: GetLocationOption): Unit = js.native
  
  /** [[LogManager](https://developers.weixin.qq.com/miniprogram/dev/api/debug/LogManager.html) wx.getLogManager(number level)](wx.getLogManager.md)
  *
  * 获取日志管理器对象。
  *
  * **示例代码**
  *
  *
  * ```js
  const logger = wx.getLogManager()
  logger.log({str: 'hello world'}, 'basic log', 100, [1, 2, 3])
  logger.info({str: 'hello world'}, 'info log', 100, [1, 2, 3])
  logger.debug({str: 'hello world'}, 'debug log', 100, [1, 2, 3])
  logger.warn({str: 'hello world'}, 'warn log', 100, [1, 2, 3])
  ```
  *
  * 最低基础库： `2.1.0` */
  def getLogManager(): LogManager = js.native
  def getLogManager(
    /** 取值为0/1，取值为0表示是否会把 `App`、`Page` 的生命周期函数和 `wx` 命名空间下的函数调用写入日志，取值为1则不会。默认值是 0
    *
    * 最低基础库： `2.3.2` */
  level: Double
  ): LogManager = js.native
  
  /** [Object wx.getMenuButtonBoundingClientRect()](wx.getMenuButtonBoundingClientRect.md)
    *
    * 获取菜单按钮（右上角胶囊按钮）的布局位置信息。坐标信息以屏幕左上角为原点。
    *
    * 最低基础库： `2.1.0` */
  def getMenuButtonBoundingClientRect(): Rect = js.native
  
  /** [wx.getNetworkType(Object object)](wx.getNetworkType.md)
  *
  * 获取网络类型
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getNetworkType({
    success (res) {
    const networkType = res.networkType
    }
  })
  ``` */
  def getNetworkType(): Unit = js.native
  def getNetworkType(option: GetNetworkTypeOption): Unit = js.native
  
  /** [[RecorderManager](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/RecorderManager.html) wx.getRecorderManager()](wx.getRecorderManager.md)
    *
    * 获取**全局唯一**的录音管理器 RecorderManager
    *
    * 最低基础库： `1.6.0` */
  def getRecorderManager(): RecorderManager = js.native
  
  /** [wx.getSavedFileInfo(Object object)](wx.getSavedFileInfo.md)
  *
  * 获取本地文件的文件信息。此接口只能用于获取已保存到本地的文件，若需要获取临时文件信息，请使用 [wx.getFileInfo()](https://developers.weixin.qq.com/miniprogram/dev/api/file/wx.getFileInfo.html) 接口。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSavedFileList({
    success (res) {
    console.log(res.fileList)
    }
  })
  ``` */
  def getSavedFileInfo(option: GetSavedFileInfoOption): Unit = js.native
  
  /** [wx.getSavedFileList(Object object)](wx.getSavedFileList.md)
  *
  * 获取该小程序下已保存的本地缓存文件列表
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSavedFileList({
    success (res) {
    console.log(res.fileList)
    }
  })
  ``` */
  def getSavedFileList(): Unit = js.native
  def getSavedFileList(option: WxGetSavedFileListOption): Unit = js.native
  
  /** [wx.getScreenBrightness(Object object)](wx.getScreenBrightness.md)
    *
    * 获取屏幕亮度
    *
    * **说明**
    *
    *
    * - 若安卓系统设置中开启了自动调节亮度功能，则屏幕亮度会根据光线自动调整，该接口仅能获取自动调节亮度之前的值，而非实时的亮度值。
    *
    * 最低基础库： `1.2.0` */
  def getScreenBrightness(): Unit = js.native
  def getScreenBrightness(option: GetScreenBrightnessOption): Unit = js.native
  
  /** [wx.getSetting(Object object)](wx.getSetting.md)
  *
  * 获取用户的当前设置。**返回值中只会出现小程序已经向用户请求过的[权限](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/authorize/wx.authorize.html)**。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSetting({
    success (res) {
    console.log(res.authSetting)
    // res.authSetting = {
    //   "scope.userInfo": true,
    //   "scope.userLocation": true
    // }
    }
  })
  ```
  *
  * 最低基础库： `1.2.0` */
  def getSetting(): Unit = js.native
  def getSetting(option: GetSettingOption): Unit = js.native
  
  /** [wx.getShareInfo(Object object)](wx.getShareInfo.md)
  *
  * 获取转发详细信息
  *
  * **示例代码**
  *
  *
  * encryptedData 解密后为以下 json 结构，详见[加密数据解密算法]((开放数据校验与解密))。其中 openGId 为当前群的唯一标识
  *
  * ```json
  {
    "openGId": "OPENGID"
  }
  ```
  *
  * **Tips**
  *
  *
  * - 如需要展示群名称，可以使用[开放数据组件]((open-data))
  *
  * 最低基础库： `1.1.0` */
  def getShareInfo(option: GetShareInfoOption): Unit = js.native
  
  /** [wx.getStorage(Object object)](wx.getStorage.md)
  *
  * 从本地缓存中异步获取指定 key 的内容
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getStorage({
    key: 'key',
    success (res) {
    console.log(res.data)
    }
  })
  ```
  *
  * ```js
  try {
    var value = wx.getStorageSync('key')
    if (value) {
    // Do something with return value
    }
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def getStorage(option: GetStorageOption): Unit = js.native
  
  /** [wx.getStorageInfo(Object object)](wx.getStorageInfo.md)
  *
  * 异步获取当前storage的相关信息
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getStorageInfo({
    success (res) {
    console.log(res.keys)
    console.log(res.currentSize)
    console.log(res.limitSize)
    }
  })
  ```
  *
  * ```js
  try {
    const res = wx.getStorageInfoSync()
    console.log(res.keys)
    console.log(res.currentSize)
    console.log(res.limitSize)
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def getStorageInfo(): Unit = js.native
  def getStorageInfo(option: GetStorageInfoOption): Unit = js.native
  
  /** [Object wx.getStorageInfoSync()](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.getStorageInfoSync.html)
  *
  * [wx.getStorageInfo](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.getStorageInfo.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getStorageInfo({
    success (res) {
    console.log(res.keys)
    console.log(res.currentSize)
    console.log(res.limitSize)
    }
  })
  ```
  *
  * ```js
  try {
    const res = wx.getStorageInfoSync()
    console.log(res.keys)
    console.log(res.currentSize)
    console.log(res.limitSize)
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def getStorageInfoSync(): GetStorageInfoSyncOption = js.native
  
  /** [any wx.getStorageSync(string key)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.getStorageSync.html)
  *
  * [wx.getStorage](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.getStorage.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getStorage({
    key: 'key',
    success (res) {
    console.log(res.data)
    }
  })
  ```
  *
  * ```js
  try {
    var value = wx.getStorageSync('key')
    if (value) {
    // Do something with return value
    }
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def getStorageSync(/** 本地缓存中指定的 key */
  key: String): Any = js.native
  
  /** [wx.getSystemInfo(Object object)](wx.getSystemInfo.md)
  *
  * 获取系统信息
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSystemInfo({
    success (res) {
    console.log(res.model)
    console.log(res.pixelRatio)
    console.log(res.windowWidth)
    console.log(res.windowHeight)
    console.log(res.language)
    console.log(res.version)
    console.log(res.platform)
    }
  })
  ```
  *
  * ```js
  try {
    const res = wx.getSystemInfoSync()
    console.log(res.model)
    console.log(res.pixelRatio)
    console.log(res.windowWidth)
    console.log(res.windowHeight)
    console.log(res.language)
    console.log(res.version)
    console.log(res.platform)
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def getSystemInfo(): Unit = js.native
  def getSystemInfo(option: GetSystemInfoOption): Unit = js.native
  
  /** [Object wx.getSystemInfoSync()](https://developers.weixin.qq.com/miniprogram/dev/api/system/system-info/wx.getSystemInfoSync.html)
  *
  * [wx.getSystemInfo](https://developers.weixin.qq.com/miniprogram/dev/api/system/system-info/wx.getSystemInfo.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSystemInfo({
    success (res) {
    console.log(res.model)
    console.log(res.pixelRatio)
    console.log(res.windowWidth)
    console.log(res.windowHeight)
    console.log(res.language)
    console.log(res.version)
    console.log(res.platform)
    }
  })
  ```
  *
  * ```js
  try {
    const res = wx.getSystemInfoSync()
    console.log(res.model)
    console.log(res.pixelRatio)
    console.log(res.windowWidth)
    console.log(res.windowHeight)
    console.log(res.language)
    console.log(res.version)
    console.log(res.platform)
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def getSystemInfoSync(): GetSystemInfoSyncResult = js.native
  
  /** [[UpdateManager](https://developers.weixin.qq.com/miniprogram/dev/api/update/UpdateManager.html) wx.getUpdateManager()](wx.getUpdateManager.md)
    *
    * 获取**全局唯一**的版本更新管理器，用于管理小程序更新。关于小程序的更新机制，可以查看[运行机制]((operating-mechanism))文档。
    *
    * 最低基础库： `1.9.90` */
  def getUpdateManager(): UpdateManager = js.native
  
  /** [wx.getUserInfo(Object object)](wx.getUserInfo.md)
  *
  * 获取用户信息。
  *
  * **接口调整说明**
  *
  *
  * 在用户未授权过的情况下调用此接口，将不再出现授权弹窗，会直接进入 fail 回调（详见[《公告》]({% postUrl(0000a26e1aca6012e896a517556c01) %}))。在用户已授权的情况下调用此接口，可成功获取用户信息。
  *
  * **示例代码**
  *
  *
  * ```html
  * <!-- 如果只是展示用户头像昵称，可以使用 <open-data /> 组件 -->
  * <open-data type="userAvatarUrl"></open-data>
  * <open-data type="userNickName"></open-data>
  * <!-- 需要使用 button 来授权登录 -->
  * <button wx:if="{{canIUse}}" open-type="getUserInfo" bindgetuserinfo="bindGetUserInfo">授权登录</button>
  * <view wx:else>请升级微信版本</view>
  * ```
  *
  * ```js
  Page({
    data: {
    canIUse: wx.canIUse('button.open-type.getUserInfo')
    },
    onLoad: function() {
    // 查看是否授权
    wx.getSetting({
    success (res){
    if (res.authSetting['scope.userInfo']) {
    // 已经授权，可以直接调用 getUserInfo 获取头像昵称
    wx.getUserInfo({
    success: function(res) {
    console.log(res.userInfo)
    }
    })
    }
    }
    })
    },
    bindGetUserInfo (e) {
    console.log(e.detail.userInfo)
    }
  })
  ``` */
  def getUserInfo(option: GetUserInfoOption): Unit = js.native
  
  /** [wx.getWeRunData(Object object)](wx.getWeRunData.md)
  *
  * 获取用户过去三十天微信运动步数。需要先调用 [wx.login](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/login/wx.login.html) 接口。步数信息会在用户主动进入小程序时更新。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getWeRunData({
    success (res) {
    const encryptedData = res.encryptedData
    }
  })
  ```
  *
  * **encryptedData 解密后 JSON 结构**
  *
  *
  * ```json
  {
    "stepInfoList": [
    {
    "timestamp": 1445866601,
    "step": 100
    },
    {
    "timestamp": 1445876601,
    "step": 120
    }
    ]
  }
  ```
  *
  * stepInfoList 中，每一项结构如下：
  *
  * | 属性 | 类型 | 说明 |
  * | --- | ---- | --- |
  * | timestamp | number | 时间戳，表示数据对应的时间 |
  * | step | number | 微信运动步数 |
  *
  * 最低基础库： `1.2.0` */
  def getWeRunData(): Unit = js.native
  def getWeRunData(option: GetWeRunDataOption): Unit = js.native
  
  /** [wx.getWifiList(Object object)](wx.getWifiList.md)
    *
    * 请求获取 Wi-Fi 列表。在 `onGetWifiList` 注册的回调中返回 `wifiList` 数据。
    *
    * iOS 将跳转到系统的 Wi-Fi 界面，Android 不会跳转。 iOS 11.0 及 iOS 11.1 两个版本因系统问题，该方法失效。但在 iOS 11.2 中已修复。
    *
    * 最低基础库： `1.6.0` */
  def getWifiList(): Unit = js.native
  def getWifiList(option: GetWifiListOption): Unit = js.native
  
  /** [wx.hideLoading(Object object)](wx.hideLoading.md)
    *
    * 隐藏 loading 提示框
    *
    * 最低基础库： `1.1.0` */
  def hideLoading(): Unit = js.native
  def hideLoading(option: HideLoadingOption): Unit = js.native
  
  /** [wx.hideNavigationBarLoading(Object object)](wx.hideNavigationBarLoading.md)
    *
    * 在当前页面隐藏导航条加载动画 */
  def hideNavigationBarLoading(): Unit = js.native
  def hideNavigationBarLoading(option: HideNavigationBarLoadingOption): Unit = js.native
  
  /** [wx.hideShareMenu(Object object)](wx.hideShareMenu.md)
  *
  * 隐藏转发按钮
  *
  * **示例代码**
  *
  *
  * ```js
  wx.hideShareMenu()
  ```
  *
  * 最低基础库： `1.1.0` */
  def hideShareMenu(): Unit = js.native
  def hideShareMenu(option: HideShareMenuOption): Unit = js.native
  
  /** [wx.hideTabBar(Object object)](wx.hideTabBar.md)
    *
    * 隐藏 tabBar
    *
    * 最低基础库： `1.9.0` */
  def hideTabBar(option: HideTabBarOption): Unit = js.native
  
  /** [wx.hideTabBarRedDot(Object object)](wx.hideTabBarRedDot.md)
    *
    * 隐藏 tabBar 某一项的右上角的红点
    *
    * 最低基础库： `1.9.0` */
  def hideTabBarRedDot(option: HideTabBarRedDotOption): Unit = js.native
  
  /** [wx.hideToast(Object object)](wx.hideToast.md)
    *
    * 隐藏消息提示框 */
  def hideToast(): Unit = js.native
  def hideToast(option: HideToastOption): Unit = js.native
  
  /** [wx.loadFontFace(Object object)](wx.loadFontFace.md)
  *
  * 动态加载网络字体。文件地址需为下载类型。iOS 仅支持 https 格式文件地址。
  *
  * 注意：
  * 1. 引入中文字体，体积过大时会发生错误，建议抽离出部分中文，减少体积，或者用图片替代
  * 2. 字体链接必须是https（ios不支持http)
  * 3. 字体链接必须是同源下的，或开启了cors支持，小程序的域名是`servicewechat.com`
  * 4. canvas等原生组件不支持使用接口添加的字体
  * 5. 工具里提示 Faild to load font可以忽略
  *
  * **示例代码**
  *
  *
  * {% minicode('b6Zrajm67R2x') %}
  * ```js
  wx.loadFontFace({
    family: 'Bitstream Vera Serif Bold',
    source: 'url("https://sungd.github.io/Pacifico.ttf")',
    success: console.log
  })
  ```
  *
  * 最低基础库： `2.1.0` */
  def loadFontFace(option: LoadFontFaceOption): Unit = js.native
  
  /** [wx.login(Object object)](wx.login.md)
  *
  * 调用接口获取登录凭证（code）。通过凭证进而换取用户登录态信息，包括用户的唯一标识（openid）及本次登录的会话密钥（session_key）等。用户数据的加解密通讯需要依赖会话密钥完成。更多使用方法详见 [小程序登录]((login))。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.login({
    success (res) {
    if (res.code) {
    //发起网络请求
    wx.request({
    url: 'https://test.com/onLogin',
    data: {
    code: res.code
    }
    })
    } else {
    console.log('登录失败！' + res.errMsg)
    }
    }
  })
  ``` */
  def login(option: LoginOption): Unit = js.native
  
  /** [wx.makePhoneCall(Object object)](wx.makePhoneCall.md)
  *
  * 拨打电话
  *
  * **示例代码**
  *
  *
  * ```js
  wx.makePhoneCall({
    phoneNumber: '1340000' //仅为示例，并非真实的电话号码
  })
  ``` */
  def makePhoneCall(option: MakePhoneCallOption): Unit = js.native
  
  /** [wx.navigateBack(Object object)](wx.navigateBack.md)
    *
    * 关闭当前页面，返回上一页面或多级页面。可通过 [getCurrentPages()]((页面路由#getcurrentpages)) 获取当前的页面栈，决定需要返回几层。 */
  def navigateBack(option: NavigateBackOption): Unit = js.native
  
  /** [wx.navigateBackMiniProgram(Object object)](wx.navigateBackMiniProgram.md)
  *
  * 返回到上一个小程序。只有在当前小程序是被其他小程序打开时可以调用成功
  *
  * 注意：**微信客户端 iOS 6.5.9，Android 6.5.10 及以上版本支持**
  *
  * **示例代码**
  *
  *
  * ```js
  wx.navigateBackMiniProgram({
    extraData: {
    foo: 'bar'
  },
  success(res) {
    // 返回成功
  }
  })
  ```
  *
  * 最低基础库： `1.3.0` */
  def navigateBackMiniProgram(option: NavigateBackMiniProgramOption): Unit = js.native
  
  /** [wx.navigateTo(Object object)](wx.navigateTo.md)
  *
  * 保留当前页面，跳转到应用内的某个页面。但是不能跳到 tabbar 页面。使用 [wx.navigateBack](https://developers.weixin.qq.com/miniprogram/dev/api/route/wx.navigateBack.html) 可以返回到原页面。
  *
  * **示例代码**
  *
  *
  *
  * ```js
  wx.navigateTo({
    url: 'test?id=1'
  })
  ```
  *
  * ```javascript
  //test.js
  Page({
    onLoad: function(option){
    console.log(option.query)
    }
  })
  ``` */
  def navigateTo(option: NavigateToOption): Unit = js.native
  
  /** [wx.navigateToMiniProgram(Object object)](wx.navigateToMiniProgram.md)
  *
  * 打开另一个小程序
  *
  * **使用限制**
  *
  *
  * ##### 需要用户触发跳转
  * 从 2.3.0 版本开始，若用户未点击小程序页面任意位置，则开发者将无法调用此接口自动跳转至其他小程序。
  * ##### 需要用户确认跳转
  * 从 2.3.0 版本开始，在跳转至其他小程序前，将统一增加弹窗，询问是否跳转，用户确认后才可以跳转其他小程序。如果用户点击取消，则回调 `fail cancel`。
  * ##### 每个小程序可跳转的其他小程序数量限制为不超过 10 个
  * 从 2.4.0 版本以及指定日期（具体待定）开始，开发者提交新版小程序代码时，如使用了跳转其他小程序功能，则需要在代码配置中声明将要跳转的小程序名单，限定不超过 10 个，否则将无法通过审核。该名单可在发布新版时更新，不支持动态修改。配置方法详见 [配置]((config))。调用此接口时，所跳转的 appId 必须在配置列表中，否则回调 `fail appId "${appId}" is not in navigateToMiniProgramAppIdList`。
  *
  * **关于调试**
  *
  *
  * - 在开发者工具上调用此 API 并不会真实的跳转到另外的小程序，但是开发者工具会校验本次调用跳转是否成功。[详情](https://developers.weixin.qq.com/miniprogram/dev/devtools/different.html#跳转小程序调试支持)
  * - 开发者工具上支持被跳转的小程序处理接收参数的调试。[详情](https://developers.weixin.qq.com/miniprogram/dev/devtools/different.html#跳转小程序调试支持)
  *
  * **示例代码**
  *
  *
  * ```js
  wx.navigateToMiniProgram({
    appId: '',
    path: 'page/index/index?id=123',
    extraData: {
    foo: 'bar'
    },
    envVersion: 'develop',
    success(res) {
    // 打开成功
    }
  })
  ```
  *
  * 最低基础库： `[object Object]` */
  def navigateToMiniProgram(option: NavigateToMiniProgramOption): Unit = js.native
  
  /** [wx.nextTick(function callback)](wx.nextTick.md)
    *
    * 延迟一部分操作到下一个时间片再执行。（类似于 setTimeout）
    *
    * **说明**
    *
    *
    *
    * 因为自定义组件中的 setData 和 triggerEvent 等接口本身是同步的操作，当这几个接口被连续调用时，都是在一个同步流程中执行完的，因此若逻辑不当可能会导致出错。
    *
    * 一个极端的案例：当父组件的 setData 引发了子组件的 triggerEvent，进而使得父组件又进行了一次 setData，期间有通过 wx:if 语句对子组件进行卸载，就有可能引发奇怪的错误，所以对于不需要在一个同步流程内完成的逻辑，可以使用此接口延迟到下一个时间片再执行。
    *
    * 最低基础库： `2.2.3` */
  def nextTick(callback: Function): Unit = js.native
  
  /** [wx.notifyBLECharacteristicValueChange(Object object)](wx.notifyBLECharacteristicValueChange.md)
  *
  * 启用低功耗蓝牙设备特征值变化时的 notify 功能，订阅特征值。注意：必须设备的特征值支持 notify 或者 indicate 才可以成功调用。
  *
  * 另外，必须先启用 `notifyBLECharacteristicValueChange` 才能监听到设备 `characteristicValueChange` 事件
  *
  * **注意**
  *
  *
  * - 订阅操作成功后需要设备主动更新特征值的 value，才会触发 `wx.onBLECharacteristicValueChange` 回调。
  * - 安卓平台上，在调用 `notifyBLECharacteristicValueChange` 成功后立即调用 `writeBLECharacteristicValue` 接口，在部分机型上会发生 10008 系统错误
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  wx.notifyBLECharacteristicValueChange({
    state: true, // 启用 notify 功能
    // 这里的 deviceId 需要已经通过 createBLEConnection 与对应设备建立链接
    deviceId,
    // 这里的 serviceId 需要在 getBLEDeviceServices 接口中获取
    serviceId,
    // 这里的 characteristicId 需要在 getBLEDeviceCharacteristics 接口中获取
    characteristicId,
    success (res) {
    console.log('notifyBLECharacteristicValueChange success', res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def notifyBLECharacteristicValueChange(option: NotifyBLECharacteristicValueChangeOption): Unit = js.native
  
  /** [wx.offAppHide(function callback)](wx.offAppHide.md)
    *
    * 取消监听小程序切后台事件
    *
    * 最低基础库： `2.1.2` */
  def offAppHide(/** 小程序切后台事件的回调函数 */
  callback: OffAppHideCallback): Unit = js.native
  
  /** [wx.offAppShow(function callback)](wx.offAppShow.md)
    *
    * 取消监听小程序切前台事件
    *
    * 最低基础库： `2.1.2` */
  def offAppShow(/** 小程序切前台事件的回调函数 */
  callback: OffAppShowCallback): Unit = js.native
  
  /** [wx.offError(function callback)](wx.offError.md)
    *
    * 取消监听小程序错误事件。
    *
    * 最低基础库： `2.1.2` */
  def offError(/** 小程序错误事件的回调函数 */
  callback: Function): Unit = js.native
  
  /** [wx.offLocalServiceDiscoveryStop(function callback)](wx.offLocalServiceDiscoveryStop.md)
    *
    * 取消监听 mDNS 服务停止搜索的事件
    *
    * 最低基础库： `2.4.0` */
  def offLocalServiceDiscoveryStop(/** mDNS 服务停止搜索的事件的回调函数 */
  callback: OffLocalServiceDiscoveryStopCallback): Unit = js.native
  
  /** [wx.offLocalServiceFound(function callback)](wx.offLocalServiceFound.md)
    *
    * 取消监听 mDNS 服务发现的事件
    *
    * 最低基础库： `2.4.0` */
  def offLocalServiceFound(/** mDNS 服务发现的事件的回调函数 */
  callback: OffLocalServiceFoundCallback): Unit = js.native
  
  /** [wx.offLocalServiceLost(function callback)](wx.offLocalServiceLost.md)
    *
    * 取消监听 mDNS 服务离开的事件
    *
    * 最低基础库： `2.4.0` */
  def offLocalServiceLost(/** mDNS 服务离开的事件的回调函数 */
  callback: OffLocalServiceLostCallback): Unit = js.native
  
  /** [wx.offLocalServiceResolveFail(function callback)](wx.offLocalServiceResolveFail.md)
    *
    * 取消监听 mDNS 服务解析失败的事件
    *
    * 最低基础库： `2.4.0` */
  def offLocalServiceResolveFail(/** mDNS 服务解析失败的事件的回调函数 */
  callback: OffLocalServiceResolveFailCallback): Unit = js.native
  
  /** [wx.offPageNotFound(function callback)](wx.offPageNotFound.md)
    *
    * 取消监听小程序要打开的页面不存在事件
    *
    * 最低基础库： `2.1.2` */
  def offPageNotFound(/** 小程序要打开的页面不存在事件的回调函数 */
  callback: OffPageNotFoundCallback): Unit = js.native
  
  /** [wx.offWindowResize(function callback)](wx.offWindowResize.md)
    *
    * 取消监听窗口尺寸变化事件
    *
    * 最低基础库： `2.3.0` */
  def offWindowResize(/** 窗口尺寸变化事件的回调函数 */
  callback: OffWindowResizeCallback): Unit = js.native
  
  /** [wx.onAccelerometerChange(function callback)](wx.onAccelerometerChange.md)
  *
  * 监听加速度数据事件。频率根据 [wx.startAccelerometer()](https://developers.weixin.qq.com/miniprogram/dev/api/device/accelerometer/wx.startAccelerometer.html) 的 interval 参数。可使用 [wx.stopAccelerometer()](https://developers.weixin.qq.com/miniprogram/dev/api/device/accelerometer/wx.stopAccelerometer.html) 停止监听。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.onAccelerometerChange(function (res) {
    console.log(res.x)
    console.log(res.y)
    console.log(res.z)
  })
  ``` */
  def onAccelerometerChange(/** 加速度数据事件的回调函数 */
  callback: OnAccelerometerChangeCallback): Unit = js.native
  
  /** [wx.onAppHide(function callback)](wx.onAppHide.md)
    *
    * 监听小程序切后台事件。该事件与 [`App.onHide`]((app-service/app#onhide)) 的回调时机一致。
    *
    * 最低基础库： `2.1.2` */
  def onAppHide(/** 小程序切后台事件的回调函数 */
  callback: OnAppHideCallback): Unit = js.native
  
  /** [wx.onAppShow(function callback)](wx.onAppShow.md)
    *
    * 监听小程序切前台事件。该事件与 [`App.onShow`]((app-service/app#onshowobject)) 的回调参数一致。
    *
    * **返回有效 referrerInfo 的场景**
    *
    *
    * | 场景值 | 场景                            | appId含义  |
    * | ------ | ------------------------------- | ---------- |
    * | 1020   | 公众号 profile 页相关小程序列表 | 来源公众号 |
    * | 1035   | 公众号自定义菜单                | 来源公众号 |
    * | 1036   | App 分享消息卡片                | 来源App    |
    * | 1037   | 小程序打开小程序                | 来源小程序 |
    * | 1038   | 从另一个小程序返回              | 来源小程序 |
    * | 1043   | 公众号模板消息                  | 来源公众号 |
    *
    * **注意**
    *
    *
    * 部分版本在无`referrerInfo`的时候会返回 `undefined`，建议使用 `options.referrerInfo && options.referrerInfo.appId` 进行判断。
    *
    * 最低基础库： `2.1.2` */
  def onAppShow(/** 小程序切前台事件的回调函数 */
  callback: OnAppShowCallback): Unit = js.native
  
  /** [wx.onBLECharacteristicValueChange(function callback)](wx.onBLECharacteristicValueChange.md)
  *
  * 监听低功耗蓝牙设备的特征值变化事件。必须先启用 `notifyBLECharacteristicValueChange` 接口才能接收到设备推送的 notification。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  *
  * ```js
  // ArrayBuffer转16进度字符串示例
  function ab2hex(buffer) {
    let hexArr = Array.prototype.map.call(
    new Uint8Array(buffer),
    function(bit) {
    return ('00' + bit.toString(16)).slice(-2)
    }
    )
    return hexArr.join('');
  }
  wx.onBLECharacteristicValueChange(function(res) {
    console.log(`characteristic ${res.characteristicId} has changed, now is ${res.value}`)
    console.log(ab2hex(res.value))
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def onBLECharacteristicValueChange(/** 低功耗蓝牙设备的特征值变化事件的回调函数 */
  callback: OnBLECharacteristicValueChangeCallback): Unit = js.native
  
  /** [wx.onBLEConnectionStateChange(function callback)](wx.onBLEConnectionStateChange.md)
  *
  * 监听低功耗蓝牙连接状态的改变事件。包括开发者主动连接或断开连接，设备丢失，连接异常断开等等
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  wx.onBLEConnectionStateChange(function(res) {
    // 该方法回调中可以用于处理连接意外断开等异常情况
    console.log(`device ${res.deviceId} state has changed, connected: ${res.connected}`)
  })
  ```
  *
  * 最低基础库： `1.1.1` */
  def onBLEConnectionStateChange(/** 低功耗蓝牙连接状态的改变事件的回调函数 */
  callback: OnBLEConnectionStateChangeCallback): Unit = js.native
  
  /** [wx.onBackgroundAudioPause(function callback)](wx.onBackgroundAudioPause.md)
    *
    * 监听音乐暂停事件。 */
  def onBackgroundAudioPause(/** 音乐暂停事件的回调函数 */
  callback: OnBackgroundAudioPauseCallback): Unit = js.native
  
  /** [wx.onBackgroundAudioPlay(function callback)](wx.onBackgroundAudioPlay.md)
    *
    * 监听音乐播放事件。 */
  def onBackgroundAudioPlay(/** 音乐播放事件的回调函数 */
  callback: OnBackgroundAudioPlayCallback): Unit = js.native
  
  /** [wx.onBackgroundAudioStop(function callback)](wx.onBackgroundAudioStop.md)
    *
    * 监听音乐停止事件。 */
  def onBackgroundAudioStop(/** 音乐停止事件的回调函数 */
  callback: OnBackgroundAudioStopCallback): Unit = js.native
  
  /** [wx.onBeaconServiceChange(function callback)](wx.onBeaconServiceChange.md)
    *
    * 监听 iBeacon 服务状态变化事件
    *
    * 最低基础库： `1.2.0` */
  def onBeaconServiceChange(/** iBeacon 服务状态变化事件的回调函数 */
  callback: OnBeaconServiceChangeCallback): Unit = js.native
  
  /** [wx.onBeaconUpdate(function callback)](wx.onBeaconUpdate.md)
    *
    * 监听 iBeacon 设备更新事件
    *
    * 最低基础库： `1.2.0` */
  def onBeaconUpdate(/** iBeacon 设备更新事件的回调函数 */
  callback: OnBeaconUpdateCallback): Unit = js.native
  
  /** [wx.onBluetoothAdapterStateChange(function callback)](wx.onBluetoothAdapterStateChange.md)
  *
  * 监听蓝牙适配器状态变化事件
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  wx.onBluetoothAdapterStateChange(function (res) {
    console.log('adapterState changed, now is', res)
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def onBluetoothAdapterStateChange(/** 蓝牙适配器状态变化事件的回调函数 */
  callback: OnBluetoothAdapterStateChangeCallback): Unit = js.native
  
  /** [wx.onBluetoothDeviceFound(function callback)](wx.onBluetoothDeviceFound.md)
  *
  * 监听寻找到新设备的事件
  *
  * **注意**
  *
  *
  * - 若在 `wx.onBluetoothDeviceFound` 回调了某个设备，则此设备会添加到 `wx.getBluetoothDevices` 接口获取到的数组中。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  *
  * ```js
  // ArrayBuffer转16进度字符串示例
  function ab2hex(buffer) {
    var hexArr = Array.prototype.map.call(
    new Uint8Array(buffer),
    function(bit) {
    return ('00' + bit.toString(16)).slice(-2)
    }
    )
    return hexArr.join('');
  }
  wx.onBluetoothDeviceFound(function(devices) {
    console.log('new device list has founded')
    console.dir(devices)
    console.log(ab2hex(devices[0].advertisData))
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def onBluetoothDeviceFound(/** 寻找到新设备的事件的回调函数 */
  callback: OnBluetoothDeviceFoundCallback): Unit = js.native
  
  /** [wx.onCompassChange(function callback)](wx.onCompassChange.md)
    *
    * 监听罗盘数据变化事件。频率：5 次/秒，接口调用后会自动开始监听，可使用 wx.stopCompass 停止监听。
    *
    * **accuracy 在 iOS/Android 的差异**
    *
    *
    * 由于平台差异，accuracy 在 iOS/Android 的值不同。
    *
    * - iOS：accuracy 是一个 number 类型的值，表示相对于磁北极的偏差。0 表示设备指向磁北，90 表示指向东，180 表示指向南，依此类推。
    * - Android：accuracy 是一个 string 类型的枚举值。
    *
    * | 值              | 说明                                                                                   |
    * | --------------- | -------------------------------------------------------------------------------------- |
    * | high            | 高精度                                                                                 |
    * | medium          | 中等精度                                                                               |
    * | low             | 低精度                                                                                 |
    * | no-contact      | 不可信，传感器失去连接                                                                 |
    * | unreliable      | 不可信，原因未知                                                                       |
    * | unknow ${value} | 未知的精度枚举值，即该 Android 系统此时返回的表示精度的 value 不是一个标准的精度枚举值 | */
  def onCompassChange(/** 罗盘数据变化事件的回调函数 */
  callback: OnCompassChangeCallback): Unit = js.native
  
  /** [wx.onDeviceMotionChange(function callback)](wx.onDeviceMotionChange.md)
    *
    * 监听设备方向变化事件。频率根据 [wx.startDeviceMotionListening()](https://developers.weixin.qq.com/miniprogram/dev/api/device/motion/wx.startDeviceMotionListening.html) 的 interval 参数。可以使用 [wx.stopDeviceMotionListening()](https://developers.weixin.qq.com/miniprogram/dev/api/device/motion/wx.stopDeviceMotionListening.html) 停止监听。
    *
    * 最低基础库： `2.3.0` */
  def onDeviceMotionChange(/** 设备方向变化事件的回调函数 */
  callback: OnDeviceMotionChangeCallback): Unit = js.native
  
  /** [wx.onError(function callback)](wx.onError.md)
    *
    * 监听小程序错误事件。如脚本错误或 API 调用报错等。该事件与 [`App.onError`]((app-service/app#onerrorstring-error)) 的回调时机与参数一致。
    *
    * 最低基础库： `2.1.2` */
  def onError(/** 小程序错误事件的回调函数 */
  callback: OnAppErrorCallback): Unit = js.native
  
  /** [wx.onGetWifiList(function callback)](wx.onGetWifiList.md)
    *
    * 监听获取到 Wi-Fi 列表数据事件
    *
    * 最低基础库： `1.6.0` */
  def onGetWifiList(/** 获取到 Wi-Fi 列表数据事件的回调函数 */
  callback: OnGetWifiListCallback): Unit = js.native
  
  /** [wx.onGyroscopeChange(function callback)](wx.onGyroscopeChange.md)
    *
    * 监听陀螺仪数据变化事件。频率根据 [wx.startGyroscope()](https://developers.weixin.qq.com/miniprogram/dev/api/device/gyroscope/wx.startGyroscope.html) 的 interval 参数。可以使用 [wx.stopGyroscope()](https://developers.weixin.qq.com/miniprogram/dev/api/device/gyroscope/wx.stopGyroscope.html) 停止监听。
    *
    * 最低基础库： `2.3.0` */
  def onGyroscopeChange(/** 陀螺仪数据变化事件的回调函数 */
  callback: OnGyroscopeChangeCallback): Unit = js.native
  
  /** [wx.onHCEMessage(function callback)](wx.onHCEMessage.md)
    *
    * 监听接收 NFC 设备消息事件
    *
    * 最低基础库： `1.7.0` */
  def onHCEMessage(/** 接收 NFC 设备消息事件的回调函数 */
  callback: OnHCEMessageCallback): Unit = js.native
  
  /** [wx.onLocalServiceDiscoveryStop(function callback)](wx.onLocalServiceDiscoveryStop.md)
    *
    * 监听 mDNS 服务停止搜索的事件
    *
    * 最低基础库： `2.4.0` */
  def onLocalServiceDiscoveryStop(/** mDNS 服务停止搜索的事件的回调函数 */
  callback: OnLocalServiceDiscoveryStopCallback): Unit = js.native
  
  /** [wx.onLocalServiceFound(function callback)](wx.onLocalServiceFound.md)
    *
    * 监听 mDNS 服务发现的事件
    *
    * 最低基础库： `2.4.0` */
  def onLocalServiceFound(/** mDNS 服务发现的事件的回调函数 */
  callback: OnLocalServiceFoundCallback): Unit = js.native
  
  /** [wx.onLocalServiceLost(function callback)](wx.onLocalServiceLost.md)
    *
    * 监听 mDNS 服务离开的事件
    *
    * 最低基础库： `2.4.0` */
  def onLocalServiceLost(/** mDNS 服务离开的事件的回调函数 */
  callback: OnLocalServiceLostCallback): Unit = js.native
  
  /** [wx.onLocalServiceResolveFail(function callback)](wx.onLocalServiceResolveFail.md)
    *
    * 监听 mDNS 服务解析失败的事件
    *
    * 最低基础库： `2.4.0` */
  def onLocalServiceResolveFail(/** mDNS 服务解析失败的事件的回调函数 */
  callback: OnLocalServiceResolveFailCallback): Unit = js.native
  
  /** [wx.onMemoryWarning(function callback)](wx.onMemoryWarning.md)
    *
    * 监听内存不足告警事件。
    *
    * 当 iOS/Android 向小程序进程发出内存警告时，触发该事件。触发该事件不意味小程序被杀，大部分情况下仅仅是告警，开发者可在收到通知后回收一些不必要资源避免进一步加剧内存紧张。
    *
    * **示例代码**
    *
    *
    * ```js
    * wx.onMemoryWarning(function () {
    *   console.log('onMemoryWarningReceive')
    * })
    * ``
    *
    * 最低基础库： `2.0.2` */
  def onMemoryWarning(/** 内存不足告警事件的回调函数 */
  callback: OnMemoryWarningCallback): Unit = js.native
  
  /** [wx.onNetworkStatusChange(function callback)](wx.onNetworkStatusChange.md)
  *
  * 监听网络状态变化事件
  *
  * **示例代码**
  *
  *
  * ```js
  wx.onNetworkStatusChange(function (res) {
    console.log(res.isConnected)
    console.log(res.networkType)
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def onNetworkStatusChange(/** 网络状态变化事件的回调函数 */
  callback: OnNetworkStatusChangeCallback): Unit = js.native
  
  /** [wx.onPageNotFound(function callback)](wx.onPageNotFound.md)
    *
    * 监听小程序要打开的页面不存在事件。该事件与 [`App.onPageNotFound`]((app-service/app#onpagenotfoundobject)) 的回调时机一致。
    *
    * **注意**
    *
    *
    * - 开发者可以在回调中进行页面重定向，但必须在回调中**同步**处理，异步处理（例如 `setTimeout` 异步执行）无效。
    * - 若开发者没有调用 `wx.onPageNotFound` 绑定监听，也没有声明 `App.onPageNotFound`，当跳转页面不存在时，将推入微信客户端原生的页面不存在提示页面。
    * - 如果回调中又重定向到另一个不存在的页面，将推入微信客户端原生的页面不存在提示页面，并且不再第二次回调。
    *
    * 最低基础库： `2.1.2` */
  def onPageNotFound(/** 小程序要打开的页面不存在事件的回调函数 */
  callback: OnPageNotFoundCallback): Unit = js.native
  
  /** [wx.onSocketClose(function callback)](wx.onSocketClose.md)
    *
    * 监听 WebSocket 连接关闭事件 */
  def onSocketClose(/** WebSocket 连接关闭事件的回调函数 */
  callback: OnSocketCloseCallback): Unit = js.native
  
  /** [wx.onSocketError(function callback)](wx.onSocketError.md)
    *
    * 监听 WebSocket 错误事件 */
  def onSocketError(/** WebSocket 错误事件的回调函数 */
  callback: OnSocketErrorCallback): Unit = js.native
  
  /** [wx.onSocketMessage(function callback)](wx.onSocketMessage.md)
    *
    * 监听 WebSocket 接受到服务器的消息事件 */
  def onSocketMessage(/** WebSocket 接受到服务器的消息事件的回调函数 */
  callback: OnSocketMessageCallback): Unit = js.native
  
  /** [wx.onSocketOpen(function callback)](wx.onSocketOpen.md)
    *
    * 监听 WebSocket 连接打开事件 */
  def onSocketOpen(/** WebSocket 连接打开事件的回调函数 */
  callback: OnSocketOpenCallback): Unit = js.native
  
  /** [wx.onUserCaptureScreen(function callback)](wx.onUserCaptureScreen.md)
  *
  * 监听用户主动截屏事件。用户使用系统截屏按键截屏时触发
  *
  * **示例代码**
  *
  *
  * ```js
  wx.onUserCaptureScreen(function (res) {
    console.log('用户截屏了')
  })
  ```
  *
  * 最低基础库： `1.4.0` */
  def onUserCaptureScreen(/** 用户主动截屏事件的回调函数 */
  callback: OnUserCaptureScreenCallback): Unit = js.native
  
  /** [wx.onWifiConnected(function callback)](wx.onWifiConnected.md)
    *
    * 监听连接上 Wi-Fi 的事件
    *
    * 最低基础库： `1.6.0` */
  def onWifiConnected(/** 连接上 Wi-Fi 的事件的回调函数 */
  callback: OnWifiConnectedCallback): Unit = js.native
  
  /** [wx.onWindowResize(function callback)](wx.onWindowResize.md)
    *
    * 监听窗口尺寸变化事件
    *
    * 最低基础库： `2.3.0` */
  def onWindowResize(/** 窗口尺寸变化事件的回调函数 */
  callback: OnWindowResizeCallback): Unit = js.native
  
  /** [wx.openBluetoothAdapter(Object object)](wx.openBluetoothAdapter.md)
  *
  * 初始化蓝牙模块
  *
  * **注意**
  *
  *
  * - 其他蓝牙相关 API 必须在 `wx.openBluetoothAdapter` 调用之后使用。否则 API 会返回错误（errCode=10000）。
  * - 在用户蓝牙开关未开启或者手机不支持蓝牙功能的情况下，调用 `wx.openBluetoothAdapter` 会返回错误（errCode=10001），表示手机蓝牙功能不可用。此时小程序蓝牙模块已经初始化完成，可通过 `wx.onBluetoothAdapterStateChange` 监听手机蓝牙状态的改变，也可以调用蓝牙模块的所有API。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  wx.openBluetoothAdapter({
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def openBluetoothAdapter(): Unit = js.native
  def openBluetoothAdapter(option: OpenBluetoothAdapterOption): Unit = js.native
  
  /** [wx.openCard(Object object)](wx.openCard.md)
  *
  * 查看微信卡包中的卡券。只有通过 [认证](https://developers.weixin.qq.com/miniprogram/product/renzheng.html) 的小程序才能使用。更多文档请参考 [微信卡券接口文档](https://mp.weixin.qq.com/cgi-bin/announce?action=getannouncement&key=1490190158&version=1&lang=zh_CN&platform=2)。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.openCard({
    cardList: [{
    cardId: '',
    code: ''
    }, {
    cardId: '',
    code: ''
    }],
    success (res) { }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def openCard(option: OpenCardOption): Unit = js.native
  
  /** [wx.openDocument(Object object)](wx.openDocument.md)
    *
    * 新开页面打开文档 */
  def openDocument(option: OpenDocumentOption): Unit = js.native
  
  /** [wx.openLocation(Object object)](wx.openLocation.md)
  *
  * 使用微信内置地图查看位置
  *
  * **示例代码**
  *
  *
  *  ```js
    wx.getLocation({
    type: 'gcj02', //返回可以用于wx.openLocation的经纬度
    success (res) {
    const latitude = res.latitude
    const longitude = res.longitude
    wx.openLocation({
    latitude,
    longitude,
    scale: 18
    })
    }
  })
    ``` */
  def openLocation(option: OpenLocationOption): Unit = js.native
  
  /** [wx.openSetting(Object object)](wx.openSetting.md)
  *
  * 调起客户端小程序设置界面，返回用户设置的操作结果。**设置界面只会出现小程序已经向用户请求过的[权限](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/authorize/wx.authorize.html)**。
  *
  *
  * 注意：{% version(2.3.0) %} 版本开始，用户发生点击行为后，才可以跳转打开设置页，管理授权信息。[详情]({% postUrl(000cea2305cc5047af5733de751008) %})
  *
  * **示例代码**
  *
  *
  * ```js
  wx.openSetting({
    success (res) {
    console.log(res.authSetting)
    // res.authSetting = {
    //   "scope.userInfo": true,
    //   "scope.userLocation": true
    // }
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def openSetting(): Unit = js.native
  def openSetting(option: OpenSettingOption): Unit = js.native
  
  /** [wx.pageScrollTo(Object object)](wx.pageScrollTo.md)
  *
  * 将页面滚动到目标位置
  *
  * **示例代码**
  *
  *
  * ```js
  wx.pageScrollTo({
    scrollTop: 0,
    duration: 300
  })
  ```
  *
  * 最低基础库： `1.4.0` */
  def pageScrollTo(option: PageScrollToOption): Unit = js.native
  
  /** [wx.pauseBackgroundAudio(Object object)](wx.pauseBackgroundAudio.md)
  *
  * 暂停播放音乐。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.pauseBackgroundAudio()
  ``` */
  def pauseBackgroundAudio(): Unit = js.native
  def pauseBackgroundAudio(option: PauseBackgroundAudioOption): Unit = js.native
  
  /** [wx.pauseVoice(Object object)](wx.pauseVoice.md)
  *
  * 暂停正在播放的语音。再次调用 [`wx.playVoice`](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.playVoice.html) 播放同一个文件时，会从暂停处开始播放。如果想从头开始播放，需要先调用 [`wx.stopVoice`](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.stopVoice.html)。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startRecord({
    success (res) {
    const tempFilePath = res.tempFilePath
    wx.playVoice({
    filePath: tempFilePath
    })
    
    setTimeout(() => { wx.pauseVoice() }, 5000)
    }
  })
  ``` */
  def pauseVoice(): Unit = js.native
  def pauseVoice(option: PauseVoiceOption): Unit = js.native
  
  /** [wx.playBackgroundAudio(Object object)](wx.playBackgroundAudio.md)
  *
  * 使用后台播放器播放音乐。对于微信客户端来说，只能同时有一个后台音乐在播放。当用户离开小程序后，音乐将暂停播放；当用户在其他小程序占用了音乐播放器，原有小程序内的音乐将停止播放。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.playBackgroundAudio({
    dataUrl: '',
    title: '',
    coverImgUrl: ''
  })
  ``` */
  def playBackgroundAudio(option: PlayBackgroundAudioOption): Unit = js.native
  
  /** [wx.playVoice(Object object)](wx.playVoice.md)
  *
  * 开始播放语音。同时只允许一个语音文件正在播放，如果前一个语音文件还没播放完，将中断前一个语音播放。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startRecord({
    success (res) {
    const tempFilePath = res.tempFilePath
    wx.playVoice({
    filePath: tempFilePath,
    complete () { }
    })
    }
  })
  ``` */
  def playVoice(option: PlayVoiceOption): Unit = js.native
  
  /** [wx.previewImage(Object object)](wx.previewImage.md)
  *
  * 在新页面中全屏预览图片。预览的过程中用户可以进行保存图片、发送给朋友等操作。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.previewImage({
    current: '', // 当前显示图片的http链接
    urls: [] // 需要预览的图片http链接列表
  })
  ``` */
  def previewImage(option: PreviewImageOption): Unit = js.native
  
  /** [wx.reLaunch(Object object)](wx.reLaunch.md)
  *
  * 关闭所有页面，打开到应用内的某个页面
  *
  * **示例代码**
  *
  *
  * ```js
  wx.reLaunch({
    url: 'test?id=1'
  })
  ```
  *
  * ```html
  * // test
  * Page({
  *   onLoad (option) {
  *     console.log(option.query)
  *   }
  * })
  * ```
  *
  * 最低基础库： `1.1.0` */
  def reLaunch(option: ReLaunchOption): Unit = js.native
  
  /** [wx.readBLECharacteristicValue(Object object)](wx.readBLECharacteristicValue.md)
  *
  * 读取低功耗蓝牙设备的特征值的二进制数据值。注意：必须设备的特征值支持 read 才可以成功调用。
  *
  * **注意**
  *
  *
  * - 并行调用多次会存在读失败的可能性。
  * - 接口读取到的信息需要在 `onBLECharacteristicValueChange` 方法注册的回调中获取。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  // 必须在这里的回调才能获取
  wx.onBLECharacteristicValueChange(function(characteristic) {
    console.log('characteristic value comed:', characteristic)
  })
    
  wx.readBLECharacteristicValue({
    // 这里的 deviceId 需要已经通过 createBLEConnection 与对应设备建立链接
    deviceId,
    // 这里的 serviceId 需要在 getBLEDeviceServices 接口中获取
    serviceId,
    // 这里的 characteristicId 需要在 getBLEDeviceCharacteristics 接口中获取
    characteristicId,
    success (res) {
    console.log('readBLECharacteristicValue:', res.errCode)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def readBLECharacteristicValue(option: ReadBLECharacteristicValueOption): Unit = js.native
  
  /** [wx.redirectTo(Object object)](wx.redirectTo.md)
  *
  * 关闭当前页面，跳转到应用内的某个页面。但是不允许跳转到 tabbar 页面。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.redirectTo({
    url: 'test?id=1'
  })
  ``` */
  def redirectTo(option: RedirectToOption): Unit = js.native
  
  /** [wx.removeSavedFile(Object object)](wx.removeSavedFile.md)
  *
  * 删除本地缓存文件
  *
  * **示例代码**
  *
  *
  * ```js
  wx.getSavedFileList({
    success (res) {
    if (res.fileList.length > 0){
    wx.removeSavedFile({
    filePath: res.fileList[0].filePath,
    complete (res) {
    console.log(res)
    }
    })
    }
    }
  })
  ``` */
  def removeSavedFile(option: WxRemoveSavedFileOption): Unit = js.native
  
  /** [wx.removeStorage(Object object)](wx.removeStorage.md)
  *
  * 从本地缓存中移除指定 key
  *
  * **示例代码**
  *
  *
  * ```js
  wx.removeStorage({
    key: 'key',
    success (res) {
    console.log(res.data)
    }
  })
  ```
  *
  * ```js
  try {
    wx.removeStorageSync('key')
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def removeStorage(option: RemoveStorageOption): Unit = js.native
  
  /** [wx.removeStorageSync(string key)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.removeStorageSync.html)
  *
  * [wx.removeStorage](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.removeStorage.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.removeStorage({
    key: 'key',
    success (res) {
    console.log(res.data)
    }
  })
  ```
  *
  * ```js
  try {
    wx.removeStorageSync('key')
  } catch (e) {
    // Do something when catch error
  }
  ``` */
  def removeStorageSync(/** 本地缓存中指定的 key */
  key: String): Unit = js.native
  
  /** [wx.removeTabBarBadge(Object object)](wx.removeTabBarBadge.md)
    *
    * 移除 tabBar 某一项右上角的文本
    *
    * 最低基础库： `1.9.0` */
  def removeTabBarBadge(option: RemoveTabBarBadgeOption): Unit = js.native
  
  /** [wx.reportAnalytics(string eventName, Object data)](wx.reportAnalytics.md)
  *
  * 自定义分析数据上报接口。使用前，需要在小程序管理后台自定义分析中新建事件，配置好事件名与字段。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.reportAnalytics('purchase', {
    price: 120,
    color: 'red'
  })
  ``` */
  def reportAnalytics(/** 事件名 */
  eventName: String, /** 上报的自定义数据。 */
  data: Data): Unit = js.native
  
  /** [wx.reportMonitor(string name, number value)](wx.reportMonitor.md)
  *
  * 自定义业务数据监控上报接口。
  *
  * **使用说明**
  *
  *
  * 使用前，需要在「小程序管理后台-运维中心-性能监控-业务数据监控」中新建监控事件，配置监控描述与告警类型。每一个监控事件对应唯一的监控ID，开发者最多可以创建128个监控事件。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.reportMonitor('1', 1)
  ```
  *
  * 最低基础库： `2.0.1` */
  def reportMonitor(/** 监控ID，在「小程序管理后台」新建数据指标后获得 */
  name: String, /** 上报数值，经处理后会在「小程序管理后台」上展示每分钟的上报总量 */
  value: Double): Unit = js.native
  
  /** [[RequestTask](https://developers.weixin.qq.com/miniprogram/dev/api/network/request/RequestTask.html) wx.request(Object object)](wx.request.md)
  *
  * 发起 HTTPS 网络请求。使用前请注意阅读[相关说明]((network))。
  *
  * **data 参数说明**
  *
  *
  * 最终发送给服务器的数据是 String 类型，如果传入的 data 不是 String 类型，会被转换成 String 。转换规则如下：
  * - 对于 `GET` 方法的数据，会将数据转换成 query string（`encodeURIComponent(k)=encodeURIComponent(v)&encodeURIComponent(k)=encodeURIComponent(v)...`）
  * - 对于 `POST` 方法且 `header['content-type']` 为 `application/json` 的数据，会对数据进行 JSON 序列化
  * - 对于 `POST` 方法且 `header['content-type']` 为 `application/x-www-form-urlencoded` 的数据，会将数据转换成 query string `（encodeURIComponent(k)=encodeURIComponent(v)&encodeURIComponent(k)=encodeURIComponent(v)...）`
  *
  * **示例代码**
  *
  *
  * ```js
  wx.request({
    url: 'test.php', //仅为示例，并非真实的接口地址
    data: {
    x: '',
    y: ''
    },
    header: {
    'content-type': 'application/json' // 默认值
    },
    success (res) {
    console.log(res.data)
    }
  })
  ``` */
  def request(option: RequestOption): RequestTask = js.native
  
  /** [wx.requestPayment(Object object)](wx.requestPayment.md)
  *
  * 发起微信支付。了解更多信息，请查看[微信支付接口文档](https://pay.weixin.qq.com/wiki/doc/api/wxa/wxa_api.php?chapter=7_3&index=1)
  *
  * **示例代码**
  *
  *
  * ```js
  wx.requestPayment({
    timeStamp: '',
    nonceStr: '',
    package: '',
    signType: 'MD5',
    paySign: '',
    success (res) { },
    fail (res) { }
  })
  ``` */
  def requestPayment(option: RequestPaymentOption): Unit = js.native
  
  /** [wx.saveFile(Object object)](wx.saveFile.md)
  *
  * 保存文件到本地。注意：**saveFile 会把临时文件移动，因此调用成功后传入的 tempFilePath 将不可用**
  *
  * **示例代码**
  *
  *
  * ```js
  wx.chooseImage({
    success: function(res) {
    const tempFilePaths = res.tempFilePaths
    wx.saveFile({
    tempFilePath: tempFilePaths[0],
    success (res) {
    const savedFilePath = res.savedFilePath
    }
    })
    }
  })
  ```
  *
  * **注意**
  *
  *
  * 本地文件存储的大小限制为 10M */
  def saveFile(option: WxSaveFileOption): Unit = js.native
  
  /** [wx.saveImageToPhotosAlbum(Object object)](wx.saveImageToPhotosAlbum.md)
  *
  * 保存图片到系统相册。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.saveImageToPhotosAlbum({
    success(res) { }
  })
  ```
  *
  * 最低基础库： `1.2.0` */
  def saveImageToPhotosAlbum(option: SaveImageToPhotosAlbumOption): Unit = js.native
  
  /** [wx.saveVideoToPhotosAlbum(Object object)](wx.saveVideoToPhotosAlbum.md)
  *
  * 保存视频到系统相册
  *
  * **示例代码**
  *
  *
  * ```js
  wx.saveVideoToPhotosAlbum({
    filePath: 'wxfile://xxx',
    success (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.2.0` */
  def saveVideoToPhotosAlbum(option: SaveVideoToPhotosAlbumOption): Unit = js.native
  
  /** [wx.scanCode(Object object)](wx.scanCode.md)
  *
  * 调起客户端扫码界面进行扫码
  *
  * **示例代码**
  *
  *
  * ```js
  // 允许从相机和相册扫码
  wx.scanCode({
    success (res) {
    console.log(res)
    }
  })
    
  // 只允许从相机扫码
  wx.scanCode({
    onlyFromCamera: true,
    success (res) {
    console.log(res)
    }
  })
  ``` */
  def scanCode(option: ScanCodeOption): Unit = js.native
  
  /** [wx.seekBackgroundAudio(Object object)](wx.seekBackgroundAudio.md)
  *
  * 控制音乐播放进度。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.seekBackgroundAudio({
    position: 30
  })
  ``` */
  def seekBackgroundAudio(option: SeekBackgroundAudioOption): Unit = js.native
  
  /** [wx.sendHCEMessage(Object object)](wx.sendHCEMessage.md)
  *
  * 发送 NFC 消息。仅在安卓系统下有效。
  *
  * **示例代码**
  *
  *
  * ```js
  const buffer = new ArrayBuffer(1)
  const dataView = new DataView(buffer)
  dataView.setUint8(0, 0)
    
  wx.startHCE({
    success (res) {
    wx.onHCEMessage(function(res) {
    if (res.messageType === 1) {
    wx.sendHCEMessage({data: buffer})
    }
    })
    }
  })
  ```
  *
  * 最低基础库： `1.7.0` */
  def sendHCEMessage(option: SendHCEMessageOption): Unit = js.native
  
  /** [wx.sendSocketMessage(Object object)](wx.sendSocketMessage.md)
  *
  * 通过 WebSocket 连接发送数据。需要先 wx.connectSocket，并在 wx.onSocketOpen 回调之后才能发送。
  *
  * **示例代码**
  *
  *
  * ```js
  const socketOpen = false
  const socketMsgQueue = []
  wx.connectSocket({
    url: 'test.php'
  })
    
  wx.onSocketOpen(function(res) {
    socketOpen = true
    for (let i = 0; i < socketMsgQueue.length; i++){
    sendSocketMessage(socketMsgQueue[i])
    }
    socketMsgQueue = []
  })
    
  function sendSocketMessage(msg) {
    if (socketOpen) {
    wx.sendSocketMessage({
    data:msg
    })
    } else {
    socketMsgQueue.push(msg)
    }
  }
  ``` */
  def sendSocketMessage(option: SendSocketMessageOption): Unit = js.native
  
  /** [wx.setBackgroundColor(Object object)](wx.setBackgroundColor.md)
  *
  * 动态设置窗口的背景色
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setBackgroundColor({
    backgroundColor: '#ffffff', // 窗口的背景色为白色
  })
    
  wx.setBackgroundColor({
    backgroundColorTop: '#ffffff', // 顶部窗口的背景色为白色
    backgroundColorBottom: '#ffffff', // 底部窗口的背景色为白色
  })
  ```
  *
  * 最低基础库： `2.1.0` */
  def setBackgroundColor(option: SetBackgroundColorOption): Unit = js.native
  
  /** [wx.setBackgroundTextStyle(Object object)](wx.setBackgroundTextStyle.md)
  *
  * 动态设置下拉背景字体、loading 图的样式
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setBackgroundTextStyle({
    textStyle: 'dark' // 下拉背景字体、loading 图的样式为dark
  })
  ```
  *
  * 最低基础库： `2.1.0` */
  def setBackgroundTextStyle(option: SetBackgroundTextStyleOption): Unit = js.native
  
  /** [wx.setClipboardData(Object object)](wx.setClipboardData.md)
  *
  * 设置系统剪贴板的内容
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setClipboardData({
    data: 'data',
    success (res) {
    wx.getClipboardData({
    success (res) {
    console.log(res.data) // data
    }
    })
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def setClipboardData(option: SetClipboardDataOption): Unit = js.native
  
  /** [wx.setEnableDebug(Object object)](wx.setEnableDebug.md)
  *
  * 设置是否打开调试开关。此开关对正式版也能生效。
  *
  * **示例代码**
  *
  *
  * ```javascript
  // 打开调试
  wx.setEnableDebug({
    enableDebug: true
  })
    
  // 关闭调试
  wx.setEnableDebug({
    enableDebug: false
  })
  ```
  *
  * **Tips**
  *
  *
  * - 在正式版打开调试还有一种方法，就是先在开发版或体验版打开调试，再切到正式版就能看到vConsole。
  *
  * 最低基础库： `1.4.0` */
  def setEnableDebug(option: SetEnableDebugOption): Unit = js.native
  
  /** [wx.setInnerAudioOption(Object object)](wx.setInnerAudioOption.md)
    *
    * 设置 [InnerAudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/InnerAudioContext.html) 的播放选项。设置之后对当前小程序全局生效。
    *
    * 最低基础库： `2.3.0` */
  def setInnerAudioOption(option: SetInnerAudioOption): Unit = js.native
  
  /** [wx.setKeepScreenOn(Object object)](wx.setKeepScreenOn.md)
  *
  * 设置是否保持常亮状态。仅在当前小程序生效，离开小程序后设置失效。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setKeepScreenOn({
    keepScreenOn: true
  })
  ```
  *
  * 最低基础库： `1.4.0` */
  def setKeepScreenOn(option: SetKeepScreenOnOption): Unit = js.native
  
  /** [wx.setNavigationBarColor(Object object)](wx.setNavigationBarColor.md)
    *
    * 设置页面导航条颜色
    *
    * 最低基础库： `1.4.0` */
  def setNavigationBarColor(option: SetNavigationBarColorOption): Unit = js.native
  
  /** [wx.setNavigationBarTitle(Object object)](wx.setNavigationBarTitle.md)
  *
  * 动态设置当前页面的标题
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setNavigationBarTitle({
    title: '当前页面'
  })
  ``` */
  def setNavigationBarTitle(option: SetNavigationBarTitleOption): Unit = js.native
  
  /** [wx.setScreenBrightness(Object object)](wx.setScreenBrightness.md)
    *
    * 设置屏幕亮度
    *
    * 最低基础库： `1.2.0` */
  def setScreenBrightness(option: SetScreenBrightnessOption): Unit = js.native
  
  /** [wx.setStorage(Object object)](wx.setStorage.md)
  *
  * 将数据存储在本地缓存中指定的 key 中。会覆盖掉原来该 key 对应的内容。数据存储生命周期跟小程序本身一致，即除用户主动删除或超过一定时间被自动清理，否则数据都一直可用。单个 key 允许存储的最大数据长度为 1MB，所有数据存储上限为 10MB。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setStorage({
    key:"key",
    data:"value"
  })
  ```
  * ```js
  try {
    wx.setStorageSync('key', 'value')
  } catch (e) { }
  ``` */
  def setStorage(option: SetStorageOption): Unit = js.native
  
  /** [wx.setStorageSync(string key, any data)](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.setStorageSync.html)
  *
  * [wx.setStorage](https://developers.weixin.qq.com/miniprogram/dev/api/storage/wx.setStorage.html) 的同步版本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setStorage({
    key:"key",
    data:"value"
  })
  ```
  * ```js
  try {
    wx.setStorageSync('key', 'value')
  } catch (e) { }
  ``` */
  def setStorageSync(
    /** 本地缓存中指定的 key */
  key: String,
    /** 需要存储的内容。只支持原生类型、Date、及能够通过`JSON.stringify`序列化的对象。 */
  data: Any
  ): Unit = js.native
  
  /** [wx.setTabBarBadge(Object object)](wx.setTabBarBadge.md)
  *
  * 为 tabBar 某一项的右上角添加文本
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setTabBarBadge({
    index: 0,
    text: '1'
  })
  ```
  *
  * 最低基础库： `1.9.0` */
  def setTabBarBadge(option: SetTabBarBadgeOption): Unit = js.native
  
  /** [wx.setTabBarItem(Object object)](wx.setTabBarItem.md)
  *
  * 动态设置 tabBar 某一项的内容
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setTabBarItem({
    index: 0,
    text: 'text',
    iconPath: '/path/to/iconPath',
    selectedIconPath: '/path/to/selectedIconPath'
  })
  ```
  *
  * 最低基础库： `1.9.0` */
  def setTabBarItem(option: SetTabBarItemOption): Unit = js.native
  
  /** [wx.setTabBarStyle(Object object)](wx.setTabBarStyle.md)
  *
  * 动态设置 tabBar 的整体样式
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setTabBarStyle({
    color: '#FF0000',
    selectedColor: '#00FF00',
    backgroundColor: '#0000FF',
    borderStyle: 'white'
  })
  ```
  *
  * 最低基础库： `1.9.0` */
  def setTabBarStyle(option: SetTabBarStyleOption): Unit = js.native
  
  /** [wx.setTopBarText(Object object)](wx.setTopBarText.md)
  *
  * 动态设置置顶栏文字内容。只有当前小程序被置顶时能生效，如果当前小程序没有被置顶，也能调用成功，但是不会立即生效，只有在用户将这个小程序置顶后才换上设置的文字内容.
  *
  * **示例代码**
  *
  *
  * ```js
  wx.setTopBarText({
    text: 'hello, world!'
  })
  ```
  *
  * **注意**
  *
  *
  * - 调用成功后，需间隔 5s 才能再次调用此接口，如果在 5s 内再次调用此接口，会回调 fail，errMsg："setTopBarText: fail invoke too frequently"
  *
  * 最低基础库： `1.4.3` */
  def setTopBarText(option: SetTopBarTextOption): Unit = js.native
  
  /** [wx.setWifiList(Object object)](wx.setWifiList.md)
  *
  * 设置 `wifiList` 中 AP 的相关信息。在 `onGetWifiList` 回调后调用，**iOS特有接口**。
  *
  * **注意**
  *
  *
  * - 该接口只能在 `onGetWifiList` 回调之后才能调用。
  * - 此时客户端会挂起，等待小程序设置 Wi-Fi 信息，请务必尽快调用该接口，若无数据请传入一个空数组。
  * - 有可能随着周边 Wi-Fi 列表的刷新，单个流程内收到多次带有存在重复的 Wi-Fi 列表的回调。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.onGetWifiList(function(res) {
    if (res.wifiList.length) {
    wx.setWifiList({
    wifiList: [{
    SSID: res.wifiList[0].SSID,
    BSSID: res.wifiList[0].BSSID,
    password: '123456'
    }]
    })
    } else {
    wx.setWifiList({
    wifiList: []
    })
    }
  })
  wx.getWifiList()
  ```
  *
  * 最低基础库： `1.6.0` */
  def setWifiList(option: SetWifiListOption): Unit = js.native
  
  /** [wx.showActionSheet(Object object)](wx.showActionSheet.md)
  *
  * ​显示操作菜单
  *
  * **示例代码**
  *
  *
  * ```js
  wx.showActionSheet({
    itemList: ['A', 'B', 'C'],
    success (res) {
    console.log(res.tapIndex)
    },
    fail (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * **注意**
  *
  *
  * - Android 6.7.2 以下版本，点击取消或蒙层时，回调 fail, errMsg 为 "fail cancel"；
  * - Android 6.7.2 及以上版本 和 iOS 点击蒙层不会关闭模态弹窗，所以尽量避免使用「取消」分支中实现业务逻辑 */
  def showActionSheet(option: ShowActionSheetOption): Unit = js.native
  
  /** [wx.showLoading(Object object)](wx.showLoading.md)
  *
  * 显示 loading 提示框。需主动调用 wx.hideLoading 才能关闭提示框
  *
  * **示例代码**
  *
  *
  * ```js
  wx.showLoading({
    title: '加载中',
  })
    
  setTimeout(function () {
    wx.hideLoading()
  }, 2000)
  ```
  *
  * **注意**
  *
  *
  * - `wx.showLoading` 和 `wx.showToast` 同时只能显示一个
  * - `wx.showLoading` 应与 `wx.hideLoading` 配对使用
  *
  * 最低基础库： `1.1.0` */
  def showLoading(option: ShowLoadingOption): Unit = js.native
  
  /** [wx.showModal(Object object)](wx.showModal.md)
  *
  * 显示模态对话框
  *
  * **示例代码**
  *
  *
  * ```js
  wx.showModal({
    title: '提示',
    content: '这是一个模态弹窗',
    success (res) {
    if (res.confirm) {
    console.log('用户点击确定')
    } else if (res.cancel) {
    console.log('用户点击取消')
    }
    }
  })
  ```
  *
  * **注意**
  *
  *
  * - Android 6.7.2 以下版本，点击取消或蒙层时，回调 fail, errMsg 为 "fail cancel"；
  * - Android 6.7.2 及以上版本 和 iOS 点击蒙层不会关闭模态弹窗，所以尽量避免使用「取消」分支中实现业务逻辑 */
  def showModal(option: ShowModalOption): Unit = js.native
  
  /** [wx.showNavigationBarLoading(Object object)](wx.showNavigationBarLoading.md)
    *
    * 在当前页面显示导航条加载动画 */
  def showNavigationBarLoading(): Unit = js.native
  def showNavigationBarLoading(option: ShowNavigationBarLoadingOption): Unit = js.native
  
  /** [wx.showShareMenu(Object object)](wx.showShareMenu.md)
  *
  * 显示当前页面的转发按钮
  *
  * **示例代码**
  *
  *
  * ```js
  wx.showShareMenu({
    withShareTicket: true
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def showShareMenu(option: ShowShareMenuOption): Unit = js.native
  
  /** [wx.showTabBar(Object object)](wx.showTabBar.md)
    *
    * 显示 tabBar
    *
    * 最低基础库： `1.9.0` */
  def showTabBar(option: ShowTabBarOption): Unit = js.native
  
  /** [wx.showTabBarRedDot(Object object)](wx.showTabBarRedDot.md)
    *
    * 显示 tabBar 某一项的右上角的红点
    *
    * 最低基础库： `1.9.0` */
  def showTabBarRedDot(option: ShowTabBarRedDotOption): Unit = js.native
  
  /** [wx.showToast(Object object)](wx.showToast.md)
  *
  * 显示消息提示框
  *
  * **示例代码**
  *
  *
  * ```js
  wx.showToast({
    title: '成功',
    icon: 'success',
    duration: 2000
  })
  ```
  *
  * **注意**
  *
  *
  * - `wx.showLoading` 和 `wx.showToast` 同时只能显示一个
  * - `wx.showToast` 应与 `wx.hideToast` 配对使用 */
  def showToast(option: ShowToastOption): Unit = js.native
  
  /** [wx.startAccelerometer(Object object)](wx.startAccelerometer.md)
  *
  * 开始监听加速度数据。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startAccelerometer({
    interval: 'game'
  })
  ```
  *
  * **注意**
  *
  *
  * - 根据机型性能、当前 CPU 与内存的占用情况，`interval` 的设置与实际 `wx.onAccelerometerChange()` 回调函数的执行频率会有一些出入。
  *
  * 最低基础库： `1.1.0` */
  def startAccelerometer(option: StartAccelerometerOption): Unit = js.native
  
  /** [wx.startBeaconDiscovery(Object object)](wx.startBeaconDiscovery.md)
  *
  * 开始搜索附近的 iBeacon 设备
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startBeaconDiscovery({
    success(res) { }
  })
  ```
  *
  * 最低基础库： `1.2.0` */
  def startBeaconDiscovery(option: StartBeaconDiscoveryOption): Unit = js.native
  
  /** [wx.startBluetoothDevicesDiscovery(Object object)](wx.startBluetoothDevicesDiscovery.md)
  *
  * 开始搜寻附近的蓝牙外围设备。**此操作比较耗费系统资源，请在搜索并连接到设备后调用 `wx.stopBluetoothDevicesDiscovery` 方法停止搜索。**
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  *
  * ```js
  // 以微信硬件平台的蓝牙智能灯为例，主服务的 UUID 是 FEE7。传入这个参数，只搜索主服务 UUID 为 FEE7 的设备
  wx.startBluetoothDevicesDiscovery({
    services: ['FEE7'],
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def startBluetoothDevicesDiscovery(option: StartBluetoothDevicesDiscoveryOption): Unit = js.native
  
  /** [wx.startCompass(Object object)](wx.startCompass.md)
  *
  * 开始监听罗盘数据
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startCompass()
  ```
  *
  * 最低基础库： `1.1.0` */
  def startCompass(): Unit = js.native
  def startCompass(option: StartCompassOption): Unit = js.native
  
  /** [wx.startDeviceMotionListening(Object object)](wx.startDeviceMotionListening.md)
    *
    * 开始监听设备方向的变化。
    *
    * 最低基础库： `2.3.0` */
  def startDeviceMotionListening(option: StartDeviceMotionListeningOption): Unit = js.native
  
  /** [wx.startGyroscope(Object object)](wx.startGyroscope.md)
    *
    * 开始监听陀螺仪数据。
    *
    * 最低基础库： `2.3.0` */
  def startGyroscope(option: StartGyroscopeOption): Unit = js.native
  
  /** [wx.startHCE(Object object)](wx.startHCE.md)
  *
  * 初始化 NFC 模块。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startHCE({
    aid_list: ['F222222222']
    success (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.7.0` */
  def startHCE(option: StartHCEOption): Unit = js.native
  
  /** [wx.startLocalServiceDiscovery(Object object)](wx.startLocalServiceDiscovery.md)
    *
    * 开始搜索局域网下的 mDNS 服务。搜索的结果会通过 wx.onLocalService* 事件返回。
    *
    * **注意**
    *
    *
    * 1. wx.startLocalServiceDiscovery 是一个消耗性能的行为，开始 30 秒后会自动 stop 并执行 wx.onLocalServiceDiscoveryStop 注册的回调函数。
    * 2. 在调用 wx.startLocalServiceDiscovery 后，在这次搜索行为停止后才能发起下次 wx.startLocalServiceDiscovery。停止本次搜索行为的操作包括调用 wx.stopLocalServiceDiscovery 和 30 秒后系统自动 stop 本次搜索。
    *
    * 最低基础库： `2.4.0` */
  def startLocalServiceDiscovery(option: StartLocalServiceDiscoveryOption): Unit = js.native
  
  /** [wx.startPullDownRefresh(Object object)](wx.startPullDownRefresh.md)
  *
  * 开始下拉刷新。调用后触发下拉刷新动画，效果与用户手动下拉刷新一致。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startPullDownRefresh()
  ```
  *
  * 最低基础库： `1.5.0` */
  def startPullDownRefresh(): Unit = js.native
  def startPullDownRefresh(option: StartPullDownRefreshOption): Unit = js.native
  
  /** [wx.startRecord(Object object)](wx.startRecord.md)
  *
  * 开始录音。当主动调用 [`wx.stopRecord`](https://developers.weixin.qq.com/miniprogram/dev/api/media/recorder/wx.stopRecord.html)，或者录音超过1分钟时自动结束录音。当用户离开小程序时，此接口无法调用。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startRecord({
    success (res) {
    const tempFilePath = res.tempFilePath
    }
  })
  setTimeout(function () {
    wx.stopRecord() // 结束录音
  }, 10000)
  ``` */
  def startRecord(option: WxStartRecordOption): Unit = js.native
  
  /** [wx.startSoterAuthentication(Object object)](wx.startSoterAuthentication.md)
  *
  * 开始 SOTER 生物认证。验证流程请参考[说明](https://developers.weixin.qq.com/miniprogram/dev/api/open-api/soter/wx.startSoterAuthentication.html)。
  *
  * **resultJSON 说明**
  *
  *
  * 此数据为设备TEE中，将传入的challenge和TEE内其他安全信息组成的数据进行组装而来的JSON，对下述字段的解释如下表。例子如下：
  * | 字段名  | 说明                                                                                      |
  * |---------|-------------------------------------------------------------------------------------------|
  * | raw     | 调用者传入的challenge                                                                     |
  * | fid     | （仅Android支持）本次生物识别认证的生物信息编号（如指纹识别则是指纹信息在本设备内部编号） |
  * | counter | 防重放特征参数                                                                            |
  * | tee_n   | TEE名称（如高通或者trustonic等）                                                          |
  * | tee_v   | TEE版本号                                                                                 |
  * | fp_n    | 指纹以及相关逻辑模块提供商（如FPC等）                                                     |
  * | fp_v    | 指纹以及相关模块版本号                                                                    |
  * | cpu_id  | 机器唯一识别ID                                                                            |
  * | uid     | 概念同Android系统定义uid，即应用程序编号                                                  |
  *
  * ```json
  {
    "raw":"msg",
    "fid":"2",
    "counter":123,
    "tee_n":"TEE Name",
    "tee_v":"TEE Version",
    "fp_n":"Fingerprint Sensor Name",
    "fp_v":"Fingerprint Sensor Version",
    "cpu_id":"CPU Id",
    "uid":"21"
  }
  ```
  *
  * **示例代码**
  *
  *
  * {% minicode('q3tCKkmJ7g2e') %}
  * ```js
  wx.startSoterAuthentication({
    requestAuthModes: ['fingerPrint'],
    challenge: '123456',
    authContent: '请用指纹解锁',
    success(res) {
    }
  })
  ```
  *
  * 最低基础库： `1.5.0` */
  def startSoterAuthentication(option: StartSoterAuthenticationOption): Unit = js.native
  
  /** [wx.startWifi(Object object)](wx.startWifi.md)
  *
  * 初始化 Wi-Fi 模块。
  *
  * **示例代码**
  *
  *
  * {% minicode('8P7zrkmd7r2n') %}
  * ```js
  wx.startWifi({
    success (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.6.0` */
  def startWifi(): Unit = js.native
  def startWifi(option: StartWifiOption): Unit = js.native
  
  /** [wx.stopAccelerometer(Object object)](wx.stopAccelerometer.md)
  *
  * 停止监听加速度数据。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.stopAccelerometer()
  ```
  *
  * 最低基础库： `1.1.0` */
  def stopAccelerometer(): Unit = js.native
  def stopAccelerometer(option: StopAccelerometerOption): Unit = js.native
  
  /** [wx.stopBackgroundAudio(Object object)](wx.stopBackgroundAudio.md)
  *
  * 停止播放音乐。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.stopBackgroundAudio()
  ``` */
  def stopBackgroundAudio(): Unit = js.native
  def stopBackgroundAudio(option: StopBackgroundAudioOption): Unit = js.native
  
  /** [wx.stopBeaconDiscovery(Object object)](wx.stopBeaconDiscovery.md)
    *
    * 停止搜索附近的 iBeacon 设备
    *
    * 最低基础库： `1.2.0` */
  def stopBeaconDiscovery(): Unit = js.native
  def stopBeaconDiscovery(option: StopBeaconDiscoveryOption): Unit = js.native
  
  /** [wx.stopBluetoothDevicesDiscovery(Object object)](wx.stopBluetoothDevicesDiscovery.md)
  *
  * 停止搜寻附近的蓝牙外围设备。若已经找到需要的蓝牙设备并不需要继续搜索时，建议调用该接口停止蓝牙搜索。
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  wx.stopBluetoothDevicesDiscovery({
    success (res) {
    console.log(res)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def stopBluetoothDevicesDiscovery(): Unit = js.native
  def stopBluetoothDevicesDiscovery(option: StopBluetoothDevicesDiscoveryOption): Unit = js.native
  
  /** [wx.stopCompass(Object object)](wx.stopCompass.md)
  *
  * 停止监听罗盘数据
  *
  * **示例代码**
  *
  *
  * ```js
  wx.stopCompass()
  ```
  *
  * 最低基础库： `1.1.0` */
  def stopCompass(): Unit = js.native
  def stopCompass(option: StopCompassOption): Unit = js.native
  
  /** [wx.stopDeviceMotionListening(Object object)](wx.stopDeviceMotionListening.md)
    *
    * 停止监听设备方向的变化。
    *
    * 最低基础库： `2.3.0` */
  def stopDeviceMotionListening(): Unit = js.native
  def stopDeviceMotionListening(option: StopDeviceMotionListeningOption): Unit = js.native
  
  /** [wx.stopGyroscope(Object object)](wx.stopGyroscope.md)
    *
    * 停止监听陀螺仪数据。
    *
    * 最低基础库： `2.3.0` */
  def stopGyroscope(): Unit = js.native
  def stopGyroscope(option: StopGyroscopeOption): Unit = js.native
  
  /** [wx.stopHCE(Object object)](wx.stopHCE.md)
  *
  * 关闭 NFC 模块。仅在安卓系统下有效。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.stopHCE({
    success (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.7.0` */
  def stopHCE(): Unit = js.native
  def stopHCE(option: StopHCEOption): Unit = js.native
  
  /** [wx.stopLocalServiceDiscovery(Object object)](wx.stopLocalServiceDiscovery.md)
    *
    * 停止搜索 mDNS 服务
    *
    * 最低基础库： `2.4.0` */
  def stopLocalServiceDiscovery(): Unit = js.native
  def stopLocalServiceDiscovery(option: StopLocalServiceDiscoveryOption): Unit = js.native
  
  /** [wx.stopPullDownRefresh(Object object)](wx.stopPullDownRefresh.md)
  *
  * 停止当前页面下拉刷新。
  *
  * **示例代码**
  *
  *
  * ```js
  Page({
    onPullDownRefresh () {
    wx.stopPullDownRefresh()
    }
  })
  ```
  *
  * 最低基础库： `1.5.0` */
  def stopPullDownRefresh(): Unit = js.native
  def stopPullDownRefresh(option: StopPullDownRefreshOption): Unit = js.native
  
  /** [wx.stopRecord()](wx.stopRecord.md)
  *
  * 停止录音。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startRecord({
    success (res) {
    const tempFilePath = res.tempFilePath
    }
  })
  setTimeout(function () {
    wx.stopRecord() // 结束录音
  }, 10000)
  ``` */
  def stopRecord(): Unit = js.native
  
  /** [wx.stopVoice(Object object)](wx.stopVoice.md)
  *
  * 结束播放语音。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.startRecord({
    success (res) {
    const tempFilePath = res.tempFilePath
    wx.playVoice({
    filePath: tempFilePath,
    })
    
    setTimeout(() => { wx.stopVoice() }, 5000)
    }
  })
  ``` */
  def stopVoice(): Unit = js.native
  def stopVoice(option: StopVoiceOption): Unit = js.native
  
  /** [wx.stopWifi(Object object)](wx.stopWifi.md)
  *
  * 关闭 Wi-Fi 模块。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.stopWifi({
    success (res) {
    console.log(res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.6.0` */
  def stopWifi(): Unit = js.native
  def stopWifi(option: StopWifiOption): Unit = js.native
  
  /** [wx.switchTab(Object object)](wx.switchTab.md)
  *
  * 跳转到 tabBar 页面，并关闭其他所有非 tabBar 页面
  *
  * **示例代码**
  *
  *
  * ```json
  {
    "tabBar": {
    "list": [{
    "pagePath": "index",
    "text": "首页"
    },{
    "pagePath": "other",
    "text": "其他"
    }]
    }
  }
  ```
  *
  * ```js
  wx.switchTab({
    url: '/index'
  })
  ``` */
  def switchTab(option: SwitchTabOption): Unit = js.native
  
  /** [wx.updateShareMenu(Object object)](wx.updateShareMenu.md)
  *
  * 更新转发属性
  *
  * **示例代码**
  *
  *
  * ```js
  wx.updateShareMenu({
    withShareTicket: true,
    success () { }
  })
  ```
  *
  * 最低基础库： `1.2.0` */
  def updateShareMenu(option: UpdateShareMenuOption): Unit = js.native
  
  /** [[UploadTask](https://developers.weixin.qq.com/miniprogram/dev/api/network/upload/UploadTask.html) wx.uploadFile(Object object)](wx.uploadFile.md)
  *
  * 将本地资源上传到服务器。客户端发起一个 HTTPS POST 请求，其中 `content-type` 为 `multipart/form-data`。使用前请注意阅读[相关说明]((network))。
  *
  * **示例代码**
  *
  *
  * ```js
  wx.chooseImage({
    success (res) {
    const tempFilePaths = res.tempFilePaths
    wx.uploadFile({
    url: 'https://example.weixin.qq.com/upload', //仅为示例，非真实的接口地址
    filePath: tempFilePaths[0],
    name: 'file',
    formData: {
    'user': 'test'
    },
    success (res){
    const data = res.data
    //do something
    }
    })
    }
  })
  ``` */
  def uploadFile(option: UploadFileOption): UploadTask = js.native
  
  /** [wx.vibrateLong(Object object)](wx.vibrateLong.md)
    *
    * 使手机发生较长时间的振动（400 ms)
    *
    * 最低基础库： `1.2.0` */
  def vibrateLong(): Unit = js.native
  def vibrateLong(option: VibrateLongOption): Unit = js.native
  
  /** [wx.vibrateShort(Object object)](wx.vibrateShort.md)
    *
    * 使手机发生较短时间的振动（15 ms）。仅在 iPhone `7 / 7 Plus` 以上及 Android 机型生效
    *
    * 最低基础库： `1.2.0` */
  def vibrateShort(): Unit = js.native
  def vibrateShort(option: VibrateShortOption): Unit = js.native
  
  /** [wx.writeBLECharacteristicValue(Object object)](wx.writeBLECharacteristicValue.md)
  *
  * 向低功耗蓝牙设备特征值中写入二进制数据。注意：必须设备的特征值支持 write 才可以成功调用。
  *
  * **注意**
  *
  *
  * - 并行调用多次会存在写失败的可能性。
  * - 小程序不会对写入数据包大小做限制，但系统与蓝牙设备会限制蓝牙4.0单次传输的数据大小，超过最大字节数后会发生写入错误，建议每次写入不超过20字节。
  * - 若单次写入数据过长，iOS 上存在系统不会有任何回调的情况（包括错误回调）。
  * - 安卓平台上，在调用 `notifyBLECharacteristicValueChange` 成功后立即调用 `writeBLECharacteristicValue` 接口，在部分机型上会发生 10008 系统错误
  *
  * **示例代码**
  *
  *
  * {% minicode('pQU51zmz7a3K') %}
  * ```js
  // 向蓝牙设备发送一个0x00的16进制数据
  let buffer = new ArrayBuffer(1)
  let dataView = new DataView(buffer)
  dataView.setUint8(0, 0)
    
  wx.writeBLECharacteristicValue({
    // 这里的 deviceId 需要在 getBluetoothDevices 或 onBluetoothDeviceFound 接口中获取
    deviceId,
    // 这里的 serviceId 需要在 getBLEDeviceServices 接口中获取
    serviceId,
    // 这里的 characteristicId 需要在 getBLEDeviceCharacteristics 接口中获取
    characteristicId,
    // 这里的value是ArrayBuffer类型
    value: buffer,
    success (res) {
    console.log('writeBLECharacteristicValue success', res.errMsg)
    }
  })
  ```
  *
  * 最低基础库： `1.1.0` */
  def writeBLECharacteristicValue(option: WriteBLECharacteristicValueOption): Unit = js.native
}
