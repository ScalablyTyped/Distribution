package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisibleSubSections extends StObject {
  
  /**
    * Object whose keys are the visible SubSection IDs and their values are the SubSection instances
    */
  var visibleSubSections: js.UndefOr[js.Object] = js.undefined
}
object VisibleSubSections {
  
  inline def apply(): VisibleSubSections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisibleSubSections]
  }
  
  extension [Self <: VisibleSubSections](x: Self) {
    
    inline def setVisibleSubSections(value: js.Object): Self = StObject.set(x, "visibleSubSections", value.asInstanceOf[js.Any])
    
    inline def setVisibleSubSectionsUndefined: Self = StObject.set(x, "visibleSubSections", js.undefined)
  }
}
