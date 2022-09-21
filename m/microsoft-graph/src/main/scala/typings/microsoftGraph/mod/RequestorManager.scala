package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestorManager
  extends StObject
     with SubjectSet {
  
  /**
    * The hierarchical level of the manager with respect to the requestor. For example, the direct manager of a requestor
    * would have a managerLevel of 1, while the manager of the requestor's manager would have a managerLevel of 2. Default
    * value for managerLevel is 1. Possible values for this property range from 1 to 2.
    */
  var managerLevel: js.UndefOr[NullableOption[Double]] = js.undefined
}
object RequestorManager {
  
  inline def apply(): RequestorManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestorManager]
  }
  
  extension [Self <: RequestorManager](x: Self) {
    
    inline def setManagerLevel(value: NullableOption[Double]): Self = StObject.set(x, "managerLevel", value.asInstanceOf[js.Any])
    
    inline def setManagerLevelNull: Self = StObject.set(x, "managerLevel", null)
    
    inline def setManagerLevelUndefined: Self = StObject.set(x, "managerLevel", js.undefined)
  }
}
