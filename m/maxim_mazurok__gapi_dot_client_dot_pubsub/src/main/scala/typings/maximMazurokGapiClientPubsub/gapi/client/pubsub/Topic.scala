package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topic extends StObject {
  
  /**
    * The resource name of the Cloud KMS CryptoKey to be used to protect access to messages published on this topic. The expected format is
    * `projects/ *‍/locations/ *‍/keyRings/ *‍/cryptoKeys/ *`.
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  /** See [Creating and managing labels] (https://cloud.google.com/pubsub/docs/labels). */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /**
    * Indicates the minimum duration to retain a message after it is published to the topic. If this field is set, messages published to the topic in the last `message_retention_duration`
    * are always available to subscribers. For instance, it allows any attached subscription to [seek to a timestamp](https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time)
    * that is up to `message_retention_duration` in the past. If this field is not set, message retention is controlled by settings on individual subscriptions. Cannot be more than 31
    * days or less than 10 minutes.
    */
  var messageRetentionDuration: js.UndefOr[String] = js.undefined
  
  /** Policy constraining the set of Google Cloud Platform regions where messages published to the topic may be stored. If not present, then no constraints are in effect. */
  var messageStoragePolicy: js.UndefOr[MessageStoragePolicy] = js.undefined
  
  /**
    * Required. The name of the topic. It must have the format `"projects/{project}/topics/{topic}"`. `{topic}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers
    * (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start
    * with `"goog"`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Reserved for future use. This field is set only in responses from the server; it is ignored if it is set in any requests. */
  var satisfiesPzs: js.UndefOr[Boolean] = js.undefined
  
  /** Settings for validating messages published against a schema. */
  var schemaSettings: js.UndefOr[SchemaSettings] = js.undefined
}
object Topic {
  
  inline def apply(): Topic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Topic]
  }
  
  extension [Self <: Topic](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMessageRetentionDuration(value: String): Self = StObject.set(x, "messageRetentionDuration", value.asInstanceOf[js.Any])
    
    inline def setMessageRetentionDurationUndefined: Self = StObject.set(x, "messageRetentionDuration", js.undefined)
    
    inline def setMessageStoragePolicy(value: MessageStoragePolicy): Self = StObject.set(x, "messageStoragePolicy", value.asInstanceOf[js.Any])
    
    inline def setMessageStoragePolicyUndefined: Self = StObject.set(x, "messageStoragePolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSatisfiesPzs(value: Boolean): Self = StObject.set(x, "satisfiesPzs", value.asInstanceOf[js.Any])
    
    inline def setSatisfiesPzsUndefined: Self = StObject.set(x, "satisfiesPzs", js.undefined)
    
    inline def setSchemaSettings(value: SchemaSettings): Self = StObject.set(x, "schemaSettings", value.asInstanceOf[js.Any])
    
    inline def setSchemaSettingsUndefined: Self = StObject.set(x, "schemaSettings", js.undefined)
  }
}
