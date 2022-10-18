package typings.ol

import typings.ol.projMod.ProjectionLike
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTileDebugMod {
  
  @JSImport("ol/source/TileDebug", JSImport.Default)
  @js.native
  open class default () extends TileDebug {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait LabeledTile
    extends typings.ol.tileMod.default {
    
    /**
      * Get the image element for this tile.
      */
    def getImage(): HTMLCanvasElement = js.native
  }
  
  trait Options extends StObject {
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    var zDirection: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      inline def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      inline def setZDirection(value: Double): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  @js.native
  trait TileDebug
    extends typings.ol.sourceXyzMod.default {
    
    def getTile(z: Double, x: Double, y: Double): LabeledTile = js.native
  }
}
