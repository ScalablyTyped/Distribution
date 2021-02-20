package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UUIDObject extends StObject {
  
  var uuids: js.Array[String] = js.native
}
object UUIDObject {
  
  @scala.inline
  def apply(uuids: js.Array[String]): UUIDObject = {
    val __obj = js.Dynamic.literal(uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[UUIDObject]
  }
  
  @scala.inline
  implicit class UUIDObjectMutableBuilder[Self <: UUIDObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUuids(value: js.Array[String]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidsVarargs(value: String*): Self = StObject.set(x, "uuids", js.Array(value :_*))
  }
}
