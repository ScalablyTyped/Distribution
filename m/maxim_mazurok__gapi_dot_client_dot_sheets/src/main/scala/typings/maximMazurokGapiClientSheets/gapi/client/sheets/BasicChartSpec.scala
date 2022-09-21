package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicChartSpec extends StObject {
  
  /** The axis on the chart. */
  var axis: js.UndefOr[js.Array[BasicChartAxis]] = js.undefined
  
  /** The type of the chart. */
  var chartType: js.UndefOr[String] = js.undefined
  
  /** The behavior of tooltips and data highlighting when hovering on data and chart area. */
  var compareMode: js.UndefOr[String] = js.undefined
  
  /** The domain of data this is charting. Only a single domain is supported. */
  var domains: js.UndefOr[js.Array[BasicChartDomain]] = js.undefined
  
  /**
    * The number of rows or columns in the data that are "headers". If not set, Google Sheets will guess how many rows are headers based on the data. (Note that BasicChartAxis.title may
    * override the axis title inferred from the header values.)
    */
  var headerCount: js.UndefOr[Double] = js.undefined
  
  /**
    * If some values in a series are missing, gaps may appear in the chart (e.g, segments of lines in a line chart will be missing). To eliminate these gaps set this to true. Applies to
    * Line, Area, and Combo charts.
    */
  var interpolateNulls: js.UndefOr[Boolean] = js.undefined
  
  /** The position of the chart legend. */
  var legendPosition: js.UndefOr[String] = js.undefined
  
  /** Gets whether all lines should be rendered smooth or straight by default. Applies to Line charts. */
  var lineSmoothing: js.UndefOr[Boolean] = js.undefined
  
  /** The data this chart is visualizing. */
  var series: js.UndefOr[js.Array[BasicChartSeries]] = js.undefined
  
  /** The stacked type for charts that support vertical stacking. Applies to Area, Bar, Column, Combo, and Stepped Area charts. */
  var stackedType: js.UndefOr[String] = js.undefined
  
  /** True to make the chart 3D. Applies to Bar and Column charts. */
  var threeDimensional: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls whether to display additional data labels on stacked charts which sum the total value of all stacked values at each value along the domain axis. These data labels can only
    * be set when chart_type is one of AREA, BAR, COLUMN, COMBO or STEPPED_AREA and stacked_type is either STACKED or PERCENT_STACKED. In addition, for COMBO, this will only be supported
    * if there is only one type of stackable series type or one type has more series than the others and each of the other types have no more than one series. For example, if a chart has
    * two stacked bar series and one area series, the total data labels will be supported. If it has three bar series and two area series, total data labels are not allowed. Neither
    * CUSTOM nor placement can be set on the total_data_label.
    */
  var totalDataLabel: js.UndefOr[DataLabel] = js.undefined
}
object BasicChartSpec {
  
  inline def apply(): BasicChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicChartSpec]
  }
  
  extension [Self <: BasicChartSpec](x: Self) {
    
    inline def setAxis(value: js.Array[BasicChartAxis]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setAxisVarargs(value: BasicChartAxis*): Self = StObject.set(x, "axis", js.Array(value*))
    
    inline def setChartType(value: String): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
    
    inline def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
    
    inline def setCompareMode(value: String): Self = StObject.set(x, "compareMode", value.asInstanceOf[js.Any])
    
    inline def setCompareModeUndefined: Self = StObject.set(x, "compareMode", js.undefined)
    
    inline def setDomains(value: js.Array[BasicChartDomain]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    inline def setDomainsVarargs(value: BasicChartDomain*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setHeaderCount(value: Double): Self = StObject.set(x, "headerCount", value.asInstanceOf[js.Any])
    
    inline def setHeaderCountUndefined: Self = StObject.set(x, "headerCount", js.undefined)
    
    inline def setInterpolateNulls(value: Boolean): Self = StObject.set(x, "interpolateNulls", value.asInstanceOf[js.Any])
    
    inline def setInterpolateNullsUndefined: Self = StObject.set(x, "interpolateNulls", js.undefined)
    
    inline def setLegendPosition(value: String): Self = StObject.set(x, "legendPosition", value.asInstanceOf[js.Any])
    
    inline def setLegendPositionUndefined: Self = StObject.set(x, "legendPosition", js.undefined)
    
    inline def setLineSmoothing(value: Boolean): Self = StObject.set(x, "lineSmoothing", value.asInstanceOf[js.Any])
    
    inline def setLineSmoothingUndefined: Self = StObject.set(x, "lineSmoothing", js.undefined)
    
    inline def setSeries(value: js.Array[BasicChartSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: BasicChartSeries*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setStackedType(value: String): Self = StObject.set(x, "stackedType", value.asInstanceOf[js.Any])
    
    inline def setStackedTypeUndefined: Self = StObject.set(x, "stackedType", js.undefined)
    
    inline def setThreeDimensional(value: Boolean): Self = StObject.set(x, "threeDimensional", value.asInstanceOf[js.Any])
    
    inline def setThreeDimensionalUndefined: Self = StObject.set(x, "threeDimensional", js.undefined)
    
    inline def setTotalDataLabel(value: DataLabel): Self = StObject.set(x, "totalDataLabel", value.asInstanceOf[js.Any])
    
    inline def setTotalDataLabelUndefined: Self = StObject.set(x, "totalDataLabel", js.undefined)
  }
}
