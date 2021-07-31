package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event class that mimics native DOM events.
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "InteractionEvent")
@js.native
class InteractionEvent ()
  extends StObject
     with typings.pixiJs.PIXI.InteractionEvent {
  
  /**
    * The object whose event listener’s callback is currently being invoked.
    *
    * @member {PIXI.DisplayObject} PIXI.InteractionEvent#currentTarget
    */
  /* CompleteClass */
  var currentTarget: typings.pixiJs.PIXI.DisplayObject = js.native
  
  /**
    * InteractionData related to this event
    *
    * @member {PIXI.InteractionData} PIXI.InteractionEvent#data
    */
  /* CompleteClass */
  var data: typings.pixiJs.PIXI.InteractionData = js.native
  
  /**
    * Resets the event.
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /**
    * Prevents event from reaching any objects other than the current object.
    *
    */
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
  
  /**
    * Whether this event will continue propagating in the tree.
    *
    * Remaining events for the {@link stopsPropagatingAt} object
    * will still be dispatched.
    *
    * @member {boolean} PIXI.InteractionEvent#stopped
    */
  /* CompleteClass */
  var stopped: Boolean = js.native
  
  /**
    * The object which caused this event to be dispatched.
    * For listener callback see {@link PIXI.InteractionEvent.currentTarget}.
    *
    * @member {PIXI.DisplayObject} PIXI.InteractionEvent#target
    */
  /* CompleteClass */
  var target: typings.pixiJs.PIXI.DisplayObject = js.native
  
  /**
    * Type of the event
    *
    * @member {string} PIXI.InteractionEvent#type
    */
  /* CompleteClass */
  var `type`: String = js.native
}
