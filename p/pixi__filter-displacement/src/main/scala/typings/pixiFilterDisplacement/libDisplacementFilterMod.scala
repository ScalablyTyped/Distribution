package typings.pixiFilterDisplacement

import typings.pixiConstants.mod.CLEAR_MODES
import typings.pixiCore.libFiltersSpriteMaskSpriteMaskFilterMod.ISpriteMaskTarget
import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Filter
import typings.pixiCore.mod.FilterSystem
import typings.pixiCore.mod.Matrix
import typings.pixiCore.mod.Point
import typings.pixiCore.mod.RenderTexture
import typings.pixiCore.mod.Texture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDisplacementFilterMod {
  
  @JSImport("@pixi/filter-displacement/lib/DisplacementFilter", "DisplacementFilter")
  @js.native
  open class DisplacementFilter protected () extends Filter {
    /**
      * @param {PIXI.Sprite} sprite - The sprite used for the displacement map. (make sure its added to the scene!)
      * @param scale - The scale of the displacement
      */
    def this(sprite: ISpriteMaskTarget) = this()
    def this(sprite: ISpriteMaskTarget, scale: Double) = this()
    
    /**
      * Applies the filter.
      * @param filterManager - The manager.
      * @param input - The input target.
      * @param output - The output target.
      * @param clearMode - clearMode.
      */
    @JSName("apply")
    def apply(filterManager: FilterSystem, input: RenderTexture, output: RenderTexture, clearMode: CLEAR_MODES): Unit = js.native
    
    /** The texture used for the displacement map. Must be power of 2 sized texture. */
    def map: Texture[Resource] = js.native
    def map_=(value: Texture[Resource]): Unit = js.native
    
    var maskMatrix: Matrix = js.native
    
    var maskSprite: ISpriteMaskTarget = js.native
    
    var scale: Point = js.native
  }
}
