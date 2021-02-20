package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentTable
  extends ContentBase
     with _Content {
  
  var layout: js.UndefOr[TableLayout] = js.native
  
  var table: Table = js.native
}
object ContentTable {
  
  @scala.inline
  def apply(table: Table): ContentTable = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTable]
  }
  
  @scala.inline
  implicit class ContentTableMutableBuilder[Self <: ContentTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: TableLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
  }
}
