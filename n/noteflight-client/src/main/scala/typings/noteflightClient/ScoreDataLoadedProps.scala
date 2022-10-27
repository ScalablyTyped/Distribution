package typings.noteflightClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScoreDataLoadedProps extends StObject {
  
  /**
    * This event is dispatched whenever an embed instance finishes loading a score from the Noteflight server and is ready to accept user interaction.
    * Document methods should not be called until this event has been received.
    */
  var scoreId: String
}
object ScoreDataLoadedProps {
  
  inline def apply(scoreId: String): ScoreDataLoadedProps = {
    val __obj = js.Dynamic.literal(scoreId = scoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScoreDataLoadedProps]
  }
  
  extension [Self <: ScoreDataLoadedProps](x: Self) {
    
    inline def setScoreId(value: String): Self = StObject.set(x, "scoreId", value.asInstanceOf[js.Any])
  }
}
