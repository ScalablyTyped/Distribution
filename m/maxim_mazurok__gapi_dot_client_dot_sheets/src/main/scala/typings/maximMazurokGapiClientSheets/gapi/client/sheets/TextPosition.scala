package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextPosition extends StObject {
  
  /** Horizontal alignment setting for the piece of text. */
  var horizontalAlignment: js.UndefOr[String] = js.native
}
object TextPosition {
  
  @scala.inline
  def apply(): TextPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPosition]
  }
  
  @scala.inline
  implicit class TextPositionMutableBuilder[Self <: TextPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
  }
}
