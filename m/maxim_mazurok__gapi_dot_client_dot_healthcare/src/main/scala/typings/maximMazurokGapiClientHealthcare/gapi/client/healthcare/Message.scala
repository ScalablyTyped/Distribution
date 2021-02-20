package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  /** Output only. The datetime when the message was created. Set by the server. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Raw message bytes. */
  var data: js.UndefOr[String] = js.native
  
  /**
    * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the
    * following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
    * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.Message with TopLevel[js.Any]
  ] = js.native
  
  /** The message type for this message. MSH-9.1. */
  var messageType: js.UndefOr[String] = js.native
  
  /** Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The parsed version of the raw message data. */
  var parsedData: js.UndefOr[ParsedData] = js.native
  
  /** All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message. */
  var patientIds: js.UndefOr[js.Array[PatientId]] = js.native
  
  /** The hospital that this message came from. MSH-4. */
  var sendFacility: js.UndefOr[String] = js.native
  
  /** The datetime the sending application sent this message. MSH-7. */
  var sendTime: js.UndefOr[String] = js.native
}
object Message {
  
  @scala.inline
  def apply(): Message = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.Message with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParsedData(value: ParsedData): Self = StObject.set(x, "parsedData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParsedDataUndefined: Self = StObject.set(x, "parsedData", js.undefined)
    
    @scala.inline
    def setPatientIds(value: js.Array[PatientId]): Self = StObject.set(x, "patientIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatientIdsUndefined: Self = StObject.set(x, "patientIds", js.undefined)
    
    @scala.inline
    def setPatientIdsVarargs(value: PatientId*): Self = StObject.set(x, "patientIds", js.Array(value :_*))
    
    @scala.inline
    def setSendFacility(value: String): Self = StObject.set(x, "sendFacility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendFacilityUndefined: Self = StObject.set(x, "sendFacility", js.undefined)
    
    @scala.inline
    def setSendTime(value: String): Self = StObject.set(x, "sendTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendTimeUndefined: Self = StObject.set(x, "sendTime", js.undefined)
  }
}
