package typings.openfin.utilsMod

import typings.openfin.shapesMod.Bounds
import typings.openfin.v2MainMod.View
import typings.std.ClientRect
import typings.std.DOMRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/platform/utils", "setViewBoundsByRect")
@js.native
object setViewBoundsByRect extends js.Object {
  def apply(rect: Bounds, ofView: View): js.Promise[View] = js.native
  def apply(rect: ClientRect, ofView: View): js.Promise[View] = js.native
  def apply(rect: DOMRect, ofView: View): js.Promise[View] = js.native
}

