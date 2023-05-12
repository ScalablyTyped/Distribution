package typings.playcanvas.mod

import typings.playcanvas.anon.BlendType
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Anim Component allows an Entity to playback animations on models and entity properties.
  *
  * @augments Component
  */
@JSImport("playcanvas", "AnimComponent")
@js.native
open class AnimComponent protected () extends Component {
  /**
    * Create a new AnimComponent instance.
    *
    * @param {import('./system.js').AnimComponentSystem} system - The {@link ComponentSystem} that
    * created this Component.
    * @param {Entity} entity - The Entity that this Component is attached to.
    */
  def this(system: AnimComponentSystem, entity: Entity) = this()
  
  var _activate: Boolean = js.native
  
  def _addLayer(param0: BlendType): Any = js.native
  
  var _consumedTriggers: Set[Any] = js.native
  
  var _layers: js.Array[Any] = js.native
  
  var _normalizeWeights: Boolean = js.native
  
  def _onStateGraphAssetChangeEvent(asset: Any): Unit = js.native
  
  var _playing: Boolean = js.native
  
  var _rootBone: Any = js.native
  
  var _speed: Double = js.native
  
  var _stateGraph: Any = js.native
  
  var _stateGraphAsset: Any = js.native
  
  def activate: Boolean = js.native
  /**
    * If true the first animation will begin playing when the scene is loaded.
    *
    * @type {boolean}
    */
  def activate_=(arg: Boolean): Unit = js.native
  
  def addAnimationState(nodeName: Any, animTrack: Any): Unit = js.native
  def addAnimationState(nodeName: Any, animTrack: Any, speed: Double): Unit = js.native
  def addAnimationState(nodeName: Any, animTrack: Any, speed: Double, loop: Boolean): Unit = js.native
  def addAnimationState(nodeName: Any, animTrack: Any, speed: Double, loop: Boolean, layerName: String): Unit = js.native
  def addAnimationState(nodeName: Any, animTrack: Any, speed: Double, loop: Unit, layerName: String): Unit = js.native
  def addAnimationState(nodeName: Any, animTrack: Any, speed: Unit, loop: Boolean): Unit = js.native
  def addAnimationState(nodeName: Any, animTrack: Any, speed: Unit, loop: Boolean, layerName: String): Unit = js.native
  def addAnimationState(nodeName: Any, animTrack: Any, speed: Unit, loop: Unit, layerName: String): Unit = js.native
  
  /**
    * Adds a new anim component layer to the anim component.
    *
    * @param {string} name - The name of the layer to create.
    * @param {number} [weight] - The blending weight of the layer. Defaults to 1.
    * @param {object[]} [mask] - A list of paths to bones in the model which should be animated in
    * this layer. If omitted the full model is used. Defaults to null.
    * @param {string} [blendType] - Defines how properties animated by this layer blend with
    * animations of those properties in previous layers. Defaults to pc.ANIM_LAYER_OVERWRITE.
    * @returns {AnimComponentLayer} The created anim component layer.
    */
  def addLayer(name: String): AnimComponentLayer = js.native
  def addLayer(name: String, weight: Double): AnimComponentLayer = js.native
  def addLayer(name: String, weight: Double, mask: js.Array[js.Object]): AnimComponentLayer = js.native
  def addLayer(name: String, weight: Double, mask: js.Array[js.Object], blendType: String): AnimComponentLayer = js.native
  def addLayer(name: String, weight: Double, mask: Unit, blendType: String): AnimComponentLayer = js.native
  def addLayer(name: String, weight: Unit, mask: js.Array[js.Object]): AnimComponentLayer = js.native
  def addLayer(name: String, weight: Unit, mask: js.Array[js.Object], blendType: String): AnimComponentLayer = js.native
  def addLayer(name: String, weight: Unit, mask: Unit, blendType: String): AnimComponentLayer = js.native
  
  def animationAssets: js.Object = js.native
  def animationAssets_=(arg: js.Object): Unit = js.native
  
