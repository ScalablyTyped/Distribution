package typings.maximMazurokGapiClientTexttospeech.gapi.client.texttospeech

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SynthesisInput extends js.Object {
  
  /**
    * The SSML document to be synthesized. The SSML document must be valid and well-formed. Otherwise the RPC will fail and return google.rpc.Code.INVALID_ARGUMENT. For more information,
    * see [SSML](https://cloud.google.com/text-to-speech/docs/ssml).
    */
  var ssml: js.UndefOr[String] = js.native
  
  /** The raw text to be synthesized. */
  var text: js.UndefOr[String] = js.native
}
object SynthesisInput {
  
  @scala.inline
  def apply(): SynthesisInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthesisInput]
  }
  
  @scala.inline
  implicit class SynthesisInputOps[Self <: SynthesisInput] (val x: Self) extends AnyVal {
    
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
    def setSsml(value: String): Self = this.set("ssml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsml: Self = this.set("ssml", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
