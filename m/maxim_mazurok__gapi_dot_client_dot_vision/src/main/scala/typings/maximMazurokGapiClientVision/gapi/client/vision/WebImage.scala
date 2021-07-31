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
  
  @scala.inline
  def apply(): WebImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebImage]
  }
  
  @scala.inline
  implicit class WebImageMutableBuilder[Self <: WebImage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
