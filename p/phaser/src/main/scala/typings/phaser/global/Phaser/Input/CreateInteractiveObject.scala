package typings.phaser.global.Phaser.Input

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Types.Input.HitAreaCallback
import typings.phaser.Phaser.Types.Input.InteractiveObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Input.CreateInteractiveObject")
@js.native
object CreateInteractiveObject extends js.Object {
  /**
    * Creates a new Interactive Object.
    * 
    * This is called automatically by the Input Manager when you enable a Game Object for input.
    * 
    * The resulting Interactive Object is mapped to the Game Object's `input` property.
    * @param gameObject The Game Object to which this Interactive Object is bound.
    * @param hitArea The hit area for this Interactive Object. Typically a geometry shape, like a Rectangle or Circle.
    * @param hitAreaCallback The 'contains' check callback that the hit area shape will use for all hit tests.
    */
  def apply(gameObject: GameObject, hitArea: js.Any, hitAreaCallback: HitAreaCallback): InteractiveObject = js.native
}

