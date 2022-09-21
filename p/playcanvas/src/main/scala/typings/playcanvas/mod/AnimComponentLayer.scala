package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./component.js').AnimComponent} AnimComponent */
/** @typedef {import('../../../asset/asset.js').Asset} Asset */
/**
  * The Anim Component Layer allows managers a single layer of the animation state graph.
  */
@JSImport("playcanvas", "AnimComponentLayer")
@js.native
open class AnimComponentLayer protected () extends StObject {
  /**
    * Create a new AnimComponentLayer instance.
    *
    * @param {string} name - The name of the layer.
    * @param {object} controller - The controller to manage this layers animations.
    * @param {AnimComponent} component - The component that this layer is a member of.
    * @param {number} [weight] - The weight of this layer. Defaults to 1.
    * @param {string} [blendType] - The blend type of this layer. Defaults to {@link ANIM_LAYER_OVERWRITE}.
    * @param {boolean} [normalizedWeight] - Whether the weight of this layer should be normalized using the total weight of all layers.
    */
  def this(name: String, controller: js.Object, component: AnimComponent) = this()
  def this(name: String, controller: js.Object, component: AnimComponent, weight: Double) = this()
  def this(name: String, controller: js.Object, component: AnimComponent, weight: Double, blendType: String) = this()
  def this(name: String, controller: js.Object, component: AnimComponent, weight: Unit, blendType: String) = this()
  def this(
    name: String,
    controller: js.Object,
    component: AnimComponent,
    weight: Double,
    blendType: String,
    normalizedWeight: Boolean
  ) = this()
  def this(
    name: String,
    controller: js.Object,
    component: AnimComponent,
    weight: Double,
    blendType: Unit,
    normalizedWeight: Boolean
  ) = this()
  def this(
    name: String,
    controller: js.Object,
    component: AnimComponent,
    weight: Unit,
    blendType: String,
    normalizedWeight: Boolean
  ) = this()
  def this(
    name: String,
    controller: js.Object,
    component: AnimComponent,
    weight: Unit,
    blendType: Unit,
    normalizedWeight: Boolean
  ) = this()
  
  var _blendTime: Double = js.native
  
  var _blendTimeElapsed: Double = js.native
  
  var _blendType: String = js.native
  
  var _component: AnimComponent = js.native
  
  var _controller: Any = js.native
  
  var _mask: Any = js.native
  
  var _name: String = js.native
  
  var _normalizedWeight: Boolean = js.native
  
  var _startingWeight: Double = js.native
  
  var _targetWeight: Double = js.native
  
  var _weight: Double = js.native
  
  /**
    * Returns the currently active state name.
    *
    * @type {string}
    */
  def activeState: String = js.native
  
  def activeStateCurrentTime: Any = js.native
  /**
    * The active states time in seconds.
    *
    * @type {number}
    */
  def activeStateCurrentTime_=(arg: Any): Unit = js.native
  
  /**
    * Returns the currently active states duration.
    *
    * @type {number}
    */
  def activeStateDuration: Double = js.native
  
  /**
    * Returns the currently active states progress as a value normalized by the states animation
    * duration. Looped animations will return values greater than 1.
    *
    * @type {number}
    */
  def activeStateProgress: Double = js.native
  
  /**
    * Assigns an animation track to a state or blend tree node in the current graph. If a state
    * for the given nodePath doesn't exist, it will be created. If all states nodes are linked and
    * the {@link AnimComponent#activate} value was set to true then the component will begin
    * playing.
    *
    * @param {string} nodePath - Either the state name or the path to a blend tree node that this
    * animation should be associated with. Each section of a blend tree path is split using a
    * period (`.`) therefore state names should not include this character (e.g "MyStateName" or
    * "MyStateName.BlendTreeNode").
    * @param {object} animTrack - The animation track that will be assigned to this state and
    * played whenever this state is active.
    * @param {number} [speed] - Update the speed of the state you are assigning an animation to.
    * Defaults to 1.
    * @param {boolean} [loop] - Update the loop property of the state you are assigning an
    * animation to. Defaults to true.
    */
  def assignAnimation(nodePath: String, animTrack: js.Object): Unit = js.native
  def assignAnimation(nodePath: String, animTrack: js.Object, speed: Double): Unit = js.native
  def assignAnimation(nodePath: String, animTrack: js.Object, speed: Double, loop: Boolean): Unit = js.native
  def assignAnimation(nodePath: String, animTrack: js.Object, speed: Unit, loop: Boolean): Unit = js.native
  
