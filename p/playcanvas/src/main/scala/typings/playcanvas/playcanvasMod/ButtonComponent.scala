package typings.playcanvas.playcanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.ButtonComponent
  * @extends pc.Component
  * @classdesc A ButtonComponent enables a group of entities to behave like a button, with different visual states for hover and press interactions.
  * @description Create a new ButtonComponent.
  * @param {pc.ButtonComponentSystem} system The ComponentSystem that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  * @property {Boolean} active If set to false, the button will be visible but will not respond to hover or touch interactions.
  * @property {pc.Entity} imageEntity A reference to the entity to be used as the button background. The entity must have an ImageElement component.
  * @property {pc.Vec4} hitPadding Padding to be used in hit-test calculations. Can be used to expand the bounding box so that the button is easier to tap.
  * @property {Number} transitionMode Controls how the button responds when the user hovers over it/presses it.
  * @property {pc.Color} hoverTint Color to be used on the button image when the user hovers over it.
  * @property {pc.Color} pressedTint Color to be used on the button image when the user presses it.
  * @property {pc.Color} inactiveTint Color to be used on the button image when the button is not interactive.
  * @property {Number} fadeDuration Duration to be used when fading between tints, in milliseconds.
  * @property {pc.Asset} hoverSpriteAsset Sprite to be used as the button image when the user hovers over it.
  * @property {Number} hoverSpriteFrame Frame to be used from the hover sprite.
  * @property {pc.Asset} pressedSpriteAsset Sprite to be used as the button image when the user presses it.
  * @property {Number} pressedSpriteFrame Frame to be used from the pressed sprite.
  * @property {pc.Asset} inactiveSpriteAsset Sprite to be used as the button image when the button is not interactive.
  * @property {Number} inactiveSpriteFrame Frame to be used from the inactive sprite.
  */
@JSImport("playcanvas", "ButtonComponent")
@js.native
class ButtonComponent protected ()
  extends typings.playcanvas.pc.ButtonComponent {
  def this(system: typings.playcanvas.pc.ButtonComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

