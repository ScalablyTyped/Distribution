package typings.mendixmodelsdk.deltasDeltasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDelta extends js.Object {
  
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
  implicit class IDeltaOps[Self <: IDelta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUnitId(value: String): Self = this.set("unitId", value.asInstanceOf[js.Any])
  }
}
