package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Lane represents a turn lane at the corresponding turn location.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#lane-object
  */
@js.native
trait Lane extends js.Object {
  
  var indications: js.Array[Indication] = js.native
  
  var valid: Boolean = js.native
}
object Lane {
  
  @scala.inline
  def apply(indications: js.Array[Indication], valid: Boolean): Lane = {
    val __obj = js.Dynamic.literal(indications = indications.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lane]
  }
  
  @scala.inline
  implicit class LaneOps[Self <: Lane] (val x: Self) extends AnyVal {
    
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
    def setIndicationsVarargs(value: Indication*): Self = this.set("indications", js.Array(value :_*))
    
    @scala.inline
    def setIndications(value: js.Array[Indication]): Self = this.set("indications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
}
