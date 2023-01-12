package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOriginatorInfo extends StObject {
  
  /**
    * Collection of certificates. In may contain originator certificates associated with several different
    * key management algorithms. It may also contain attribute certificates associated with the originator.
    */
  var certs: js.UndefOr[CertificateSet] = js.undefined
  
  /**
    * Collection of CRLs. It is intended that the set contain information sufficient to determine whether
    * or not the certificates in the certs field are valid, but such correspondence is not necessary
    */
  var crls: js.UndefOr[RevocationInfoChoices] = js.undefined
}
object IOriginatorInfo {
  
  inline def apply(): IOriginatorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOriginatorInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOriginatorInfo] (val x: Self) extends AnyVal {
    
    inline def setCerts(value: CertificateSet): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setCertsUndefined: Self = StObject.set(x, "certs", js.undefined)
    
    inline def setCrls(value: RevocationInfoChoices): Self = StObject.set(x, "crls", value.asInstanceOf[js.Any])
    
    inline def setCrlsUndefined: Self = StObject.set(x, "crls", js.undefined)
  }
}
