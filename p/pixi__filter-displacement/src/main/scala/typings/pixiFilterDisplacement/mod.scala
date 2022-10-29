package typings.pixiFilterDisplacement

import typings.pixiCore.libFiltersSpriteMaskSpriteMaskFilterMod.ISpriteMaskTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pixi/filter-displacement", "DisplacementFilter")
  @js.native
  open class DisplacementFilter protected ()
    extends typings.pixiFilterDisplacement.libDisplacementFilterMod.DisplacementFilter {
    /**
      * @param {PIXI.Sprite} sprite - The sprite used for the displacement map. (make sure its added to the scene!)
      * @param scale - The scale of the displacement
      */
    def this(sprite: ISpriteMaskTarget) = this()
    def this(sprite: ISpriteMaskTarget, scale: Double) = this()
  }
}
