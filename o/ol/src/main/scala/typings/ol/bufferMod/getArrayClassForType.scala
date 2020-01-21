package typings.ol.bufferMod

import typings.std.Float32ArrayConstructor
import typings.std.Uint32ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/webgl/Buffer", "getArrayClassForType")
@js.native
object getArrayClassForType extends js.Object {
  def apply(`type`: Double): Float32ArrayConstructor | Uint32ArrayConstructor = js.native
}

