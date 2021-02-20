package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTextRequest extends StObject {
  
  /** The optional table cell location if the text is to be deleted from a table cell. If present, the object_id must refer to a table. */
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  
  /** The object ID of the shape or table from which the text will be deleted. */
  var objectId: js.UndefOr[String] = js.native
  
  /**
    * The range of text to delete, based on TextElement indexes. There is always an implicit newline character at the end of a shape's or table cell's text that cannot be deleted.
    * `Range.Type.ALL` will use the correct bounds, but care must be taken when specifying explicit bounds for range types `FROM_START_INDEX` and `FIXED_RANGE`. For example, if the text
    * is "ABC", followed by an implicit newline, then the maximum value is 2 for `text_range.start_index` and 3 for `text_range.end_index`. Deleting text that crosses a paragraph boundary
    * may result in changes to paragraph styles and lists as the two paragraphs are merged. Ranges that include only one code unit of a surrogate pair are expanded to include both code
    * units.
    */
  var textRange: js.UndefOr[Range] = js.native
}
object DeleteTextRequest {
  
  @scala.inline
  def apply(): DeleteTextRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTextRequest]
  }
  
  @scala.inline
  implicit class DeleteTextRequestMutableBuilder[Self <: DeleteTextRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
  }
}
