package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSpan extends StObject {
  
  /** The API calculates the beginning offset of the content in the original document according to the EncodingType specified in the API request. */
  var beginOffset: js.UndefOr[Double] = js.undefined
  
  /** The content of the output text. */
  var content: js.UndefOr[String] = js.undefined
}
object TextSpan {
  
  @scala.inline
  def apply(): TextSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextSpan]
  }
  
  @scala.inline
  implicit class TextSpanMutableBuilder[Self <: TextSpan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginOffset(value: Double): Self = StObject.set(x, "beginOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginOffsetUndefined: Self = StObject.set(x, "beginOffset", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
