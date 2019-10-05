package typings.nodeDashJose.nodeDashJoseMod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-jose", "JWK.asKeyStore")
@js.native
object asKeyStore extends js.Object {
  def apply(ks: String): js.Promise[KeyStore] = js.native
  /**
    * To import a JWK-set as a keystore
    */
  def apply(ks: js.Object): js.Promise[KeyStore] = js.native
}

