package typings.pixiFilterDisplacement

import typings.pixiCore.mod.Filter
import typings.pixiCore.mod.ISpriteMaskTarget
import typings.pixiCore.mod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiMath.mod.Matrix
import typings.pixiMath.mod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/filter-displacement", "DisplacementFilter")
  @js.native
  open class DisplacementFilter protected () extends Filter {
    /**
      * @param {PIXI.Sprite} sprite - The sprite used for the displacement map. (make sure its added to the scene!)
      * @param scale - The scale of the displacement
      */
    def this(sprite: ISpriteMaskTarget) = this()
    def this(sprite: ISpriteMaskTarget, scale: Double) = this()
    
    /** The texture used for the displacement map. Must be power of 2 sized texture. */
    def map: Texture[Resource] = js.native
    def map_=(value: Texture[Resource]): Unit = js.native
    
    var maskMatrix: Matrix = js.native
    
    var maskSprite: ISpriteMaskTarget = js.native
    
    var scale: Point = js.native
  }
}
