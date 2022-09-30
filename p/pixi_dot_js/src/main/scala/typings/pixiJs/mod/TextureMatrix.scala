package typings.pixiJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "TextureMatrix")
@js.native
open class TextureMatrix protected ()
  extends typings.pixiCore.mod.TextureMatrix {
  /**
    * @param texture - observed texture
    * @param clampMargin - Changes frame clamping, 0.5 by default. Use -0.5 for extra border.
    */
  def this(texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource]) = this()
  def this(texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource], clampMargin: Double) = this()
}
