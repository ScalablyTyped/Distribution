package typings.nivoVoronoi

import typings.d3Delaunay.mod.Delaunay
import typings.d3Delaunay.mod.Delaunay.Point
import typings.d3Delaunay.mod.Voronoi
import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Theme
import typings.nivoVoronoi.anon.X
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait VoronoiCommonProps extends StObject {
    
    var cellLineColor: String
    
    var cellLineWidth: Double
    
    var data: js.Array[VoronoiDatum]
    
    var enableCells: Boolean
    
    var enableLinks: Boolean
    
    var enablePoints: Boolean
    
    var height: Double
    
    var layers: js.Array[VoronoiLayer]
    
    var linkLineColor: String
    
    var linkLineWidth: Double
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var pointColor: String
    
    var pointSize: Double
    
    var role: String
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var width: Double
    
    var xDomain: VoronoiDomain
    
    var yDomain: VoronoiDomain
  }
  object VoronoiCommonProps {
    
    inline def apply(
      cellLineColor: String,
      cellLineWidth: Double,
      data: js.Array[VoronoiDatum],
      enableCells: Boolean,
      enableLinks: Boolean,
      enablePoints: Boolean,
      height: Double,
      layers: js.Array[VoronoiLayer],
      linkLineColor: String,
      linkLineWidth: Double,
      pointColor: String,
      pointSize: Double,
      role: String,
      width: Double,
      xDomain: VoronoiDomain,
      yDomain: VoronoiDomain
    ): VoronoiCommonProps = {
      val __obj = js.Dynamic.literal(cellLineColor = cellLineColor.asInstanceOf[js.Any], cellLineWidth = cellLineWidth.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], enableCells = enableCells.asInstanceOf[js.Any], enableLinks = enableLinks.asInstanceOf[js.Any], enablePoints = enablePoints.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], linkLineColor = linkLineColor.asInstanceOf[js.Any], linkLineWidth = linkLineWidth.asInstanceOf[js.Any], pointColor = pointColor.asInstanceOf[js.Any], pointSize = pointSize.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xDomain = xDomain.asInstanceOf[js.Any], yDomain = yDomain.asInstanceOf[js.Any])
      __obj.asInstanceOf[VoronoiCommonProps]
    }
    
    extension [Self <: VoronoiCommonProps](x: Self) {
      
      inline def setCellLineColor(value: String): Self = StObject.set(x, "cellLineColor", value.asInstanceOf[js.Any])
      
      inline def setCellLineWidth(value: Double): Self = StObject.set(x, "cellLineWidth", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Array[VoronoiDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: VoronoiDatum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEnableCells(value: Boolean): Self = StObject.set(x, "enableCells", value.asInstanceOf[js.Any])
      
      inline def setEnableLinks(value: Boolean): Self = StObject.set(x, "enableLinks", value.asInstanceOf[js.Any])
      
      inline def setEnablePoints(value: Boolean): Self = StObject.set(x, "enablePoints", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLayers(value: js.Array[VoronoiLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: VoronoiLayer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLinkLineColor(value: String): Self = StObject.set(x, "linkLineColor", value.asInstanceOf[js.Any])
      
      inline def setLinkLineWidth(value: Double): Self = StObject.set(x, "linkLineWidth", value.asInstanceOf[js.Any])
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPointColor(value: String): Self = StObject.set(x, "pointColor", value.asInstanceOf[js.Any])
      
      inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setXDomain(value: VoronoiDomain): Self = StObject.set(x, "xDomain", value.asInstanceOf[js.Any])
      
      inline def setYDomain(value: VoronoiDomain): Self = StObject.set(x, "yDomain", value.asInstanceOf[js.Any])
    }
  }
  
  type VoronoiCustomLayer = FC[VoronoiCustomLayerProps]
  
  trait VoronoiCustomLayerProps extends StObject {
    
    var delaunay: Delaunay[Point]
    
    var points: js.Array[X]
    
    var voronoi: Voronoi[Point]
  }
  object VoronoiCustomLayerProps {
    
    inline def apply(delaunay: Delaunay[Point], points: js.Array[X], voronoi: Voronoi[Point]): VoronoiCustomLayerProps = {
      val __obj = js.Dynamic.literal(delaunay = delaunay.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], voronoi = voronoi.asInstanceOf[js.Any])
      __obj.asInstanceOf[VoronoiCustomLayerProps]
    }
    
    extension [Self <: VoronoiCustomLayerProps](x: Self) {
      
      inline def setDelaunay(value: Delaunay[Point]): Self = StObject.set(x, "delaunay", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[X]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: X*): Self = StObject.set(x, "points", js.Array(value*))
      
      inline def setVoronoi(value: Voronoi[Point]): Self = StObject.set(x, "voronoi", value.asInstanceOf[js.Any])
    }
  }
  
  trait VoronoiDatum extends StObject {
    
    var id: String | Double
    
    var x: Double
    
    var y: Double
  }
  object VoronoiDatum {
    
    inline def apply(id: String | Double, x: Double, y: Double): VoronoiDatum = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[VoronoiDatum]
    }
    
    extension [Self <: VoronoiDatum](x: Self) {
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type VoronoiDomain = js.Tuple2[Double, Double]
  
  type VoronoiLayer = VoronoiLayerId | VoronoiCustomLayer
  
  /* Rewritten from type alias, can be one of: 
    - typings.nivoVoronoi.nivoVoronoiStrings.links
    - typings.nivoVoronoi.nivoVoronoiStrings.cells
    - typings.nivoVoronoi.nivoVoronoiStrings.points
    - typings.nivoVoronoi.nivoVoronoiStrings.bounds
  */
  trait VoronoiLayerId extends StObject
  object VoronoiLayerId {
    
    inline def bounds: typings.nivoVoronoi.nivoVoronoiStrings.bounds = "bounds".asInstanceOf[typings.nivoVoronoi.nivoVoronoiStrings.bounds]
    
    inline def cells: typings.nivoVoronoi.nivoVoronoiStrings.cells = "cells".asInstanceOf[typings.nivoVoronoi.nivoVoronoiStrings.cells]
    
    inline def links: typings.nivoVoronoi.nivoVoronoiStrings.links = "links".asInstanceOf[typings.nivoVoronoi.nivoVoronoiStrings.links]
    
    inline def points: typings.nivoVoronoi.nivoVoronoiStrings.points = "points".asInstanceOf[typings.nivoVoronoi.nivoVoronoiStrings.points]
  }
  
  type VoronoiSvgProps = VoronoiCommonProps
}
