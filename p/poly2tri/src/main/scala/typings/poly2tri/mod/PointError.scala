package typings.poly2tri.mod

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
  /**
    * Invalid points
    */
  val points: js.Array[XY] = js.native
}

