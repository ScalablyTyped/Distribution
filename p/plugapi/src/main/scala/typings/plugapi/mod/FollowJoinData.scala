package typings.plugapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowJoinData extends js.Object {
  
  var id: String = js.native
  
  var r: Double = js.native
  
  var un: String = js.native
}
object FollowJoinData {
  
  @scala.inline
  def apply(id: String, r: Double, un: String): FollowJoinData = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], un = un.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowJoinData]
  }
  
  @scala.inline
  implicit class FollowJoinDataOps[Self <: FollowJoinData] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUn(value: String): Self = this.set("un", value.asInstanceOf[js.Any])
  }
}
