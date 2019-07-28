package typings.natural.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "TransformationRule")
@js.native
class TransformationRule protected () extends js.Object {
  def this(c1: String, c2: String, predicate: String, parameter1: String) = this()
  def this(c1: String, c2: String, predicate: String, parameter1: String, parameter2: String) = this()
  var literal: js.Array[String] = js.native
  var new_category: String = js.native
  var old_category: String = js.native
  var predicate: Predicate = js.native
  @JSName("apply")
  def apply(tagged_sentence: js.Array[js.Array[String]], position: Double): Unit = js.native
}

