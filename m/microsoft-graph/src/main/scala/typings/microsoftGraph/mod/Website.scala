package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Website extends StObject {
  
  // The URL of the website.
  var address: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The display name of the web site.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The possible values are: other, home, work, blog, profile.
  var `type`: js.UndefOr[NullableOption[WebsiteType]] = js.undefined
}
object Website {
  
  inline def apply(): Website = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Website]
  }
  
  extension [Self <: Website](x: Self) {
    
    inline def setAddress(value: NullableOption[String]): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressNull: Self = StObject.set(x, "address", null)
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setType(value: NullableOption[WebsiteType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
