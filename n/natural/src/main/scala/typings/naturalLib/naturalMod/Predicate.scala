package typings
package naturalLib.naturalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("natural", "Predicate")
@js.native
class Predicate protected () extends js.Object {
  def this(name: java.lang.String, parameter1: java.lang.String) = this()
  def this(name: java.lang.String, parameter1: java.lang.String, parameter2: java.lang.String) = this()
  var function: js.UndefOr[
    js.Function3[
      /* tagged_sentence */ js.Array[js.Array[java.lang.String]], 
      /* i */ scala.Double, 
      /* parameter */ java.lang.String, 
      scala.Boolean
    ]
  ] = js.native
  var name: java.lang.String = js.native
  var parameter1: java.lang.String = js.native
  var parameter2: js.UndefOr[java.lang.String] = js.native
  def evaluate(tagged_sentence: js.Array[js.Array[java.lang.String]], position: scala.Double): scala.Boolean = js.native
}

