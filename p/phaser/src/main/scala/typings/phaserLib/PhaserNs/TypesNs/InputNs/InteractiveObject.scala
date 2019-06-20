package typings
package phaserLib.PhaserNs.TypesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractiveObject extends js.Object {
  /**
    * The most recent Camera to be tested against this Interactive Object.
    */
  var camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  /**
    * Should this Interactive Object change the cursor (via css) when over? (desktop only)
    */
  var cursor: scala.Boolean | java.lang.String = js.native
  /**
    * Was the hitArea for this Interactive Object created based on texture size (false), or a custom shape? (true)
    */
  var customHitArea: scala.Boolean = js.native
  /**
    * The x coordinate of the Game Object that owns this Interactive Object when the drag started.
    */
  var dragStartX: scala.Double = js.native
  /**
    * The x coordinate that the Pointer started dragging this Interactive Object from.
    */
  var dragStartXGlobal: scala.Double = js.native
  /**
    * The y coordinate of the Game Object that owns this Interactive Object when the drag started.
    */
  var dragStartY: scala.Double = js.native
  /**
    * The y coordinate that the Pointer started dragging this Interactive Object from.
    */
  var dragStartYGlobal: scala.Double = js.native
  /**
    * The current drag state of this Interactive Object. 0 = Not being dragged, 1 = being checked for drag, or 2 = being actively dragged.
    */
  var dragState: phaserLib.phaserLibNumbers.`0` | phaserLib.phaserLibNumbers.`1` | phaserLib.phaserLibNumbers.`2` = js.native
  /**
    * The x coordinate that this Interactive Object is currently being dragged to.
    */
  var dragX: scala.Double = js.native
  /**
    * The y coordinate that this Interactive Object is currently being dragged to.
    */
  var dragY: scala.Double = js.native
  /**
    * Is this Interactive Object draggable? Enable with `InputPlugin.setDraggable`.
    */
  var draggable: scala.Boolean = js.native
  /**
    * Is this Interactive Object a drag-targets drop zone? Set when the object is created.
    */
  var dropZone: scala.Boolean = js.native
  /**
    * Is this Interactive Object currently enabled for input events?
    */
  var enabled: scala.Boolean = js.native
  /**
    * The Game Object to which this Interactive Object is bound.
    */
  var gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
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
    * The x coordinate that the Pointer interacted with this object on, relative to the Game Object's top-left position.
    */
  var localX: scala.Double = js.native
  /**
    * The y coordinate that the Pointer interacted with this object on, relative to the Game Object's top-left position.
    */
  var localY: scala.Double = js.native
  /**
    * An optional drop target for a draggable Interactive Object.
    */
  var target: phaserLib.PhaserNs.GameObjectsNs.GameObject = js.native
  /**
    * The 'contains' check callback that the hit area shape will use for all hit tests.
    */
  def hitAreaCallback(
    hitArea: js.Any,
    x: scala.Double,
    y: scala.Double,
    gameObject: phaserLib.PhaserNs.GameObjectsNs.GameObject
  ): scala.Unit = js.native
}

