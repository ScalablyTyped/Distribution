package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListShaCertificatesResponse extends js.Object {
  
  /** The list of each `ShaCertificate` associated with the `AndroidApp`. */
  var certificates: js.UndefOr[js.Array[ShaCertificate]] = js.native
}
object ListShaCertificatesResponse {
  
  @scala.inline
  def apply(): ListShaCertificatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListShaCertificatesResponse]
  }
  
  @scala.inline
  implicit class ListShaCertificatesResponseOps[Self <: ListShaCertificatesResponse] (val x: Self) extends AnyVal {
    
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
    def setCertificatesVarargs(value: ShaCertificate*): Self = this.set("certificates", js.Array(value :_*))
    
    @scala.inline
    def setCertificates(value: js.Array[ShaCertificate]): Self = this.set("certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificates: Self = this.set("certificates", js.undefined)
  }
}
