package typings.node.cryptoMod

import typings.node.Buffer
import typings.node.nodeStrings.pkcs1
import typings.node.nodeStrings.pkcs8
import typings.node.nodeStrings.sec1
import typings.node.nodeStrings.spki
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyExportOptions[T /* <: KeyFormat */] extends js.Object {
  
  var cipher: js.UndefOr[String] = js.native
  
  var format: T = js.native
  
  var passphrase: js.UndefOr[String | Buffer] = js.native
  
  var `type`: pkcs1 | spki | pkcs8 | sec1 = js.native
}
object KeyExportOptions {
  
  @scala.inline
  def apply[T /* <: KeyFormat */](format: T, `type`: pkcs1 | spki | pkcs8 | sec1): KeyExportOptions[T] = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyExportOptions[T]]
  }
  
  @scala.inline
  implicit class KeyExportOptionsOps[Self <: KeyExportOptions[_], T /* <: KeyFormat */] (val x: Self with KeyExportOptions[T]) extends AnyVal {
    
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
    def setFormat(value: T): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pkcs1 | spki | pkcs8 | sec1): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipher(value: String): Self = this.set("cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCipher: Self = this.set("cipher", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String | Buffer): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
  }
}
