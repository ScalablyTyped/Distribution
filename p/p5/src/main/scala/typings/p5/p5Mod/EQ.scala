package typings.p5.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EQ extends Effect {
  /**
    *   The p5.EQ is built with abstracted p5.Filter
    *   objects. To modify any bands, use methods of the
    *   p5.Filter API, especially gain and freq. Bands are
    *   stored in an array, with indices 0 - 3, or 0 - 7
    */
  var bands: js.Array[_] = js.native
  /**
    *   Process an input by connecting it to the EQ
    *   @param src Audio source
    */
  def process(src: js.Object): Unit = js.native
}