  /**
    * Associates an animation with a state or blend tree node in the loaded state graph. If all
    * states are linked and the {@link AnimComponent#activate} value was set to true then the
    * component will begin playing. If no state graph is loaded, a default state graph will be
    * created with a single state based on the provided nodePath parameter.
    *
    * @param {string} nodePath - Either the state name or the path to a blend tree node that this
    * animation should be associated with. Each section of a blend tree path is split using a
    * period (`.`) therefore state names should not include this character (e.g "MyStateName" or
    * "MyStateName.BlendTreeNode").
    * @param {object} animTrack - The animation track that will be assigned to this state and
    * played whenever this state is active.
    * @param {string} [layerName] - The name of the anim component layer to update. If omitted the
    * default layer is used. If no state graph has been previously loaded this parameter is
    * ignored.
    * @param {number} [speed] - Update the speed of the state you are assigning an animation to.
    * Defaults to 1.
    * @param {boolean} [loop] - Update the loop property of the state you are assigning an
    * animation to. Defaults to true.
    */
  def assignAnimation(nodePath: String, animTrack: js.Object): Unit = js.native
  def assignAnimation(nodePath: String, animTrack: js.Object, layerName: String): Unit = js.native
  def assignAnimation(nodePath: String, animTrack: js.Object, layerName: String, speed: Double): Unit = js.native
  def assignAnimation(nodePath: String, animTrack: js.Object, layerName: String, speed: Double, loop: Boolean): Unit = js.native
  def assignAnimation(nodePath: String, animTrack: js.Object, layerName: String, speed: Unit, loop: Boolean): Unit = js.native
  def assignAnimation(nodePath: String, animTrack: js.Object, layerName: Unit, speed: Double): Unit = js.native
  def assignAnimation(nodePath: String, animTrack: js.Object, layerName: Unit, speed: Double, loop: Boolean): Unit = js.native
  def assignAnimation(nodePath: String, animTrack: js.Object, layerName: Unit, speed: Unit, loop: Boolean): Unit = js.native
  
  /**
    * Returns the base layer of the state graph.
    *
    * @type {AnimComponentLayer|null}
    */
  def baseLayer: AnimComponentLayer = js.native
  
  def dirtifyTargets(): Unit = js.native
  
  /**
    * Finds a {@link AnimComponentLayer} in this component.
    *
    * @param {string} name - The name of the anim component layer to find.
    * @returns {AnimComponentLayer} Layer.
    */
  def findAnimationLayer(name: String): AnimComponentLayer = js.native
  
  /**
    * Returns a boolean parameter value by name.
    *
    * @param {string} name - The name of the boolean to return the value of.
    * @returns {boolean} A boolean.
    */
  def getBoolean(name: String): Boolean = js.native
  
  /**
    * Returns a float parameter value by name.
    *
    * @param {string} name - The name of the float to return the value of.
    * @returns {number} A float.
    */
  def getFloat(name: String): Double = js.native
  
  /**
    * Returns an integer parameter value by name.
    *
    * @param {string} name - The name of the integer to return the value of.
    * @returns {number} An integer.
    */
  def getInteger(name: String): Double = js.native
  
  def getParameterValue(name: Any, `type`: Any): Any = js.native
  
  /**
    * Returns a trigger parameter value by name.
    *
    * @param {string} name - The name of the trigger to return the value of.
    * @returns {boolean} A boolean.
    */
  def getTrigger(name: String): Boolean = js.native
  
  def layerIndices: js.Object = js.native
  def layerIndices_=(arg: js.Object): Unit = js.native
  
  /**
    * Returns the animation layers available in this anim component.
    *
    * @type {AnimComponentLayer[]}
    */
  def layers: js.Array[AnimComponentLayer] = js.native
  
  def loadAnimationAssets(): Unit = js.native
  
  /**
    * Initializes component animation controllers using the provided state graph.
    *
    * @param {object} stateGraph - The state graph asset to load into the component. Contains the
    * states, transitions and parameters used to define a complete animation controller.
    * @example
    * entity.anim.loadStateGraph({
    *     "layers": [
    *         {
    *             "name": layerName,
    *             "states": [
    *                 {
    *                     "name": "START",
    *                     "speed": 1
    *                 },
    *                 {
    *                     "name": "Initial State",
    *                     "speed": speed,
    *                     "loop": loop,
    *                     "defaultState": true
    *                 }
    *             ],
    *             "transitions": [
    *                 {
    *                     "from": "START",
    *                     "to": "Initial State"
    *                 }
    *             ]
    *         }
    *     ],
    *     "parameters": {}
    * });
    */
  def loadStateGraph(stateGraph: js.Object): Unit = js.native
  