  /**
    * Add a mask to this layer.
    *
    * @param {object} [mask] - The mask to assign to the layer. If not provided the current mask
    * in the layer will be removed.
    * @example
    * entity.anim.baseLayer.assignMask({
    *     // include the spine of the current model and all of its children
    *     "path/to/spine": {
    *         children: true
    *     },
    *     // include the hip of the current model but not all of its children
    *     "path/to/hip": true
    * });
    * @ignore
    */
  def assignMask(): Unit = js.native
  def assignMask(mask: js.Object): Unit = js.native
  
  /**
    * Blend from the current weight value to the provided weight value over a given amount of time.
    *
    * @param {number} weight - The new weight value to blend to.
    * @param {number} time - The duration of the blend in seconds.
    */
  def blendToWeight(weight: Double, time: Double): Unit = js.native
  
  def blendType: String = js.native
  def blendType_=(arg: String): Unit = js.native
  
  /**
    * Returns the asset that is associated with the given state.
    *
    * @param {string} stateName - The name of the state to get the asset for.
    * @returns {Asset} The asset associated with the given state.
    */
  def getAnimationAsset(stateName: String): Asset_ = js.native
  
  def mask: Any = js.native
  /**
    * A mask of bones which should be animated or ignored by this layer.
    *
    * @type {object}
    * @example
    * entity.anim.baseLayer.mask = {
    *     // include the spine of the current model and all of its children
    *     "path/to/spine": {
    *         children: true
    *     },
    *     // include the hip of the current model but not all of its children
    *     "path/to/hip": true
    * };
    */
  def mask_=(arg: Any): Unit = js.native
  
  /**
    * Returns the name of the layer.
    *
    * @type {string}
    */
  def name: String = js.native
  
  /**
    * Pause the animation in the current state.
    */
  def pause(): Unit = js.native
  
  /**
    * Start playing the animation in the current state.
    *
    * @param {string} [name] - If provided, will begin playing from the start of the state with
    * this name.
    */
  def play(): Unit = js.native
  def play(name: String): Unit = js.native
  
  /**
    * Returns true if a state graph has been loaded and all states in the graph have been assigned
    * animation tracks.
    *
    * @type {string}
    */
  def playable: String = js.native
  
  def playing: Any = js.native
  /**
    * Whether this layer is currently playing.
    *
    * @type {string}
    */
  def playing_=(arg: Any): Unit = js.native
  
  /**
    * Returns the previously active state name.
    *
    * @type {string}
    */
  def previousState: String = js.native
  
  /**
    * Rebind any animations in the layer to the currently present components and model of the anim
    * components entity.
    */
  def rebind(): Unit = js.native
  
  /**
    * Removes animations from a node in the loaded state graph.
    *
    * @param {string} nodeName - The name of the node that should have its animation tracks removed.
    */
  def removeNodeAnimations(nodeName: String): Unit = js.native
  
  /**
    * Reset the animation component to its initial state, including all parameters. The system
    * will be paused.
    */
  def reset(): Unit = js.native
  
  /**
    * Lists all available states in this layers state graph.
    *
    * @type {string[]}
    */
  def states: js.Array[String] = js.native
  
  /**
    * Transition to any state in the current layers graph. Transitions can be instant or take an
    * optional blend time.
    *
    * @param {string} to - The state that this transition will transition to.
    * @param {number} [time] - The duration of the transition in seconds. Defaults to 0.
    * @param {number} [transitionOffset] - If provided, the destination state will begin playing
    * its animation at this time. Given in normalized time, based on the states duration & must be
    * between 0 and 1. Defaults to null.
    */
  def transition(to: String): Unit = js.native
  def transition(to: String, time: Double): Unit = js.native
  def transition(to: String, time: Double, transitionOffset: Double): Unit = js.native
  def transition(to: String, time: Unit, transitionOffset: Double): Unit = js.native
  
  /**
    * If the anim component layer is currently transitioning between states, returns the progress.
    * Otherwise returns null.
    *
    * @type {number|null}
    */
  def transitionProgress: Double = js.native
  
  /**
    * Returns whether the anim component layer is currently transitioning between states.
    *
    * @type {boolean}
    */
  def transitioning: Boolean = js.native
  
  def update(dt: Any): Unit = js.native
  
  def weight: Double = js.native
  /**
    * The blending weight of this layer. Used when calculating the value of properties that are
    * animated by more than one layer.
    *
    * @type {number}
    */
  def weight_=(arg: Double): Unit = js.native
}
