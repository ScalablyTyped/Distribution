package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateParagraphStyleRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `paragraph_style` is implied and should not be specified. For example, to update the paragraph
    * style's alignment property, set `fields` to `"alignment"`. To reset a property to its default value, include its field name in the field mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The styles to set on the paragraphs. Certain paragraph style changes may cause other changes in order to mirror the behavior of the Docs editor. See the documentation of
    * ParagraphStyle for more information.
    */
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
  
  /** The range overlapping the paragraphs to style. */
  var range: js.UndefOr[Range] = js.undefined
}
object UpdateParagraphStyleRequest {
  
  @scala.inline
  def apply(): UpdateParagraphStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParagraphStyleRequest]
  }
  
  @scala.inline
  implicit class UpdateParagraphStyleRequestMutableBuilder[Self <: UpdateParagraphStyleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setParagraphStyle(value: ParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
