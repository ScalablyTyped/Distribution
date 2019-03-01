package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKeyPublicKey extends js.Object {
  var privateKey: Buffer
  var publicKey: java.lang.String
}

object Anon_PrivateKeyPublicKey {
  @scala.inline
  def apply(privateKey: Buffer, publicKey: java.lang.String): Anon_PrivateKeyPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("privateKey")(privateKey)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[Anon_PrivateKeyPublicKey]
  }
}

