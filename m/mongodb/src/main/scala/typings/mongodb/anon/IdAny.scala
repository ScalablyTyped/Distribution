package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdAny extends StObject {
  
  var _id: js.Any = js.native
}
object IdAny {
  
  @scala.inline
  def apply(_id: js.Any): IdAny = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdAny]
  }
  
  @scala.inline
  implicit class IdAnyMutableBuilder[Self <: IdAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set_id(value: js.Any): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
