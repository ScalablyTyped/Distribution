package typings.phaser.PhaserNs.InputNs

import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.phaser.PhaserNs.TexturesNs.TextureManager
import typings.phaser.PhaserNs.TypesNs.InputNs.HitAreaCallback
import typings.phaser.PhaserNs.TypesNs.InputNs.InteractiveObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Input")
@js.native
object ^ extends js.Object {
  /**
    * The mouse pointer is being held down.
    */
  var MOUSE_DOWN: integer = js.native
  /**
    * The mouse pointer is being moved.
    */
  var MOUSE_MOVE: integer = js.native
  /**
    * The mouse pointer is released.
    */
  var MOUSE_UP: integer = js.native
  /**
    * The mouse wheel changes.
    */
  var MOUSE_WHEEL: integer = js.native
  /**
    * The pointer lock has changed.
    */
  var POINTER_LOCK_CHANGE: integer = js.native
  /**
    * A touch pointer has been been cancelled by the browser.
    */
  var TOUCH_CANCEL: integer = js.native
  /**
    * A touch pointer has been started.
    */
  var TOUCH_END: integer = js.native
  /**
    * A touch pointer has been started.
    */
  var TOUCH_MOVE: integer = js.native
  /**
    * A touch pointer has been started.
    */
  var TOUCH_START: integer = js.native
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
  def CreateInteractiveObject(gameObject: GameObject, hitArea: js.Any, hitAreaCallback: HitAreaCallback): InteractiveObject = js.native
  /**
    * Creates a new Pixel Perfect Handler function.
    * 
    * Access via `InputPlugin.makePixelPerfect` rather than calling it directly.
    * @param textureManager A reference to the Texture Manager.
    * @param alphaTolerance The alpha level that the pixel should be above to be included as a successful interaction.
    */
  def CreatePixelPerfectHandler(textureManager: TextureManager, alphaTolerance: integer): js.Function = js.native
}

