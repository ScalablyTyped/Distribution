package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsInformationProtectionApp extends StObject {
  
  // If true, app is denied protection or exemption.
  var denied: js.UndefOr[Boolean] = js.undefined
  
  // The app's description.
  var description: js.UndefOr[NullableOption[String]] = js.undefined
  
  // App display name.
  var displayName: js.UndefOr[String] = js.undefined
  
  // The product name.
  var productName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The publisher name
  var publisherName: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsInformationProtectionApp {
  
  inline def apply(): WindowsInformationProtectionApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionApp]
  }
  
  extension [Self <: WindowsInformationProtectionApp](x: Self) {
    
    inline def setDenied(value: Boolean): Self = StObject.set(x, "denied", value.asInstanceOf[js.Any])
    
    inline def setDeniedUndefined: Self = StObject.set(x, "denied", js.undefined)
    
    inline def setDescription(value: NullableOption[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setProductName(value: NullableOption[String]): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameNull: Self = StObject.set(x, "productName", null)
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setPublisherName(value: NullableOption[String]): Self = StObject.set(x, "publisherName", value.asInstanceOf[js.Any])
    
    inline def setPublisherNameNull: Self = StObject.set(x, "publisherName", null)
    
    inline def setPublisherNameUndefined: Self = StObject.set(x, "publisherName", js.undefined)
  }
}
