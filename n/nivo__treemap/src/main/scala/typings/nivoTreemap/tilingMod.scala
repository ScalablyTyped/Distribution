package typings.nivoTreemap

import typings.d3Hierarchy.mod.HierarchyRectangularNode
import typings.d3Hierarchy.mod.RatioSquarifyTilingFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilingMod {
  
  object tileByType {
    
    @JSImport("@nivo/treemap/dist/types/tiling", "tileByType.binary")
    @js.native
    val binary: js.Function5[
        /* node */ HierarchyRectangularNode[Any], 
        /* x0 */ Double, 
        /* y0 */ Double, 
        /* x1 */ Double, 
        /* y1 */ Double, 
        Unit
      ] = js.native
    
    @JSImport("@nivo/treemap/dist/types/tiling", "tileByType.dice")
    @js.native
    val dice: js.Function5[
        /* node */ HierarchyRectangularNode[Any], 
        /* x0 */ Double, 
        /* y0 */ Double, 
        /* x1 */ Double, 
        /* y1 */ Double, 
        Unit
      ] = js.native
    
    @JSImport("@nivo/treemap/dist/types/tiling", "tileByType.slice")
    @js.native
    val slice: js.Function5[
        /* node */ HierarchyRectangularNode[Any], 
        /* x0 */ Double, 
        /* y0 */ Double, 
        /* x1 */ Double, 
        /* y1 */ Double, 
        Unit
      ] = js.native
    
    @JSImport("@nivo/treemap/dist/types/tiling", "tileByType.sliceDice")
    @js.native
    val sliceDice: js.Function5[
        /* node */ HierarchyRectangularNode[Any], 
        /* x0 */ Double, 
        /* y0 */ Double, 
        /* x1 */ Double, 
        /* y1 */ Double, 
        Unit
      ] = js.native
    
    @JSImport("@nivo/treemap/dist/types/tiling", "tileByType.squarify")
    @js.native
    val squarify: RatioSquarifyTilingFactory = js.native
  }
  
  /* keyof @nivo/treemap.anon.Binary */ /* Rewritten from type alias, can be one of: 
    - typings.nivoTreemap.nivoTreemapStrings.binary
    - typings.nivoTreemap.nivoTreemapStrings.dice
    - typings.nivoTreemap.nivoTreemapStrings.slice
    - typings.nivoTreemap.nivoTreemapStrings.sliceDice
    - typings.nivoTreemap.nivoTreemapStrings.squarify
  */
  trait TileType extends StObject
}
