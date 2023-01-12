package typings.nivoLine.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Serie
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var data: js.Array[Datum]
  
  var id: String | Double
}
object Serie {
  
  inline def apply(data: js.Array[Datum], id: String | Double): Serie = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Serie] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
