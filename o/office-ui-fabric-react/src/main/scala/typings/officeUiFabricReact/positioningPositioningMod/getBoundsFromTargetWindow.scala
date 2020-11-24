package typings.officeUiFabricReact.positioningPositioningMod

import typings.officeUiFabricReact.positioningTypesMod.IWindowWithSegments
import typings.std.Element
import typings.std.MouseEvent
import typings.uifabricUtilities.irectangleMod.IRectangle
import typings.uifabricUtilities.pointMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", "getBoundsFromTargetWindow")
@js.native
object getBoundsFromTargetWindow extends js.Object {
  
  def apply(target: Null, targetWindow: IWindowWithSegments): IRectangle = js.native
  def apply(target: Element, targetWindow: IWindowWithSegments): IRectangle = js.native
  def apply(target: MouseEvent, targetWindow: IWindowWithSegments): IRectangle = js.native
  def apply(target: Point, targetWindow: IWindowWithSegments): IRectangle = js.native
}
