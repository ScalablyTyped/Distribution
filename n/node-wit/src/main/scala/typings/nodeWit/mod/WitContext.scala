package typings.nodeWit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WitContext extends js.Object {
  
  var entities: js.UndefOr[js.Array[WitEntity]] = js.native
  
  var location: js.UndefOr[String] = js.native
  
  var reference_time: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[js.Array[String]] = js.native
  
  var timezone: js.UndefOr[String] = js.native
}
object WitContext {
  
  @scala.inline
  def apply(): WitContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WitContext]
  }
  
  @scala.inline
  implicit class WitContextOps[Self <: WitContext] (val x: Self) extends AnyVal {
    
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
    def setEntitiesVarargs(value: WitEntity*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[WitEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setReference_time(value: String): Self = this.set("reference_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReference_time: Self = this.set("reference_time", js.undefined)
    
    @scala.inline
    def setStateVarargs(value: String*): Self = this.set("state", js.Array(value :_*))
    
    @scala.inline
    def setState(value: js.Array[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
  }
}
