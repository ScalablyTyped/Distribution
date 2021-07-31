package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertTableRequest extends StObject {
  
  /** The number of columns in the table. */
  var columns: js.UndefOr[Double] = js.undefined
  
  /**
    * Inserts the table at the end of the given header, footer or document body. A newline character will be inserted before the inserted table. Tables cannot be inserted inside a
    * footnote.
    */
  var endOfSegmentLocation: js.UndefOr[EndOfSegmentLocation] = js.undefined
  
  /**
    * Inserts the table at a specific model index. A newline character will be inserted before the inserted table, therefore the table start index will be at the specified location index
    * + 1. The table must be inserted inside the bounds of an existing Paragraph. For instance, it cannot be inserted at a table's start index (i.e. between an existing table and its
    * preceding paragraph). Tables cannot be inserted inside a footnote or equation.
    */
  var location: js.UndefOr[Location] = js.undefined
  
  /** The number of rows in the table. */
  var rows: js.UndefOr[Double] = js.undefined
}
object InsertTableRequest {
  
  @scala.inline
  def apply(): InsertTableRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertTableRequest]
  }
  
  @scala.inline
  implicit class InsertTableRequestMutableBuilder[Self <: InsertTableRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setEndOfSegmentLocation(value: EndOfSegmentLocation): Self = StObject.set(x, "endOfSegmentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndOfSegmentLocationUndefined: Self = StObject.set(x, "endOfSegmentLocation", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
