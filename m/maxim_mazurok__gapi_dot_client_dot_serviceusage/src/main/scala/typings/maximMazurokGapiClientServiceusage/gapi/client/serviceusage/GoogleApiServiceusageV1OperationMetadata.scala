package typings.maximMazurokGapiClientServiceusage.gapi.client.serviceusage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiServiceusageV1OperationMetadata extends StObject {
  
  /** The full name of the resources that this operation is directly associated with. */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
}
object GoogleApiServiceusageV1OperationMetadata {
  
  @scala.inline
  def apply(): GoogleApiServiceusageV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleApiServiceusageV1OperationMetadata]
  }
  
  @scala.inline
  implicit class GoogleApiServiceusageV1OperationMetadataMutableBuilder[Self <: GoogleApiServiceusageV1OperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceNames(value: js.Array[String]): Self = StObject.set(x, "resourceNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceNamesUndefined: Self = StObject.set(x, "resourceNames", js.undefined)
    
    @scala.inline
    def setResourceNamesVarargs(value: String*): Self = StObject.set(x, "resourceNames", js.Array(value :_*))
  }
}
