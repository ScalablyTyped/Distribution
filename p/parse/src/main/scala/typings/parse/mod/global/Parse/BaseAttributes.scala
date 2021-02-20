package typings.parse.mod.global.Parse

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseAttributes extends StObject {
  
  var createdAt: Date = js.native
  
  var objectId: String = js.native
  
  var updatedAt: Date = js.native
}
object BaseAttributes {
  
  @scala.inline
  def apply(createdAt: Date, objectId: String, updatedAt: Date): BaseAttributes = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAttributes]
  }
  
  @scala.inline
  implicit class BaseAttributesMutableBuilder[Self <: BaseAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedAt(value: Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
  }
}
