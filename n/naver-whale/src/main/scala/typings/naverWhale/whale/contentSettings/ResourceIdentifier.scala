package typings.naverWhale.whale.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceIdentifier extends StObject {
  
  /** Optional. A human readable description of the resource.  */
  var description: js.UndefOr[String] = js.native
  
  /** The resource identifier for the given content type. */
  var id: String = js.native
}
object ResourceIdentifier {
  
  @scala.inline
  def apply(id: String): ResourceIdentifier = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdentifier]
  }
  
  @scala.inline
  implicit class ResourceIdentifierMutableBuilder[Self <: ResourceIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
