package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new ButtonComponent.
  * @property active - If set to false, the button will be visible but will not respond to hover or touch interactions.
  * @property imageEntity - A reference to the entity to be used as the button background. The entity must have an ImageElement component.
  * @property hitPadding - Padding to be used in hit-test calculations. Can be used to expand the bounding box so that the button is easier to tap.
  * @property transitionMode - Controls how the button responds when the user hovers over it/presses it.
  * @property hoverTint - Color to be used on the button image when the user hovers over it.
  * @property pressedTint - Color to be used on the button image when the user presses it.
  * @property inactiveTint - Color to be used on the button image when the button is not interactive.
  * @property fadeDuration - Duration to be used when fading between tints, in milliseconds.
  * @property hoverSpriteAsset - Sprite to be used as the button image when the user hovers over it.
  * @property hoverSpriteFrame - Frame to be used from the hover sprite.
  * @property pressedSpriteAsset - Sprite to be used as the button image when the user presses it.
  * @property pressedSpriteFrame - Frame to be used from the pressed sprite.
  * @property inactiveSpriteAsset - Sprite to be used as the button image when the button is not interactive.
  * @property inactiveSpriteFrame - Frame to be used from the inactive sprite.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@JSImport("playcanvas", "ButtonComponent")
@js.native
class ButtonComponent protected ()
  extends typings.playcanvas.pc.ButtonComponent {
  def this(system: typings.playcanvas.pc.ButtonComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}
