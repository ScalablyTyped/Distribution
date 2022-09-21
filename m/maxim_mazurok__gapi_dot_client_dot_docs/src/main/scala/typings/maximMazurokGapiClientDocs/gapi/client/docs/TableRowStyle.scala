package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRowStyle extends StObject {
  
  /** The minimum height of the row. The row will be rendered in the Docs editor at a height equal to or greater than this value in order to show all the content in the row's cells. */
  var minRowHeight: js.UndefOr[Dimension] = js.undefined
  
  /** Whether the row cannot overflow across page or column boundaries. */
  var preventOverflow: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the row is a table header. */
  var tableHeader: js.UndefOr[Boolean] = js.undefined
}
object TableRowStyle {
  
  inline def apply(): TableRowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowStyle]
  }
  
  extension [Self <: TableRowStyle](x: Self) {
    
    inline def setMinRowHeight(value: Dimension): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
    
    inline def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
    
    inline def setPreventOverflow(value: Boolean): Self = StObject.set(x, "preventOverflow", value.asInstanceOf[js.Any])
    
    inline def setPreventOverflowUndefined: Self = StObject.set(x, "preventOverflow", js.undefined)
    
    inline def setTableHeader(value: Boolean): Self = StObject.set(x, "tableHeader", value.asInstanceOf[js.Any])
    
    inline def setTableHeaderUndefined: Self = StObject.set(x, "tableHeader", js.undefined)
  }
}
