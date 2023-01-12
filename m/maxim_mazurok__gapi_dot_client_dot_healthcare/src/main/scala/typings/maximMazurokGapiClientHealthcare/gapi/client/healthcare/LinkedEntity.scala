package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkedEntity extends StObject {
  
  /**
    * entity_id is a concept unique identifier. These are prefixed by a string that identifies the entity coding system, followed by the unique identifier within that system. For example,
    * "UMLS/C0000970". This also supports ad hoc entities, which are formed by normalizing entity mention content.
    */
  var entityId: js.UndefOr[String] = js.undefined
}
object LinkedEntity {
  
  inline def apply(): LinkedEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkedEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkedEntity] (val x: Self) extends AnyVal {
    
    inline def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
  }
}
