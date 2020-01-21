package typings.playcanvas.pc

import typings.playcanvas.AnonFps
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @constructor
  * @name pc.SpriteComponent
  * @extends pc.Component
  * @classdesc Enables an Entity to render a simple static sprite or sprite animations.
  * @param {pc.SpriteComponentSystem} system The ComponentSystem that created this Component
  * @param {pc.Entity} entity The Entity that this Component is attached to.
  * @property {String} type The type of the SpriteComponent. Can be one of the following:
  * <ul>
  *     <li>pc.SPRITETYPE_SIMPLE: The component renders a single frame from a sprite asset.
  *     <li>pc.SPRITETYPE_ANIMATED: The component can play sprite animation clips.
  * </ul>
  * @property {Number} frame The frame counter of the sprite. Specifies which frame from the current sprite asset to render.
  * @property {Number} spriteAsset The id of the sprite asset to render. Only works for {@link pc.SPRITETYPE_SIMPLE} types.
  * @property {pc.Sprite} sprite The current sprite.
  * @property {Number} width The width of the sprite when rendering using 9-Slicing. The width and height are only used when the render mode of the sprite asset is Sliced or Tiled.
  * @property {Number} height The height of the sprite when rendering using 9-Slicing. The width and height are only used when the render mode of the sprite asset is Sliced or Tiled.
  * @property {pc.Color} color The color tint of the sprite.
  * @property {Number} opacity The opacity of the sprite.
  * @property {Boolean} flipX Flip the X axis when rendering a sprite.
  * @property {Boolean} flipY Flip the Y axis when rendering a sprite.
  * @property {Object} clips A dictionary that contains {@link pc.SpriteAnimationClip}s.
  * @property {pc.SpriteAnimationClip} currentClip The current clip being played.
  * @property {Number} speed A global speed modifier used when playing sprite animation clips.
  * @property {Number} batchGroupId Assign sprite to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
  * @property {String} autoPlayClip The name of the clip to play automatically when the component is enabled and the clip exists.
  * @property {Number[]} layers An array of layer IDs ({@link pc.Layer#id}) to which this sprite should belong.
  * @property {Number} drawOrder The draw order of the component. A higher value means that the component will be rendered on top of other components in the same layer.
  */
@JSGlobal("pc.SpriteComponent")
@js.native
class SpriteComponent protected () extends Component {
  def this(system: SpriteComponentSystem, entity: Entity) = this()
  /**
    * The name of the clip to play automatically when the component is enabled and the clip exists.
    */
  var autoPlayClip: String = js.native
  /**
    * Assign sprite to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
    */
  var batchGroupId: Double = js.native
  /**
    * A dictionary that contains {@link pc.SpriteAnimationClip}s.
    */
  var clips: js.Any = js.native
  /**
    * The color tint of the sprite.
    */
  var color: Color = js.native
  /**
    * The current clip being played.
    */
  var currentClip: SpriteAnimationClip = js.native
  /**
    * The draw order of the component. A higher value means that the component will be rendered on top of other components in the same layer.
    */
  var drawOrder: Double = js.native
  /**
    * Flip the X axis when rendering a sprite.
    */
  var flipX: Boolean = js.native
  /**
    * Flip the Y axis when rendering a sprite.
    */
  var flipY: Boolean = js.native
  /**
    * The frame counter of the sprite. Specifies which frame from the current sprite asset to render.
    */
  var frame: Double = js.native
  /**
    * The height of the sprite when rendering using 9-Slicing. The width and height are only used when the render mode of the sprite asset is Sliced or Tiled.
    */
  var height: Double = js.native
  /**
    * An array of layer IDs ({@link pc.Layer#id}) to which this sprite should belong.
    */
  var layers: js.Array[Number] = js.native
  /**
    * The opacity of the sprite.
    */
  var opacity: Double = js.native
  /**
    * A global speed modifier used when playing sprite animation clips.
    */
  var speed: Double = js.native
  /**
    * The current sprite.
    */
  var sprite: Sprite = js.native
  /**
    * The id of the sprite asset to render. Only works for {@link pc.SPRITETYPE_SIMPLE} types.
    */
  var spriteAsset: Double = js.native
  /**
    * The type of the SpriteComponent. Can be one of the following:
    * <ul>
    * <li>pc.SPRITETYPE_SIMPLE: The component renders a single frame from a sprite asset.
    * <li>pc.SPRITETYPE_ANIMATED: The component can play sprite animation clips.
    * </ul>
    */
  var `type`: String = js.native
  /**
    * The width of the sprite when rendering using 9-Slicing. The width and height are only used when the render mode of the sprite asset is Sliced or Tiled.
    */
  var width: Double = js.native
  /**
    * @function
    * @name pc.SpriteComponent#addClip
    * @description Creates and adds a new {@link pc.SpriteAnimationClip} to the component's clips.
    * @param {Object} data Data for the new animation clip.
    * @param {String} [data.name] The name of the new animation clip.
    * @param {Number} [data.fps] Frames per second for the animation clip.
    * @param {Object} [data.loop] Whether to loop the animation clip.
    * @param {Number} [data.spriteAsset] The id of the sprite asset that this clip will play.
    * @returns {pc.SpriteAnimationClip} The new clip that was added.
    */
  def addClip(data: AnonFps): SpriteAnimationClip = js.native
  /**
    * @function
    * @name pc.SpriteComponent#clip
    * @description Get an animation clip by name.
    * @param {String} name The name of the clip.
    * @returns {pc.SpriteAnimationClip} The clip.
    */
  def clip(name: String): SpriteAnimationClip = js.native
  /**
    * @function
    * @name pc.SpriteComponent#pause
    * @description Pauses the current animation clip.
    */
  def pause(): Unit = js.native
  /**
    * @function
    * @name pc.SpriteComponent#play
    * @description Plays a sprite animation clip by name. If the animation clip is already playing then this will do nothing.
    * @param {String} name The name of the clip to play.
    * @returns {pc.SpriteAnimationClip} The clip that started playing.
    */
  def play(name: String): SpriteAnimationClip = js.native
  /**
    * @function
    * @name pc.SpriteComponent#removeClip
    * @description Removes a clip by name.
    * @param {String} name The name of the animation clip to remove.
    */
  def removeClip(name: String): Unit = js.native
  /**
    * @function
    * @name pc.SpriteComponent#resume
    * @description Resumes the current paused animation clip.
    */
  def resume(): Unit = js.native
  /**
    * @function
    * @name pc.SpriteComponent#stop
    * @description Stops the current animation clip and resets it to the first frame.
    */
  def stop(): Unit = js.native
}

