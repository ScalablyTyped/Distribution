package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToneInfo extends js.Object {
  
  // An incremental identifier used for ordering DTMF events.
  var sequenceId: js.UndefOr[Double] = js.native
  
  // Possible values are: tone0, tone1, tone2, tone3, tone4, tone5, tone6, tone7, tone8, tone9, star, pound
  var tone: js.UndefOr[Tone] = js.native
}
object ToneInfo {
  
  @scala.inline
  def apply(): ToneInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToneInfo]
  }
  
  @scala.inline
  implicit class ToneInfoOps[Self <: ToneInfo] (val x: Self) extends AnyVal {
    
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
    def setSequenceId(value: Double): Self = this.set("sequenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequenceId: Self = this.set("sequenceId", js.undefined)
    
    @scala.inline
    def setTone(value: Tone): Self = this.set("tone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTone: Self = this.set("tone", js.undefined)
  }
}
