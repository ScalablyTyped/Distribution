package typings.nivoVoronoi

import typings.nivoCore.mod.Box
import typings.nivoCore.mod.Theme
import typings.nivoVoronoi.distTypesTypesMod.VoronoiDatum
import typings.nivoVoronoi.distTypesTypesMod.VoronoiDomain
import typings.nivoVoronoi.distTypesTypesMod.VoronoiLayer
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveVoronoiMod {
  
  @JSImport("@nivo/voronoi/dist/types/ResponsiveVoronoi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveVoronoi(props: ResponsiveVoronoiProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveVoronoi")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Partial<std.Omit<@nivo/voronoi.@nivo/voronoi/dist/types/types.VoronoiSvgProps, 'data' | 'width' | 'height'>> & std.Pick<@nivo/voronoi.@nivo/voronoi/dist/types/types.VoronoiSvgProps, 'data'> */
  trait ResponsiveVoronoiProps extends StObject {
    
    var cellLineColor: js.UndefOr[String] = js.undefined
    
    var cellLineWidth: js.UndefOr[Double] = js.undefined
    
    var data: js.Array[VoronoiDatum]
    
    var enableCells: js.UndefOr[Boolean] = js.undefined
    
    var enableLinks: js.UndefOr[Boolean] = js.undefined
    
    var enablePoints: js.UndefOr[Boolean] = js.undefined
    
    var layers: js.UndefOr[js.Array[VoronoiLayer]] = js.undefined
    
    var linkLineColor: js.UndefOr[String] = js.undefined
    
    var linkLineWidth: js.UndefOr[Double] = js.undefined
    
    var margin: js.UndefOr[Box] = js.undefined
    
    var pointColor: js.UndefOr[String] = js.undefined
    
    var pointSize: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
    
    var xDomain: js.UndefOr[VoronoiDomain] = js.undefined
    
    var yDomain: js.UndefOr[VoronoiDomain] = js.undefined
  }
  object ResponsiveVoronoiProps {
    
    inline def apply(data: js.Array[VoronoiDatum]): ResponsiveVoronoiProps = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsiveVoronoiProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponsiveVoronoiProps] (val x: Self) extends AnyVal {
      
      inline def setCellLineColor(value: String): Self = StObject.set(x, "cellLineColor", value.asInstanceOf[js.Any])
      
      inline def setCellLineColorUndefined: Self = StObject.set(x, "cellLineColor", js.undefined)
      
      inline def setCellLineWidth(value: Double): Self = StObject.set(x, "cellLineWidth", value.asInstanceOf[js.Any])
      
      inline def setCellLineWidthUndefined: Self = StObject.set(x, "cellLineWidth", js.undefined)
      
      inline def setData(value: js.Array[VoronoiDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: VoronoiDatum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setEnableCells(value: Boolean): Self = StObject.set(x, "enableCells", value.asInstanceOf[js.Any])
      
      inline def setEnableCellsUndefined: Self = StObject.set(x, "enableCells", js.undefined)
      
      inline def setEnableLinks(value: Boolean): Self = StObject.set(x, "enableLinks", value.asInstanceOf[js.Any])
      
      inline def setEnableLinksUndefined: Self = StObject.set(x, "enableLinks", js.undefined)
      
      inline def setEnablePoints(value: Boolean): Self = StObject.set(x, "enablePoints", value.asInstanceOf[js.Any])
      
      inline def setEnablePointsUndefined: Self = StObject.set(x, "enablePoints", js.undefined)
      
      inline def setLayers(value: js.Array[VoronoiLayer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      inline def setLayersVarargs(value: VoronoiLayer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLinkLineColor(value: String): Self = StObject.set(x, "linkLineColor", value.asInstanceOf[js.Any])
      
      inline def setLinkLineColorUndefined: Self = StObject.set(x, "linkLineColor", js.undefined)
      
      inline def setLinkLineWidth(value: Double): Self = StObject.set(x, "linkLineWidth", value.asInstanceOf[js.Any])
      
      inline def setLinkLineWidthUndefined: Self = StObject.set(x, "linkLineWidth", js.undefined)
      
      inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPointColor(value: String): Self = StObject.set(x, "pointColor", value.asInstanceOf[js.Any])
      
      inline def setPointColorUndefined: Self = StObject.set(x, "pointColor", js.undefined)
      
      inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
      
      inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setXDomain(value: VoronoiDomain): Self = StObject.set(x, "xDomain", value.asInstanceOf[js.Any])
      
      inline def setXDomainUndefined: Self = StObject.set(x, "xDomain", js.undefined)
      
      inline def setYDomain(value: VoronoiDomain): Self = StObject.set(x, "yDomain", value.asInstanceOf[js.Any])
      
      inline def setYDomainUndefined: Self = StObject.set(x, "yDomain", js.undefined)
    }
  }
}
