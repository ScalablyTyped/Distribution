package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncAnnotateFileResponse extends StObject {
  
  /** The output location and metadata from AsyncAnnotateFileRequest. */
  var outputConfig: js.UndefOr[OutputConfig] = js.native
}
object AsyncAnnotateFileResponse {
  
  @scala.inline
  def apply(): AsyncAnnotateFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncAnnotateFileResponse]
  }
  
  @scala.inline
  implicit class AsyncAnnotateFileResponseMutableBuilder[Self <: AsyncAnnotateFileResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
