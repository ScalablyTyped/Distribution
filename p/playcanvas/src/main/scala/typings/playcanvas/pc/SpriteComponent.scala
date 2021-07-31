package typings.playcanvas.pc

import typings.playcanvas.anon.Loop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables an Entity to render a simple static sprite or sprite animations.
  * @property type - The type of the SpriteComponent. Can be:
  *
  * * {@link pc.SPRITETYPE_SIMPLE}: The component renders a single frame from a sprite asset.
  * * {@link pc.SPRITETYPE_ANIMATED}: The component can play sprite animation clips.
  * @property frame - The frame counter of the sprite. Specifies which frame from the current sprite asset to render.
  * @property spriteAsset - The id of the sprite asset to render. Only works for {@link pc.SPRITETYPE_SIMPLE} types.
  * @property sprite - The current sprite.
  * @property width - The width of the sprite when rendering using 9-Slicing. The width and height are only used when the render mode of the sprite asset is Sliced or Tiled.
  * @property height - The height of the sprite when rendering using 9-Slicing. The width and height are only used when the render mode of the sprite asset is Sliced or Tiled.
  * @property color - The color tint of the sprite.
  * @property opacity - The opacity of the sprite.
  * @property flipX - Flip the X axis when rendering a sprite.
  * @property flipY - Flip the Y axis when rendering a sprite.
  * @property clips - A dictionary that contains {@link pc.SpriteAnimationClip}s.
  * @property currentClip - The current clip being played.
  * @property speed - A global speed modifier used when playing sprite animation clips.
  * @property batchGroupId - Assign sprite to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
  * @property autoPlayClip - The name of the clip to play automatically when the component is enabled and the clip exists.
  * @property layers - An array of layer IDs ({@link pc.Layer#id}) to which this sprite should belong.
  * @property drawOrder - The draw order of the component. A higher value means that the component will be rendered on top of other components in the same layer.
  * @param system - The ComponentSystem that created this Component.
  * @param entity - The Entity that this Component is attached to.
  */
@js.native
trait SpriteComponent
  extends StObject
     with Component {
  
  /**
    * Creates and adds a new {@link pc.SpriteAnimationClip} to the component's clips.
    * @param data - Data for the new animation clip.
    * @param [data.name] - The name of the new animation clip.
    * @param [data.fps] - Frames per second for the animation clip.
    * @param [data.loop] - Whether to loop the animation clip.
    * @param [data.spriteAsset] - The id of the sprite asset that this clip will play.
    * @returns The new clip that was added.
    */
  def addClip(data: Loop): SpriteAnimationClip = js.native
  
  /**
    * The name of the clip to play automatically when the component is enabled and the clip exists.
    */
  var autoPlayClip: String = js.native
  
  /**
    * Assign sprite to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
    */
  var batchGroupId: Double = js.native
  
  /**
    * Get an animation clip by name.
    * @param name - The name of the clip.
    * @returns The clip.
    */
  def clip(name: String): SpriteAnimationClip = js.native
  
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
  var layers: js.Array[Double] = js.native
  
  /**
    * The opacity of the sprite.
    */
  var opacity: Double = js.native
  
  /**
    * Pauses the current animation clip.
    */
  def pause(): Unit = js.native
  
  /**
    * Plays a sprite animation clip by name. If the animation clip is already playing then this will do nothing.
    * @param name - The name of the clip to play.
    * @returns The clip that started playing.
    */
  def play(name: String): SpriteAnimationClip = js.native
  
  /**
    * Removes a clip by name.
    * @param name - The name of the animation clip to remove.
    */
  def removeClip(name: String): Unit = js.native
  
  /**
    * Resumes the current paused animation clip.
    */
  def resume(): Unit = js.native
  
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
    * Stops the current animation clip and resets it to the first frame.
    */
  def stop(): Unit = js.native
  
  /**
    * The type of the SpriteComponent. Can be:
    
    * {@link pc.SPRITETYPE_SIMPLE}: The component renders a single frame from a sprite asset.
    * {@link pc.SPRITETYPE_ANIMATED}: The component can play sprite animation clips.
    */
  var `type`: String = js.native
  
  /**
    * The width of the sprite when rendering using 9-Slicing. The width and height are only used when the render mode of the sprite asset is Sliced or Tiled.
    */
  var width: Double = js.native
}
