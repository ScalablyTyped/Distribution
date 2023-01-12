package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscriptOutputConfig extends StObject {
  
  /** Specifies a Cloud Storage URI for the recognition results. Must be specified in the format: `gs://bucket_name/object_name`, and the bucket must already exist. */
  var gcsUri: js.UndefOr[String] = js.undefined
}
object TranscriptOutputConfig {
  
  inline def apply(): TranscriptOutputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptOutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranscriptOutputConfig] (val x: Self) extends AnyVal {
    
    inline def setGcsUri(value: String): Self = StObject.set(x, "gcsUri", value.asInstanceOf[js.Any])
    
    inline def setGcsUriUndefined: Self = StObject.set(x, "gcsUri", js.undefined)
  }
}
