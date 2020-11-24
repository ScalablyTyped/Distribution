package typings.nodeForge.anon

import typings.nodeForge.mod.pkcs12.Bag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Encrypted extends js.Object {
  
  var encrypted: Boolean = js.native
  
  var safeBags: js.Array[Bag] = js.native
}
object Encrypted {
  
  @scala.inline
  def apply(encrypted: Boolean, safeBags: js.Array[Bag]): Encrypted = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], safeBags = safeBags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Encrypted]
  }
  
  @scala.inline
  implicit class EncryptedOps[Self <: Encrypted] (val x: Self) extends AnyVal {
    
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
    def setEncrypted(value: Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafeBagsVarargs(value: Bag*): Self = this.set("safeBags", js.Array(value :_*))
    
    @scala.inline
    def setSafeBags(value: js.Array[Bag]): Self = this.set("safeBags", value.asInstanceOf[js.Any])
  }
}
