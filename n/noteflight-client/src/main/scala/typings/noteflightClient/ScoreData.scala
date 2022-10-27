package typings.noteflightClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A JSON-like structure describing the entire score in the embed.
  */
trait ScoreData extends StObject {
  
  /**
    * an array of Objects representing each staff in the score.
    */
  var staves: js.Array[Staff]
}
object ScoreData {
  
  inline def apply(staves: js.Array[Staff]): ScoreData = {
    val __obj = js.Dynamic.literal(staves = staves.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScoreData]
  }
  
  extension [Self <: ScoreData](x: Self) {
    
    inline def setStaves(value: js.Array[Staff]): Self = StObject.set(x, "staves", value.asInstanceOf[js.Any])
    
    inline def setStavesVarargs(value: Staff*): Self = StObject.set(x, "staves", js.Array(value*))
  }
}
