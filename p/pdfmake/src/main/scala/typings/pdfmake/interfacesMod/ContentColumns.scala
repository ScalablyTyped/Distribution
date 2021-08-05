package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentColumns
  extends StObject
     with ContentBase
     with _Content {
  
  var columns: js.Array[Column]
}
object ContentColumns {
  
  inline def apply(columns: js.Array[Column]): ContentColumns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentColumns]
  }
  
  extension [Self <: ContentColumns](x: Self) {
    
    inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
  }
}
