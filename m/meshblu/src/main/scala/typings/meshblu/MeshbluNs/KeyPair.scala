package typings.meshblu.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  var privateKey: String
  var publicKey: String
}

object KeyPair {
  @scala.inline
  def apply(privateKey: String, publicKey: String): KeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[KeyPair]
  }
}

