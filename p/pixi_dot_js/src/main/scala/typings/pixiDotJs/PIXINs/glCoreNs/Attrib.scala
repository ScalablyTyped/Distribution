package typings.pixiDotJs.PIXINs.glCoreNs

import typings.pixiDotJs.Anon_Location
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attrib extends js.Object {
  var attribute: Anon_Location
  var buffer: ArrayBuffer
  var normalized: Boolean
  var start: Double
  var stride: Double
}

object Attrib {
  @scala.inline
  def apply(attribute: Anon_Location, buffer: ArrayBuffer, normalized: Boolean, start: Double, stride: Double): Attrib = {
    val __obj = js.Dynamic.literal(attribute = attribute, buffer = buffer, normalized = normalized, start = start, stride = stride)
  
    __obj.asInstanceOf[Attrib]
  }
}

