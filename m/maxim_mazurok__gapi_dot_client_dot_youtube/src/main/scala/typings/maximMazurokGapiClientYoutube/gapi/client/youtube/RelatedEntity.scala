package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelatedEntity extends StObject {
  
  var entity: js.UndefOr[Entity] = js.native
}
object RelatedEntity {
  
  @scala.inline
  def apply(): RelatedEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedEntity]
  }
  
  @scala.inline
  implicit class RelatedEntityMutableBuilder[Self <: RelatedEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
  }
}
