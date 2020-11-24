package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phrase extends js.Object {
  
  /**
    *   Array of values to pass into the callback at each
    *   step of the phrase. Depending on the callback
    *   function's requirements, these values may be
    *   numbers, strings, or an object with multiple
    *   parameters. Zero (0) indicates a rest.
    */
  var sequence: js.Array[_] = js.native
}
object Phrase {
  
  @scala.inline
  def apply(sequence: js.Array[_]): Phrase = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phrase]
  }
  
  @scala.inline
  implicit class PhraseOps[Self <: Phrase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSequenceVarargs(value: js.Any*): Self = this.set("sequence", js.Array(value :_*))
    
    @scala.inline
    def setSequence(value: js.Array[_]): Self = this.set("sequence", value.asInstanceOf[js.Any])
  }
}
