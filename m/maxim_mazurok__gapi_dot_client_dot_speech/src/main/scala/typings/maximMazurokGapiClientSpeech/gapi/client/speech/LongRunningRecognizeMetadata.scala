package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongRunningRecognizeMetadata extends StObject {
  
  /** Time of the most recent processing update. */
  var lastUpdateTime: js.UndefOr[String] = js.native
  
  /** Approximate percentage of audio processed thus far. Guaranteed to be 100 when the audio is fully processed and the results are available. */
  var progressPercent: js.UndefOr[Double] = js.native
  
  /** Time when the request was received. */
  var startTime: js.UndefOr[String] = js.native
  
  /** Output only. The URI of the audio file being transcribed. Empty if the audio was sent as byte content. */
  var uri: js.UndefOr[String] = js.native
}
object LongRunningRecognizeMetadata {
  
  @scala.inline
  def apply(): LongRunningRecognizeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LongRunningRecognizeMetadata]
  }
  
  @scala.inline
  implicit class LongRunningRecognizeMetadataMutableBuilder[Self <: LongRunningRecognizeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setProgressPercent(value: Double): Self = StObject.set(x, "progressPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressPercentUndefined: Self = StObject.set(x, "progressPercent", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
