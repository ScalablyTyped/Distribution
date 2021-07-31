package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
@js.native
trait ButtonComponent
  extends StObject
     with Component {
  
  /**
    * If set to false, the button will be visible but will not respond to hover or touch interactions.
    */
  var active: Boolean = js.native
  
  /**
    * Duration to be used when fading between tints, in milliseconds.
    */
  var fadeDuration: Double = js.native
  
  /**
    * Padding to be used in hit-test calculations. Can be used to expand the bounding box so that the button is easier to tap.
    */
  var hitPadding: Vec4 = js.native
  
  /**
    * Sprite to be used as the button image when the user hovers over it.
    */
  var hoverSpriteAsset: Asset = js.native
  
  /**
    * Frame to be used from the hover sprite.
    */
  var hoverSpriteFrame: Double = js.native
  
  /**
    * Color to be used on the button image when the user hovers over it.
    */
  var hoverTint: Color = js.native
  
  /**
    * A reference to the entity to be used as the button background. The entity must have an ImageElement component.
    */
  var imageEntity: Entity = js.native
  
  /**
    * Sprite to be used as the button image when the button is not interactive.
    */
  var inactiveSpriteAsset: Asset = js.native
  
  /**
    * Frame to be used from the inactive sprite.
    */
  var inactiveSpriteFrame: Double = js.native
  
  /**
    * Color to be used on the button image when the button is not interactive.
    */
  var inactiveTint: Color = js.native
  
  /**
    * Sprite to be used as the button image when the user presses it.
    */
  var pressedSpriteAsset: Asset = js.native
  
  /**
    * Frame to be used from the pressed sprite.
    */
  var pressedSpriteFrame: Double = js.native
  
  /**
    * Color to be used on the button image when the user presses it.
    */
  var pressedTint: Color = js.native
  
  /**
    * Controls how the button responds when the user hovers over it/presses it.
    */
  var transitionMode: Double = js.native
}
