package typings.parse.mod.global.Parse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONBaseAttributes extends StObject {
  
  var createdAt: String = js.native
  
  var objectId: String = js.native
  
  var updatedAt: String = js.native
}
object JSONBaseAttributes {
  
  @scala.inline
  def apply(createdAt: String, objectId: String, updatedAt: String): JSONBaseAttributes = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONBaseAttributes]
  }
  
  @scala.inline
  implicit class JSONBaseAttributesMutableBuilder[Self <: JSONBaseAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: String): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: String): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
