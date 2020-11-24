package typings.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListVoicesResponse extends js.Object {
  
  /** The list of voices. */
  var voices: js.UndefOr[js.Array[Voice]] = js.native
}
object ListVoicesResponse {
  
  @scala.inline
  def apply(): ListVoicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoicesResponse]
  }
  
  @scala.inline
  implicit class ListVoicesResponseOps[Self <: ListVoicesResponse] (val x: Self) extends AnyVal {
    
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
    def setVoicesVarargs(value: Voice*): Self = this.set("voices", js.Array(value :_*))
    
    @scala.inline
    def setVoices(value: js.Array[Voice]): Self = this.set("voices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVoices: Self = this.set("voices", js.undefined)
  }
}
