package typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningMod

import typings.atUifabricUtilities.libIRectangleMod.IRectangle
import typings.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.IPoint
import typings.std.Element
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", "getMaxHeight")
@js.native
object getMaxHeight extends js.Object {
  def apply(target: IPoint, targetEdge: DirectionalHint): Double = js.native
  def apply(target: IPoint, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def apply(target: IPoint, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def apply(
    target: IPoint,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def apply(target: Element, targetEdge: DirectionalHint): Double = js.native
  def apply(target: Element, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def apply(target: Element, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def apply(
    target: Element,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
  def apply(target: MouseEvent, targetEdge: DirectionalHint): Double = js.native
  def apply(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double): Double = js.native
  def apply(target: MouseEvent, targetEdge: DirectionalHint, gapSpace: Double, bounds: IRectangle): Double = js.native
  def apply(
    target: MouseEvent,
    targetEdge: DirectionalHint,
    gapSpace: Double,
    bounds: IRectangle,
    coverTarget: Boolean
  ): Double = js.native
}

