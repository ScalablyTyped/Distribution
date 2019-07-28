package typings.poly2tri.poly2triMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("poly2tri", "PointError")
@js.native
class PointError protected () extends Error {
  /**
    * Custom exception class to indicate invalid Point values
    * @param message - error message
    * @param points - invalid points
    */
  def this(message: String, points: js.Array[XY]) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Invalid points
    */
  val points: js.Array[XY] = js.native
}

