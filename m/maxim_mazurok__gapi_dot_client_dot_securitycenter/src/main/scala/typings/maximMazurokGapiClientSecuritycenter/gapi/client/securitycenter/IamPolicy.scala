package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamPolicy extends StObject {
  
  /** The JSON representation of the Policy associated with the asset. See https://cloud.google.com/iam/reference/rest/v1/Policy for format details. */
  var policyBlob: js.UndefOr[String] = js.undefined
}
object IamPolicy {
  
  inline def apply(): IamPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamPolicy]
  }
  
  extension [Self <: IamPolicy](x: Self) {
    
    inline def setPolicyBlob(value: String): Self = StObject.set(x, "policyBlob", value.asInstanceOf[js.Any])
    
    inline def setPolicyBlobUndefined: Self = StObject.set(x, "policyBlob", js.undefined)
  }
}
