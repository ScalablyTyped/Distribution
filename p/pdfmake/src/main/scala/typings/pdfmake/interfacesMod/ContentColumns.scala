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
  
  @scala.inline
  def apply(columns: js.Array[Column]): ContentColumns = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentColumns]
  }
  
  @scala.inline
  implicit class ContentColumnsMutableBuilder[Self <: ContentColumns] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value :_*))
  }
}
