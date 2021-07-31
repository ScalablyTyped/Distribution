package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToneInfo extends StObject {
  
  // An incremental identifier used for ordering DTMF events.
  var sequenceId: js.UndefOr[Double] = js.undefined
  
  // Possible values are: tone0, tone1, tone2, tone3, tone4, tone5, tone6, tone7, tone8, tone9, star, pound
  var tone: js.UndefOr[Tone] = js.undefined
}
object ToneInfo {
  
  @scala.inline
  def apply(): ToneInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToneInfo]
  }
  
  @scala.inline
  implicit class ToneInfoMutableBuilder[Self <: ToneInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSequenceId(value: Double): Self = StObject.set(x, "sequenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceIdUndefined: Self = StObject.set(x, "sequenceId", js.undefined)
    
    @scala.inline
    def setTone(value: Tone): Self = StObject.set(x, "tone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToneUndefined: Self = StObject.set(x, "tone", js.undefined)
  }
}
