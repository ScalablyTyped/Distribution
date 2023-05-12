package typings.playcanvas.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Animation Component allows an Entity to playback animations on models.
  *
  * @augments Component
  */
@JSImport("playcanvas", "AnimationComponent")
@js.native
open class AnimationComponent protected () extends Component {
  /**
    * Create a new AnimationComponent instance.
    *
    * @param {import('./system.js').AnimationComponentSystem} system - The {@link ComponentSystem}
    * that created this component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this component is
    * attached to.
    */
  def this(system: AnimationComponentSystem, entity: Entity) = this()
  
  /**
    * @type {Object<string, import('../../../scene/animation/animation.js').Animation>}
    * @private
    */
  /* private */ var _animations: Any = js.native
  
  /**
    * @type {Array.<number|Asset>}
    * @private
    */
  /* private */ var _assets: Any = js.native
  
  /** @private */
  /* private */ var _createAnimationController: Any = js.native
  
  /** @private */
  /* private */ var _loop: Any = js.native
  
  /** @private */
  /* private */ var _resetAnimationController: Any = js.native
  
  /** @private */
  /* private */ var _stopCurrentAnimation: Any = js.native
  
  /**
    * If true the first animation asset will begin playing when the scene is loaded.
    *
    * @type {boolean}
    */
  var activate: Boolean = js.native
  
  /**
    * @type {AnimEvaluator|null}
    * @ignore
    */
  var animEvaluator: AnimEvaluator | Null = js.native
  
  def animations: StringDictionary[Animation] = js.native
  
  /**
    * @type {Object<string, string>}
    * @ignore
    */
  var animationsIndex: StringDictionary[String] = js.native
  
  /**
    * Get or set dictionary of animations by name.
    *
    * @type {Object<string, import('../../../scene/animation/animation.js').Animation>}
    */
  def animations_=(arg: StringDictionary[Animation]): Unit = js.native
  
  def assets: js.Array[Double | Asset_] = js.native
  /**
    * The array of animation assets. Can also be an array of asset ids.
    *
    * @type {Array.<number|Asset>}
    */
  def assets_=(arg: js.Array[Double | Asset_]): Unit = js.native
  
  /** @private */
  /* private */ var blend: Any = js.native
  
  /** @private */
  /* private */ var blendSpeed: Any = js.native
  
  /** @private */
  /* private */ var blending: Any = js.native
  
  /**
    * @type {string|null}
    * @private
    */
  /* private */ var currAnim: Any = js.native
  
  def currentTime: Double = js.native
  /**
    * Get or set the current time position (in seconds) of the animation.
    *
    * @type {number}
    */
  def currentTime_=(arg: Double): Unit = js.native
  
  /**
    * Get the duration in seconds of the current animation. Returns 0 if no animation is playing.
    *
    * @type {number}
    */
  def duration: Double = js.native
  
  /**
    * @type {Skeleton|null}
    * @ignore
    */
  var fromSkel: Skeleton | Null = js.native
  
  /**
    * Return an animation.
    *
    * @param {string} name - The name of the animation asset.
    * @returns {import('../../../scene/animation/animation.js').Animation} An Animation.
    */
  def getAnimation(name: String): Animation = js.native
  
  /**
    * @param {number[]} ids - Array of animation asset ids.
    * @private
    */
  /* private */ var loadAnimationAssets: Any = js.native
  
  def loop: Boolean = js.native
  /**
    * If true the animation will restart from the beginning when it reaches the end.
    *
    * @type {boolean}
    */
  def loop_=(arg: Boolean): Unit = js.native
  
  /**
    * @type {import('../../../scene/model.js').Model|null}
    * @ignore
    */
  var model: Model | Null = js.native
  
  /**
    * Handle asset change events.
    *
    * @param {Asset} asset - The asset that changed.
    * @param {string} attribute - The name of the asset attribute that changed. Can be 'data',
    * 'file', 'resource' or 'resources'.
    * @param {*} newValue - The new value of the specified asset property.
    * @param {*} oldValue - The old value of the specified asset property.
    * @private
    */
  /* private */ var onAssetChanged: Any = js.native
  
  /**
    * @param {Asset} asset - The asset that was removed.
    * @private
    */
  /* private */ var onAssetRemoved: Any = js.native
  
  def onBeforeRemove(): Unit = js.native
  
  def onSetAnimations(): Unit = js.native
  
  /**
    * Start playing an animation.
    *
    * @param {string} name - The name of the animation asset to begin playing.
    * @param {number} [blendTime] - The time in seconds to blend from the current
    * animation state to the start of the animation being set. Defaults to 0.
    */
  def play(name: String): Unit = js.native
  def play(name: String, blendTime: Double): Unit = js.native
  
  var playing: Boolean = js.native
  
  /**
    * @type {string|null}
    * @private
    */
  /* private */ var prevAnim: Any = js.native
  
  /**
    * Set the model driven by this animation component.
    *
    * @param {import('../../../scene/model.js').Model} model - The model to set.
    * @ignore
    */
  def setModel(model: Model): Unit = js.native
  
  /**
    * Get the skeleton for the current model. If the model is loaded from glTF/glb, then the
    * skeleton is null.
    *
    * @type {Skeleton|null}
    */
  var skeleton: Skeleton | Null = js.native
  
  /**
    * Speed multiplier for animation play back. 1 is playback at normal speed and 0 pauses the
    * animation.
    *
    * @type {number}
    */
  var speed: Double = js.native
  
  /**
    * @type {Skeleton|null}
    * @ignore
    */
  var toSkel: Skeleton | Null = js.native
  
  /**
    * Update the state of the component.
    *
    * @param {number} dt - The time delta.
    * @ignore
    */
  def update(dt: Double): Unit = js.native
}
