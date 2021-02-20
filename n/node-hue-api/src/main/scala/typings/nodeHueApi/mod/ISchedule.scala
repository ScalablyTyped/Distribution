package typings.nodeHueApi.mod

import typings.nodeHueApi.anon.Address
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISchedule extends StObject {
  
  var command: Address = js.native
  
  var description: String = js.native
  
  var name: String = js.native
  
  var time: Date = js.native
}
object ISchedule {
  
  @scala.inline
  def apply(command: Address, description: String, name: String, time: Date): ISchedule = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISchedule]
  }
  
  @scala.inline
  implicit class IScheduleMutableBuilder[Self <: ISchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommand(value: Address): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
