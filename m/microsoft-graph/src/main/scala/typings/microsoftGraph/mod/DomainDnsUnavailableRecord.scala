package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainDnsUnavailableRecord extends DomainDnsRecord {
  
  // Provides the reason why the DomainDnsUnavailableRecord entity is returned.
  var description: js.UndefOr[NullableOption[String]] = js.native
}
object DomainDnsUnavailableRecord {
  
  @scala.inline
  def apply(): DomainDnsUnavailableRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsUnavailableRecord]
  }
  
  @scala.inline
  implicit class DomainDnsUnavailableRecordMutableBuilder[Self <: DomainDnsUnavailableRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
