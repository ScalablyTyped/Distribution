package typings.mendixmodelsdk.deltasDeltasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDelta extends StObject {
  
  /**
    * The ID of the unit (containing an element or property value) to which the delta is to be applied.
    */
  var unitId: String = js.native
}
object IDelta {
  
  @scala.inline
  def apply(unitId: String): IDelta = {
    val __obj = js.Dynamic.literal(unitId = unitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDelta]
  }
  
  @scala.inline
  implicit class IDeltaMutableBuilder[Self <: IDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnitId(value: String): Self = StObject.set(x, "unitId", value.asInstanceOf[js.Any])
  }
}
