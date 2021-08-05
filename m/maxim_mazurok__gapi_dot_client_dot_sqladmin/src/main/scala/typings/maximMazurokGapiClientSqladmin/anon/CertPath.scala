package typings.maximMazurokGapiClientSqladmin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertPath extends StObject {
  
  /** Path to the Certificate (.cer) in Cloud Storage, in the form *gs://bucketName/fileName*. The instance must have write permissions to the bucket and read access to the file. */
  var certPath: js.UndefOr[String] = js.undefined
  
  /** Password that encrypts the private key */
  var pvkPassword: js.UndefOr[String] = js.undefined
  
  /**
    * Path to the Certificate Private Key (.pvk) in Cloud Storage, in the form *gs://bucketName/fileName*. The instance must have write permissions to the bucket and read access
    * to the file.
    */
  var pvkPath: js.UndefOr[String] = js.undefined
}
object CertPath {
  
  inline def apply(): CertPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertPath]
  }
  
  extension [Self <: CertPath](x: Self) {
    
    inline def setCertPath(value: String): Self = StObject.set(x, "certPath", value.asInstanceOf[js.Any])
    
    inline def setCertPathUndefined: Self = StObject.set(x, "certPath", js.undefined)
    
    inline def setPvkPassword(value: String): Self = StObject.set(x, "pvkPassword", value.asInstanceOf[js.Any])
    
    inline def setPvkPasswordUndefined: Self = StObject.set(x, "pvkPassword", js.undefined)
    
    inline def setPvkPath(value: String): Self = StObject.set(x, "pvkPath", value.asInstanceOf[js.Any])
    
    inline def setPvkPathUndefined: Self = StObject.set(x, "pvkPath", js.undefined)
  }
}
