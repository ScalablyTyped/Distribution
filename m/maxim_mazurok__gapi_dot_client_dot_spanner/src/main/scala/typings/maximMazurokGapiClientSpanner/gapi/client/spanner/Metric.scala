package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metric extends StObject {
  
  /** The aggregation function used to aggregate each key bucket */
  var aggregation: js.UndefOr[String] = js.undefined
  
  /** The category of the metric, e.g. "Activity", "Alerts", "Reads", etc. */
  var category: js.UndefOr[LocalizedString] = js.undefined
  
  /** The references to numerator and denominator metrics for a derived metric. */
  var derived: js.UndefOr[DerivedMetric] = js.undefined
  
  /** The displayed label of the metric. */
  var displayLabel: js.UndefOr[LocalizedString] = js.undefined
  
  /** Whether the metric has any non-zero data. */
  var hasNonzeroData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value that is considered hot for the metric. On a per metric basis hotness signals high utilization and something that might potentially be a cause for concern by the end user.
    * hot_value is used to calibrate and scale visual color scales.
    */
  var hotValue: js.UndefOr[Double] = js.undefined
  
  /** The (sparse) mapping from time index to an IndexedHotKey message, representing those time intervals for which there are hot keys. */
  var indexedHotKeys: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.spanner.gapi.client.spanner.IndexedHotKey} */ js.Any
  ] = js.undefined
  
  /** The (sparse) mapping from time interval index to an IndexedKeyRangeInfos message, representing those time intervals for which there are informational messages concerning key ranges. */
  var indexedKeyRangeInfos: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.spanner.gapi.client.spanner.IndexedKeyRangeInfos} */ js.Any
  ] = js.undefined
  
  /** Information about the metric. */
  var info: js.UndefOr[LocalizedString] = js.undefined
  
  /** The data for the metric as a matrix. */
  var matrix: js.UndefOr[MetricMatrix] = js.undefined
  
  /** The unit of the metric. */
  var unit: js.UndefOr[LocalizedString] = js.undefined
  
  /** Whether the metric is visible to the end user. */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Metric {
  
  inline def apply(): Metric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metric]
  }
  
  extension [Self <: Metric](x: Self) {
    
    inline def setAggregation(value: String): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setCategory(value: LocalizedString): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setDerived(value: DerivedMetric): Self = StObject.set(x, "derived", value.asInstanceOf[js.Any])
    
    inline def setDerivedUndefined: Self = StObject.set(x, "derived", js.undefined)
    
    inline def setDisplayLabel(value: LocalizedString): Self = StObject.set(x, "displayLabel", value.asInstanceOf[js.Any])
    
    inline def setDisplayLabelUndefined: Self = StObject.set(x, "displayLabel", js.undefined)
    
    inline def setHasNonzeroData(value: Boolean): Self = StObject.set(x, "hasNonzeroData", value.asInstanceOf[js.Any])
    
    inline def setHasNonzeroDataUndefined: Self = StObject.set(x, "hasNonzeroData", js.undefined)
    
    inline def setHotValue(value: Double): Self = StObject.set(x, "hotValue", value.asInstanceOf[js.Any])
    
    inline def setHotValueUndefined: Self = StObject.set(x, "hotValue", js.undefined)
    
    inline def setIndexedHotKeys(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.spanner.gapi.client.spanner.IndexedHotKey} */ js.Any
    ): Self = StObject.set(x, "indexedHotKeys", value.asInstanceOf[js.Any])
    
    inline def setIndexedHotKeysUndefined: Self = StObject.set(x, "indexedHotKeys", js.undefined)
    
    inline def setIndexedKeyRangeInfos(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.spanner.gapi.client.spanner.IndexedKeyRangeInfos} */ js.Any
    ): Self = StObject.set(x, "indexedKeyRangeInfos", value.asInstanceOf[js.Any])
    
    inline def setIndexedKeyRangeInfosUndefined: Self = StObject.set(x, "indexedKeyRangeInfos", js.undefined)
    
    inline def setInfo(value: LocalizedString): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setMatrix(value: MetricMatrix): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixUndefined: Self = StObject.set(x, "matrix", js.undefined)
    
    inline def setUnit(value: LocalizedString): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
