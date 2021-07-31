package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDnsMxRecord
  extends StObject
     with DomainDnsRecord {
  
  // Value used when configuring the answer/destination/value of the MX record at the DNS host.
  var mailExchange: js.UndefOr[String] = js.undefined
  
  // Value used when configuring the Preference/Priority property of the MX record at the DNS host.
  var preference: js.UndefOr[NullableOption[Double]] = js.undefined
}
object DomainDnsMxRecord {
  
  @scala.inline
  def apply(): DomainDnsMxRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsMxRecord]
  }
  
  @scala.inline
  implicit class DomainDnsMxRecordMutableBuilder[Self <: DomainDnsMxRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMailExchange(value: String): Self = StObject.set(x, "mailExchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMailExchangeUndefined: Self = StObject.set(x, "mailExchange", js.undefined)
    
    @scala.inline
    def setPreference(value: NullableOption[Double]): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferenceNull: Self = StObject.set(x, "preference", null)
    
    @scala.inline
    def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
  }
}
