package typings.meshblu.Meshblu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataInput extends StObject {
  
  var online: Boolean = js.native
  
  var uuid: String = js.native
  
  var x: Double = js.native
  
  var y: Double = js.native
}
object DataInput {
  
  @scala.inline
  def apply(online: Boolean, uuid: String, x: Double, y: Double): DataInput = {
    val __obj = js.Dynamic.literal(online = online.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataInput]
  }
  
  @scala.inline
  implicit class DataInputMutableBuilder[Self <: DataInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnline(value: Boolean): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
