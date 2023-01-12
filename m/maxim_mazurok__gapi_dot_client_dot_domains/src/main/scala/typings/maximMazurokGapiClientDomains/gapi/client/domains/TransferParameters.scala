package typings.maximMazurokGapiClientDomains.gapi.client.domains

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferParameters extends StObject {
  
  /** The registrar that currently manages the domain. */
  var currentRegistrar: js.UndefOr[String] = js.undefined
  
  /** The URL of registrar that currently manages the domain. */
  var currentRegistrarUri: js.UndefOr[String] = js.undefined
  
  /** The domain name. Unicode domain names are expressed in Punycode format. */
  var domainName: js.UndefOr[String] = js.undefined
  
  /** The name servers that currently store the configuration of the domain. */
  var nameServers: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Contact privacy options that the domain supports. */
  var supportedPrivacy: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Indicates whether the domain is protected by a transfer lock. For a transfer to succeed, this must show `UNLOCKED`. To unlock a domain, go to its current registrar. */
  var transferLockState: js.UndefOr[String] = js.undefined
  
  /** Price to transfer or renew the domain for one year. */
  var yearlyPrice: js.UndefOr[Money] = js.undefined
}
object TransferParameters {
  
  inline def apply(): TransferParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransferParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferParameters] (val x: Self) extends AnyVal {
    
    inline def setCurrentRegistrar(value: String): Self = StObject.set(x, "currentRegistrar", value.asInstanceOf[js.Any])
    
    inline def setCurrentRegistrarUndefined: Self = StObject.set(x, "currentRegistrar", js.undefined)
    
    inline def setCurrentRegistrarUri(value: String): Self = StObject.set(x, "currentRegistrarUri", value.asInstanceOf[js.Any])
    
    inline def setCurrentRegistrarUriUndefined: Self = StObject.set(x, "currentRegistrarUri", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
    
    inline def setNameServersUndefined: Self = StObject.set(x, "nameServers", js.undefined)
    
    inline def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value*))
    
    inline def setSupportedPrivacy(value: js.Array[String]): Self = StObject.set(x, "supportedPrivacy", value.asInstanceOf[js.Any])
    
    inline def setSupportedPrivacyUndefined: Self = StObject.set(x, "supportedPrivacy", js.undefined)
    
    inline def setSupportedPrivacyVarargs(value: String*): Self = StObject.set(x, "supportedPrivacy", js.Array(value*))
    
    inline def setTransferLockState(value: String): Self = StObject.set(x, "transferLockState", value.asInstanceOf[js.Any])
    
    inline def setTransferLockStateUndefined: Self = StObject.set(x, "transferLockState", js.undefined)
    
    inline def setYearlyPrice(value: Money): Self = StObject.set(x, "yearlyPrice", value.asInstanceOf[js.Any])
    
    inline def setYearlyPriceUndefined: Self = StObject.set(x, "yearlyPrice", js.undefined)
  }
}
