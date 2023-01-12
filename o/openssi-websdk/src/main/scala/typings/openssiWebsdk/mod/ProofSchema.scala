package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProofSchema extends StObject {
  
  var id: String
  
  var name: String
  
  var requested_attributes: Any
  
  var requested_predicates: js.UndefOr[Any] = js.undefined
  
  var version: String
}
object ProofSchema {
  
  inline def apply(id: String, name: String, requested_attributes: Any, version: String): ProofSchema = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requested_attributes = requested_attributes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProofSchema] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequested_attributes(value: Any): Self = StObject.set(x, "requested_attributes", value.asInstanceOf[js.Any])
    
    inline def setRequested_predicates(value: Any): Self = StObject.set(x, "requested_predicates", value.asInstanceOf[js.Any])
    
    inline def setRequested_predicatesUndefined: Self = StObject.set(x, "requested_predicates", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
