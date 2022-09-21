package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ButtonComponent enables a group of entities to behave like a button, with different visual
  * states for hover and press interactions.
  *
  * @property {boolean} active If set to false, the button will be visible but will not respond to hover or touch interactions.
  * @property {Entity} imageEntity A reference to the entity to be used as the button background. The entity must have an ImageElement component.
  * @property {Vec4} hitPadding Padding to be used in hit-test calculations. Can be used to expand the bounding box so that the button is easier to tap.
  * @property {number} transitionMode Controls how the button responds when the user hovers over it/presses it.
  * @property {Color} hoverTint Color to be used on the button image when the user hovers over it.
  * @property {Color} pressedTint Color to be used on the button image when the user presses it.
  * @property {Color} inactiveTint Color to be used on the button image when the button is not interactive.
  * @property {number} fadeDuration Duration to be used when fading between tints, in milliseconds.
  * @property {Asset} hoverSpriteAsset Sprite to be used as the button image when the user hovers over it.
  * @property {number} hoverSpriteFrame Frame to be used from the hover sprite.
  * @property {Asset} pressedSpriteAsset Sprite to be used as the button image when the user presses it.
  * @property {number} pressedSpriteFrame Frame to be used from the pressed sprite.
  * @property {Asset} inactiveSpriteAsset Sprite to be used as the button image when the button is not interactive.
  * @property {number} inactiveSpriteFrame Frame to be used from the inactive sprite.
  * @augments Component
  */
@JSGlobal("pc.ButtonComponent")
@js.native
open class ButtonComponent protected ()
  extends typings.playcanvas.mod.ButtonComponent {
  /**
    * Create a new ButtonComponent instance.
    *
    * @param {ButtonComponentSystem} system - The ComponentSystem that created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: typings.playcanvas.mod.ButtonComponentSystem, entity: typings.playcanvas.mod.Entity) = this()
}
