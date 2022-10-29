package typings.pixiSpriteTiling

import typings.pixiCore.mod.ObjectRenderer
import typings.pixiCore.mod.QuadUv
import typings.pixiCore.mod.Renderer
import typings.pixiCore.mod.Shader
import typings.pixiCore.mod.State
import typings.pixiExtensions.mod.ExtensionMetadata
import typings.pixiSpriteTiling.libTilingSpriteMod.TilingSprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTilingSpriteRendererMod {
  
  @JSImport("@pixi/sprite-tiling/lib/TilingSpriteRenderer", "TilingSpriteRenderer")
  @js.native
  open class TilingSpriteRenderer protected () extends ObjectRenderer {
    /**
      * constructor for renderer
      * @param {PIXI.Renderer} renderer - The renderer this tiling awesomeness works for.
      */
    def this(renderer: Renderer) = this()
    
    /** Creates shaders when context is initialized. */
    def contextChange(): Unit = js.native
    
    var quad: QuadUv = js.native
    
    /**
      * @param {PIXI.TilingSprite} ts - tilingSprite to be rendered
      */
    def render(ts: TilingSprite): Unit = js.native
    
    var shader: Shader = js.native
    
    var simpleShader: Shader = js.native
    
    val state: State = js.native
  }
  /* static members */
  object TilingSpriteRenderer {
    
    /** @ignore */
    @JSImport("@pixi/sprite-tiling/lib/TilingSpriteRenderer", "TilingSpriteRenderer.extension")
    @js.native
    val `extension`: ExtensionMetadata = js.native
  }
}
