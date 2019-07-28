package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "Predicate")
@js.native
class Predicate protected () extends js.Object {
  def this(name: String, parameter1: String) = this()
  def this(name: String, parameter1: String, parameter2: String) = this()
  var function: js.UndefOr[
    js.Function3[
      /* tagged_sentence */ js.Array[js.Array[String]], 
      /* i */ Double, 
      /* parameter */ String, 
      Boolean
    ]
  ] = js.native
  var name: String = js.native
  var parameter1: String = js.native
  var parameter2: js.UndefOr[String] = js.native
  def evaluate(tagged_sentence: js.Array[js.Array[String]], position: Double): Boolean = js.native
}

