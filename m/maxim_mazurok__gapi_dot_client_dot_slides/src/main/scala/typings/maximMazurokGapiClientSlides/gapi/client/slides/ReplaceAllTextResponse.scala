package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceAllTextResponse extends StObject {
  
  /** The number of occurrences changed by replacing all text. */
  var occurrencesChanged: js.UndefOr[Double] = js.native
}
object ReplaceAllTextResponse {
  
  @scala.inline
  def apply(): ReplaceAllTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceAllTextResponse]
  }
  
  @scala.inline
  implicit class ReplaceAllTextResponseMutableBuilder[Self <: ReplaceAllTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOccurrencesChanged(value: Double): Self = StObject.set(x, "occurrencesChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesChangedUndefined: Self = StObject.set(x, "occurrencesChanged", js.undefined)
  }
}
