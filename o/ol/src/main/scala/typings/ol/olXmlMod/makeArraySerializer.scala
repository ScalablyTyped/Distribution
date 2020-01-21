package typings.ol.olXmlMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/xml", "makeArraySerializer")
@js.native
object makeArraySerializer extends js.Object {
  def apply[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Element, /* p1 */ V, /* p2 */ js.Array[_], Unit]
  ): Serializer = js.native
  def apply[T, V](
    nodeWriter: js.ThisFunction3[/* this */ T, /* p0 */ Element, /* p1 */ V, /* p2 */ js.Array[_], Unit],
    opt_this: T
  ): Serializer = js.native
}

