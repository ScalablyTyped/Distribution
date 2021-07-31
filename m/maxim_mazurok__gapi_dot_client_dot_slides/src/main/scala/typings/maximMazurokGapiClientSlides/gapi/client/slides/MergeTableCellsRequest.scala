package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeTableCellsRequest extends StObject {
  
  /** The object ID of the table. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * The table range specifying which cells of the table to merge. Any text in the cells being merged will be concatenated and stored in the upper-left ("head") cell of the range. If the
    * range is non-rectangular (which can occur in some cases where the range covers cells that are already merged), a 400 bad request error is returned.
    */
  var tableRange: js.UndefOr[TableRange] = js.undefined
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
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setTableRange(value: TableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
  }
}
