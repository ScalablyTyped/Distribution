package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAtom extends js.Object {
  
  /** List of `Job.inputs` that should be embedded in this atom. Only one input is supported. */
  var inputs: js.UndefOr[js.Array[TextInput]] = js.native
  
  /** Required. The `EditAtom.key` that references atom with text inputs in the `Job.edit_list`. */
  var key: js.UndefOr[String] = js.native
}
object TextAtom {
  
  @scala.inline
  def apply(): TextAtom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAtom]
  }
  
  @scala.inline
  implicit class TextAtomOps[Self <: TextAtom] (val x: Self) extends AnyVal {
    
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
    def setInputsVarargs(value: TextInput*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[TextInput]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
