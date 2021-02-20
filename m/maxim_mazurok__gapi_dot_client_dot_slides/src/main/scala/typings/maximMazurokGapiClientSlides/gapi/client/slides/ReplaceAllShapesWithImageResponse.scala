package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceAllShapesWithImageResponse extends StObject {
  
  /** The number of shapes replaced with images. */
  var occurrencesChanged: js.UndefOr[Double] = js.native
}
object ReplaceAllShapesWithImageResponse {
  
  @scala.inline
  def apply(): ReplaceAllShapesWithImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllShapesWithImageResponse]
  }
  
  @scala.inline
  implicit class ReplaceAllShapesWithImageResponseMutableBuilder[Self <: ReplaceAllShapesWithImageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
  }
}
