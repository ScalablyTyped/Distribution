package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDnsCnameRecord
  extends StObject
     with DomainDnsRecord {
  
  // The canonical name of the CNAME record. Used to configure the CNAME record at the DNS host.
  var canonicalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object DomainDnsCnameRecord {
  
  inline def apply(): DomainDnsCnameRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsCnameRecord]
  }
  
  extension [Self <: DomainDnsCnameRecord](x: Self) {
    
    inline def setCanonicalName(value: NullableOption[String]): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
    
    inline def setCanonicalNameNull: Self = StObject.set(x, "canonicalName", null)
    
    inline def setCanonicalNameUndefined: Self = StObject.set(x, "canonicalName", js.undefined)
  }
}
