package typings.playcanvas.playcanvasMod

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
@JSImport("playcanvas", "SpriteComponent")
@js.native
class SpriteComponent protected ()
  extends typings.playcanvas.pc.SpriteComponent {
  def this(system: typings.playcanvas.pc.SpriteComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

