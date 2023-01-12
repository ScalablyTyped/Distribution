package typings.mongodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aws extends StObject {
  
  /** Configuration options for using 'aws' as your KMS provider */
  var aws: js.UndefOr[AccessKeyId] = js.undefined
  
  /** Configuration options for using 'azure' as your KMS provider */
  var azure: js.UndefOr[ClientId] = js.undefined
  
  /** Configuration options for using 'gcp' as your KMS provider */
  var gcp: js.UndefOr[Email] = js.undefined
  
  /**
    * Configuration options for using 'kmip' as your KMS provider
    */
  var kmip: js.UndefOr[Endpoint] = js.undefined
  
  /** Configuration options for using 'local' as your KMS provider */
  var local: js.UndefOr[Key] = js.undefined
}
object Aws {
  
  inline def apply(): Aws = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aws]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Aws] (val x: Self) extends AnyVal {
    
    inline def setAws(value: AccessKeyId): Self = StObject.set(x, "aws", value.asInstanceOf[js.Any])
    
    inline def setAwsUndefined: Self = StObject.set(x, "aws", js.undefined)
    
    inline def setAzure(value: ClientId): Self = StObject.set(x, "azure", value.asInstanceOf[js.Any])
    
    inline def setAzureUndefined: Self = StObject.set(x, "azure", js.undefined)
    
    inline def setGcp(value: Email): Self = StObject.set(x, "gcp", value.asInstanceOf[js.Any])
    
    inline def setGcpUndefined: Self = StObject.set(x, "gcp", js.undefined)
    
    inline def setKmip(value: Endpoint): Self = StObject.set(x, "kmip", value.asInstanceOf[js.Any])
    
    inline def setKmipUndefined: Self = StObject.set(x, "kmip", js.undefined)
    
    inline def setLocal(value: Key): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
  }
}
