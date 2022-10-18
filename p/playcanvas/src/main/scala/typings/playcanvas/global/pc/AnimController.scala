package typings.playcanvas.global.pc

import typings.playcanvas.mod.AnimEvaluator
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('../../core/event-handler.js').EventHandler} EventHandler */
/** @typedef {import('../evaluator/anim-evaluator.js').AnimEvaluator} AnimEvaluator */
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
    * @param {AnimEvaluator} animEvaluator - The animation evaluator used to blend all current
    * playing animation keyframes and update the entities properties based on the current
    * animation values.
    * @param {object[]} states - The list of states used to form the controller state graph.
    * @param {object[]} transitions - The list of transitions used to form the controller state
    * graph.
    * @param {object[]} parameters - The anim components parameters.
    * @param {boolean} activate - Determines whether the anim controller should automatically play
    * once all {@link AnimNodes} are assigned animations.
    * @param {EventHandler} eventHandler - The event handler which should be notified with anim
    * events.
    * @param {Set} consumedTriggers - Used to set triggers back to their default state after they
    * have been consumed by a transition.
    */
  def this(
    animEvaluator: AnimEvaluator,
    states: js.Array[js.Object],
    transitions: js.Array[js.Object],
    parameters: js.Array[js.Object],
    activate: Boolean,
    eventHandler: typings.playcanvas.mod.EventHandler,
    consumedTriggers: Set[Any]
  ) = this()
}
