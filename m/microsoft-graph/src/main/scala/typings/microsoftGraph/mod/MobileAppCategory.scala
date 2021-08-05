package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MobileAppCategory
  extends StObject
     with Entity {
  
  // The name of the app category.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The date and time the mobileAppCategory was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.undefined
}
object MobileAppCategory {
  
  inline def apply(): MobileAppCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppCategory]
  }
  
  extension [Self <: MobileAppCategory](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
  }
}
