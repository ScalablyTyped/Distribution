package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailureDetail extends StObject {
  
  /** A description of the failure. */
  var description: js.UndefOr[String] = js.undefined
}
object FailureDetail {
  
  inline def apply(): FailureDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailureDetail]
  }
  
  extension [Self <: FailureDetail](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
