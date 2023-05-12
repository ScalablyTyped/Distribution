package typings.playcanvas.mod

import typings.std.Set
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
@JSImport("playcanvas", "AnimController")
@js.native
open class AnimController protected () extends StObject {
  /**
    * Create a new AnimController.
    *
    * @param {import('../evaluator/anim-evaluator.js').AnimEvaluator} animEvaluator - The
    * animation evaluator used to blend all current playing animation keyframes and update the
    * entities properties based on the current animation values.
    * @param {object[]} states - The list of states used to form the controller state graph.
    * @param {object[]} transitions - The list of transitions used to form the controller state
    * graph.
    * @param {object[]} parameters - The anim components parameters.
    * @param {boolean} activate - Determines whether the anim controller should automatically play
    * once all {@link AnimNodes} are assigned animations.
    * @param {import('../../../core/event-handler.js').EventHandler} eventHandler - The event
    * handler which should be notified with anim events.
    * @param {Set} consumedTriggers - Used to set triggers back to their default state after they
    * have been consumed by a transition.
    */
  def this(
    animEvaluator: AnimEvaluator,
    states: js.Array[js.Object],
    transitions: js.Array[js.Object],
    parameters: js.Array[js.Object],
    activate: Boolean,
    eventHandler: EventHandler,
    consumedTriggers: Set[Any]
  ) = this()
  
  var _activate: Boolean = js.native
  
  var _activeStateName: String = js.native
  
  var _animEvaluator: AnimEvaluator = js.native
  
  var _consumedTriggers: Set[Any] = js.native
  
  var _currTransitionTime: Double = js.native
  
  var _eventHandler: EventHandler = js.native
  
  def _findState(stateName: Any): Any = js.native
  
  def _findTransition(from: Any, to: Any): Any = js.native
  
  def _findTransitionsBetweenStates(sourceStateName: Any, destinationStateName: Any): Any = js.native
  
  def _findTransitionsFromState(stateName: Any): Any = js.native
  
  def _getActiveStateProgressForTime(time: Any): Double = js.native
  
  var _isTransitioning: Boolean = js.native
  
  var _parameters: js.Array[Any] = js.native
  
  var _playing: Boolean = js.native
  
  var _previousStateName: Any = js.native
  
  var _stateNames: js.Array[Any] = js.native
  
  var _timeInState: Double = js.native
  
  var _timeInStateBefore: Double = js.native
  
  var _totalTransitionTime: Double = js.native
  
  def _transitionHasConditionsMet(transition: Any): Boolean = js.native
  
  var _transitionInterruptionSource: String = js.native
  
  var _transitionPreviousStates: js.Array[Any] = js.native
  
  def _transitionToState(newStateName: Any): Unit = js.native
  
  var _transitions: js.Array[AnimTransition] = js.native
  
  def activeState: Any = js.native
  
  def activeStateAnimations: Any = js.native
  
  def activeStateCurrentTime: Double = js.native
  def activeStateCurrentTime_=(arg: Double): Unit = js.native
  
  def activeStateDuration: Double = js.native
  
  def activeStateName: String = js.native
  
  def activeStateProgress: Double = js.native
  
  def activeState_=(arg: Any): Unit = js.native
  
  def animEvaluator: AnimEvaluator = js.native
  
  def assignAnimation(pathString: Any, animTrack: Any, speed: Any, loop: Any): Unit = js.native
  
  def assignMask(mask: Any): Any = js.native
  
  def findParameter(name: Any): Any = js.native
  
  def pause(): Unit = js.native
  
  def play(stateName: Any): Unit = js.native
  
  def playable: Boolean = js.native
  
  def playing: Boolean = js.native
  def playing_=(arg: Boolean): Unit = js.native
  
  def previousState: Any = js.native
  
  def previousStateName: Any = js.native
  
  def previousState_=(arg: Any): Unit = js.native
  
  def rebind(): Unit = js.native
  
  def removeNodeAnimations(nodeName: Any): Boolean = js.native
  
  def reset(): Unit = js.native
  
  def states: js.Array[Any] = js.native
  
  def transitionProgress: Double = js.native
  
  def transitioning: Boolean = js.native
  
  def update(dt: Any): Unit = js.native
  
  def updateStateFromTransition(transition: Any): Unit = js.native
}
