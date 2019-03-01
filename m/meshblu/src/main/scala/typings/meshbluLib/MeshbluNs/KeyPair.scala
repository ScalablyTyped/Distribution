package typings
package meshbluLib.MeshbluNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPair extends js.Object {
  var privateKey: java.lang.String
  var publicKey: java.lang.String
}

object KeyPair {
  @scala.inline
  def apply(privateKey: java.lang.String, publicKey: java.lang.String): KeyPair = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("privateKey")(privateKey)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[KeyPair]
  }
}

