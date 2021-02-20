package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NamedStyle extends StObject {
  
  /** The type of this named style. */
  var namedStyleType: js.UndefOr[String] = js.native
  
  /** The paragraph style of this named style. */
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.native
  
  /** The text style of this named style. */
  var textStyle: js.UndefOr[TextStyle] = js.native
}
object NamedStyle {
  
  @scala.inline
  def apply(): NamedStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedStyle]
  }
  
  @scala.inline
  implicit class NamedStyleMutableBuilder[Self <: NamedStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNamedStyleType(value: String): Self = StObject.set(x, "namedStyleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedStyleTypeUndefined: Self = StObject.set(x, "namedStyleType", js.undefined)
    
    @scala.inline
    def setParagraphStyle(value: ParagraphStyle): Self = StObject.set(x, "paragraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphStyleUndefined: Self = StObject.set(x, "paragraphStyle", js.undefined)
    
    @scala.inline
    def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
  }
}
