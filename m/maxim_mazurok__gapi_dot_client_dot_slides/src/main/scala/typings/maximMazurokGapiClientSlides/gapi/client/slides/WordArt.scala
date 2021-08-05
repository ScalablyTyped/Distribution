package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordArt extends StObject {
  
  /** The text rendered as word art. */
  var renderedText: js.UndefOr[String] = js.undefined
}
object WordArt {
  
  inline def apply(): WordArt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordArt]
  }
  
  extension [Self <: WordArt](x: Self) {
    
    inline def setRenderedText(value: String): Self = StObject.set(x, "renderedText", value.asInstanceOf[js.Any])
    
    inline def setRenderedTextUndefined: Self = StObject.set(x, "renderedText", js.undefined)
  }
}
