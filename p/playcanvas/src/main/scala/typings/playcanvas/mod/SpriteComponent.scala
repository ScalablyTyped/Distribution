package typings.playcanvas.mod

import org.scalablytyped.runtime.StringDictionary
import typings.playcanvas.anon.Loop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables an Entity to render a simple static sprite or sprite animations.
  *
  * @augments Component
  */
@JSImport("playcanvas", "SpriteComponent")
@js.native
open class SpriteComponent protected () extends Component {
  /**
    * Create a new SpriteComponent instance.
    *
    * @param {import('./system.js').SpriteComponentSystem} system - The ComponentSystem that
    * created this Component.
    * @param {import('../../entity.js').Entity} entity - The Entity that this Component is
    * attached to.
    */
  def this(system: SpriteComponentSystem, entity: Entity) = this()
  
  var _addedModel: Boolean = js.native
  
  var _atlasRect: Vec4 = js.native
  
  var _atlasRectUniform: js.typedarray.Float32Array = js.native
  
  var _autoPlayClip: Any = js.native
  
  var _batchGroup: Any = js.native
  
  var _batchGroupId: Double = js.native
  
  /**
    * Dictionary of sprite animation clips.
    *
    * @type {Object<string, SpriteAnimationClip>}
    * @private
    */
  /* private */ var _clips: Any = js.native
  
  var _color: Color = js.native
  
  var _colorUniform: js.typedarray.Float32Array = js.native
  
  /**
    * The sprite animation clip currently playing.
    *
    * @type {SpriteAnimationClip}
    * @private
    */
  /* private */ var _currentClip: Any = js.native
  
  var _defaultClip: SpriteAnimationClip = js.native
  
  var _drawOrder: Double = js.native
  
  var _flipX: Boolean = js.native
  
  var _flipY: Boolean = js.native
  
  var _height: Double = js.native
  
  def _hideModel(): Unit = js.native
  
  var _innerOffset: Vec4 = js.native
  
  var _innerOffsetUniform: js.typedarray.Float32Array = js.native
  
  var _layers: js.Array[Double] = js.native
  
  var _material: Any = js.native
  
  var _meshInstance: MeshInstance = js.native
  
  var _model: Model = js.native
  
  var _node: GraphNode = js.native
  
  def _onLayerAdded(layer: Any): Unit = js.native
  
  def _onLayerRemoved(layer: Any): Unit = js.native
  
  def _onLayersChanged(oldComp: Any, newComp: Any): Unit = js.native
  
  var _outerScale: Vec2 = js.native
  
  var _outerScaleUniform: js.typedarray.Float32Array = js.native
  
  def _showFrame(frame: Any): Unit = js.native
  
  def _showModel(): Unit = js.native
  
  var _speed: Double = js.native
  
  def _tryAutoPlay(): Unit = js.native
  
  var _type: String = js.native
  
  def _updateAabb(aabb: Any): Any = js.native
  
  var _updateAabbFunc: Any = js.native
  
  def _updateTransform(): Unit = js.native
  
  var _width: Double = js.native
  
  def aabb: Any = js.native
  
  /**
    * Creates and adds a new {@link SpriteAnimationClip} to the component's clips.
    *
    * @param {object} data - Data for the new animation clip.
    * @param {string} [data.name] - The name of the new animation clip.
    * @param {number} [data.fps] - Frames per second for the animation clip.
    * @param {boolean} [data.loop] - Whether to loop the animation clip.
    * @param {number|import('../../asset/asset.js').Asset} [data.spriteAsset] - The asset id or
    * the {@link Asset} of the sprite that this clip will play.
    * @returns {SpriteAnimationClip} The new clip that was added.
    */
  def addClip(data: Loop): SpriteAnimationClip = js.native
  
  def autoPlayClip: Any = js.native
  /**
    * The name of the clip to play automatically when the component is enabled and the clip exists.
    *
    * @type {string}
    */
  def autoPlayClip_=(arg: Any): Unit = js.native
  
  def batchGroupId: Double = js.native
  /**
    * Assign sprite to a specific batch group (see {@link BatchGroup}). Default is -1 (no group).
    *
    * @type {number}
    */
  def batchGroupId_=(arg: Double): Unit = js.native
  
  /**
    * Get an animation clip by name.
    *
    * @param {string} name - The name of the clip.
    * @returns {SpriteAnimationClip} The clip.
    */
  def clip(name: String): SpriteAnimationClip = js.native
  
  def clips: StringDictionary[SpriteAnimationClip] = js.native
  /**
    * A dictionary that contains {@link SpriteAnimationClip}s.
    *
    * @type {Object<string, SpriteAnimationClip>}
    */
  def clips_=(arg: StringDictionary[SpriteAnimationClip]): Unit = js.native
  
  def color: Color = js.native
  /**
    * The color tint of the sprite.
    *
    * @type {Color}
    */
  def color_=(arg: Color): Unit = js.native
  
  /**
    * The current clip being played.
    *
    * @type {SpriteAnimationClip}
    */
  def currentClip: SpriteAnimationClip = js.native
  
