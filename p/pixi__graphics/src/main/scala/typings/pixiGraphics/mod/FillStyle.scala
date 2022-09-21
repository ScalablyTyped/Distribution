package typings.pixiGraphics.mod

import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiMath.mod.Matrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi/graphics", "FillStyle")
@js.native
open class FillStyle () extends StObject {
  
  /** The alpha value used when filling the Graphics object. */
  var alpha: Double = js.native
  
  /**
    * The hex color value used when coloring the Graphics object.
    * @default 0xFFFFFF
    */
  var color: Double = js.native
  
  /** Destroy and don't use after this. */
  def destroy(): Unit = js.native
  
  /**
    * The transform applied to the texture.
    * @default null
    */
  var matrix: Matrix = js.native
  
  /** Reset */
  def reset(): Unit = js.native
  
  /**
    * The texture to be used for the fill.
    * @default 0
    */
  var texture: Texture[Resource] = js.native
  
  /** If the current fill is visible. */
  var visible: Boolean = js.native
}
