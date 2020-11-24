package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aes128Encryption extends js.Object {
  
  /** Required. URI of the key delivery service. This URI is inserted into the M3U8 header. */
  var keyUri: js.UndefOr[String] = js.native
}
object Aes128Encryption {
  
  @scala.inline
  def apply(): Aes128Encryption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aes128Encryption]
  }
  
  @scala.inline
  implicit class Aes128EncryptionOps[Self <: Aes128Encryption] (val x: Self) extends AnyVal {
    
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
    def setKeyUri(value: String): Self = this.set("keyUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyUri: Self = this.set("keyUri", js.undefined)
  }
}
