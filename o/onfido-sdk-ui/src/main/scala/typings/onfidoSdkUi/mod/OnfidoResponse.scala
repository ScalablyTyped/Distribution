package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.anon.Id
import typings.onfidoSdkUi.anon.Variant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnfidoResponse extends js.Object {
  
  var document_front: Id = js.native
  
  var face: Variant = js.native
}
object OnfidoResponse {
  
  @scala.inline
  def apply(document_front: Id, face: Variant): OnfidoResponse = {
    val __obj = js.Dynamic.literal(document_front = document_front.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfidoResponse]
  }
  
  @scala.inline
  implicit class OnfidoResponseOps[Self <: OnfidoResponse] (val x: Self) extends AnyVal {
    
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
    def setDocument_front(value: Id): Self = this.set("document_front", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFace(value: Variant): Self = this.set("face", value.asInstanceOf[js.Any])
  }
}
