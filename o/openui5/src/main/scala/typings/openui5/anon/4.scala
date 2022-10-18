package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  /**
    * 2D array of strings with data from the clipboard. The first dimension represents the rows, and the second
    * dimension represents the cells of the tabular data.
    */
  var data: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setData(value: js.Array[js.Array[String]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: js.Array[String]*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
