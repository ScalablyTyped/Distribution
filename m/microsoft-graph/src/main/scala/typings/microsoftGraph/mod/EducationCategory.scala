package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationCategory
  extends StObject
     with Entity {
  
  // Unique identifier for the category.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationCategory {
  
  inline def apply(): EducationCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationCategory]
  }
  
  extension [Self <: EducationCategory](x: Self) {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
