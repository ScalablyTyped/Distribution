package typings.phaser.Phaser.Types.Input

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Shape
import typings.phaser.phaserNumbers.`0`
import typings.phaser.phaserNumbers.`1`
import typings.phaser.phaserNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractiveObject extends js.Object {
  /**
    * An Interactive Object that is 'always enabled' will receive input even if the parent object is invisible or won't render.
    */
  var alwaysEnabled: Boolean = js.native
  /**
    * The most recent Camera to be tested against this Interactive Object.
    */
  var camera: Camera = js.native
  /**
    * Should this Interactive Object change the cursor (via css) when over? (desktop only)
    */
  var cursor: Boolean | String = js.native
  /**
    * Was the hitArea for this Interactive Object created based on texture size (false), or a custom shape? (true)
    */
  var customHitArea: Boolean = js.native
  /**
    * The x coordinate of the Game Object that owns this Interactive Object when the drag started.
    */
  var dragStartX: Double = js.native
  /**
    * The x coordinate that the Pointer started dragging this Interactive Object from.
    */
  var dragStartXGlobal: Double = js.native
  /**
    * The y coordinate of the Game Object that owns this Interactive Object when the drag started.
    */
  var dragStartY: Double = js.native
  /**
    * The y coordinate that the Pointer started dragging this Interactive Object from.
    */
  var dragStartYGlobal: Double = js.native
  /**
    * The current drag state of this Interactive Object. 0 = Not being dragged, 1 = being checked for drag, or 2 = being actively dragged.
    */
  var dragState: `0` | `1` | `2` = js.native
  /**
    * The x coordinate that this Interactive Object is currently being dragged to.
    */
  var dragX: Double = js.native
  /**
    * The y coordinate that this Interactive Object is currently being dragged to.
    */
  var dragY: Double = js.native
  /**
    * Is this Interactive Object draggable? Enable with `InputPlugin.setDraggable`.
    */
  var draggable: Boolean = js.native
  /**
    * Is this Interactive Object a drag-targets drop zone? Set when the object is created.
    */
  var dropZone: Boolean = js.native
  /**
    * Is this Interactive Object currently enabled for input events?
    */
  var enabled: Boolean = js.native
  /**
    * The Game Object to which this Interactive Object is bound.
    */
  var gameObject: GameObject = js.native
  /**
    * The hit area for this Interactive Object. Typically a geometry shape, like a Rectangle or Circle.
    */
  var hitArea: js.Any = js.native
  /**
    * The 'contains' check callback that the hit area shape will use for all hit tests.
    */
  @JSName("hitAreaCallback")
  var hitAreaCallback_Original: HitAreaCallback = js.native
  /**
    * If this Interactive Object has been enabled for debug, via `InputPlugin.enableDebug` then this property holds its debug shape.
    */
  var hitAreaDebug: Shape = js.native
  /**
    * The x coordinate that the Pointer interacted with this object on, relative to the Game Object's top-left position.
    */
  var localX: Double = js.native
  /**
    * The y coordinate that the Pointer interacted with this object on, relative to the Game Object's top-left position.
    */
  var localY: Double = js.native
  /**
    * An optional drop target for a draggable Interactive Object.
    */
  var target: GameObject = js.native
  /**
    * The 'contains' check callback that the hit area shape will use for all hit tests.
    */
  def hitAreaCallback(hitArea: js.Any, x: Double, y: Double, gameObject: GameObject): Unit = js.native
}

