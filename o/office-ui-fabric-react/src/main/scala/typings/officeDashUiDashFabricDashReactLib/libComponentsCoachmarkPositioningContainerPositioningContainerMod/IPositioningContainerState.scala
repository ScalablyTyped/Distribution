package typings
package officeDashUiDashFabricDashReactLib.libComponentsCoachmarkPositioningContainerPositioningContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPositioningContainerState extends js.Object {
  /**
       * Tracks the current height offset and updates during
       * the height animation when props.finalHeight is specified.
       */
  var heightOffset: js.UndefOr[scala.Double] = js.undefined
  /**
       * Current set of calcualted positions for the outermost parent container.
       */
  var positions: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.IPositionedData
  ] = js.undefined
}

