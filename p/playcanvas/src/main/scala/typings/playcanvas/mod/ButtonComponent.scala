package typings.playcanvas.mod

import typings.playcanvas.anon.From
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ButtonComponent enables a group of entities to behave like a button, with different visual
  * states for hover and press interactions.
  *
  * @property {boolean} active If set to false, the button will be visible but will not respond to
  * hover or touch interactions.
  * @property {import('../../entity.js').Entity} imageEntity A reference to the entity to be used as
  * the button background. The entity must have an ImageElement component.
  * @property {import('../../../core/math/vec4.js').Vec4} hitPadding Padding to be used in hit-test
  * calculations. Can be used to expand the bounding box so that the button is easier to tap.
  * @property {number} transitionMode Controls how the button responds when the user hovers over
  * it/presses it.
  * @property {Color} hoverTint Color to be used on the button image when the user hovers over it.
  * @property {Color} pressedTint Color to be used on the button image when the user presses it.
  * @property {Color} inactiveTint Color to be used on the button image when the button is not
  * interactive.
  * @property {number} fadeDuration Duration to be used when fading between tints, in milliseconds.
  * @property {import('../../asset/asset.js').Asset} hoverSpriteAsset Sprite to be used as the
  * button image when the user hovers over it.
  * @property {number} hoverSpriteFrame Frame to be used from the hover sprite.
  * @property {import('../../asset/asset.js').Asset} pressedSpriteAsset Sprite to be used as the
  * button image when the user presses it.
  * @property {number} pressedSpriteFrame Frame to be used from the pressed sprite.
  * @property {import('../../asset/asset.js').Asset} inactiveSpriteAsset Sprite to be used as the
  * button image when the button is not interactive.
  * @property {number} inactiveSpriteFrame Frame to be used from the inactive sprite.
  * @augments Component
  */
@JSImport("playcanvas", "ButtonComponent")
@js.native
open class ButtonComponent protected () extends Component {
  /**
    * Create a new ButtonComponent instance.
    *
    * @param {import('./system.js').ButtonComponentSystem} system - The ComponentSystem that
    * created this component.
    * @param {import('../../entity.js').Entity} entity - The entity that this component is
    * attached to.
    */
  def this(system: ButtonComponentSystem, entity: Entity) = this()
  
  def _applySprite(spriteAsset: Any, spriteFrame: Any): Unit = js.native
  
  def _applyTint(tintColor: Any): Unit = js.native
  
  def _applyTintImmediately(tintColor: Any): Unit = js.native
  
  def _applyTintWithTween(tintColor: Any): Unit = js.native
  
  def _cancelTween(): Unit = js.native
  
  var _defaultSpriteAsset: Any = js.native
  
  var _defaultSpriteFrame: Double = js.native
  
  var _defaultTint: Color = js.native
  
  def _determineVisualState(): String = js.native
  
  def _fireIfActive(name: Any, event: Any): Unit = js.native
  
  def _forceReapplyVisualState(): Unit = js.native
  
  var _hasHitElementListeners: Boolean = js.native
  
  var _hoveringCounter: Double = js.native
  
  var _imageReference: EntityReference = js.native
  
  var _isApplyingSprite: Boolean = js.native
  
  var _isApplyingTint: Boolean = js.native
  
  var _isHovering: Boolean = js.native
  
  var _isPressed: Boolean = js.native
  
  def _onClick(event: Any): Unit = js.native
  
  def _onElementComponentAdd(entity: Any): Unit = js.native
  
  def _onElementComponentRemove(entity: Any): Unit = js.native
  
  def _onImageElementGain(): Unit = js.native
  
  def _onImageElementLose(): Unit = js.native
  
  def _onMouseDown(event: Any): Unit = js.native
  
  def _onMouseEnter(event: Any): Unit = js.native
  
  def _onMouseLeave(event: Any): Unit = js.native
  
  def _onMouseUp(event: Any): Unit = js.native
  
  def _onSelectEnd(event: Any): Unit = js.native
  
  def _onSelectEnter(event: Any): Unit = js.native
  
  def _onSelectLeave(event: Any): Unit = js.native
  
  def _onSelectStart(event: Any): Unit = js.native
  
  def _onSetActive(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def _onSetColor(color: Any): Unit = js.native
  
  def _onSetOpacity(opacity: Any): Unit = js.native
  
  def _onSetSpriteAsset(spriteAsset: Any): Unit = js.native
  
  def _onSetSpriteFrame(spriteFrame: Any): Unit = js.native
  
  def _onSetTransitionMode(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def _onSetTransitionValue(name: Any, oldValue: Any, newValue: Any): Unit = js.native
  
  def _onTouchCancel(event: Any): Unit = js.native
  
  def _onTouchEnd(event: Any): Unit = js.native
  
  def _onTouchLeave(event: Any): Unit = js.native
  
  def _onTouchStart(event: Any): Unit = js.native
  
  def _resetToDefaultVisualState(transitionMode: Any): Unit = js.native
  
  def _storeDefaultColor(color: Any): Unit = js.native
  
  def _storeDefaultOpacity(opacity: Any): Unit = js.native
  
  def _storeDefaultSpriteAsset(spriteAsset: Any): Unit = js.native
  
  def _storeDefaultSpriteFrame(spriteFrame: Any): Unit = js.native
  
  def _storeDefaultVisualState(): Unit = js.native
  
  def _toggleHitElementListeners(onOrOff: Any): Unit = js.native
  
  def _toggleLifecycleListeners(onOrOff: Any, system: Any): Unit = js.native
  
  var _tweenInfo: From = js.native
  
  def _updateTintTween(): Unit = js.native
  
  def _updateVisualState(force: Any): Unit = js.native
  
  var _visualState: String = js.native
  
  def active: Boolean = js.native
  def active_=(arg: Boolean): Unit = js.native
  
  def fadeDuration: Double = js.native
  def fadeDuration_=(arg: Double): Unit = js.native
  
  def hitPadding: Vec4 = js.native
  def hitPadding_=(arg: Vec4): Unit = js.native
  
  def hoverSpriteAsset: Asset_ = js.native
  def hoverSpriteAsset_=(arg: Asset_): Unit = js.native
  
  def hoverSpriteFrame: Double = js.native
  def hoverSpriteFrame_=(arg: Double): Unit = js.native
  
  def hoverTint: Color = js.native
  def hoverTint_=(arg: Color): Unit = js.native
  
  def imageEntity: Entity = js.native
  def imageEntity_=(arg: Entity): Unit = js.native
  
  def inactiveSpriteAsset: Asset_ = js.native
  def inactiveSpriteAsset_=(arg: Asset_): Unit = js.native
  
  def inactiveSpriteFrame: Double = js.native
  def inactiveSpriteFrame_=(arg: Double): Unit = js.native
  
  def inactiveTint: Color = js.native
  def inactiveTint_=(arg: Color): Unit = js.native
  
  def onRemove(): Unit = js.native
  
  def onUpdate(): Unit = js.native
  
  def pressedSpriteAsset: Asset_ = js.native
  def pressedSpriteAsset_=(arg: Asset_): Unit = js.native
  
  def pressedSpriteFrame: Double = js.native
  def pressedSpriteFrame_=(arg: Double): Unit = js.native
  
  def pressedTint: Color = js.native
  def pressedTint_=(arg: Color): Unit = js.native
  
  def transitionMode: Double = js.native
  def transitionMode_=(arg: Double): Unit = js.native
}
