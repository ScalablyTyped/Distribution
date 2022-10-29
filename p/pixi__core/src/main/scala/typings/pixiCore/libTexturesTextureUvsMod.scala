package typings.pixiCore

import typings.pixiMath.mod.ISize
import typings.pixiMath.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTexturesTextureUvsMod {
  
  @JSImport("@pixi/core/lib/textures/TextureUvs", "TextureUvs")
  @js.native
  open class TextureUvs () extends StObject {
    
    /**
      * Sets the texture Uvs based on the given frame information.
      * @protected
      * @param frame - The frame of the texture
      * @param baseFrame - The base frame of the texture
      * @param rotate - Rotation of frame, see {@link PIXI.groupD8}
      */
    def set(frame: Rectangle, baseFrame: ISize, rotate: Double): Unit = js.native
    
    var uvsFloat32: js.typedarray.Float32Array = js.native
    
    /** X-component of top-left corner `(x0,y0)`. */
    var x0: Double = js.native
    
    /** X-component of top-right corner `(x1,y1)`. */
    var x1: Double = js.native
    
    /** X-component of bottom-right corner `(x2,y2)`. */
    var x2: Double = js.native
    
    /** X-component of bottom-left corner `(x3,y3)`. */
    var x3: Double = js.native
    
    /** Y-component of top-left corner `(x0,y0)`. */
    var y0: Double = js.native
    
    /** Y-component of top-right corner `(x1,y1)`. */
    var y1: Double = js.native
    
    /** Y-component of bottom-right corner `(x2,y2)`. */
    var y2: Double = js.native
    
    /** Y-component of bottom-right corner `(x3,y3)`. */
    var y3: Double = js.native
  }
}
