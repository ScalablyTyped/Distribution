package typings.ol.styleAtlasManagerMod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AtlasManager extends js.Object {
  def add(
    id: String,
    width: Double,
    height: Double,
    renderCallback: js.Function3[/* p0 */ CanvasRenderingContext2D, /* p1 */ Double, /* p2 */ Double, Unit]
  ): AtlasManagerInfo = js.native
  def add(
    id: String,
    width: Double,
    height: Double,
    renderCallback: js.Function3[/* p0 */ CanvasRenderingContext2D, /* p1 */ Double, /* p2 */ Double, Unit],
    opt_renderHitCallback: js.Function0[Unit]
  ): AtlasManagerInfo = js.native
  def add(
    id: String,
    width: Double,
    height: Double,
    renderCallback: js.Function3[/* p0 */ CanvasRenderingContext2D, /* p1 */ Double, /* p2 */ Double, Unit],
    opt_renderHitCallback: js.Function0[Unit],
    opt_this: js.Any
  ): AtlasManagerInfo = js.native
  def getInfo(id: String): AtlasManagerInfo = js.native
}

