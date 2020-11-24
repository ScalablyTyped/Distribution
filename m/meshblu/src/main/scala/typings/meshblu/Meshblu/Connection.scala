package typings.meshblu.Meshblu

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  def authenticate(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  def bufferedSocketEmit(): Unit = js.native
  
  def claimdevice(data: Device, fn: js.Function1[/* result */ Device, Unit]): Connection = js.native
  
  def close(fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  def connect(): Unit = js.native
  
  /**
    * Send a meshblu data message.
    * @param data
    * @param fn The callback to be called. It should take one parameter, result.
    * @returns This Connection.
    */
  def data(data: DataInput, fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  /**
    * Find a Meshblu device.
    * @param data
    * @param fn The callback to be called. It should take one parameter, result.
    * @returns This Connection.
    */
  def device(data: Device, fn: js.Function1[/* result */ DeviceResponse, Unit]): Connection = js.native
  
  /**
    * Find Meshblu devices.
    * @param data
    * @param fn The callback to be called. It should take one parameter, result.
    * @returns This Connection.
    */
  def devices(data: Color, fn: js.Function1[/* result */ js.Array[DeviceResponse], Unit]): Connection = js.native
  
  def directText(data: js.Any): Connection = js.native
  
  /**
    * @param uuid
    * @param message {string|number|object|array|Buffer} - data for encrypting.
    * @param options
    * @param fn The callback to be called. It should take one parameter, result,
    *     which is an object containing a property "error".
    * @returns This Connection.
    */
  def encryptMessage(
    uuid: String,
    message: js.Any,
    options: ConnectionOptions,
    fn: js.Function1[/* result */ js.Any, Unit]
  ): Connection = js.native
  
  def events(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  /**
    * Generate a new session token for a device.
    * @param data
    * @param fn The callback to be called. It should take one parameter, result.
    */
  def generateAndStoreToken(data: Device, fn: js.Function1[/* result */ ConnectionOptions, Unit]): Unit = js.native
  
  def generateKeyPair(): KeyPair = js.native
  
  /**
    *
    * @param uuid
    * @param fn The callback to be called. It should take one parameter, err,
    *     which will be null if there was no problem, and one parameter, publicKey,
    *     of type NodeRSA.
    */
  def getPublicKey(uuid: String, fn: js.Function2[/* err */ Error, /* publicKey */ js.Any, Unit]): Unit = js.native
  
  /**
    * Get a meshblu data for a device.
    * @param data
    * @param fn The callback to be called. It should take one parameter, result.
    * @returns This Connection.
    */
  def getdata(data: GetDataInput, fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  /**
    * Authenticate with Meshblu.
    * @returns This Connection.
    */
  def identify(): Connection = js.native
  
  def localdevices(fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  /**
    * Send a meshblu message.
    * @param payload An array of devices UUIDs.
    * @param fn The callback to be called. It should take one parameter, result,
    *     which is an object containing a property "error".
    * @returns This Connection.
    */
  def message(payload: MessagePayload, fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  def mydevices(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  def parseUrl(serverUrl: String, port: String): String = js.native
  
  def reconnect(): Unit = js.native
  
  /**
    * Register a new device record.
    * @param data
    * @param fn The callback to be called. It should take one parameter, result.
    * @returns This Connection.
    */
  def register(data: RegisterData, fn: js.Function1[/* result */ RegisterResponse, Unit]): Connection = js.native
  
  def resetToken(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  
  /**
    * Remove a session token from a device.
    * @param data
    * @param fn The callback to be called. It should take one parameter, result.
    */
  def revokeToken(data: ConnectionOptions, fn: js.Function1[/* result */ Device, Unit]): Unit = js.native
  
  /*
    * Lack of documentation about these api functions.
    */
  def send(text: String): Connection = js.native
  
  def setPrivateKey(privateKey: String): Unit = js.native
  
  def setup(): Connection = js.native
  
  /**
    * @param data {string|number|object|array|Buffer} - data for signing.
    */
  def sign(data: js.Any): String = js.native
  
  def status(data: js.Any): Connection = js.native
  
  /**
    * Returns device messages as they are sent and received.
    * @param data
    * @param fn The callback to be called. It should take one parameter, result.
    * @returns This Connection.
    */
  def subscribe(data: SubscribeData, fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  def subscribeText(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  def textBroadcast(data: js.Any): Connection = js.native
  
  def unclaimeddevices(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  /**
    * Removes a device record.
    * @param data
    * @param fn The callback to be called. It should take one parameter, result.
    * @returns This Connection.
    */
  def unregister(data: Device, fn: js.Function1[/* result */ Device, Unit]): Connection = js.native
  
  /**
    * Cancels device subscription.
    * @param data
    * @param fn The callback to be called. It should take one parameter, result.
    * @returns This Connection.
    */
  def unsubscribe(data: UnsubscribeData, fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  def unsubscribeText(data: js.Any, fn: js.Function1[/* result */ js.Any, Unit]): Connection = js.native
  
  /**
    * Update a device record.
    * @param data
    * @param fn The callback to be called. It should take one parameter, result.
    * @returns This Connection.
    */
  def update(data: UpdateData, fn: js.Function1[/* result */ UpdateSuccess, Unit]): Connection = js.native
  
  /**
    * @param message {string|number|object|array|Buffer} - signed data.
    * @param signature
    * @returns {*}
    */
  def verify(message: js.Any, signature: js.Any): js.Any = js.native
  
  /**
    * Get my device info.
    * @param data
    * @param fn The callback to be called. It should take one parameter, result.
    * @returns This Connection.
    */
  def whoami(data: js.Any, fn: js.Function1[/* result */ DeviceResponse, Unit]): Connection = js.native
}
object Connection {
  
  @scala.inline
  def apply(
    authenticate: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection,
    bufferedSocketEmit: () => Unit,
    claimdevice: (Device, js.Function1[/* result */ Device, Unit]) => Connection,
    close: js.Function1[/* result */ js.Any, Unit] => Connection,
    connect: () => Unit,
    data: (DataInput, js.Function1[/* result */ js.Any, Unit]) => Connection,
    device: (Device, js.Function1[/* result */ DeviceResponse, Unit]) => Connection,
    devices: (Color, js.Function1[/* result */ js.Array[DeviceResponse], Unit]) => Connection,
    directText: js.Any => Connection,
    encryptMessage: (String, js.Any, ConnectionOptions, js.Function1[/* result */ js.Any, Unit]) => Connection,
    events: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection,
    generateAndStoreToken: (Device, js.Function1[/* result */ ConnectionOptions, Unit]) => Unit,
    generateKeyPair: () => KeyPair,
    getPublicKey: (String, js.Function2[/* err */ Error, /* publicKey */ js.Any, Unit]) => Unit,
    getdata: (GetDataInput, js.Function1[/* result */ js.Any, Unit]) => Connection,
    identify: () => Connection,
    localdevices: js.Function1[/* result */ js.Any, Unit] => Connection,
    message: (MessagePayload, js.Function1[/* result */ js.Any, Unit]) => Connection,
    mydevices: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection,
    parseUrl: (String, String) => String,
    reconnect: () => Unit,
    register: (RegisterData, js.Function1[/* result */ RegisterResponse, Unit]) => Connection,
    resetToken: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Unit,
    revokeToken: (ConnectionOptions, js.Function1[/* result */ Device, Unit]) => Unit,
    send: String => Connection,
    setPrivateKey: String => Unit,
    setup: () => Connection,
    sign: js.Any => String,
    status: js.Any => Connection,
    subscribe: (SubscribeData, js.Function1[/* result */ js.Any, Unit]) => Connection,
    subscribeText: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection,
    textBroadcast: js.Any => Connection,
    unclaimeddevices: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection,
    unregister: (Device, js.Function1[/* result */ Device, Unit]) => Connection,
    unsubscribe: (UnsubscribeData, js.Function1[/* result */ js.Any, Unit]) => Connection,
    unsubscribeText: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection,
    update: (UpdateData, js.Function1[/* result */ UpdateSuccess, Unit]) => Connection,
    verify: (js.Any, js.Any) => js.Any,
    whoami: (js.Any, js.Function1[/* result */ DeviceResponse, Unit]) => Connection
  ): Connection = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate), bufferedSocketEmit = js.Any.fromFunction0(bufferedSocketEmit), claimdevice = js.Any.fromFunction2(claimdevice), close = js.Any.fromFunction1(close), connect = js.Any.fromFunction0(connect), data = js.Any.fromFunction2(data), device = js.Any.fromFunction2(device), devices = js.Any.fromFunction2(devices), directText = js.Any.fromFunction1(directText), encryptMessage = js.Any.fromFunction4(encryptMessage), events = js.Any.fromFunction2(events), generateAndStoreToken = js.Any.fromFunction2(generateAndStoreToken), generateKeyPair = js.Any.fromFunction0(generateKeyPair), getPublicKey = js.Any.fromFunction2(getPublicKey), getdata = js.Any.fromFunction2(getdata), identify = js.Any.fromFunction0(identify), localdevices = js.Any.fromFunction1(localdevices), message = js.Any.fromFunction2(message), mydevices = js.Any.fromFunction2(mydevices), parseUrl = js.Any.fromFunction2(parseUrl), reconnect = js.Any.fromFunction0(reconnect), register = js.Any.fromFunction2(register), resetToken = js.Any.fromFunction2(resetToken), revokeToken = js.Any.fromFunction2(revokeToken), send = js.Any.fromFunction1(send), setPrivateKey = js.Any.fromFunction1(setPrivateKey), setup = js.Any.fromFunction0(setup), sign = js.Any.fromFunction1(sign), status = js.Any.fromFunction1(status), subscribe = js.Any.fromFunction2(subscribe), subscribeText = js.Any.fromFunction2(subscribeText), textBroadcast = js.Any.fromFunction1(textBroadcast), unclaimeddevices = js.Any.fromFunction2(unclaimeddevices), unregister = js.Any.fromFunction2(unregister), unsubscribe = js.Any.fromFunction2(unsubscribe), unsubscribeText = js.Any.fromFunction2(unsubscribeText), update = js.Any.fromFunction2(update), verify = js.Any.fromFunction2(verify), whoami = js.Any.fromFunction2(whoami))
    __obj.asInstanceOf[Connection]
  }
  
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
    
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
    def setAuthenticate(value: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection): Self = this.set("authenticate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBufferedSocketEmit(value: () => Unit): Self = this.set("bufferedSocketEmit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClaimdevice(value: (Device, js.Function1[/* result */ Device, Unit]) => Connection): Self = this.set("claimdevice", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClose(value: js.Function1[/* result */ js.Any, Unit] => Connection): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnect(value: () => Unit): Self = this.set("connect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setData(value: (DataInput, js.Function1[/* result */ js.Any, Unit]) => Connection): Self = this.set("data", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDevice(value: (Device, js.Function1[/* result */ DeviceResponse, Unit]) => Connection): Self = this.set("device", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDevices(value: (Color, js.Function1[/* result */ js.Array[DeviceResponse], Unit]) => Connection): Self = this.set("devices", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDirectText(value: js.Any => Connection): Self = this.set("directText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncryptMessage(value: (String, js.Any, ConnectionOptions, js.Function1[/* result */ js.Any, Unit]) => Connection): Self = this.set("encryptMessage", js.Any.fromFunction4(value))
    
    @scala.inline
    def setEvents(value: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection): Self = this.set("events", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGenerateAndStoreToken(value: (Device, js.Function1[/* result */ ConnectionOptions, Unit]) => Unit): Self = this.set("generateAndStoreToken", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGenerateKeyPair(value: () => KeyPair): Self = this.set("generateKeyPair", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPublicKey(value: (String, js.Function2[/* err */ Error, /* publicKey */ js.Any, Unit]) => Unit): Self = this.set("getPublicKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetdata(value: (GetDataInput, js.Function1[/* result */ js.Any, Unit]) => Connection): Self = this.set("getdata", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIdentify(value: () => Connection): Self = this.set("identify", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocaldevices(value: js.Function1[/* result */ js.Any, Unit] => Connection): Self = this.set("localdevices", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMessage(value: (MessagePayload, js.Function1[/* result */ js.Any, Unit]) => Connection): Self = this.set("message", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMydevices(value: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection): Self = this.set("mydevices", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParseUrl(value: (String, String) => String): Self = this.set("parseUrl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReconnect(value: () => Unit): Self = this.set("reconnect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: (RegisterData, js.Function1[/* result */ RegisterResponse, Unit]) => Connection): Self = this.set("register", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResetToken(value: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Unit): Self = this.set("resetToken", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRevokeToken(value: (ConnectionOptions, js.Function1[/* result */ Device, Unit]) => Unit): Self = this.set("revokeToken", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSend(value: String => Connection): Self = this.set("send", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetPrivateKey(value: String => Unit): Self = this.set("setPrivateKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetup(value: () => Connection): Self = this.set("setup", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSign(value: js.Any => String): Self = this.set("sign", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatus(value: js.Any => Connection): Self = this.set("status", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubscribe(value: (SubscribeData, js.Function1[/* result */ js.Any, Unit]) => Connection): Self = this.set("subscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSubscribeText(value: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection): Self = this.set("subscribeText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTextBroadcast(value: js.Any => Connection): Self = this.set("textBroadcast", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnclaimeddevices(value: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection): Self = this.set("unclaimeddevices", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnregister(value: (Device, js.Function1[/* result */ Device, Unit]) => Connection): Self = this.set("unregister", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnsubscribe(value: (UnsubscribeData, js.Function1[/* result */ js.Any, Unit]) => Connection): Self = this.set("unsubscribe", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnsubscribeText(value: (js.Any, js.Function1[/* result */ js.Any, Unit]) => Connection): Self = this.set("unsubscribeText", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUpdate(value: (UpdateData, js.Function1[/* result */ UpdateSuccess, Unit]) => Connection): Self = this.set("update", js.Any.fromFunction2(value))
    
    @scala.inline
    def setVerify(value: (js.Any, js.Any) => js.Any): Self = this.set("verify", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWhoami(value: (js.Any, js.Function1[/* result */ DeviceResponse, Unit]) => Connection): Self = this.set("whoami", js.Any.fromFunction2(value))
  }
}
