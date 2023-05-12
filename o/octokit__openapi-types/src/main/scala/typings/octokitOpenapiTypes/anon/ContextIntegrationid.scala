package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextIntegrationid extends StObject {
  
  /** @description The status check context name that must be present on the commit. */
  var context: String
  
  /** @description The optional integration ID that this status check must originate from. */
  var integration_id: js.UndefOr[Double] = js.undefined
}
object ContextIntegrationid {
  
  inline def apply(context: String): ContextIntegrationid = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextIntegrationid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextIntegrationid] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setIntegration_id(value: Double): Self = StObject.set(x, "integration_id", value.asInstanceOf[js.Any])
    
    inline def setIntegration_idUndefined: Self = StObject.set(x, "integration_id", js.undefined)
  }
}
