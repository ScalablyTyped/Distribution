package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  def authenticate(data: js.Any, fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  def bufferedSocketEmit(): scala.Unit
  def claimdevice(data: Device, fn: js.Function1[/* result */ Device, scala.Unit]): Connection
  def close(fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  def connect(): scala.Unit
  /**
  		 * Send a meshblu data message.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def data(data: DataInput, fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  /**
  		 * Find a Meshblu device.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def device(data: Device, fn: js.Function1[/* result */ DeviceResponse, scala.Unit]): Connection
  /**
  		 * Find Meshblu devices.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def devices(data: Color, fn: js.Function1[/* result */ js.Array[DeviceResponse], scala.Unit]): Connection
  def directText(data: js.Any): Connection
  /**
  		 * @param uuid
  		 * @param message {string|number|object|array|Buffer} - data for encrypting.
  		 * @param options
  		 * @param fn The callback to be called. It should take one parameter, result,
  		 * 	which is an object containing a property "error".
  		 * @returns This Connection.
  		 */
  def encryptMessage(
    uuid: java.lang.String,
    message: js.Any,
    options: ConnectionOptions,
    fn: js.Function1[/* result */ js.Any, scala.Unit]
  ): Connection
  def events(data: js.Any, fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  /**
  		 * Generate a new session token for a device.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 */
  def generateAndStoreToken(data: Device, fn: js.Function1[/* result */ ConnectionOptions, scala.Unit]): scala.Unit
  def generateKeyPair(): KeyPair
  /**
  		 *
  		 * @param uuid
  		 * @param fn The callback to be called. It should take one parameter, err,
  		 * 	which will be null if there was no problem, and one parameter, publicKey,
  		 * 	of type NodeRSA.
  		 */
  def getPublicKey(
    uuid: java.lang.String,
    fn: js.Function2[/* err */ nodeLib.Error, /* publicKey */ js.Any, scala.Unit]
  ): scala.Unit
  /**
  		 * Get a meshblu data for a device.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def getdata(data: GetDataInput, fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  /**
  		 * Authenticate with Meshblu.
  		 * @returns This Connection.
  		 */
  def identify(): Connection
  def localdevices(fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  /**
  		 * Send a meshblu message.
  		 * @param payload An array of devices UUIDs.
  		 * @param fn The callback to be called. It should take one parameter, result,
  		 * 	which is an object containing a property "error".
  		 * @returns This Connection.
  		 */
  def message(payload: MessagePayload, fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  def mydevices(data: js.Any, fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  def parseUrl(serverUrl: java.lang.String, port: java.lang.String): java.lang.String
  def reconnect(): scala.Unit
  /**
  		 * Register a new device record.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def register(data: RegisterData, fn: js.Function1[/* result */ RegisterResponse, scala.Unit]): Connection
  def resetToken(data: js.Any, fn: js.Function1[/* result */ js.Any, scala.Unit]): scala.Unit
  /**
  		 * Remove a session token from a device.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 */
  def revokeToken(data: ConnectionOptions, fn: js.Function1[/* result */ Device, scala.Unit]): scala.Unit
  /*
  		 * Lack of documentation about these api functions.
  		 */
  def send(text: java.lang.String): Connection
  def setPrivateKey(privateKey: java.lang.String): scala.Unit
  def setup(): Connection
  /**
  		 * @param data {string|number|object|array|Buffer} - data for signing.
  		 */
  def sign(data: js.Any): java.lang.String
  def status(data: js.Any): Connection
  /**
  		 * Returns device messages as they are sent and received.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def subscribe(data: SubscribeData, fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  def subscribeText(data: js.Any, fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  def textBroadcast(data: js.Any): Connection
  def unclaimeddevices(data: js.Any, fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  /**
  		 * Removes a device record.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def unregister(data: Device, fn: js.Function1[/* result */ Device, scala.Unit]): Connection
  /**
  		 * Cancels device subscription.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def unsubscribe(data: UnsubscribeData, fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  def unsubscribeText(data: js.Any, fn: js.Function1[/* result */ js.Any, scala.Unit]): Connection
  /**
  		 * Update a device record.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def update(data: UpdateData, fn: js.Function1[/* result */ UpdateSuccess, scala.Unit]): Connection
  /**
  		 * @param message {string|number|object|array|Buffer} - signed data.
  		 * @param signature
  		 * @returns {*}
  		 */
  def verify(message: js.Any, signature: js.Any): js.Any
  /**
  		 * Get my device info.
  		 * @param data
  		 * @param fn The callback to be called. It should take one parameter, result.
  		 * @returns This Connection.
  		 */
  def whoami(data: js.Any, fn: js.Function1[/* result */ DeviceResponse, scala.Unit]): Connection
}

