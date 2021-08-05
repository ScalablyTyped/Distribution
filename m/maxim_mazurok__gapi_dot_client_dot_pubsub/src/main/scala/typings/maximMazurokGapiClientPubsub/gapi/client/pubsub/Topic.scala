package typings.maximMazurokGapiClientPubsub.gapi.client.pubsub

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Topic extends StObject {
  
  /**
    * The resource name of the Cloud KMS CryptoKey to be used to protect access to messages published on this topic. The expected format is
    * `projects/∗/locations/∗/keyRings/∗/cryptoKeys/ *`.
    */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  /** See [Creating and managing labels] (https://cloud.google.com/pubsub/docs/labels). */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientPubsub.maximMazurokGapiClientPubsubStrings.Topic & TopLevel[js.Any]
  ] = js.undefined
  
  /** Policy constraining the set of Google Cloud Platform regions where messages published to the topic may be stored. If not present, then no constraints are in effect. */
  var messageStoragePolicy: js.UndefOr[MessageStoragePolicy] = js.undefined
  
  /**
    * Required. The name of the topic. It must have the format `"projects/{project}/topics/{topic}"`. `{topic}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers
    * (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start
    * with `"goog"`.
    */
  var name: js.UndefOr[String] = js.undefined
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
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientPubsub.maximMazurokGapiClientPubsubStrings.Topic & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMessageStoragePolicy(value: MessageStoragePolicy): Self = StObject.set(x, "messageStoragePolicy", value.asInstanceOf[js.Any])
    
    inline def setMessageStoragePolicyUndefined: Self = StObject.set(x, "messageStoragePolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
