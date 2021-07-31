package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uuid extends StObject {
  
  var name: String
  
  var uuid: String
}
object Uuid {
  
  @scala.inline
  def apply(name: String, uuid: String): Uuid = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uuid]
  }
  
  @scala.inline
  implicit class UuidMutableBuilder[Self <: Uuid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
