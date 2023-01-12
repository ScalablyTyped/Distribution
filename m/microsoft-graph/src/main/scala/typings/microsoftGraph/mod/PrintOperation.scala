package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintOperation
  extends StObject
     with Entity {
  
  // The DateTimeOffset when the operation was created. Read-only.
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  // The status of the operation. Read-only.
  var status: js.UndefOr[PrintOperationStatus] = js.undefined
}
object PrintOperation {
  
  inline def apply(): PrintOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintOperation] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setStatus(value: PrintOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
