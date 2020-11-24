package typings.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pkcs12CreationOptions extends js.Object {
  
  var certFiles: js.UndefOr[js.Array[String]] = js.native
  
  var cipher: js.UndefOr[PrivateKeyCipher] = js.native
  
  var clientKeyPassword: js.UndefOr[String] = js.native
}
object Pkcs12CreationOptions {
  
  @scala.inline
  def apply(): Pkcs12CreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pkcs12CreationOptions]
  }
  
  @scala.inline
  implicit class Pkcs12CreationOptionsOps[Self <: Pkcs12CreationOptions] (val x: Self) extends AnyVal {
    
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
    def setCertFilesVarargs(value: String*): Self = this.set("certFiles", js.Array(value :_*))
    
    @scala.inline
    def setCertFiles(value: js.Array[String]): Self = this.set("certFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertFiles: Self = this.set("certFiles", js.undefined)
    
    @scala.inline
    def setCipher(value: PrivateKeyCipher): Self = this.set("cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCipher: Self = this.set("cipher", js.undefined)
    
    @scala.inline
    def setClientKeyPassword(value: String): Self = this.set("clientKeyPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientKeyPassword: Self = this.set("clientKeyPassword", js.undefined)
  }
}
