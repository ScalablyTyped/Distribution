package typings.musickitJs.MusicKit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchChartResult[T] extends StObject {
  
  var chart: String
  
  var data: js.Array[T]
  
  var href: js.UndefOr[String] = js.undefined
  
  var name: String
  
  var next: js.UndefOr[String] = js.undefined
}
object SearchChartResult {
  
  inline def apply[T](chart: String, data: js.Array[T], name: String): SearchChartResult[T] = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchChartResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchChartResult[?], T] (val x: Self & SearchChartResult[T]) extends AnyVal {
    
    inline def setChart(value: String): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
