package typings.officeDashUiDashFabricDashReact.libComponentsCoachmarkCoachmarkDotBaseMod

import typings.officeDashUiDashFabricDashReact.libUtilitiesPositioningPositioningDotTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoachmarkState extends js.Object {
  /**
    * ARIA alert text to read aloud with Narrator once the Coachmark is mounted
    */
  var alertText: js.UndefOr[String] = js.undefined
  /**
    * The bottom position of the beak
    */
  var beakBottom: js.UndefOr[String] = js.undefined
  /**
    * The left position of the beak
    */
  var beakLeft: js.UndefOr[String] = js.undefined
  /**
    * The right position of the beak
    */
  var beakRight: js.UndefOr[String] = js.undefined
  /**
    * The right position of the beak
    */
  var beakTop: js.UndefOr[String] = js.undefined
  /**
    * Cached width and height of _entityInnerHostElement
    */
  var entityInnerHostRect: IEntityRect
  /**
    * Enables/Disables the beacon that radiates
    * from the center of the coachmark.
    */
  var isBeaconAnimating: Boolean
  /**
    * Is the Coachmark currently collapsed into
    * a tear drop shape
    */
  var isCollapsed: Boolean
  /**
    * Is the Coachmark done measuring the hosted entity
    */
  var isMeasured: Boolean
  /**
    * Is the teaching bubble currently retreiving the
    * original dimensions of the hosted entity.
    */
  var isMeasuring: Boolean
  /**
    * Is the mouse in proximity of the default target element
    */
  var isMouseInProximity: Boolean
  /**
    * Alignment edge of callout in relation to target
    */
  var targetAlignment: js.UndefOr[RectangleEdge] = js.undefined
  /**
    * Position of Coachmark/TeachingBubble in relation to target
    */
  var targetPosition: js.UndefOr[RectangleEdge] = js.undefined
  /**
    * Transform origin of teaching bubble callout
    */
  var transformOrigin: js.UndefOr[String] = js.undefined
}

object ICoachmarkState {
  @scala.inline
  def apply(
    entityInnerHostRect: IEntityRect,
    isBeaconAnimating: Boolean,
    isCollapsed: Boolean,
    isMeasured: Boolean,
    isMeasuring: Boolean,
    isMouseInProximity: Boolean,
    alertText: String = null,
    beakBottom: String = null,
    beakLeft: String = null,
    beakRight: String = null,
    beakTop: String = null,
    targetAlignment: RectangleEdge = null,
    targetPosition: RectangleEdge = null,
    transformOrigin: String = null
  ): ICoachmarkState = {
    val __obj = js.Dynamic.literal(entityInnerHostRect = entityInnerHostRect, isBeaconAnimating = isBeaconAnimating, isCollapsed = isCollapsed, isMeasured = isMeasured, isMeasuring = isMeasuring, isMouseInProximity = isMouseInProximity)
    if (alertText != null) __obj.updateDynamic("alertText")(alertText)
    if (beakBottom != null) __obj.updateDynamic("beakBottom")(beakBottom)
    if (beakLeft != null) __obj.updateDynamic("beakLeft")(beakLeft)
    if (beakRight != null) __obj.updateDynamic("beakRight")(beakRight)
    if (beakTop != null) __obj.updateDynamic("beakTop")(beakTop)
    if (targetAlignment != null) __obj.updateDynamic("targetAlignment")(targetAlignment)
    if (targetPosition != null) __obj.updateDynamic("targetPosition")(targetPosition)
    if (transformOrigin != null) __obj.updateDynamic("transformOrigin")(transformOrigin)
    __obj.asInstanceOf[ICoachmarkState]
  }
}

