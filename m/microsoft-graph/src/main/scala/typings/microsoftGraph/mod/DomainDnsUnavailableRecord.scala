package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDnsUnavailableRecord
  extends StObject
     with DomainDnsRecord {
  
  // Provides the reason why the DomainDnsUnavailableRecord entity is returned.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
}
object DomainDnsUnavailableRecord {
  
  inline def apply(): DomainDnsUnavailableRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsUnavailableRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainDnsUnavailableRecord] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
