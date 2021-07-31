package typings.maximMazurokGapiClientSafebrowsing.gapi.client.safebrowsing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreatListDescriptor extends StObject {
  
  /** The platform type targeted by the list's entries. */
  var platformType: js.UndefOr[String] = js.undefined
  
  /** The entry types contained in the list. */
  var threatEntryType: js.UndefOr[String] = js.undefined
  
  /** The threat type posed by the list's entries. */
  var threatType: js.UndefOr[String] = js.undefined
}
object ThreatListDescriptor {
  
  @scala.inline
  def apply(): ThreatListDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThreatListDescriptor]
  }
  
  @scala.inline
  implicit class ThreatListDescriptorMutableBuilder[Self <: ThreatListDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlatformType(value: String): Self = StObject.set(x, "platformType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformTypeUndefined: Self = StObject.set(x, "platformType", js.undefined)
    
    @scala.inline
    def setThreatEntryType(value: String): Self = StObject.set(x, "threatEntryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatEntryTypeUndefined: Self = StObject.set(x, "threatEntryType", js.undefined)
    
    @scala.inline
    def setThreatType(value: String): Self = StObject.set(x, "threatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreatTypeUndefined: Self = StObject.set(x, "threatType", js.undefined)
  }
}
