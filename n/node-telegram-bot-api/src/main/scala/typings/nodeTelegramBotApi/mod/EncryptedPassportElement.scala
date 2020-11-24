package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptedPassportElement extends js.Object {
  
  var data: js.UndefOr[String] = js.native
  
  var email: js.UndefOr[String] = js.native
  
  var files: js.UndefOr[js.Array[PassportFile]] = js.native
  
  var front_side: js.UndefOr[PassportFile] = js.native
  
  var hash: String = js.native
  
  var phone_number: js.UndefOr[String] = js.native
  
  var reverse_side: js.UndefOr[PassportFile] = js.native
  
  var selfie: js.UndefOr[PassportFile] = js.native
  
  var translation: js.UndefOr[js.Array[PassportFile]] = js.native
  
  var `type`: String = js.native
}
object EncryptedPassportElement {
  
  @scala.inline
  def apply(hash: String, `type`: String): EncryptedPassportElement = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedPassportElement]
  }
  
  @scala.inline
  implicit class EncryptedPassportElementOps[Self <: EncryptedPassportElement] (val x: Self) extends AnyVal {
    
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
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: PassportFile*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[PassportFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    
    @scala.inline
    def setFront_side(value: PassportFile): Self = this.set("front_side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFront_side: Self = this.set("front_side", js.undefined)
    
    @scala.inline
    def setPhone_number(value: String): Self = this.set("phone_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone_number: Self = this.set("phone_number", js.undefined)
    
    @scala.inline
    def setReverse_side(value: PassportFile): Self = this.set("reverse_side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse_side: Self = this.set("reverse_side", js.undefined)
    
    @scala.inline
    def setSelfie(value: PassportFile): Self = this.set("selfie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfie: Self = this.set("selfie", js.undefined)
    
    @scala.inline
    def setTranslationVarargs(value: PassportFile*): Self = this.set("translation", js.Array(value :_*))
    
    @scala.inline
    def setTranslation(value: js.Array[PassportFile]): Self = this.set("translation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslation: Self = this.set("translation", js.undefined)
  }
}