  def drawOrder: Double = js.native
  /**
    * The draw order of the component. A higher value means that the component will be rendered on
    * top of other components in the same layer. This is not used unless the layer's sort order is
    * set to {@link SORTMODE_MANUAL}.
    *
    * @type {number}
    */
  def drawOrder_=(arg: Double): Unit = js.native
  
  def flipX: Boolean = js.native
  /**
    * Flip the X axis when rendering a sprite.
    *
    * @type {boolean}
    */
  def flipX_=(arg: Boolean): Unit = js.native
  
  def flipY: Boolean = js.native
  /**
    * Flip the Y axis when rendering a sprite.
    *
    * @type {boolean}
    */
  def flipY_=(arg: Boolean): Unit = js.native
  
  def frame: Double = js.native
  /**
    * The frame counter of the sprite. Specifies which frame from the current sprite asset to
    * render.
    *
    * @type {number}
    */
  def frame_=(arg: Double): Unit = js.native
  
  def height: Double = js.native
  /**
    * The height of the sprite when rendering using 9-Slicing. The width and height are only used
    * when the render mode of the sprite asset is Sliced or Tiled.
    *
    * @type {number}
    */
  def height_=(arg: Double): Unit = js.native
  
  def layers: js.Array[Double] = js.native
  /**
    * An array of layer IDs ({@link Layer#id}) to which this sprite should belong.
    *
    * @type {number[]}
    */
  def layers_=(arg: js.Array[Double]): Unit = js.native
  
  def material: Any = js.native
  def material_=(arg: Any): Unit = js.native
  
  def onDestroy(): Unit = js.native
  
  def opacity: Double = js.native
  /**
    * The opacity of the sprite.
    *
    * @type {number}
    */
  def opacity_=(arg: Double): Unit = js.native
  
  /**
    * Pauses the current animation clip.
    */
  def pause(): Unit = js.native
  
  /**
    * Plays a sprite animation clip by name. If the animation clip is already playing then this
    * will do nothing.
    *
    * @param {string} name - The name of the clip to play.
    * @returns {SpriteAnimationClip} The clip that started playing.
    */
  def play(name: String): SpriteAnimationClip = js.native
  
  /**
    * Removes a clip by name.
    *
    * @param {string} name - The name of the animation clip to remove.
    */
  def removeClip(name: String): Unit = js.native
  
  def removeModelFromLayers(): Unit = js.native
  
  /**
    * Resumes the current paused animation clip.
    */
  def resume(): Unit = js.native
  
  def speed: Double = js.native
  /**
    * A global speed modifier used when playing sprite animation clips.
    *
    * @type {number}
    */
  def speed_=(arg: Double): Unit = js.native
  
  def sprite: Any = js.native
  
  def spriteAsset: Any = js.native
  /**
    * The asset id or the {@link Asset} of the sprite to render. Only works for
    * {@link SPRITETYPE_SIMPLE} sprites.
    *
    * @type {number|import('../../asset/asset.js').Asset}
    */
  def spriteAsset_=(arg: Any): Unit = js.native
  
  /**
    * The current sprite.
    *
    * @type {import('../../../scene/sprite.js').Sprite}
    */
  def sprite_=(arg: Any): Unit = js.native
  
  /**
    * Stops the current animation clip and resets it to the first frame.
    */
  def stop(): Unit = js.native
  
  def `type`: String = js.native
  /**
    * Fired when an animation clip starts playing.
    *
    * @event SpriteComponent#play
    * @param {SpriteAnimationClip} clip - The clip that started playing.
    */
  /**
    * Fired when an animation clip is paused.
    *
    * @event SpriteComponent#pause
    * @param {SpriteAnimationClip} clip - The clip that was paused.
    */
  /**
    * Fired when an animation clip is resumed.
    *
    * @event SpriteComponent#resume
    * @param {SpriteAnimationClip} clip - The clip that was resumed.
    */
  /**
    * Fired when an animation clip is stopped.
    *
    * @event SpriteComponent#stop
    * @param {SpriteAnimationClip} clip - The clip that was stopped.
    */
  /**
    * Fired when an animation clip stops playing because it reached its ending.
    *
    * @event SpriteComponent#end
    * @param {SpriteAnimationClip} clip - The clip that ended.
    */
  /**
    * Fired when an animation clip reached the end of its current loop.
    *
    * @event SpriteComponent#loop
    * @param {SpriteAnimationClip} clip - The clip.
    */
  /**
    * The type of the SpriteComponent. Can be:
    *
    * - {@link SPRITETYPE_SIMPLE}: The component renders a single frame from a sprite asset.
    * - {@link SPRITETYPE_ANIMATED}: The component can play sprite animation clips.
    *
    * Defaults to {@link SPRITETYPE_SIMPLE}.
    *
    * @type {string}
    */
  def type_=(arg: String): Unit = js.native
  
  def width: Double = js.native
  /**
    * The width of the sprite when rendering using 9-Slicing. The width and height are only used
    * when the render mode of the sprite asset is Sliced or Tiled.
    *
    * @type {number}
    */
  def width_=(arg: Double): Unit = js.native
}
