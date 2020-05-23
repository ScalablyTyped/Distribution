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
trait InteractionEvent extends js.Object {
  /**
    * The object whose event listener’s callback is currently being invoked.
    *
    * @member {PIXI.DisplayObject} PIXI.interaction.InteractionEvent#currentTarget
    */
  var currentTarget: DisplayObject
  /**
    * InteractionData related to this event
    *
    * @member {PIXI.interaction.InteractionData} PIXI.interaction.InteractionEvent#data
    */
  var data: InteractionData
  /**
    * Whether this event will continue propagating in the tree.
    *
    * Remaining events for the {@link stopsPropagatingAt} object
    * will still be dispatched.
    *
    * @member {boolean} PIXI.interaction.InteractionEvent#stopped
    */
  var stopped: Boolean
  /**
    * The object which caused this event to be dispatched.
    * For listener callback see {@link PIXI.interaction.InteractionEvent.currentTarget}.
    *
    * @member {PIXI.DisplayObject} PIXI.interaction.InteractionEvent#target
    */
  var target: DisplayObject
  /**
    * Type of the event
    *
    * @member {string} PIXI.interaction.InteractionEvent#type
    */
  var `type`: String
  /**
    * Resets the event.
    */
  def reset(): Unit
  /**
    * Prevents event from reaching any objects other than the current object.
    *
    */
  def stopPropagation(): Unit
}

object InteractionEvent {
  @scala.inline
  def apply(
    currentTarget: DisplayObject,
    data: InteractionData,
    reset: () => Unit,
    stopPropagation: () => Unit,
    stopped: Boolean,
    target: DisplayObject,
    `type`: String
  ): InteractionEvent = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), stopPropagation = js.Any.fromFunction0(stopPropagation), stopped = stopped.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionEvent]
  }
}

