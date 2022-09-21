package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSettings extends StObject {
  
  /** The encoding of messages validated against `schema`. */
  var encoding: js.UndefOr[String] = js.undefined
  
  /** The minimum (inclusive) revision allowed for validating messages. If empty or not present, allow any revision to be validated against last_revision or any revision created before. */
  var firstRevisionId: js.UndefOr[String] = js.undefined
  
  /** The maximum (inclusive) revision allowed for validating messages. If empty or not present, allow any revision to be validated against first_revision or any revision created after. */
  var lastRevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the schema that messages published should be validated against. Format is `projects/{project}/schemas/{schema}`. The value of this field will be
    * `_deleted-schema_` if the schema has been deleted.
    */
  var schema: js.UndefOr[String] = js.undefined
}
object SchemaSettings {
  
  inline def apply(): SchemaSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettings]
  }
  
  extension [Self <: SchemaSettings](x: Self) {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFirstRevisionId(value: String): Self = StObject.set(x, "firstRevisionId", value.asInstanceOf[js.Any])
    
    inline def setFirstRevisionIdUndefined: Self = StObject.set(x, "firstRevisionId", js.undefined)
    
    inline def setLastRevisionId(value: String): Self = StObject.set(x, "lastRevisionId", value.asInstanceOf[js.Any])
    
    inline def setLastRevisionIdUndefined: Self = StObject.set(x, "lastRevisionId", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
