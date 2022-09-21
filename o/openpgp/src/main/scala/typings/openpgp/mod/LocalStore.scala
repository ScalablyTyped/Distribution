package typings.openpgp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "LocalStore")
@js.native
open class LocalStore protected () extends StObject {
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
  def loadPrivate(): js.Array[Any] = js.native
  
  /**
    * Load the public keys from HTML5 local storage.
    * @returns array of keys retrieved from localstore
    */
  def loadPublic(): js.Array[Any] = js.native
  
  /**
    * Saves the current state of the private keys to HTML5 local storage.
    * The key array gets stringified using JSON
    * @param keys array of keys to save in localstore
    */
  def storePrivate(keys: js.Array[Any]): Unit = js.native
  
  /**
    * Saves the current state of the public keys to HTML5 local storage.
    * The key array gets stringified using JSON
    * @param keys array of keys to save in localstore
    */
  def storePublic(keys: js.Array[Any]): Unit = js.native
}
