package typings
package officeDashUiDashFabricDashReactLib.libComponentsCoachmarkCoachmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICoachmarkState extends js.Object {
  /**
       * ARIA alert text to read aloud with Narrator once the Coachmark is mounted
       */
  var alertText: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The bottom position of the beak
       */
  var beakBottom: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The left position of the beak
       */
  var beakLeft: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The right position of the beak
       */
  var beakRight: js.UndefOr[java.lang.String] = js.undefined
  /**
       * The right position of the beak
       */
  var beakTop: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Cached width and height of _entityInnerHostElement
       */
  var entityInnerHostRect: IEntityRect
  /**
       * Enables/Disables the beacon that radiates
       * from the center of the coachmark.
       */
  var isBeaconAnimating: scala.Boolean
  /**
       * Is the Coachmark currently collapsed into
       * a tear drop shape
       */
  var isCollapsed: scala.Boolean
  /**
       * Is the Coachmark done measuring the hosted entity
       */
  var isMeasured: scala.Boolean
  /**
       * Is the teaching bubble currently retreiving the
       * original dimensions of the hosted entity.
       */
  var isMeasuring: scala.Boolean
  /**
       * Is the mouse in proximity of the default target element
       */
  var isMouseInProximity: scala.Boolean
  /**
       * Alignment edge of callout in relation to target
       */
  var targetAlignment: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
  ] = js.undefined
  /**
       * Position of Coachmark/TeachingBubble in relation to target
       */
  var targetPosition: js.UndefOr[
    officeDashUiDashFabricDashReactLib.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
  ] = js.undefined
  /**
       * Transform origin of teaching bubble callout
       */
  var transformOrigin: js.UndefOr[java.lang.String] = js.undefined
}

