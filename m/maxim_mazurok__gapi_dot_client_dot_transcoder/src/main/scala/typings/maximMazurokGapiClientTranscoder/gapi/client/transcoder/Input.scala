package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  /** A unique key for this input. Must be specified when using advanced mapping and edit lists. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Preprocessing configurations. */
  var preprocessingConfig: js.UndefOr[PreprocessingConfig] = js.undefined
  
  /** URI of the media. It must be stored in Cloud Storage. Example `gs://bucket/inputs/file.mp4`. If empty the value will be populated from `Job.input_uri`. */
  var uri: js.UndefOr[String] = js.undefined
}
object Input {
  
  @scala.inline
  def apply(): Input = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit class InputMutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setPreprocessingConfig(value: PreprocessingConfig): Self = StObject.set(x, "preprocessingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreprocessingConfigUndefined: Self = StObject.set(x, "preprocessingConfig", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
