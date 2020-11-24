package typings.officeUiFabricReact.coachmarkBaseMod

import typings.officeUiFabricReact.positioningTypesMod.RectangleEdge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICoachmarkState extends js.Object {
  
  /**
    * ARIA alert text to read aloud with Narrator once the Coachmark is mounted
    */
  var alertText: js.UndefOr[String] = js.native
  
  /**
    * The bottom position of the beak
    */
  var beakBottom: js.UndefOr[String] = js.native
  
  /**
    * The left position of the beak
    */
  var beakLeft: js.UndefOr[String] = js.native
  
  /**
    * The right position of the beak
    */
  var beakRight: js.UndefOr[String] = js.native
  
  /**
    * The right position of the beak
    */
  var beakTop: js.UndefOr[String] = js.native
  
  /**
    * Cached width and height of _entityInnerHostElement
    */
  var entityInnerHostRect: IEntityRect = js.native
  
  /**
    * Enables/Disables the beacon that radiates
    * from the center of the coachmark.
    */
  var isBeaconAnimating: Boolean = js.native
  
  /**
    * Is the Coachmark currently collapsed into
    * a tear drop shape
    */
  var isCollapsed: Boolean = js.native
  
  /**
    * Is the Coachmark done measuring the hosted entity
    */
  var isMeasured: Boolean = js.native
  
  /**
    * Is the teaching bubble currently retreiving the
    * original dimensions of the hosted entity.
    */
  var isMeasuring: Boolean = js.native
  
  /**
    * Is the mouse in proximity of the default target element
    */
  var isMouseInProximity: Boolean = js.native
  
  /**
    * Alignment edge of callout in relation to target
    */
  var targetAlignment: js.UndefOr[RectangleEdge] = js.native
  
  /**
    * Position of Coachmark/TeachingBubble in relation to target
    */
  var targetPosition: js.UndefOr[RectangleEdge] = js.native
  
  /**
    * Transform origin of teaching bubble callout
    */
  var transformOrigin: js.UndefOr[String] = js.native
}
object ICoachmarkState {
  
  @scala.inline
  def apply(
    entityInnerHostRect: IEntityRect,
    isBeaconAnimating: Boolean,
    isCollapsed: Boolean,
    isMeasured: Boolean,
    isMeasuring: Boolean,
    isMouseInProximity: Boolean
  ): ICoachmarkState = {
    val __obj = js.Dynamic.literal(entityInnerHostRect = entityInnerHostRect.asInstanceOf[js.Any], isBeaconAnimating = isBeaconAnimating.asInstanceOf[js.Any], isCollapsed = isCollapsed.asInstanceOf[js.Any], isMeasured = isMeasured.asInstanceOf[js.Any], isMeasuring = isMeasuring.asInstanceOf[js.Any], isMouseInProximity = isMouseInProximity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICoachmarkState]
  }
  
  @scala.inline
  implicit class ICoachmarkStateOps[Self <: ICoachmarkState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEntityInnerHostRect(value: IEntityRect): Self = this.set("entityInnerHostRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBeaconAnimating(value: Boolean): Self = this.set("isBeaconAnimating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCollapsed(value: Boolean): Self = this.set("isCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMeasured(value: Boolean): Self = this.set("isMeasured", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMeasuring(value: Boolean): Self = this.set("isMeasuring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMouseInProximity(value: Boolean): Self = this.set("isMouseInProximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertText(value: String): Self = this.set("alertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlertText: Self = this.set("alertText", js.undefined)
    
    @scala.inline
    def setBeakBottom(value: String): Self = this.set("beakBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeakBottom: Self = this.set("beakBottom", js.undefined)
    
    @scala.inline
    def setBeakLeft(value: String): Self = this.set("beakLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeakLeft: Self = this.set("beakLeft", js.undefined)
    
    @scala.inline
    def setBeakRight(value: String): Self = this.set("beakRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeakRight: Self = this.set("beakRight", js.undefined)
    
    @scala.inline
    def setBeakTop(value: String): Self = this.set("beakTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeakTop: Self = this.set("beakTop", js.undefined)
    
    @scala.inline
    def setTargetAlignment(value: RectangleEdge): Self = this.set("targetAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetAlignment: Self = this.set("targetAlignment", js.undefined)
    
    @scala.inline
    def setTargetPosition(value: RectangleEdge): Self = this.set("targetPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetPosition: Self = this.set("targetPosition", js.undefined)
    
    @scala.inline
    def setTransformOrigin(value: String): Self = this.set("transformOrigin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformOrigin: Self = this.set("transformOrigin", js.undefined)
  }
}
