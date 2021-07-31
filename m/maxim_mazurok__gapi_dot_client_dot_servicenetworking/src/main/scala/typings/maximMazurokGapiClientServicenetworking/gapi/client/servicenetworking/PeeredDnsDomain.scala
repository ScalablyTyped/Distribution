package typings.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeeredDnsDomain extends StObject {
  
  /** The DNS domain name suffix e.g. `example.com.`. */
  var dnsSuffix: js.UndefOr[String] = js.undefined
  
  /**
    * User assigned name for this resource. Must be unique within the consumer network. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and
    * only contain lowercase letters, digits or dashes.
    */
  var name: js.UndefOr[String] = js.undefined
}
object PeeredDnsDomain {
  
  @scala.inline
  def apply(): PeeredDnsDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeeredDnsDomain]
  }
  
  @scala.inline
  implicit class PeeredDnsDomainMutableBuilder[Self <: PeeredDnsDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDnsSuffix(value: String): Self = StObject.set(x, "dnsSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDnsSuffixUndefined: Self = StObject.set(x, "dnsSuffix", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
