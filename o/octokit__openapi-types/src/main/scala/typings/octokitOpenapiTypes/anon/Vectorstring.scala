package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vectorstring extends StObject {
  
  /** @description The CVSS score. */
  var score: Double | Null
  
  /** @description The CVSS vector. */
  var vector_string: String | Null
}
object Vectorstring {
  
  inline def apply(): Vectorstring = {
    val __obj = js.Dynamic.literal(score = null, vector_string = null)
    __obj.asInstanceOf[Vectorstring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Vectorstring] (val x: Self) extends AnyVal {
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreNull: Self = StObject.set(x, "score", null)
    
    inline def setVector_string(value: String): Self = StObject.set(x, "vector_string", value.asInstanceOf[js.Any])
    
    inline def setVector_stringNull: Self = StObject.set(x, "vector_string", null)
  }
}
