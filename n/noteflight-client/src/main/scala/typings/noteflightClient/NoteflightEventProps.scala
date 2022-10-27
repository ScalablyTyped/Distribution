package typings.noteflightClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoteflightEventProps extends StObject {
  
  /**
    * If present, this corresponds to the DOM element ID of the frame that was created to hold the embedded document.
    */
  var embedld: js.UndefOr[String] = js.undefined
  
  /**
    * The NFClient.ScoreView object that generated this event.
    */
  var target: ScoreView
  
  /**
    * 	A string value that identifies the kind of event that was dispatched.
    */
  var `type`: EventType
}
object NoteflightEventProps {
  
  inline def apply(target: ScoreView, `type`: EventType): NoteflightEventProps = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteflightEventProps]
  }
  
  extension [Self <: NoteflightEventProps](x: Self) {
    
    inline def setEmbedld(value: String): Self = StObject.set(x, "embedld", value.asInstanceOf[js.Any])
    
    inline def setEmbedldUndefined: Self = StObject.set(x, "embedld", js.undefined)
    
    inline def setTarget(value: ScoreView): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
