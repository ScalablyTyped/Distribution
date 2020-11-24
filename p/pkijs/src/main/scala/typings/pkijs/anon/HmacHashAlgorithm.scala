package typings.pkijs.anon

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HmacHashAlgorithm extends js.Object {
  
  var hmacHashAlgorithm: js.UndefOr[String] = js.native
  
  var iterationCount: js.UndefOr[Double] = js.native
  
  var keyEncryptionAlgorithm: js.UndefOr[typings.std.Algorithm] = js.native
  
  var keyEncryptionAlgorithmParams: js.UndefOr[js.Any] = js.native
  
  var keyIdentifier: js.UndefOr[ArrayBuffer] = js.native
}
object HmacHashAlgorithm {
  
  @scala.inline
  def apply(): HmacHashAlgorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmacHashAlgorithm]
  }
  
  @scala.inline
  implicit class HmacHashAlgorithmOps[Self <: HmacHashAlgorithm] (val x: Self) extends AnyVal {
    
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
    def setHmacHashAlgorithm(value: String): Self = this.set("hmacHashAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHmacHashAlgorithm: Self = this.set("hmacHashAlgorithm", js.undefined)
    
    @scala.inline
    def setIterationCount(value: Double): Self = this.set("iterationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIterationCount: Self = this.set("iterationCount", js.undefined)
    
    @scala.inline
    def setKeyEncryptionAlgorithm(value: typings.std.Algorithm): Self = this.set("keyEncryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyEncryptionAlgorithm: Self = this.set("keyEncryptionAlgorithm", js.undefined)
    
    @scala.inline
    def setKeyEncryptionAlgorithmParams(value: js.Any): Self = this.set("keyEncryptionAlgorithmParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyEncryptionAlgorithmParams: Self = this.set("keyEncryptionAlgorithmParams", js.undefined)
    
    @scala.inline
    def setKeyIdentifier(value: ArrayBuffer): Self = this.set("keyIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyIdentifier: Self = this.set("keyIdentifier", js.undefined)
  }
}
