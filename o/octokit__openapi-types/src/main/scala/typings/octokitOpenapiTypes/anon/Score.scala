package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Score extends StObject {
  
  /** @description The overall CVSS score of the advisory. */
  val score: Double
  
  /** @description The full CVSS vector string for the advisory. */
  val vector_string: String | Null
}
object Score {
  
  inline def apply(score: Double): Score = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any], vector_string = null)
    __obj.asInstanceOf[Score]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Score] (val x: Self) extends AnyVal {
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setVector_string(value: String): Self = StObject.set(x, "vector_string", value.asInstanceOf[js.Any])
    
    inline def setVector_stringNull: Self = StObject.set(x, "vector_string", null)
  }
}
