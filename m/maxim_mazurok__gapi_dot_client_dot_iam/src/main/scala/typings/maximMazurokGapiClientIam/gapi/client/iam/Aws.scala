package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aws extends StObject {
  
  /** Required. The AWS account ID. */
  var accountId: js.UndefOr[String] = js.undefined
}
object Aws {
  
  inline def apply(): Aws = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aws]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aws] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
