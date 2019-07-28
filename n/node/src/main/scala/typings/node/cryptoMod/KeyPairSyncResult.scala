package typings.node.cryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairSyncResult[T1 /* <: java.lang.String | Buffer */, T2 /* <: java.lang.String | Buffer */] extends js.Object {
  var privateKey: T2
  var publicKey: T1
}

object KeyPairSyncResult {
  @scala.inline
  def apply[T1 /* <: java.lang.String | Buffer */, T2 /* <: java.lang.String | Buffer */](privateKey: T2, publicKey: T1): KeyPairSyncResult[T1, T2] = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KeyPairSyncResult[T1, T2]]
  }
}

