package typings.playcanvas.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @component
  * @class
  * @name pc.SpriteComponent
  * @augments pc.Component
  * @classdesc Enables an Entity to render a simple static sprite or sprite animations.
  * @param {pc.SpriteComponentSystem} system - The ComponentSystem that created this Component.
  * @param {pc.Entity} entity - The Entity that this Component is attached to.
  * @property {string} type The type of the SpriteComponent. Can be:
  *
  * * {@link pc.SPRITETYPE_SIMPLE}: The component renders a single frame from a sprite asset.
  * * {@link pc.SPRITETYPE_ANIMATED}: The component can play sprite animation clips.
  *
  * @property {number} frame The frame counter of the sprite. Specifies which frame from the current sprite asset to render.
  * @property {number} spriteAsset The id of the sprite asset to render. Only works for {@link pc.SPRITETYPE_SIMPLE} types.
  * @property {pc.Sprite} sprite The current sprite.
  * @property {number} width The width of the sprite when rendering using 9-Slicing. The width and height are only used when the render mode of the sprite asset is Sliced or Tiled.
  * @property {number} height The height of the sprite when rendering using 9-Slicing. The width and height are only used when the render mode of the sprite asset is Sliced or Tiled.
  * @property {pc.Color} color The color tint of the sprite.
  * @property {number} opacity The opacity of the sprite.
  * @property {boolean} flipX Flip the X axis when rendering a sprite.
  * @property {boolean} flipY Flip the Y axis when rendering a sprite.
  * @property {object} clips A dictionary that contains {@link pc.SpriteAnimationClip}s.
  * @property {pc.SpriteAnimationClip} currentClip The current clip being played.
  * @property {number} speed A global speed modifier used when playing sprite animation clips.
  * @property {number} batchGroupId Assign sprite to a specific batch group (see {@link pc.BatchGroup}). Default value is -1 (no group).
  * @property {string} autoPlayClip The name of the clip to play automatically when the component is enabled and the clip exists.
  * @property {number[]} layers An array of layer IDs ({@link pc.Layer#id}) to which this sprite should belong.
  * @property {number} drawOrder The draw order of the component. A higher value means that the component will be rendered on top of other components in the same layer.
  */
@JSImport("playcanvas", "SpriteComponent")
@js.native
class SpriteComponent protected ()
  extends typings.playcanvas.pc.SpriteComponent {
  def this(system: typings.playcanvas.pc.SpriteComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}

