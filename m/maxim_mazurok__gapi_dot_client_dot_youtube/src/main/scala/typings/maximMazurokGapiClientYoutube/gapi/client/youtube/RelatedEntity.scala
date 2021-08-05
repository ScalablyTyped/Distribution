package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedEntity extends StObject {
  
  var entity: js.UndefOr[Entity] = js.undefined
}
object RelatedEntity {
  
  inline def apply(): RelatedEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedEntity]
  }
  
  extension [Self <: RelatedEntity](x: Self) {
    
    inline def setEntity(value: Entity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
  }
}
