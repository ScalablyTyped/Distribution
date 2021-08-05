package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTextStyleRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `text_style` is implied and should not be specified. A single `"*"` can be used as short-hand for
    * listing every field. For example, to update the text style to bold, set `fields` to `"bold"`. To reset a property to its default value, include its field name in the field mask but
    * leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /**
    * The range of text to style. The range may be extended to include adjacent newlines. If the range fully contains a paragraph belonging to a list, the paragraph's bullet is also
    * updated with the matching text style. Ranges cannot be inserted inside a relative UpdateTextStyleRequest.
    */
  var range: js.UndefOr[Range] = js.undefined
  
  /**
    * The styles to set on the text. If the value for a particular style matches that of the parent, that style will be set to inherit. Certain text style changes may cause other changes
    * in order to to mirror the behavior of the Docs editor. See the documentation of TextStyle for more information.
    */
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}
object UpdateTextStyleRequest {
  
  inline def apply(): UpdateTextStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTextStyleRequest]
  }
  
  extension [Self <: UpdateTextStyleRequest](x: Self) {
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
