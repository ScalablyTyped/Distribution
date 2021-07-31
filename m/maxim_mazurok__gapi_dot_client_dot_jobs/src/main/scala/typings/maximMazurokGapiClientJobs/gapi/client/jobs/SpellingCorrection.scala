package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpellingCorrection extends StObject {
  
  /** Indicates if the query was corrected by the spell checker. */
  var corrected: js.UndefOr[Boolean] = js.undefined
  
  /** Correction output consisting of the corrected keyword string. */
  var correctedText: js.UndefOr[String] = js.undefined
}
object SpellingCorrection {
  
  @scala.inline
  def apply(): SpellingCorrection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpellingCorrection]
  }
  
  @scala.inline
  implicit class SpellingCorrectionMutableBuilder[Self <: SpellingCorrection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCorrected(value: Boolean): Self = StObject.set(x, "corrected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectedText(value: String): Self = StObject.set(x, "correctedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCorrectedTextUndefined: Self = StObject.set(x, "correctedText", js.undefined)
    
    @scala.inline
    def setCorrectedUndefined: Self = StObject.set(x, "corrected", js.undefined)
  }
}
