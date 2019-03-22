package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "hkp")
@js.native
object hkpNs extends js.Object {
  @js.native
  class HKP protected () extends js.Object {
    /**
      * Initialize the HKP client and configure it with the key server url and fetch function.
      * @param keyServerBaseUrl (optional) The HKP key server base url including
      *        the protocol to use, e.g. 'https://pgp.mit.edu'; defaults to
      *        openpgp.config.keyserver (https://keyserver.ubuntu.com)
      */
    def this(keyServerBaseUrl: java.lang.String) = this()
    /**
      * Search for a public key on the key server either by key ID or part of the user ID.
      * @param options.keyID The long public key ID.
      * @param options.query This can be any part of the key user ID such as name
      *        or email address.
      * @returns The ascii armored public key.
      */
    def lookup(): js.Promise[java.lang.String] = js.native
    /**
      * Upload a public key to the server.
      * @param publicKeyArmored An ascii armored public key to be uploaded.
      * @returns
      */
    def upload(publicKeyArmored: java.lang.String): js.Promise[_] = js.native
  }
  
}

