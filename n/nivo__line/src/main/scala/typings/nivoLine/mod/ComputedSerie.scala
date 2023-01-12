package typings.nivoLine.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputedSerie
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var color: js.UndefOr[String] = js.undefined
  
  var data: js.Array[ComputedDatum]
  
  var id: String | Double
}
object ComputedSerie {
  
  inline def apply(data: js.Array[ComputedDatum], id: String | Double): ComputedSerie = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputedSerie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComputedSerie] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setData(value: js.Array[ComputedDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: ComputedDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
