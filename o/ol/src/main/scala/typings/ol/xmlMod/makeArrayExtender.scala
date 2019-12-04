package typings.ol.xmlMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/xml", "makeArrayExtender")
@js.native
object makeArrayExtender extends js.Object {
  def apply[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[_], js.UndefOr[js.Array[_]]]
  ): Parser = js.native
  def apply[T](
    valueReader: js.ThisFunction2[/* this */ T, /* p0 */ Node, /* p1 */ js.Array[_], js.UndefOr[js.Array[_]]],
    opt_this: T
  ): Parser = js.native
}

