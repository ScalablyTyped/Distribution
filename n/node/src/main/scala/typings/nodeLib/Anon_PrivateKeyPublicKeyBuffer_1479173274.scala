package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKeyPublicKeyBuffer_1479173274 extends js.Object {
  var privateKey: Buffer
  var publicKey: Buffer
}

object Anon_PrivateKeyPublicKeyBuffer_1479173274 {
  @scala.inline
  def apply(privateKey: Buffer, publicKey: Buffer): Anon_PrivateKeyPublicKeyBuffer_1479173274 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("privateKey")(privateKey)
    __obj.updateDynamic("publicKey")(publicKey)
    __obj.asInstanceOf[Anon_PrivateKeyPublicKeyBuffer_1479173274]
  }
}

