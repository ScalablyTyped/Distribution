package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureDetail extends StObject {
  
  /** A description of the failure. */
  var description: js.UndefOr[String] = js.native
}
object FailureDetail {
  
  @scala.inline
  def apply(): FailureDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureDetail]
  }
  
  @scala.inline
  implicit class FailureDetailMutableBuilder[Self <: FailureDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
