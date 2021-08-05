package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hl7V2Store extends StObject {
  
  /**
    * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the
    * following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
    * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.Hl7V2Store & TopLevel[js.Any]
  ] = js.undefined
  
  /** Resource name of the HL7v2 store, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7v2_store_id}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * A list of notification configs. Each configuration uses a filter to determine whether to publish a message (both Ingest & Create) on the corresponding notification destination. Only
    * the message name is sent as part of the notification. Supplied by the client.
    */
  var notificationConfigs: js.UndefOr[js.Array[Hl7V2NotificationConfig]] = js.undefined
  
  /** The configuration for the parser. It determines how the server parses the messages. */
  var parserConfig: js.UndefOr[ParserConfig] = js.undefined
  
  /**
    * Determines whether to reject duplicate messages. A duplicate message is a message with the same raw bytes as a message that has already been ingested/created in this HL7v2 store.
    * The default value is false, meaning that the store accepts the duplicate messages and it also returns the same ACK message in the IngestMessageResponse as has been returned
    * previously. Note that only one resource is created in the store. When this field is set to true, CreateMessage/IngestMessage requests with a duplicate message will be rejected by
    * the store, and IngestMessageErrorDetail returns a NACK message upon rejection.
    */
  var rejectDuplicateMessage: js.UndefOr[Boolean] = js.undefined
}
object Hl7V2Store {
  
  inline def apply(): Hl7V2Store = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hl7V2Store]
  }
  
  extension [Self <: Hl7V2Store](x: Self) {
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.Hl7V2Store & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationConfigs(value: js.Array[Hl7V2NotificationConfig]): Self = StObject.set(x, "notificationConfigs", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigsUndefined: Self = StObject.set(x, "notificationConfigs", js.undefined)
    
    inline def setNotificationConfigsVarargs(value: Hl7V2NotificationConfig*): Self = StObject.set(x, "notificationConfigs", js.Array(value :_*))
    
    inline def setParserConfig(value: ParserConfig): Self = StObject.set(x, "parserConfig", value.asInstanceOf[js.Any])
    
    inline def setParserConfigUndefined: Self = StObject.set(x, "parserConfig", js.undefined)
    
    inline def setRejectDuplicateMessage(value: Boolean): Self = StObject.set(x, "rejectDuplicateMessage", value.asInstanceOf[js.Any])
    
    inline def setRejectDuplicateMessageUndefined: Self = StObject.set(x, "rejectDuplicateMessage", js.undefined)
  }
}
