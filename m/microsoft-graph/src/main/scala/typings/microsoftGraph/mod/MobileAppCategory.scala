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
  
  @scala.inline
  def apply(): MobileAppCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileAppCategory]
  }
  
  @scala.inline
  implicit class MobileAppCategoryMutableBuilder[Self <: MobileAppCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
  }
}
