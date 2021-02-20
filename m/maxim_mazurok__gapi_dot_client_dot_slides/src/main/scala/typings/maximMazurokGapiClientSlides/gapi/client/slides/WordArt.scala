package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WordArt extends StObject {
  
  /** The text rendered as word art. */
  var renderedText: js.UndefOr[String] = js.native
}
object WordArt {
  
  @scala.inline
  def apply(): WordArt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordArt]
  }
  
  @scala.inline
  implicit class WordArtMutableBuilder[Self <: WordArt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderedText(value: String): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderedTextUndefined: Self = StObject.set(x, "renderedText", js.undefined)
  }
}
