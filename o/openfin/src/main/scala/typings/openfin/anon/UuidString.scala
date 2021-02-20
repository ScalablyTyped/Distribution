package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UuidString extends StObject {
  
  var uuid: String = js.native
}
object UuidString {
  
  @scala.inline
  def apply(uuid: String): UuidString = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[UuidString]
  }
  
  @scala.inline
  implicit class UuidStringMutableBuilder[Self <: UuidString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
