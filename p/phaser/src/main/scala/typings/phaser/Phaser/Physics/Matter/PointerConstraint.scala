package typings.phaser.Phaser.Physics.Matter

import typings.phaser.MatterJS.BodyType
import typings.phaser.MatterJS.ConstraintType
import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.Input.Pointer
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Pointer Constraint is a special type of constraint that allows you to click
  * and drag bodies in a Matter World. It monitors the active Pointers in a Scene,
  * and when one is pressed down it checks to see if that hit any part of any active
  * body in the world. If it did, and the body has input enabled, it will begin to
  * drag it until either released, or you stop it via the `stopDrag` method.
  * 
  * You can adjust the stiffness, length and other properties of the constraint via
  * the `options` object on creation.
  */
trait PointerConstraint extends StObject {
  
  /**
    * Is this Constraint active or not?
    * 
    * An active constraint will be processed each update. An inactive one will be skipped.
    * Use this to toggle a Pointer Constraint on and off.
    */
  var active: Boolean
  
  /**
    * The body that is currently being dragged, if any.
    */
  var body: BodyType | Null
  
  /**
    * The Camera the Pointer was interacting with when the input
    * down event was processed.
    */
  var camera: Camera
  
  /**
    * The native Matter Constraint that is used to attach to bodies.
    */
  var constraint: ConstraintType
  
  /**
    * Destroys this Pointer Constraint instance and all of its references.
    */
  def destroy(): Unit
  
  /**
    * Scans all active bodies in the current Matter World to see if any of them
    * are hit by the Pointer. The _first one_ found to hit is set as the active contraint
    * body.
    */
  def getBody(): Boolean
  
  /**
    * Scans the current body to determine if a part of it was clicked on.
    * If a part is found the body is set as the `constraint.bodyB` property,
    * as well as the `body` property of this class. The part is also set.
    * @param body The Matter Body to check.
    * @param position A translated hit test position.
    */
  def hitTestBody(body: BodyType, position: Vector2): Boolean
  
  /**
    * A Pointer has been pressed down onto the Scene.
    * 
    * If this Constraint doesn't have an active Pointer then a hit test is set to
    * run against all active bodies in the world during the _next_ call to `update`.
    * If a body is found, it is bound to this constraint and the drag begins.
    * @param pointer A reference to the Pointer that was pressed.
    */
  def onDown(pointer: Pointer): Unit
  
  /**
    * A Pointer has been released from the Scene. If it was the one this constraint was using, it's cleared.
    * @param pointer A reference to the Pointer that was pressed.
    */
  def onUp(pointer: Pointer): Unit
  
  /**
    * The part of the body that was clicked on to start the drag.
    */
  var part: BodyType | Null
  
  /**
    * A reference to the Input Pointer that activated this Constraint.
    * This is set in the `onDown` handler.
    */
  var pointer: Pointer
  
  /**
    * The internal transformed position.
    */
  var position: Vector2
  
  /**
    * A reference to the Scene to which this Pointer Constraint belongs.
    * This is the same Scene as the Matter World instance.
    */
  var scene: Scene
  
  /**
    * Stops the Pointer Constraint from dragging the body any further.
    * 
    * This is called automatically if the Pointer is released while actively
    * dragging a body. Or, you can call it manually to release a body from a
    * constraint without having to first release the pointer.
    */
  def stopDrag(): Unit
  
  /**
    * Internal update handler. Called in the Matter BEFORE_UPDATE step.
    */
  def update(): Unit
  
  /**
    * A reference to the Matter World instance to which this Constraint belongs.
    */
  var world: World
}
object PointerConstraint {
  
  inline def apply(
    active: Boolean,
    camera: Camera,
    constraint: ConstraintType,
    destroy: () => Unit,
    getBody: () => Boolean,
    hitTestBody: (BodyType, Vector2) => Boolean,
    onDown: Pointer => Unit,
    onUp: Pointer => Unit,
    pointer: Pointer,
    position: Vector2,
    scene: Scene,
    stopDrag: () => Unit,
    update: () => Unit,
    world: World
  ): PointerConstraint = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], camera = camera.asInstanceOf[js.Any], constraint = constraint.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), getBody = js.Any.fromFunction0(getBody), hitTestBody = js.Any.fromFunction2(hitTestBody), onDown = js.Any.fromFunction1(onDown), onUp = js.Any.fromFunction1(onUp), pointer = pointer.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], stopDrag = js.Any.fromFunction0(stopDrag), update = js.Any.fromFunction0(update), world = world.asInstanceOf[js.Any], body = null, part = null)
    __obj.asInstanceOf[PointerConstraint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointerConstraint] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setBody(value: BodyType): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setCamera(value: Camera): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setConstraint(value: ConstraintType): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setGetBody(value: () => Boolean): Self = StObject.set(x, "getBody", js.Any.fromFunction0(value))
    
    inline def setHitTestBody(value: (BodyType, Vector2) => Boolean): Self = StObject.set(x, "hitTestBody", js.Any.fromFunction2(value))
    
    inline def setOnDown(value: Pointer => Unit): Self = StObject.set(x, "onDown", js.Any.fromFunction1(value))
    
    inline def setOnUp(value: Pointer => Unit): Self = StObject.set(x, "onUp", js.Any.fromFunction1(value))
    
    inline def setPart(value: BodyType): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartNull: Self = StObject.set(x, "part", null)
    
    inline def setPointer(value: Pointer): Self = StObject.set(x, "pointer", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Vector2): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setScene(value: Scene): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setStopDrag(value: () => Unit): Self = StObject.set(x, "stopDrag", js.Any.fromFunction0(value))
    
    inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    
    inline def setWorld(value: World): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
  }
}
