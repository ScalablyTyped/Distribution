package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The AnimController manages the animations for its entity, based on the provided state graph and
  * parameters. Its update method determines which state the controller should be in based on the
  * current time, parameters and available states / transitions. It also ensures the AnimEvaluator
  * is supplied with the correct animations, based on the currently active state.
  *
  * @ignore
  */
@JSGlobal("pc.AnimController")
@js.native
open class AnimController protected ()
  extends typings.playcanvas.mod.AnimController {
  /**
    * Create a new AnimController.
    *
    * @param {import('../evaluator/anim-evaluator.js').AnimEvaluator} animEvaluator - The
    * animation evaluator used to blend all current playing animation keyframes and update the
    * entities properties based on the current animation values.
    * @param {object[]} states - The list of states used to form the controller state graph.
    * @param {object[]} transitions - The list of transitions used to form the controller state
    * graph.
    * @param {boolean} activate - Determines whether the anim controller should automatically play
    * once all {@link AnimNodes} are assigned animations.
    * @param {import('../../../core/event-handler.js').EventHandler} eventHandler - The event
    * handler which should be notified with anim events.
    * @param {Function} findParameter - Retrieves a parameter which is used to control the transition between states.
    * @param {Function} consumeTrigger - Used to set triggers back to their default state after they
    * have been consumed by a transition.
    */
  def this(
    animEvaluator: typings.playcanvas.mod.AnimEvaluator,
    states: js.Array[js.Object],
    transitions: js.Array[js.Object],
    activate: Boolean,
    eventHandler: typings.playcanvas.mod.EventHandler,
    findParameter: js.Function,
    consumeTrigger: js.Function
  ) = this()
}
