package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebImage extends StObject {
  
  /** (Deprecated) Overall relevancy score for the image. */
  var score: js.UndefOr[Double] = js.undefined
  
  /** The result image URL. */
  var url: js.UndefOr[String] = js.undefined
}
object WebImage {
  
  inline def apply(): WebImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebImage]
  }
  
  extension [Self <: WebImage](x: Self) {
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
