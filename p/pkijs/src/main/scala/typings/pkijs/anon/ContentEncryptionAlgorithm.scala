package typings.pkijs.anon

import typings.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentEncryptionAlgorithm extends js.Object {
  
  var contentEncryptionAlgorithm: typings.std.Algorithm = js.native
  
  var contentToEncrypt: BufferSource = js.native
  
  var hmacHashAlgorithm: String = js.native
  
  var iterationCount: Double = js.native
  
  var password: String = js.native
}
object ContentEncryptionAlgorithm {
  
  @scala.inline
  def apply(
    contentEncryptionAlgorithm: typings.std.Algorithm,
    contentToEncrypt: BufferSource,
    hmacHashAlgorithm: String,
    iterationCount: Double,
    password: String
  ): ContentEncryptionAlgorithm = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], contentToEncrypt = contentToEncrypt.asInstanceOf[js.Any], hmacHashAlgorithm = hmacHashAlgorithm.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentEncryptionAlgorithm]
  }
  
  @scala.inline
  implicit class ContentEncryptionAlgorithmOps[Self <: ContentEncryptionAlgorithm] (val x: Self) extends AnyVal {
    
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
    def setContentEncryptionAlgorithm(value: typings.std.Algorithm): Self = this.set("contentEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentToEncrypt(value: BufferSource): Self = this.set("contentToEncrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHmacHashAlgorithm(value: String): Self = this.set("hmacHashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIterationCount(value: Double): Self = this.set("iterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
  }
}
