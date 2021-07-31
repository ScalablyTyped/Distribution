package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDnsTxtRecord
  extends StObject
     with DomainDnsRecord {
  
  // Value used when configuring the text property at the DNS host.
  var text: js.UndefOr[String] = js.undefined
}
object DomainDnsTxtRecord {
  
  @scala.inline
  def apply(): DomainDnsTxtRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsTxtRecord]
  }
  
  @scala.inline
  implicit class DomainDnsTxtRecordMutableBuilder[Self <: DomainDnsTxtRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
