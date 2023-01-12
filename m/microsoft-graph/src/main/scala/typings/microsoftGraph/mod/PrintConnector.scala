package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintConnector
  extends StObject
     with Entity {
  
  // The connector's version.
  var appVersion: js.UndefOr[String] = js.undefined
  
  // The name of the connector.
  var displayName: js.UndefOr[String] = js.undefined
  
  // The connector machine's hostname.
  var fullyQualifiedDomainName: js.UndefOr[String] = js.undefined
  
  // The physical and/or organizational location of the connector.
  var location: js.UndefOr[NullableOption[PrinterLocation]] = js.undefined
  
  // The connector machine's operating system version.
  var operatingSystem: js.UndefOr[String] = js.undefined
  
  // The DateTimeOffset when the connector was registered.
  var registeredDateTime: js.UndefOr[String] = js.undefined
}
object PrintConnector {
  
  inline def apply(): PrintConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintConnector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintConnector] (val x: Self) extends AnyVal {
    
    inline def setAppVersion(value: String): Self = StObject.set(x, "appVersion", value.asInstanceOf[js.Any])
    
    inline def setAppVersionUndefined: Self = StObject.set(x, "appVersion", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFullyQualifiedDomainName(value: String): Self = StObject.set(x, "fullyQualifiedDomainName", value.asInstanceOf[js.Any])
    
    inline def setFullyQualifiedDomainNameUndefined: Self = StObject.set(x, "fullyQualifiedDomainName", js.undefined)
    
    inline def setLocation(value: NullableOption[PrinterLocation]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOperatingSystem(value: String): Self = StObject.set(x, "operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "operatingSystem", js.undefined)
    
    inline def setRegisteredDateTime(value: String): Self = StObject.set(x, "registeredDateTime", value.asInstanceOf[js.Any])
    
    inline def setRegisteredDateTimeUndefined: Self = StObject.set(x, "registeredDateTime", js.undefined)
  }
}
