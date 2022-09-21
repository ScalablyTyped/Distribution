package typings.p5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Phrase extends StObject {
  
  /**
    *   Array of values to pass into the callback at each
    *   step of the phrase. Depending on the callback
    *   function's requirements, these values may be
    *   numbers, strings, or an object with multiple
    *   parameters. Zero (0) indicates a rest.
    */
  var sequence: js.Array[Any]
}
object Phrase {
  
  inline def apply(sequence: js.Array[Any]): Phrase = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phrase]
  }
  
  extension [Self <: Phrase](x: Self) {
    
    inline def setSequence(value: js.Array[Any]): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceVarargs(value: Any*): Self = StObject.set(x, "sequence", js.Array(value*))
  }
}
