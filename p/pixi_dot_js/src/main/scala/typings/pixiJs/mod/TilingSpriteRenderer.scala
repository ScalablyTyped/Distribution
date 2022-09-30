package typings.pixiJs.mod

import typings.pixiExtensions.mod.ExtensionMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "TilingSpriteRenderer")
@js.native
open class TilingSpriteRenderer protected ()
  extends typings.pixiSpriteTiling.mod.TilingSpriteRenderer {
  /**
    * constructor for renderer
    * @param {PIXI.Renderer} renderer - The renderer this tiling awesomeness works for.
    */
  def this(renderer: typings.pixiCore.mod.Renderer) = this()
}
/* static members */
object TilingSpriteRenderer {
  
  /** @ignore */
  @JSImport("pixi.js", "TilingSpriteRenderer.extension")
  @js.native
  val `extension`: ExtensionMetadata = js.native
}
