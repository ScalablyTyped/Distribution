package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeTableCellsRequest extends StObject {
  
  /**
    * The table range specifying which cells of the table to merge. Any text in the cells being merged will be concatenated and stored in the "head" cell of the range. This is the
    * upper-left cell of the range when the content direction is left to right, and the upper-right cell of the range otherwise. If the range is non-rectangular (which can occur in some
    * cases where the range covers cells that are already merged or where the table is non-rectangular), a 400 bad request error is returned.
    */
  var tableRange: js.UndefOr[TableRange] = js.native
}
object MergeTableCellsRequest {
  
  @scala.inline
  def apply(): MergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeTableCellsRequest]
  }
  
  @scala.inline
  implicit class MergeTableCellsRequestMutableBuilder[Self <: MergeTableCellsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableRange(value: TableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
  }
}
