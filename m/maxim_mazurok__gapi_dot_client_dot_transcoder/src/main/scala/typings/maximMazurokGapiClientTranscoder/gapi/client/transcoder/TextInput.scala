package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextInput extends StObject {
  
  /** Required. The `Input.key` that identifies the input file. */
  var key: js.UndefOr[String] = js.native
  
  /** Required. The zero-based index of the track in the input file. */
  var track: js.UndefOr[Double] = js.native
}
object TextInput {
  
  @scala.inline
  def apply(): TextInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextInput]
  }
  
  @scala.inline
  implicit class TextInputMutableBuilder[Self <: TextInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setTrack(value: Double): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
  }
}
