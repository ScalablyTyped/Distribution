package typings.ol

import typings.ol.extentCornerMod.Corner
import typings.ol.extentMod.Extent
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import typings.ol.tilegridTileGridMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilegridMod {
  
  @JSImport("ol/tilegrid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createForExtent(extent: Extent): default = ^.asInstanceOf[js.Dynamic].applyDynamic("createForExtent")(extent.asInstanceOf[js.Any]).asInstanceOf[default]
  inline def createForExtent(extent: Extent, opt_maxZoom: Double): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForExtent")(extent.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForExtent(extent: Extent, opt_maxZoom: Double, opt_tileSize: Double): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForExtent")(extent.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForExtent(extent: Extent, opt_maxZoom: Double, opt_tileSize: Double, opt_corner: Corner): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForExtent")(extent.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any], opt_corner.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForExtent(extent: Extent, opt_maxZoom: Double, opt_tileSize: Unit, opt_corner: Corner): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForExtent")(extent.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any], opt_corner.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForExtent(extent: Extent, opt_maxZoom: Double, opt_tileSize: Size): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForExtent")(extent.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForExtent(extent: Extent, opt_maxZoom: Double, opt_tileSize: Size, opt_corner: Corner): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForExtent")(extent.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any], opt_corner.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForExtent(extent: Extent, opt_maxZoom: Unit, opt_tileSize: Double): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForExtent")(extent.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForExtent(extent: Extent, opt_maxZoom: Unit, opt_tileSize: Double, opt_corner: Corner): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForExtent")(extent.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any], opt_corner.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForExtent(extent: Extent, opt_maxZoom: Unit, opt_tileSize: Unit, opt_corner: Corner): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForExtent")(extent.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any], opt_corner.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForExtent(extent: Extent, opt_maxZoom: Unit, opt_tileSize: Size): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForExtent")(extent.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForExtent(extent: Extent, opt_maxZoom: Unit, opt_tileSize: Size, opt_corner: Corner): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForExtent")(extent.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any], opt_corner.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createForProjection(projection: ProjectionLike): default = ^.asInstanceOf[js.Dynamic].applyDynamic("createForProjection")(projection.asInstanceOf[js.Any]).asInstanceOf[default]
  inline def createForProjection(projection: ProjectionLike, opt_maxZoom: Double): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProjection")(projection.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForProjection(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Double): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProjection")(projection.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForProjection(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Double, opt_corner: Corner): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProjection")(projection.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any], opt_corner.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForProjection(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Unit, opt_corner: Corner): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProjection")(projection.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any], opt_corner.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForProjection(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Size): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProjection")(projection.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForProjection(projection: ProjectionLike, opt_maxZoom: Double, opt_tileSize: Size, opt_corner: Corner): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProjection")(projection.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any], opt_corner.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForProjection(projection: ProjectionLike, opt_maxZoom: Unit, opt_tileSize: Double): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProjection")(projection.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForProjection(projection: ProjectionLike, opt_maxZoom: Unit, opt_tileSize: Double, opt_corner: Corner): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProjection")(projection.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any], opt_corner.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForProjection(projection: ProjectionLike, opt_maxZoom: Unit, opt_tileSize: Unit, opt_corner: Corner): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProjection")(projection.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any], opt_corner.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForProjection(projection: ProjectionLike, opt_maxZoom: Unit, opt_tileSize: Size): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProjection")(projection.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any])).asInstanceOf[default]
  inline def createForProjection(projection: ProjectionLike, opt_maxZoom: Unit, opt_tileSize: Size, opt_corner: Corner): default = (^.asInstanceOf[js.Dynamic].applyDynamic("createForProjection")(projection.asInstanceOf[js.Any], opt_maxZoom.asInstanceOf[js.Any], opt_tileSize.asInstanceOf[js.Any], opt_corner.asInstanceOf[js.Any])).asInstanceOf[default]
  
  inline def createXYZ(): default = ^.asInstanceOf[js.Dynamic].applyDynamic("createXYZ")().asInstanceOf[default]
  inline def createXYZ(opt_options: XYZOptions): default = ^.asInstanceOf[js.Dynamic].applyDynamic("createXYZ")(opt_options.asInstanceOf[js.Any]).asInstanceOf[default]
  
  inline def extentFromProjection(projection: ProjectionLike): Extent = ^.asInstanceOf[js.Dynamic].applyDynamic("extentFromProjection")(projection.asInstanceOf[js.Any]).asInstanceOf[Extent]
  
  inline def getForProjection(projection: typings.ol.projProjectionMod.default): default = ^.asInstanceOf[js.Dynamic].applyDynamic("getForProjection")(projection.asInstanceOf[js.Any]).asInstanceOf[default]
  
  inline def wrapX(tileGrid: default, tileCoord: TileCoord, projection: typings.ol.projProjectionMod.default): TileCoord = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapX")(tileGrid.asInstanceOf[js.Any], tileCoord.asInstanceOf[js.Any], projection.asInstanceOf[js.Any])).asInstanceOf[TileCoord]
  
  trait XYZOptions extends StObject {
    
    var extent: js.UndefOr[Extent] = js.undefined
    
    var maxResolution: js.UndefOr[Double] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var tileSize: js.UndefOr[Double | Size] = js.undefined
  }
  object XYZOptions {
    
    inline def apply(): XYZOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XYZOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XYZOptions] (val x: Self) extends AnyVal {
      
      inline def setExtent(value: Extent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setMaxResolution(value: Double): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMaxResolutionUndefined: Self = StObject.set(x, "maxResolution", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
    }
  }
}
