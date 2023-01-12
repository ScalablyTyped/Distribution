package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: String
  
  var markers: js.Array[Double]
  
  var measures: js.Array[Double]
  
  var ranges: js.Array[Double]
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object Id {
  
  inline def apply(id: String, markers: js.Array[Double], measures: js.Array[Double], ranges: js.Array[Double]): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], markers = markers.asInstanceOf[js.Any], measures = measures.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMarkers(value: js.Array[Double]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersVarargs(value: Double*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def setMeasures(value: js.Array[Double]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    inline def setMeasuresVarargs(value: Double*): Self = StObject.set(x, "measures", js.Array(value*))
    
    inline def setRanges(value: js.Array[Double]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setRangesVarargs(value: Double*): Self = StObject.set(x, "ranges", js.Array(value*))
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
