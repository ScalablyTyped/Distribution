package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataText extends StObject {
  
  /**
    * Two-dimentional array of strings with data from the clipboard. The first dimension represents the rows,
    * and the second dimension represents the cells of the tabular data.
    */
  var data: js.UndefOr[js.Array[js.Array[String]]] = js.undefined
  
  /**
    * The text data, with all special characters, from the clipboard.
    */
  var text: js.UndefOr[String] = js.undefined
}
object DataText {
  
  inline def apply(): DataText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataText] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Array[js.Array[String]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: js.Array[String]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
