package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line: interface-name
trait IpEvidence
  extends StObject
     with AlertEvidence {
  
  // The two-letter country code according to ISO 3166 format, for example: US, UK, CA, etc..).
  var countryLetterCode: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The value of the IP Address, can be either in V4 address or V6 address format.
  var ipAddress: js.UndefOr[NullableOption[String]] = js.undefined
}
object IpEvidence {
  
  inline def apply(): IpEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpEvidence] (val x: Self) extends AnyVal {
    
    inline def setCountryLetterCode(value: NullableOption[String]): Self = StObject.set(x, "countryLetterCode", value.asInstanceOf[js.Any])
    
    inline def setCountryLetterCodeNull: Self = StObject.set(x, "countryLetterCode", null)
    
    inline def setCountryLetterCodeUndefined: Self = StObject.set(x, "countryLetterCode", js.undefined)
    
    inline def setIpAddress(value: NullableOption[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
  }
}
