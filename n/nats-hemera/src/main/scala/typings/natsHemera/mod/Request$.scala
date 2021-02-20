package typings.natsHemera.mod

import typings.natsHemera.natsHemeraStrings.pubsub
import typings.natsHemera.natsHemeraStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request$ extends StObject {
  
  var id: String = js.native
  
  var `type`: pubsub | request = js.native
}
object Request$ {
  
  @scala.inline
  def apply(id: String, `type`: pubsub | request): Request$ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request$]
  }
  
  @scala.inline
  implicit class Request$MutableBuilder[Self <: Request$] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: pubsub | request): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
