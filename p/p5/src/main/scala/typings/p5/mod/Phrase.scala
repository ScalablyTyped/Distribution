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
  var sequence: js.Array[js.Any]
}
object Phrase {
  
  @scala.inline
  def apply(sequence: js.Array[js.Any]): Phrase = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phrase]
  }
  
  @scala.inline
  implicit class PhraseMutableBuilder[Self <: Phrase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSequence(value: js.Array[js.Any]): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceVarargs(value: js.Any*): Self = StObject.set(x, "sequence", js.Array(value :_*))
  }
}
