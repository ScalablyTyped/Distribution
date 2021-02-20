package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStream extends StObject {
  
  /** The codec for this text stream. The default is `"webvtt"`. Supported text codecs: - 'srt' - 'ttml' - 'cea608' - 'cea708' - 'webvtt' */
  var codec: js.UndefOr[String] = js.native
  
  /** Required. The BCP-47 language code, such as `"en-US"` or `"sr-Latn"`. For more information, see https://www.unicode.org/reports/tr35/#Unicode_locale_identifier. */
  var languageCode: js.UndefOr[String] = js.native
  
  /** The mapping for the `Job.edit_list` atoms with text `EditAtom.inputs`. */
  var mapping: js.UndefOr[js.Array[TextAtom]] = js.native
}
object TextStream {
  
  @scala.inline
  def apply(): TextStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStream]
  }
  
  @scala.inline
  implicit class TextStreamMutableBuilder[Self <: TextStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodec(value: String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "codec", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setMapping(value: js.Array[TextAtom]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingUndefined: Self = StObject.set(x, "mapping", js.undefined)
    
    @scala.inline
    def setMappingVarargs(value: TextAtom*): Self = StObject.set(x, "mapping", js.Array(value :_*))
  }
}
