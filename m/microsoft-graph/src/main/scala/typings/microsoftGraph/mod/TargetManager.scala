package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetManager
  extends StObject
     with SubjectSet {
  
  // Manager level, between 1 and 4. The direct manager is 1.
  var managerLevel: js.UndefOr[NullableOption[Double]] = js.undefined
}
object TargetManager {
  
  inline def apply(): TargetManager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetManager]
  }
  
  extension [Self <: TargetManager](x: Self) {
    
    inline def setManagerLevel(value: NullableOption[Double]): Self = StObject.set(x, "managerLevel", value.asInstanceOf[js.Any])
    
    inline def setManagerLevelNull: Self = StObject.set(x, "managerLevel", null)
    
    inline def setManagerLevelUndefined: Self = StObject.set(x, "managerLevel", js.undefined)
  }
}
