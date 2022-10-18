package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Score extends StObject {
  
  var score: Double
  
  var vector_string: String | Null
}
object Score {
  
  inline def apply(score: Double): Score = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], vector_string = null)
    __obj.asInstanceOf[Score]
  }
  
  extension [Self <: Score](x: Self) {
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setVector_string(value: String): Self = StObject.set(x, "vector_string", value.asInstanceOf[js.Any])
    
    inline def setVector_stringNull: Self = StObject.set(x, "vector_string", null)
  }
}
