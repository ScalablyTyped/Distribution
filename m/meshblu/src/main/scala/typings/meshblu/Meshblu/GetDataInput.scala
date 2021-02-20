package typings.meshblu.Meshblu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDataInput extends StObject {
  
  var finish: String = js.native
  
  var limit: Double = js.native
  
  var start: String = js.native
  
  var uuid: String = js.native
}
object GetDataInput {
  
  @scala.inline
  def apply(finish: String, limit: Double, start: String, uuid: String): GetDataInput = {
    val __obj = js.Dynamic.literal(finish = finish.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataInput]
  }
  
  @scala.inline
  implicit class GetDataInputMutableBuilder[Self <: GetDataInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinish(value: String): Self = StObject.set(x, "finish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
