package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FhirStore extends StObject {
  
  /**
    * Immutable. Whether to disable referential integrity in this FHIR store. This field is immutable after FHIR store creation. The default value is false, meaning that the API enforces
    * referential integrity and fails the requests that result in inconsistent state in the FHIR store. When this field is set to true, the API skips referential integrity checks.
    * Consequently, operations that rely on references, such as GetPatientEverything, do not return all the results if broken references exist.
    */
  var disableReferentialIntegrity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Immutable. Whether to disable resource versioning for this FHIR store. This field can not be changed after the creation of FHIR store. If set to false, which is the default
    * behavior, all write operations cause historical versions to be recorded automatically. The historical versions can be fetched through the history APIs, but cannot be updated. If set
    * to true, no historical versions are kept. The server sends errors for attempts to read the historical versions.
    */
  var disableResourceVersioning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this FHIR store has the [updateCreate capability](https://www.hl7.org/fhir/capabilitystatement-definitions.html#CapabilityStatement.rest.resource.updateCreate). This
    * determines if the client can use an Update operation to create a new resource with a client-specified ID. If false, all IDs are server-assigned through the Create operation and
    * attempts to update a non-existent resource return errors. Be careful with the audit logs if client-specified resource IDs contain sensitive data such as patient identifiers, those
    * IDs are part of the FHIR resource path recorded in Cloud audit logs and Cloud Pub/Sub notifications.
    */
  var enableUpdateCreate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * User-supplied key-value pairs used to organize FHIR stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the
    * following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
    * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.FhirStore & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. Resource name of the FHIR store, of the form `projects/{project_id}/datasets/{dataset_id}/fhirStores/{fhir_store_id}`. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If non-empty, publish all resource modifications of this FHIR store to this destination. The Cloud Pub/Sub message attributes contain a map with a string describing the action that
    * has triggered the notification. For example, "action":"CreateResource".
    */
  var notificationConfig: js.UndefOr[NotificationConfig] = js.undefined
  
  /**
    * A list of streaming configs that configure the destinations of streaming export for every resource mutation in this FHIR store. Each store is allowed to have up to 10 streaming
    * configs. After a new config is added, the next resource mutation is streamed to the new location in addition to the existing ones. When a location is removed from the list, the
    * server stops streaming to that location. Before adding a new config, you must add the required
    * [`bigquery.dataEditor`](https://cloud.google.com/bigquery/docs/access-control#bigquery.dataEditor) role to your project's **Cloud Healthcare Service Agent** [service
    * account](https://cloud.google.com/iam/docs/service-accounts). Some lag (typically on the order of dozens of seconds) is expected before the results show up in the streaming
    * destination.
    */
  var streamConfigs: js.UndefOr[js.Array[StreamConfig]] = js.undefined
  
  /**
    * Immutable. The FHIR specification version that this FHIR store supports natively. This field is immutable after store creation. Requests are rejected if they contain FHIR resources
    * of a different version. Version is required for every FHIR store.
    */
  var version: js.UndefOr[String] = js.undefined
}
object FhirStore {
  
  inline def apply(): FhirStore = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FhirStore]
  }
  
  extension [Self <: FhirStore](x: Self) {
    
    inline def setDisableReferentialIntegrity(value: Boolean): Self = StObject.set(x, "disableReferentialIntegrity", value.asInstanceOf[js.Any])
    
    inline def setDisableReferentialIntegrityUndefined: Self = StObject.set(x, "disableReferentialIntegrity", js.undefined)
    
    inline def setDisableResourceVersioning(value: Boolean): Self = StObject.set(x, "disableResourceVersioning", value.asInstanceOf[js.Any])
    
    inline def setDisableResourceVersioningUndefined: Self = StObject.set(x, "disableResourceVersioning", js.undefined)
    
    inline def setEnableUpdateCreate(value: Boolean): Self = StObject.set(x, "enableUpdateCreate", value.asInstanceOf[js.Any])
    
    inline def setEnableUpdateCreateUndefined: Self = StObject.set(x, "enableUpdateCreate", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientHealthcare.maximMazurokGapiClientHealthcareStrings.FhirStore & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotificationConfig(value: NotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
    
    inline def setStreamConfigs(value: js.Array[StreamConfig]): Self = StObject.set(x, "streamConfigs", value.asInstanceOf[js.Any])
    
    inline def setStreamConfigsUndefined: Self = StObject.set(x, "streamConfigs", js.undefined)
    
    inline def setStreamConfigsVarargs(value: StreamConfig*): Self = StObject.set(x, "streamConfigs", js.Array(value :_*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
