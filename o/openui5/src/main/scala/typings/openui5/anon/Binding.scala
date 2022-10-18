package typings.openui5.anon

import typings.openui5.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binding extends StObject {
  
  /**
    * a reference to the AnalyticalBinding which started the batch request
    */
  var binding: js.Object
  
  /**
    * an Array with detail information for all executed batch sub-requests
    */
  var executedRequests: js.Array[Any]
  
  /**
    * the analyticalInfo version at the time of the creation of this BatchResponseCollector instance, this
    * may change during the process of a pending request. Typically changed via a call to AnalyticalBinding#updateAnalyticalInfo.
    */
  var lastAnalyticalInfoVersion: int
}
object Binding {
  
  inline def apply(binding: js.Object, executedRequests: js.Array[Any], lastAnalyticalInfoVersion: int): Binding = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], executedRequests = executedRequests.asInstanceOf[js.Any], lastAnalyticalInfoVersion = lastAnalyticalInfoVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding]
  }
  
  extension [Self <: Binding](x: Self) {
    
    inline def setBinding(value: js.Object): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setExecutedRequests(value: js.Array[Any]): Self = StObject.set(x, "executedRequests", value.asInstanceOf[js.Any])
    
    inline def setExecutedRequestsVarargs(value: Any*): Self = StObject.set(x, "executedRequests", js.Array(value*))
    
    inline def setLastAnalyticalInfoVersion(value: int): Self = StObject.set(x, "lastAnalyticalInfoVersion", value.asInstanceOf[js.Any])
  }
}
