package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "TransformationRule")
@js.native
class TransformationRule protected () extends js.Object {
  def this(c1: java.lang.String, c2: java.lang.String, predicate: java.lang.String, parameter1: java.lang.String) = this()
  def this(c1: java.lang.String, c2: java.lang.String, predicate: java.lang.String, parameter1: java.lang.String, parameter2: java.lang.String) = this()
  var literal: js.Array[java.lang.String] = js.native
  var new_category: java.lang.String = js.native
  var old_category: java.lang.String = js.native
  var predicate: Predicate = js.native
  @JSName("apply")
  def apply(tagged_sentence: js.Array[js.Array[java.lang.String]], position: scala.Double): scala.Unit = js.native
}

