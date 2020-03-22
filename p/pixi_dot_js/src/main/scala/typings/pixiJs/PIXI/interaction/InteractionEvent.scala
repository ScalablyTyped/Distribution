package typings.pixiJs.PIXI.interaction

import typings.pixiJs.PIXI.DisplayObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event class that mimics native DOM events.
  *
  * @class
  * @memberof PIXI.interaction
  */
@JSGlobal("PIXI.interaction.InteractionEvent")
@js.native
class InteractionEvent () extends js.Object {
  /**
    * The object whose event listener’s callback is currently being invoked.
    *
    * @member {PIXI.DisplayObject} PIXI.interaction.InteractionEvent#currentTarget
    */
  var currentTarget: DisplayObject = js.native
  /**
    * InteractionData related to this event
    *
    * @member {PIXI.interaction.InteractionData} PIXI.interaction.InteractionEvent#data
    */
  var data: InteractionData = js.native
  /**
    * Whether this event will continue propagating in the tree.
    *
    * Remaining events for the {@link stopsPropagatingAt} object
    * will still be dispatched.
    *
    * @member {boolean} PIXI.interaction.InteractionEvent#stopped
    */
  var stopped: Boolean = js.native
  /**
    * The object which caused this event to be dispatched.
    * For listener callback see {@link PIXI.interaction.InteractionEvent.currentTarget}.
    *
    * @member {PIXI.DisplayObject} PIXI.interaction.InteractionEvent#target
    */
  var target: DisplayObject = js.native
  /**
    * Type of the event
    *
    * @member {string} PIXI.interaction.InteractionEvent#type
    */
  var `type`: String = js.native
  /**
    * Resets the event.
    */
  def reset(): Unit = js.native
  /**
    * Prevents event from reaching any objects other than the current object.
    *
    */
  def stopPropagation(): Unit = js.native
}

