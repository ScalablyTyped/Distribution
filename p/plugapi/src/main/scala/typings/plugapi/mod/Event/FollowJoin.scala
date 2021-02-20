package typings.plugapi.mod.Event

import typings.plugapi.mod.FollowJoinData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FollowJoin extends StObject {
  
  var data: FollowJoinData = js.native
  
  var `type`: String = js.native
}
object FollowJoin {
  
  @scala.inline
  def apply(data: FollowJoinData, `type`: String): FollowJoin = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FollowJoin]
  }
  
  @scala.inline
  implicit class FollowJoinMutableBuilder[Self <: FollowJoin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: FollowJoinData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
