package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "keyring")
@js.native
object keyringNs extends js.Object {
  @JSName("keyring")
  @js.native
  object keyringNs extends js.Object {
    @js.native
    /**
      * Initialization routine for the keyring.
      * @param storeHandler class implementing loadPublic(), loadPrivate(), storePublic(), and storePrivate() methods
      */
    class Keyring () extends js.Object {
      def this(storeHandler: openpgpLib.openpgpMod.keyringNs.localstoreNs.LocalStore) = this()
      /**
        * Clear the keyring - erase all the keys
        */
      def clear(): scala.Unit = js.native
      /**
        * Get all public and private keys
        * @returns all keys
        */
      def getAllKeys(): js.Array[_] = js.native
      /**
        * Searches the keyring for keys having the specified key id
        * @param keyId provided as string of lowercase hex number
        *        withouth 0x prefix (can be 16-character key ID or fingerprint)
        * @param deep if true search also in subkeys
        * @returns keys found or null
        */
      def getKeysForId(keyId: java.lang.String, deep: scala.Boolean): js.Array[_] | scala.Null = js.native
      /**
        * Calls the storeHandler to load the keys
        */
      def load(): scala.Unit = js.native
      /**
        * Removes keys having the specified key id from the keyring
        * @param keyId provided as string of lowercase hex number
        *        withouth 0x prefix (can be 16-character key ID or fingerprint)
        * @returns keys found or null
        */
      def removeKeysForId(keyId: java.lang.String): js.Array[_] | scala.Null = js.native
      /**
        * Calls the storeHandler to save the keys
        */
      def store(): scala.Unit = js.native
    }
    
    /**
      * Array of keys
      * @param keys The keys to store in this array
      */
    def KeyArray(keys: js.Array[_]): scala.Unit = js.native
  }
  
  @JSName("localstore")
  @js.native
  object localstoreNs extends js.Object {
    @js.native
    class LocalStore protected () extends js.Object {
      /**
        * The class that deals with storage of the keyring.
        * Currently the only option is to use HTML5 local storage.
        * @param prefix prefix for itemnames in localstore
        */
      def this(prefix: java.lang.String) = this()
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
      def storePrivate(keys: js.Array[_]): scala.Unit = js.native
      /**
        * Saves the current state of the public keys to HTML5 local storage.
        * The key array gets stringified using JSON
        * @param keys array of keys to save in localstore
        */
      def storePublic(keys: js.Array[_]): scala.Unit = js.native
    }
    
  }
  
}

