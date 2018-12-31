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

