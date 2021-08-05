package typings.maximMazurokGapiClientSecretmanager.gapi.client.secretmanager

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Secret extends StObject {
  
  /** Output only. The time at which the Secret was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * The labels assigned to this Secret. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular
    * expression: `\p{Ll}\p{Lo}{0,62}` Label values must be between 0 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular
    * expression: `[\p{Ll}\p{Lo}\p{N}_-]{0,63}` No more than 64 labels can be assigned to a given resource.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientSecretmanager.maximMazurokGapiClientSecretmanagerStrings.Secret & TopLevel[js.Any]
  ] = js.undefined
  
  /** Output only. The resource name of the Secret in the format `projects/∗/secrets/ *`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Required. Immutable. The replication policy of the secret data attached to the Secret. The replication policy cannot be changed after the Secret has been created. */
  var replication: js.UndefOr[Replication] = js.undefined
}
object Secret {
  
  inline def apply(): Secret = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Secret]
  }
  
  extension [Self <: Secret](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientSecretmanager.maximMazurokGapiClientSecretmanagerStrings.Secret & TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReplication(value: Replication): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
    
    inline def setReplicationUndefined: Self = StObject.set(x, "replication", js.undefined)
  }
}
