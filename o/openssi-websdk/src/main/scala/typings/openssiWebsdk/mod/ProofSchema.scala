package typings.openssiWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProofSchema extends StObject {
  
  var id: String = js.native
  
  var name: String = js.native
  
  var requested_attributes: js.Any = js.native
  
  var requested_predicates: js.UndefOr[js.Any] = js.native
  
  var version: String = js.native
}
object ProofSchema {
  
  @scala.inline
  def apply(id: String, name: String, requested_attributes: js.Any, version: String): ProofSchema = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], requested_attributes = requested_attributes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProofSchema]
  }
  
  @scala.inline
  implicit class ProofSchemaMutableBuilder[Self <: ProofSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_attributes(value: js.Any): Self = StObject.set(x, "requested_attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_predicates(value: js.Any): Self = StObject.set(x, "requested_predicates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_predicatesUndefined: Self = StObject.set(x, "requested_predicates", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
