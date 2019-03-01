package typings
package pixiDotJsLib.PIXINs.glCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attrib extends js.Object {
  var attribute: pixiDotJsLib.Anon_Location
  var buffer: stdLib.ArrayBuffer
  var normalized: scala.Boolean
  var start: scala.Double
  var stride: scala.Double
}

object Attrib {
  @scala.inline
  def apply(
    attribute: pixiDotJsLib.Anon_Location,
    buffer: stdLib.ArrayBuffer,
    normalized: scala.Boolean,
    start: scala.Double,
    stride: scala.Double
  ): Attrib = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attribute")(attribute)
    __obj.updateDynamic("buffer")(buffer)
    __obj.updateDynamic("normalized")(normalized)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("stride")(stride)
    __obj.asInstanceOf[Attrib]
  }
}

