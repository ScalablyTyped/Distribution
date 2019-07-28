package typings.openpgp.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "LocalStore")
@js.native
class LocalStore protected () extends js.Object {
  /**
    * The class that deals with storage of the keyring.
    * Currently the only option is to use HTML5 local storage.
    * @param prefix prefix for itemnames in localstore
    */
  def this(prefix: String) = this()
  /**
    * Load the private keys from HTML5 local storage.
    * @returns array of keys retrieved from localstore
    */
  def loadPrivate(): js.Array[_] = js.native
  /**
    * Load the public keys from HTML5 local storage.
    * @returns array of keys retrieved from localstore
    */
  def loadPublic(): js.Array[_] = js.native
  /**
    * Saves the current state of the private keys to HTML5 local storage.
    * The key array gets stringified using JSON
    * @param keys array of keys to save in localstore
    */
  def storePrivate(keys: js.Array[_]): Unit = js.native
  /**
    * Saves the current state of the public keys to HTML5 local storage.
    * The key array gets stringified using JSON
    * @param keys array of keys to save in localstore
    */
  def storePublic(keys: js.Array[_]): Unit = js.native
}

