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
  
  inline def apply(): ToneInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToneInfo]
  }
  
  extension [Self <: ToneInfo](x: Self) {
    
    inline def setSequenceId(value: Double): Self = StObject.set(x, "sequenceId", value.asInstanceOf[js.Any])
    
    inline def setSequenceIdUndefined: Self = StObject.set(x, "sequenceId", js.undefined)
    
    inline def setTone(value: Tone): Self = StObject.set(x, "tone", value.asInstanceOf[js.Any])
    
    inline def setToneUndefined: Self = StObject.set(x, "tone", js.undefined)
  }
}
