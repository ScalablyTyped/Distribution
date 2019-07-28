package typings.p5.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Phrase extends js.Object {
  /**
    *   Array of values to pass into the callback at each
    *   step of the phrase. Depending on the callback
    *   function's requirements, these values may be
    *   numbers, strings, or an object with multiple
    *   parameters. Zero (0) indicates a rest.
    */
  var sequence: js.Array[_]
}

object Phrase {
  @scala.inline
  def apply(sequence: js.Array[_]): Phrase = {
    val __obj = js.Dynamic.literal(sequence = sequence)
  
    __obj.asInstanceOf[Phrase]
  }
}

