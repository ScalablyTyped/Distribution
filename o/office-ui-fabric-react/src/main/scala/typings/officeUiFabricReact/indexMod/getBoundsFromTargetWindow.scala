package typings.officeUiFabricReact.indexMod

import typings.officeUiFabricReact.positioningPositioningMod.IWindowWithSegments
import typings.officeUiFabricReact.positioningTypesMod.Point
import typings.std.Element
import typings.std.MouseEvent
import typings.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/positioning/index", "getBoundsFromTargetWindow")
@js.native
object getBoundsFromTargetWindow extends js.Object {
  def apply(target: Null, targetWindow: IWindowWithSegments): IRectangle = js.native
  def apply(target: Point, targetWindow: IWindowWithSegments): IRectangle = js.native
  def apply(target: Element, targetWindow: IWindowWithSegments): IRectangle = js.native
  def apply(target: MouseEvent, targetWindow: IWindowWithSegments): IRectangle = js.native
}

