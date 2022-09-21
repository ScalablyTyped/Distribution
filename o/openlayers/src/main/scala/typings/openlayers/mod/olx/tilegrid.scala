package typings.openlayers.mod.olx

import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.Extent_
import typings.openlayers.mod.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilegrid {
  
  trait TileGridOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var origin: js.UndefOr[Coordinate_] = js.undefined
    
    var origins: js.UndefOr[js.Array[Coordinate_]] = js.undefined
    
    var resolutions: js.Array[Double]
    
    var tileSize: js.UndefOr[Double | Size] = js.undefined
    
    var tileSizes: js.UndefOr[js.Array[Double | Size]] = js.undefined
  }
  object TileGridOptions {
    
    inline def apply(resolutions: js.Array[Double]): TileGridOptions = {
      val __obj = js.Dynamic.literal(resolutions = resolutions.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileGridOptions]
    }
    
    extension [Self <: TileGridOptions](x: Self) {
      
      inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setOrigin(value: Coordinate_): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOrigins(value: js.Array[Coordinate_]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setOriginsVarargs(value: Coordinate_ *): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTileSizes(value: js.Array[Double | Size]): Self = StObject.set(x, "tileSizes", value.asInstanceOf[js.Any])
      
      inline def setTileSizesUndefined: Self = StObject.set(x, "tileSizes", js.undefined)
      
      inline def setTileSizesVarargs(value: (Double | Size)*): Self = StObject.set(x, "tileSizes", js.Array(value*))
    }
  }
  
  trait WMTSOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.undefined
    
    var matrixIds: js.Array[String]
    
    var origin: js.UndefOr[Coordinate_] = js.undefined
    
    var origins: js.UndefOr[js.Array[Coordinate_]] = js.undefined
    
    var resolutions: js.Array[Double]
    
    var sizes: js.UndefOr[js.Array[Size]] = js.undefined
    
    var tileSize: js.UndefOr[Double | Size] = js.undefined
    
    var tileSizes: js.UndefOr[js.Array[Double | Size]] = js.undefined
    
    var widths: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object WMTSOptions {
    
    inline def apply(matrixIds: js.Array[String], resolutions: js.Array[Double]): WMTSOptions = {
      val __obj = js.Dynamic.literal(matrixIds = matrixIds.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
      __obj.asInstanceOf[WMTSOptions]
    }
    
    extension [Self <: WMTSOptions](x: Self) {
      
      inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMatrixIds(value: js.Array[String]): Self = StObject.set(x, "matrixIds", value.asInstanceOf[js.Any])
      
      inline def setMatrixIdsVarargs(value: String*): Self = StObject.set(x, "matrixIds", js.Array(value*))
      
      inline def setOrigin(value: Coordinate_): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setOrigins(value: js.Array[Coordinate_]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setOriginsVarargs(value: Coordinate_ *): Self = StObject.set(x, "origins", js.Array(value*))
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setSizes(value: js.Array[Size]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      inline def setSizesVarargs(value: Size*): Self = StObject.set(x, "sizes", js.Array(value*))
      
      inline def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTileSizes(value: js.Array[Double | Size]): Self = StObject.set(x, "tileSizes", value.asInstanceOf[js.Any])
      
      inline def setTileSizesUndefined: Self = StObject.set(x, "tileSizes", js.undefined)
      
      inline def setTileSizesVarargs(value: (Double | Size)*): Self = StObject.set(x, "tileSizes", js.Array(value*))
      
      inline def setWidths(value: js.Array[Double]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
      
      inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
      
      inline def setWidthsVarargs(value: Double*): Self = StObject.set(x, "widths", js.Array(value*))
    }
  }
  
  trait XYZOptions extends StObject {
    
    var extent: js.UndefOr[Extent_] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var tileSize: js.UndefOr[Double | Size] = js.undefined
  }
  object XYZOptions {
    
    inline def apply(): XYZOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XYZOptions]
    }
    
    extension [Self <: XYZOptions](x: Self) {
      
      inline def setExtent(value: Extent_): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    }
  }
}
