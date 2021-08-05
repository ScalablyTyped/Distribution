package typings.plotlyJs.anon

import typings.plotlyJs.mod.Datum
import typings.plotlyJs.plotlyJsStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array extends StObject {
  
  var array: js.Array[Datum]
  
  var arrayminus: js.UndefOr[js.Array[Datum]] = js.undefined
  
  var `type`: data
}
object Array {
  
  inline def apply(array: js.Array[Datum]): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("data")
    __obj.asInstanceOf[Array]
  }
  
  extension [Self <: Array](x: Self) {
    
    inline def setArray(value: js.Array[Datum]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: Datum*): Self = StObject.set(x, "array", js.Array(value :_*))
    
    inline def setArrayminus(value: js.Array[Datum]): Self = StObject.set(x, "arrayminus", value.asInstanceOf[js.Any])
    
    inline def setArrayminusUndefined: Self = StObject.set(x, "arrayminus", js.undefined)
    
    inline def setArrayminusVarargs(value: Datum*): Self = StObject.set(x, "arrayminus", js.Array(value :_*))
    
    inline def setType(value: data): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
