package typings.maximMazurokGapiClientStoragetransfer.gapi.client.storagetransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AzureCredentials extends StObject {
  
  /**
    * Required. Azure shared access signature (SAS). For more information about SAS, see [Grant limited access to Azure Storage resources using shared access signatures
    * (SAS)](https://docs.microsoft.com/en-us/azure/storage/common/storage-sas-overview).
    */
  var sasToken: js.UndefOr[String] = js.undefined
}
object AzureCredentials {
  
  inline def apply(): AzureCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AzureCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AzureCredentials] (val x: Self) extends AnyVal {
    
    inline def setSasToken(value: String): Self = StObject.set(x, "sasToken", value.asInstanceOf[js.Any])
    
    inline def setSasTokenUndefined: Self = StObject.set(x, "sasToken", js.undefined)
  }
}
