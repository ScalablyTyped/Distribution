package typings.playcanvas.global.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@JSGlobal("pc.SpriteComponent")
@js.native
class SpriteComponent protected ()
  extends typings.playcanvas.pc.SpriteComponent {
  def this(system: typings.playcanvas.pc.SpriteComponentSystem, entity: typings.playcanvas.pc.Entity) = this()
}
