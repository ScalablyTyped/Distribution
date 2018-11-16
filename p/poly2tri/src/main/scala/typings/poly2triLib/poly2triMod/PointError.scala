package typings
package poly2triLib.poly2triMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("poly2tri", "PointError")
@js.native
class PointError protected ()
  extends stdLib.Error {
  /**
       * Custom exception class to indicate invalid Point values
       * @param message - error message
       * @param points - invalid points
       */
  def this(message: java.lang.String, points: js.Array[XY]) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
       * Invalid points
       */
  val points: js.Array[XY] = js.native
}

