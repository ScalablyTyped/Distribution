package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExceptionRevokedEventDataType extends StObject {
  
  /**
    * The id of revoked exception, as reported in <code>exceptionThrown</code>.
    */
  var exceptionId: Double
  
  /**
    * Reason describing why exception was revoked.
    */
  var reason: String
}
object ExceptionRevokedEventDataType {
  
  @scala.inline
  def apply(exceptionId: Double, reason: String): ExceptionRevokedEventDataType = {
    val __obj = js.Dynamic.literal(exceptionId = exceptionId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionRevokedEventDataType]
  }
  
  @scala.inline
  implicit class ExceptionRevokedEventDataTypeMutableBuilder[Self <: ExceptionRevokedEventDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionId(value: Double): Self = StObject.set(x, "exceptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
