package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteParagraphBulletsRequest extends StObject {
  
  /** The optional table cell location if the text to be modified is in a table cell. If present, the object_id must refer to a table. */
  var cellLocation: js.UndefOr[TableCellLocation] = js.native
  
  /** The object ID of the shape or table containing the text to delete bullets from. */
  var objectId: js.UndefOr[String] = js.native
  
  /** The range of text to delete bullets from, based on TextElement indexes. */
  var textRange: js.UndefOr[Range] = js.native
}
object DeleteParagraphBulletsRequest {
  
  @scala.inline
  def apply(): DeleteParagraphBulletsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteParagraphBulletsRequest]
  }
  
  @scala.inline
  implicit class DeleteParagraphBulletsRequestMutableBuilder[Self <: DeleteParagraphBulletsRequest] (val x: Self) extends AnyVal {
    
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
