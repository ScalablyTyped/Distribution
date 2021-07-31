package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Uid extends StObject {
  
  var id: js.Any
  
  var uid: js.Any
}
object Uid {
  
  @scala.inline
  def apply(id: js.Any, uid: js.Any): Uid = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uid]
  }
  
  @scala.inline
  implicit class UidMutableBuilder[Self <: Uid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: js.Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: js.Any): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
