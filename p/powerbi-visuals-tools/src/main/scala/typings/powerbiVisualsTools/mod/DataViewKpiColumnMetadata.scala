package typings.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewKpiColumnMetadata extends StObject {
  
  var graphic: String
  
  // When false, five state KPIs are in: { -2, -1, 0, 1, 2 }.
  // When true, five state KPIs are in: { -1, -0.5, 0, 0.5, 1 }.
  var normalizedFiveStateKpiRange: js.UndefOr[Boolean] = js.undefined
}
object DataViewKpiColumnMetadata {
  
  inline def apply(graphic: String): DataViewKpiColumnMetadata = {
    val __obj = js.Dynamic.literal(graphic = graphic.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataViewKpiColumnMetadata]
  }
  
  extension [Self <: DataViewKpiColumnMetadata](x: Self) {
    
    inline def setGraphic(value: String): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    inline def setNormalizedFiveStateKpiRange(value: Boolean): Self = StObject.set(x, "normalizedFiveStateKpiRange", value.asInstanceOf[js.Any])
    
    inline def setNormalizedFiveStateKpiRangeUndefined: Self = StObject.set(x, "normalizedFiveStateKpiRange", js.undefined)
  }
}
