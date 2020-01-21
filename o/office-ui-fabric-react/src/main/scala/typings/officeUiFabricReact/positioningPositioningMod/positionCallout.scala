package typings.officeUiFabricReact.positioningPositioningMod

import typings.officeUiFabricReact.positioningTypesMod.ICalloutPositionedInfo
import typings.officeUiFabricReact.positioningTypesMod.IPositionProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/positioning/positioning", "positionCallout")
@js.native
object positionCallout extends js.Object {
  def apply(props: IPositionProps, hostElement: HTMLElement, elementToPosition: HTMLElement): ICalloutPositionedInfo = js.native
  def apply(
    props: IPositionProps,
    hostElement: HTMLElement,
    elementToPosition: HTMLElement,
    previousPositions: ICalloutPositionedInfo
  ): ICalloutPositionedInfo = js.native
}

