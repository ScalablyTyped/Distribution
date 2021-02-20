package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDnsCnameRecord extends DomainDnsRecord {
  
  // The canonical name of the CNAME record. Used to configure the CNAME record at the DNS host.
  var canonicalName: js.UndefOr[NullableOption[String]] = js.native
}
object DomainDnsCnameRecord {
  
  @scala.inline
  def apply(): DomainDnsCnameRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsCnameRecord]
  }
  
  @scala.inline
  implicit class DomainDnsCnameRecordMutableBuilder[Self <: DomainDnsCnameRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanonicalName(value: NullableOption[String]): Self = StObject.set(x, "canonicalName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanonicalNameNull: Self = StObject.set(x, "canonicalName", null)
    
    @scala.inline
    def setCanonicalNameUndefined: Self = StObject.set(x, "canonicalName", js.undefined)
  }
}
