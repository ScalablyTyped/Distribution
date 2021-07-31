package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamPolicy extends StObject {
  
  /** The JSON representation of the Policy associated with the asset. See https://cloud.google.com/iam/reference/rest/v1/Policy for format details. */
  var policyBlob: js.UndefOr[String] = js.undefined
}
object IamPolicy {
  
  @scala.inline
  def apply(): IamPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamPolicy]
  }
  
  @scala.inline
  implicit class IamPolicyMutableBuilder[Self <: IamPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyBlob(value: String): Self = StObject.set(x, "policyBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyBlobUndefined: Self = StObject.set(x, "policyBlob", js.undefined)
  }
}
