package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigQueryConfig extends StObject {
  
  /**
    * When true and use_topic_schema is true, any fields that are a part of the topic schema that are not part of the BigQuery table schema are dropped when writing to BigQuery.
    * Otherwise, the schemas must be kept in sync and any messages with extra fields are not written and remain in the subscription's backlog.
    */
  var dropUnknownFields: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. An output-only field that indicates whether or not the subscription can receive messages. */
  var state: js.UndefOr[String] = js.undefined
  
  /** The name of the table to which to write data, of the form {projectId}.{datasetId}.{tableId} */
  var table: js.UndefOr[String] = js.undefined
  
  /** When true, use the topic's schema as the columns to write to in BigQuery, if it exists. */
  var useTopicSchema: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When true, write the subscription name, message_id, publish_time, attributes, and ordering_key to additional columns in the table. The subscription name, message_id, and
    * publish_time fields are put in their own columns while all other message properties (other than data) are written to a JSON object in the attributes column.
    */
  var writeMetadata: js.UndefOr[Boolean] = js.undefined
}
object BigQueryConfig {
  
  inline def apply(): BigQueryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigQueryConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BigQueryConfig] (val x: Self) extends AnyVal {
    
    inline def setDropUnknownFields(value: Boolean): Self = StObject.set(x, "dropUnknownFields", value.asInstanceOf[js.Any])
    
    inline def setDropUnknownFieldsUndefined: Self = StObject.set(x, "dropUnknownFields", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setUseTopicSchema(value: Boolean): Self = StObject.set(x, "useTopicSchema", value.asInstanceOf[js.Any])
    
    inline def setUseTopicSchemaUndefined: Self = StObject.set(x, "useTopicSchema", js.undefined)
    
    inline def setWriteMetadata(value: Boolean): Self = StObject.set(x, "writeMetadata", value.asInstanceOf[js.Any])
    
    inline def setWriteMetadataUndefined: Self = StObject.set(x, "writeMetadata", js.undefined)
  }
}
