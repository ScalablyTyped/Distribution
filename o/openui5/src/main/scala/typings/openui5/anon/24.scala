package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  /**
    * Two-dimensional mutable array of selection data to be copied to the clipboard. The first dimension represents
    * the selected rows, and the second dimension represents the cells of the selected rows.
    */
  var data: js.UndefOr[js.Array[js.Array[Any]]] = js.undefined
}
object `24` {
  
  inline def apply(): `24` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `24`] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[js.Array[Any]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: js.Array[Any]*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
