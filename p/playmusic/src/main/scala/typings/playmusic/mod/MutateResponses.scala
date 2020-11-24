package typings.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutateResponses extends js.Object {
  
  var mutate_response: js.UndefOr[js.Array[MutateResponse]] = js.native
}
object MutateResponses {
  
  @scala.inline
  def apply(): MutateResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutateResponses]
  }
  
  @scala.inline
  implicit class MutateResponsesOps[Self <: MutateResponses] (val x: Self) extends AnyVal {
    
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
    def setMutate_responseVarargs(value: MutateResponse*): Self = this.set("mutate_response", js.Array(value :_*))
    
    @scala.inline
    def setMutate_response(value: js.Array[MutateResponse]): Self = this.set("mutate_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutate_response: Self = this.set("mutate_response", js.undefined)
  }
}
