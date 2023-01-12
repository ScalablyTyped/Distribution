package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReconciliationOperationMetadata extends StObject {
  
  /** DEPRECATED. Use exclusive_action instead. */
  var deleteResource: js.UndefOr[Boolean] = js.undefined
  
  var exclusiveAction: js.UndefOr[String] = js.undefined
}
object ReconciliationOperationMetadata {
  
  inline def apply(): ReconciliationOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReconciliationOperationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReconciliationOperationMetadata] (val x: Self) extends AnyVal {
    
    inline def setDeleteResource(value: Boolean): Self = StObject.set(x, "deleteResource", value.asInstanceOf[js.Any])
    
    inline def setDeleteResourceUndefined: Self = StObject.set(x, "deleteResource", js.undefined)
    
    inline def setExclusiveAction(value: String): Self = StObject.set(x, "exclusiveAction", value.asInstanceOf[js.Any])
    
    inline def setExclusiveActionUndefined: Self = StObject.set(x, "exclusiveAction", js.undefined)
  }
}
