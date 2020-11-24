package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditAtom extends js.Object {
  
  /** End time in seconds for the atom, relative to the input file timeline. When `end_time_offset` is not specified, the `inputs` are used until the end of the atom. */
  var endTimeOffset: js.UndefOr[String] = js.native
  
  /** List of `Input.key`s identifying files that should be used in this atom. The listed `inputs` must have the same timeline. */
  var inputs: js.UndefOr[js.Array[String]] = js.native
  
  /** A unique key for this atom. Must be specified when using advanced mapping. */
  var key: js.UndefOr[String] = js.native
  
  /** Start time in seconds for the atom, relative to the input file timeline. The default is `0s`. */
  var startTimeOffset: js.UndefOr[String] = js.native
}
object EditAtom {
  
  @scala.inline
  def apply(): EditAtom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditAtom]
  }
  
  @scala.inline
  implicit class EditAtomOps[Self <: EditAtom] (val x: Self) extends AnyVal {
    
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
    def setEndTimeOffset(value: String): Self = this.set("endTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimeOffset: Self = this.set("endTimeOffset", js.undefined)
    
    @scala.inline
    def setInputsVarargs(value: String*): Self = this.set("inputs", js.Array(value :_*))
    
    @scala.inline
    def setInputs(value: js.Array[String]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputs: Self = this.set("inputs", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setStartTimeOffset(value: String): Self = this.set("startTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeOffset: Self = this.set("startTimeOffset", js.undefined)
  }
}
