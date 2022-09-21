package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Relationtype extends StObject {
  
  var id: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var relation_type: js.UndefOr[String] = js.undefined
  
  var topic_id: js.UndefOr[Double] = js.undefined
}
object Relationtype {
  
  inline def apply(): Relationtype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relationtype]
  }
  
  extension [Self <: Relationtype](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRelation_type(value: String): Self = StObject.set(x, "relation_type", value.asInstanceOf[js.Any])
    
    inline def setRelation_typeUndefined: Self = StObject.set(x, "relation_type", js.undefined)
    
    inline def setTopic_id(value: Double): Self = StObject.set(x, "topic_id", value.asInstanceOf[js.Any])
    
    inline def setTopic_idUndefined: Self = StObject.set(x, "topic_id", js.undefined)
  }
}
