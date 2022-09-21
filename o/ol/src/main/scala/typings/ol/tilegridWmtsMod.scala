package typings.ol

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.sizeMod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilegridWmtsMod {
  
  @JSImport("ol/tilegrid/WMTS", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/tilegrid/WMTS", JSImport.Default)
  @js.native
  open class default protected () extends WMTSTileGrid {
    def this(options: Options) = this()
  }
  
  inline def createFromCapabilitiesMatrixSet(matrixSet: Any): WMTSTileGrid = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromCapabilitiesMatrixSet")(matrixSet.asInstanceOf[js.Any]).asInstanceOf[WMTSTileGrid]
  inline def createFromCapabilitiesMatrixSet(matrixSet: Any, opt_extent: Unit, opt_matrixLimits: js.Array[js.Object]): WMTSTileGrid = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromCapabilitiesMatrixSet")(matrixSet.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any], opt_matrixLimits.asInstanceOf[js.Any])).asInstanceOf[WMTSTileGrid]
  inline def createFromCapabilitiesMatrixSet(matrixSet: Any, opt_extent: Extent): WMTSTileGrid = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromCapabilitiesMatrixSet")(matrixSet.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any])).asInstanceOf[WMTSTileGrid]
  inline def createFromCapabilitiesMatrixSet(matrixSet: Any, opt_extent: Extent, opt_matrixLimits: js.Array[js.Object]): WMTSTileGrid = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromCapabilitiesMatrixSet")(matrixSet.asInstanceOf[js.Any], opt_extent.asInstanceOf[js.Any], opt_matrixLimits.asInstanceOf[js.Any])).asInstanceOf[WMTSTileGrid]
  
  trait Options extends StObject {
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var matrixIds: js.Array[String]
    
    var origin: js.UndefOr[Coordinate] = js.undefined
    
    var origins: js.UndefOr[js.Array[Coordinate]] = js.undefined
    
    var resolutions: js.Array[Double]
    
    var sizes: js.UndefOr[js.Array[Size]] = js.undefined
    
    var tileSize: js.UndefOr[Double | Size] = js.undefined
    
    var tileSizes: js.UndefOr[js.Array[Size]] = js.undefined
  }
  object Options {
    
    inline def apply(matrixIds: js.Array[String], resolutions: js.Array[Double]): Options = {
      val __obj = js.Dynamic.literal(matrixIds = matrixIds.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMatrixIds(value: js.Array[String]): Self = StObject.set(x, "matrixIds", value.asInstanceOf[js.Any])
      
      inline def setMatrixIdsVarargs(value: String*): Self = StObject.set(x, "matrixIds", js.Array(value*))
      
      inline def setOrigin(value: Coordinate): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOriginVarargs(value: Double*): Self = StObject.set(x, "origin", js.Array(value*))
      
      inline def setOrigins(value: js.Array[Coordinate]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setOriginsVarargs(value: Coordinate*): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setSizes(value: js.Array[Size]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSizesVarargs(value: Size*): Self = StObject.set(x, "sizes", js.Array(value*))
      
      inline def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTileSizes(value: js.Array[Size]): Self = StObject.set(x, "tileSizes", value.asInstanceOf[js.Any])
      
      inline def setTileSizesUndefined: Self = StObject.set(x, "tileSizes", js.undefined)
      
      inline def setTileSizesVarargs(value: Size*): Self = StObject.set(x, "tileSizes", js.Array(value*))
    }
  }
  
  @js.native
  trait WMTSTileGrid
    extends typings.ol.tilegridTileGridMod.default {
    
    def getMatrixId(z: Double): String = js.native
    
    /**
      * Get the list of matrix identifiers.
      */
    def getMatrixIds(): js.Array[String] = js.native
  }
}