  def normalizeWeights: Boolean = js.native
  /**
    * If true the animation component will normalize the weights of its layers by their sum total.
    *
    * @type {boolean}
    */
  def normalizeWeights_=(arg: Boolean): Unit = js.native
  
  def onAnimationAssetLoaded(layerName: Any, stateName: Any, asset: Any): Unit = js.native
  
  def onBeforeRemove(): Unit = js.native
  
  def parameters: js.Object = js.native
  def parameters_=(arg: js.Object): Unit = js.native
  
  /**
    * Returns whether all component layers are currently playable.
    *
    * @type {boolean}
    */
  def playable: Boolean = js.native
  
  def playing: Boolean = js.native
  /**
    * Plays or pauses all animations in the component.
    *
    * @type {boolean}
    */
  def playing_=(arg: Boolean): Unit = js.native
  
  /**
    * Rebind all of the components layers.
    */
  def rebind(): Unit = js.native
  
  /**
    * Removes animations from a node in the loaded state graph.
    *
    * @param {string} nodeName - The name of the node that should have its animation tracks removed.
    * @param {string} [layerName] - The name of the anim component layer to update. If omitted the
    * default layer is used.
    */
  def removeNodeAnimations(nodeName: String): Unit = js.native
  def removeNodeAnimations(nodeName: String, layerName: String): Unit = js.native
  
  /**
    * Removes all layers from the anim component.
    */
  def removeStateGraph(): Unit = js.native
  
  /**
    * Reset all of the components layers and parameters to their initial states. If a layer was
    * playing before it will continue playing.
    */
  def reset(): Unit = js.native
  
  /**
    * Resets the value of a trigger parameter that was defined in the animation components state
    * graph to false.
    *
    * @param {string} name - The name of the parameter to set.
    */
  def resetTrigger(name: String): Unit = js.native
  
  def resolveDuplicatedEntityReferenceProperties(oldAnim: Any, duplicatedIdsMap: Any): Unit = js.native
  
  def rootBone: Any = js.native
  /**
    * The entity that this anim component should use as the root of the animation hierarchy.
    *
    * @type {Entity}
    */
  def rootBone_=(arg: Any): Unit = js.native
  
  /**
    * Sets the value of a boolean parameter that was defined in the animation components state
    * graph.
    *
    * @param {string} name - The name of the parameter to set.
    * @param {boolean} value - The new boolean value to set this parameter to.
    */
  def setBoolean(name: String, value: Boolean): Unit = js.native
  
  /**
    * Sets the value of a float parameter that was defined in the animation components state graph.
    *
    * @param {string} name - The name of the parameter to set.
    * @param {number} value - The new float value to set this parameter to.
    */
  def setFloat(name: String, value: Double): Unit = js.native
  
  /**
    * Sets the value of an integer parameter that was defined in the animation components state
    * graph.
    *
    * @param {string} name - The name of the parameter to set.
    * @param {number} value - The new integer value to set this parameter to.
    */
  def setInteger(name: String, value: Double): Unit = js.native
  
  def setParameterValue(name: Any, `type`: Any, value: Any): Unit = js.native
  
  /**
    * Sets the value of a trigger parameter that was defined in the animation components state
    * graph to true.
    *
    * @param {string} name - The name of the parameter to set.
    * @param {boolean} [singleFrame] - If true, this trigger will be set back to false at the end
    * of the animation update. Defaults to false.
    */
  def setTrigger(name: String): Unit = js.native
  def setTrigger(name: String, singleFrame: Boolean): Unit = js.native
  
  def setupAnimationAssets(): Unit = js.native
  
  def speed: Double = js.native
  /**
    * Speed multiplier for animation play back speed. 1.0 is playback at normal speed, 0.0 pauses
    * the animation.
    *
    * @type {number}
    */
  def speed_=(arg: Double): Unit = js.native
  
  def stateGraph: Any = js.native
  
  def stateGraphAsset: Any = js.native
  def stateGraphAsset_=(arg: Any): Unit = js.native
  
  def stateGraph_=(arg: Any): Unit = js.native
  
  def targets: js.Object = js.native
  def targets_=(arg: js.Object): Unit = js.native
  
  def unbind(): Unit = js.native
  
  def update(dt: Any): Unit = js.native
}
