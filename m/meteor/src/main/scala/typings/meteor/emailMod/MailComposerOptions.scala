package typings.meteor.emailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailComposerOptions extends js.Object {
  
  var charset: String = js.native
  
  var encoding: String = js.native
  
  var escapeSMTP: Boolean = js.native
  
  var forceEmbeddedImages: Boolean = js.native
  
  var keepBcc: Boolean = js.native
}
object MailComposerOptions {
  
  @scala.inline
  def apply(
    charset: String,
    encoding: String,
    escapeSMTP: Boolean,
    forceEmbeddedImages: Boolean,
    keepBcc: Boolean
  ): MailComposerOptions = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], escapeSMTP = escapeSMTP.asInstanceOf[js.Any], forceEmbeddedImages = forceEmbeddedImages.asInstanceOf[js.Any], keepBcc = keepBcc.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailComposerOptions]
  }
  
  @scala.inline
  implicit class MailComposerOptionsOps[Self <: MailComposerOptions] (val x: Self) extends AnyVal {
    
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
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeSMTP(value: Boolean): Self = this.set("escapeSMTP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceEmbeddedImages(value: Boolean): Self = this.set("forceEmbeddedImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepBcc(value: Boolean): Self = this.set("keepBcc", value.asInstanceOf[js.Any])
  }
}
