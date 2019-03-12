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
    fn: js.Function2[/* err */ stdLib.Error, /* publicKey */ js.Any, scala.Unit]
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
    authenticate: (js.Any, js.Function1[/* result */ js.Any, scala.Unit]) => Connection,
    bufferedSocketEmit: () => scala.Unit,
    claimdevice: (Device, js.Function1[/* result */ Device, scala.Unit]) => Connection,
    close: js.Function1[/* result */ js.Any, scala.Unit] => Connection,
    connect: () => scala.Unit,
    data: (DataInput, js.Function1[/* result */ js.Any, scala.Unit]) => Connection,
    device: (Device, js.Function1[/* result */ DeviceResponse, scala.Unit]) => Connection,
    devices: (Color, js.Function1[/* result */ js.Array[DeviceResponse], scala.Unit]) => Connection,
    directText: js.Any => Connection,
    encryptMessage: (java.lang.String, js.Any, ConnectionOptions, js.Function1[/* result */ js.Any, scala.Unit]) => Connection,
    events: (js.Any, js.Function1[/* result */ js.Any, scala.Unit]) => Connection,
    generateAndStoreToken: (Device, js.Function1[/* result */ ConnectionOptions, scala.Unit]) => scala.Unit,
    generateKeyPair: () => KeyPair,
    getPublicKey: (java.lang.String, js.Function2[/* err */ stdLib.Error, /* publicKey */ js.Any, scala.Unit]) => scala.Unit,
    getdata: (GetDataInput, js.Function1[/* result */ js.Any, scala.Unit]) => Connection,
    identify: () => Connection,
    localdevices: js.Function1[/* result */ js.Any, scala.Unit] => Connection,
    message: (MessagePayload, js.Function1[/* result */ js.Any, scala.Unit]) => Connection,
    mydevices: (js.Any, js.Function1[/* result */ js.Any, scala.Unit]) => Connection,
    parseUrl: (java.lang.String, java.lang.String) => java.lang.String,
    reconnect: () => scala.Unit,
    register: (RegisterData, js.Function1[/* result */ RegisterResponse, scala.Unit]) => Connection,
    resetToken: (js.Any, js.Function1[/* result */ js.Any, scala.Unit]) => scala.Unit,
    revokeToken: (ConnectionOptions, js.Function1[/* result */ Device, scala.Unit]) => scala.Unit,
    send: java.lang.String => Connection,
    setPrivateKey: java.lang.String => scala.Unit,
    setup: () => Connection,
    sign: js.Any => java.lang.String,
    status: js.Any => Connection,
    subscribe: (SubscribeData, js.Function1[/* result */ js.Any, scala.Unit]) => Connection,
    subscribeText: (js.Any, js.Function1[/* result */ js.Any, scala.Unit]) => Connection,
    textBroadcast: js.Any => Connection,
    unclaimeddevices: (js.Any, js.Function1[/* result */ js.Any, scala.Unit]) => Connection,
    unregister: (Device, js.Function1[/* result */ Device, scala.Unit]) => Connection,
    unsubscribe: (UnsubscribeData, js.Function1[/* result */ js.Any, scala.Unit]) => Connection,
    unsubscribeText: (js.Any, js.Function1[/* result */ js.Any, scala.Unit]) => Connection,
    update: (UpdateData, js.Function1[/* result */ UpdateSuccess, scala.Unit]) => Connection,
    verify: (js.Any, js.Any) => js.Any,
    whoami: (js.Any, js.Function1[/* result */ DeviceResponse, scala.Unit]) => Connection
  ): Connection = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction2(authenticate), bufferedSocketEmit = js.Any.fromFunction0(bufferedSocketEmit), claimdevice = js.Any.fromFunction2(claimdevice), close = js.Any.fromFunction1(close), connect = js.Any.fromFunction0(connect), data = js.Any.fromFunction2(data), device = js.Any.fromFunction2(device), devices = js.Any.fromFunction2(devices), directText = js.Any.fromFunction1(directText), encryptMessage = js.Any.fromFunction4(encryptMessage), events = js.Any.fromFunction2(events), generateAndStoreToken = js.Any.fromFunction2(generateAndStoreToken), generateKeyPair = js.Any.fromFunction0(generateKeyPair), getPublicKey = js.Any.fromFunction2(getPublicKey), getdata = js.Any.fromFunction2(getdata), identify = js.Any.fromFunction0(identify), localdevices = js.Any.fromFunction1(localdevices), message = js.Any.fromFunction2(message), mydevices = js.Any.fromFunction2(mydevices), parseUrl = js.Any.fromFunction2(parseUrl), reconnect = js.Any.fromFunction0(reconnect), register = js.Any.fromFunction2(register), resetToken = js.Any.fromFunction2(resetToken), revokeToken = js.Any.fromFunction2(revokeToken), send = js.Any.fromFunction1(send), setPrivateKey = js.Any.fromFunction1(setPrivateKey), setup = js.Any.fromFunction0(setup), sign = js.Any.fromFunction1(sign), status = js.Any.fromFunction1(status), subscribe = js.Any.fromFunction2(subscribe), subscribeText = js.Any.fromFunction2(subscribeText), textBroadcast = js.Any.fromFunction1(textBroadcast), unclaimeddevices = js.Any.fromFunction2(unclaimeddevices), unregister = js.Any.fromFunction2(unregister), unsubscribe = js.Any.fromFunction2(unsubscribe), unsubscribeText = js.Any.fromFunction2(unsubscribeText), update = js.Any.fromFunction2(update), verify = js.Any.fromFunction2(verify), whoami = js.Any.fromFunction2(whoami))
  
    __obj.asInstanceOf[Connection]
  }
}