object Connection {
  @scala.inline
  def apply(
    authenticate: js.Function2[js.Any, js.Function1[/* result */ js.Any, scala.Unit], Connection],
    bufferedSocketEmit: js.Function0[scala.Unit],
    claimdevice: js.Function2[Device, js.Function1[/* result */ Device, scala.Unit], Connection],
    close: js.Function1[js.Function1[/* result */ js.Any, scala.Unit], Connection],
    connect: js.Function0[scala.Unit],
    data: js.Function2[DataInput, js.Function1[/* result */ js.Any, scala.Unit], Connection],
    device: js.Function2[Device, js.Function1[/* result */ DeviceResponse, scala.Unit], Connection],
    devices: js.Function2[Color, js.Function1[/* result */ js.Array[DeviceResponse], scala.Unit], Connection],
    directText: js.Function1[js.Any, Connection],
    encryptMessage: js.Function4[
      java.lang.String, 
      js.Any, 
      ConnectionOptions, 
      js.Function1[/* result */ js.Any, scala.Unit], 
      Connection
    ],
    events: js.Function2[js.Any, js.Function1[/* result */ js.Any, scala.Unit], Connection],
    generateAndStoreToken: js.Function2[Device, js.Function1[/* result */ ConnectionOptions, scala.Unit], scala.Unit],
    generateKeyPair: js.Function0[KeyPair],
    getPublicKey: js.Function2[
      java.lang.String, 
      js.Function2[/* err */ nodeLib.Error, /* publicKey */ js.Any, scala.Unit], 
      scala.Unit
    ],
    getdata: js.Function2[GetDataInput, js.Function1[/* result */ js.Any, scala.Unit], Connection],
    identify: js.Function0[Connection],
    localdevices: js.Function1[js.Function1[/* result */ js.Any, scala.Unit], Connection],
    message: js.Function2[MessagePayload, js.Function1[/* result */ js.Any, scala.Unit], Connection],
    mydevices: js.Function2[js.Any, js.Function1[/* result */ js.Any, scala.Unit], Connection],
    parseUrl: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    reconnect: js.Function0[scala.Unit],
    register: js.Function2[RegisterData, js.Function1[/* result */ RegisterResponse, scala.Unit], Connection],
    resetToken: js.Function2[js.Any, js.Function1[/* result */ js.Any, scala.Unit], scala.Unit],
    revokeToken: js.Function2[ConnectionOptions, js.Function1[/* result */ Device, scala.Unit], scala.Unit],
    send: js.Function1[java.lang.String, Connection],
    setPrivateKey: js.Function1[java.lang.String, scala.Unit],
    setup: js.Function0[Connection],
    sign: js.Function1[js.Any, java.lang.String],
    status: js.Function1[js.Any, Connection],
    subscribe: js.Function2[SubscribeData, js.Function1[/* result */ js.Any, scala.Unit], Connection],
    subscribeText: js.Function2[js.Any, js.Function1[/* result */ js.Any, scala.Unit], Connection],
    textBroadcast: js.Function1[js.Any, Connection],
    unclaimeddevices: js.Function2[js.Any, js.Function1[/* result */ js.Any, scala.Unit], Connection],
    unregister: js.Function2[Device, js.Function1[/* result */ Device, scala.Unit], Connection],
    unsubscribe: js.Function2[UnsubscribeData, js.Function1[/* result */ js.Any, scala.Unit], Connection],
    unsubscribeText: js.Function2[js.Any, js.Function1[/* result */ js.Any, scala.Unit], Connection],
    update: js.Function2[UpdateData, js.Function1[/* result */ UpdateSuccess, scala.Unit], Connection],
    verify: js.Function2[js.Any, js.Any, js.Any],
    whoami: js.Function2[js.Any, js.Function1[/* result */ DeviceResponse, scala.Unit], Connection]
  ): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("authenticate")(authenticate)
    __obj.updateDynamic("bufferedSocketEmit")(bufferedSocketEmit)
    __obj.updateDynamic("claimdevice")(claimdevice)
    __obj.updateDynamic("close")(close)
    __obj.updateDynamic("connect")(connect)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("devices")(devices)
    __obj.updateDynamic("directText")(directText)
    __obj.updateDynamic("encryptMessage")(encryptMessage)
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("generateAndStoreToken")(generateAndStoreToken)
    __obj.updateDynamic("generateKeyPair")(generateKeyPair)
    __obj.updateDynamic("getPublicKey")(getPublicKey)
    __obj.updateDynamic("getdata")(getdata)
    __obj.updateDynamic("identify")(identify)
    __obj.updateDynamic("localdevices")(localdevices)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("mydevices")(mydevices)
    __obj.updateDynamic("parseUrl")(parseUrl)
    __obj.updateDynamic("reconnect")(reconnect)
    __obj.updateDynamic("register")(register)
    __obj.updateDynamic("resetToken")(resetToken)
    __obj.updateDynamic("revokeToken")(revokeToken)
    __obj.updateDynamic("send")(send)
    __obj.updateDynamic("setPrivateKey")(setPrivateKey)
    __obj.updateDynamic("setup")(setup)
    __obj.updateDynamic("sign")(sign)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("subscribe")(subscribe)
    __obj.updateDynamic("subscribeText")(subscribeText)
    __obj.updateDynamic("textBroadcast")(textBroadcast)
    __obj.updateDynamic("unclaimeddevices")(unclaimeddevices)
    __obj.updateDynamic("unregister")(unregister)
    __obj.updateDynamic("unsubscribe")(unsubscribe)
    __obj.updateDynamic("unsubscribeText")(unsubscribeText)
    __obj.updateDynamic("update")(update)
    __obj.updateDynamic("verify")(verify)
    __obj.updateDynamic("whoami")(whoami)
    __obj.asInstanceOf[Connection]
  }
}

