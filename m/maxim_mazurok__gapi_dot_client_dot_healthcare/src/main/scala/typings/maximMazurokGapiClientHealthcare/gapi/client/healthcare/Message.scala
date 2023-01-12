package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /** Output only. The datetime when the message was created. Set by the server. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Raw message bytes. */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the
    * following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
    * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The message type for this message. MSH-9.1. */
  var messageType: js.UndefOr[String] = js.undefined
  
  /**
    * Resource name of the Message, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the
    * server.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The parsed version of the raw message data. */
  var parsedData: js.UndefOr[ParsedData] = js.undefined
  
  /** All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message. */
  var patientIds: js.UndefOr[js.Array[PatientId]] = js.undefined
  
  /** The parsed version of the raw message data schematized according to this store's schemas and type definitions. */
  var schematizedData: js.UndefOr[SchematizedData] = js.undefined
  
  /** The hospital that this message came from. MSH-4. */
  var sendFacility: js.UndefOr[String] = js.undefined
  
  /** The datetime the sending application sent this message. MSH-7. */
  var sendTime: js.UndefOr[String] = js.undefined
}
object Message {
  
  inline def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParsedData(value: ParsedData): Self = StObject.set(x, "parsedData", value.asInstanceOf[js.Any])
    
    inline def setParsedDataUndefined: Self = StObject.set(x, "parsedData", js.undefined)
    
    inline def setPatientIds(value: js.Array[PatientId]): Self = StObject.set(x, "patientIds", value.asInstanceOf[js.Any])
    
    inline def setPatientIdsUndefined: Self = StObject.set(x, "patientIds", js.undefined)
    
    inline def setPatientIdsVarargs(value: PatientId*): Self = StObject.set(x, "patientIds", js.Array(value*))
    
    inline def setSchematizedData(value: SchematizedData): Self = StObject.set(x, "schematizedData", value.asInstanceOf[js.Any])
    
    inline def setSchematizedDataUndefined: Self = StObject.set(x, "schematizedData", js.undefined)
    
    inline def setSendFacility(value: String): Self = StObject.set(x, "sendFacility", value.asInstanceOf[js.Any])
    
    inline def setSendFacilityUndefined: Self = StObject.set(x, "sendFacility", js.undefined)
    
    inline def setSendTime(value: String): Self = StObject.set(x, "sendTime", value.asInstanceOf[js.Any])
    
    inline def setSendTimeUndefined: Self = StObject.set(x, "sendTime", js.undefined)
  }
}
