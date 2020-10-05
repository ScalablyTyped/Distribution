package typings.node.cryptoMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyPairSyncResult[T1 /* <: String | Buffer */, T2 /* <: String | Buffer */] extends js.Object {
  var privateKey: T2 = js.native
  var publicKey: T1 = js.native
}

object KeyPairSyncResult {
  @scala.inline
  def apply[/* <: java.lang.String | typings.node.Buffer */ T1, /* <: java.lang.String | typings.node.Buffer */ T2](privateKey: T2, publicKey: T1): KeyPairSyncResult[T1, T2] = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyPairSyncResult[T1, T2]]
  }
  @scala.inline
  implicit class KeyPairSyncResultOps[Self <: KeyPairSyncResult[_, _], /* <: java.lang.String | typings.node.Buffer */ T1, /* <: java.lang.String | typings.node.Buffer */ T2] (val x: Self with (KeyPairSyncResult[T1, T2])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrivateKey(value: T2): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPublicKey(value: T1): Self = this.set("publicKey", value.asInstanceOf[js.Any])
  }
  
}

