package typings.nivoBullet.distTypesTypesMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datum extends StObject {
  
  var id: DatumId
  
  var markers: js.UndefOr[js.Array[Double]] = js.undefined
  
  var measures: js.Array[Double]
  
  var ranges: js.Array[Double]
  
  var title: js.UndefOr[ReactNode] = js.undefined
}
object Datum {
  
  inline def apply(id: DatumId, measures: js.Array[Double], ranges: js.Array[Double]): Datum = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], measures = measures.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datum]
  }
  
  extension [Self <: Datum](x: Self) {
    
    inline def setId(value: DatumId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMarkers(value: js.Array[Double]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setMarkersVarargs(value: Double*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def setMeasures(value: js.Array[Double]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresVarargs(value: Double*): Self = StObject.set(x, "measures", js.Array(value*))
    
    inline def setRanges(value: js.Array[Double]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: Double*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
