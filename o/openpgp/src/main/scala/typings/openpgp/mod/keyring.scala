package typings.openpgp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyring {
  
  object keyring {
    
    /**
      * Array of keys
      * @param keys The keys to store in this array
      */
    @JSImport("openpgp", "keyring.keyring.KeyArray")
    @js.native
    def KeyArray(keys: js.Array[_]): Unit = js.native
    
    @JSImport("openpgp", "keyring.keyring.Keyring")
    @js.native
    /**
      * Initialization routine for the keyring.
      * @param storeHandler class implementing loadPublic(), loadPrivate(), storePublic(), and storePrivate() methods
      */
    class Keyring () extends StObject {
      def this(storeHandler: typings.openpgp.mod.keyring.localstore.LocalStore) = this()
      
      /**
        * Clear the keyring - erase all the keys
        */
      def clear(): Unit = js.native
      
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
      def getKeysForId(keyId: String, deep: Boolean): js.Array[_] | Null = js.native
      
      /**
        * Calls the storeHandler to load the keys
        */
      def load(): Unit = js.native
      
      /**
        * Removes keys having the specified key id from the keyring
        * @param keyId provided as string of lowercase hex number
        *        withouth 0x prefix (can be 16-character key ID or fingerprint)
        * @returns keys found or null
        */
      def removeKeysForId(keyId: String): js.Array[_] | Null = js.native
      
      /**
        * Calls the storeHandler to save the keys
        */
      def store(): Unit = js.native
    }
  }
  
  object localstore {
    
    @JSImport("openpgp", "keyring.localstore.LocalStore")
    @js.native
    class LocalStore protected () extends StObject {
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
  }
}
