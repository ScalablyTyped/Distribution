package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseSectionId extends StObject {
  
  /**
    * ID of the closed section
    */
  var closeSectionId: js.UndefOr[String] = js.undefined
}
object CloseSectionId {
  
  inline def apply(): CloseSectionId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseSectionId]
  }
  
  extension [Self <: CloseSectionId](x: Self) {
    
    inline def setCloseSectionId(value: String): Self = StObject.set(x, "closeSectionId", value.asInstanceOf[js.Any])
    
    inline def setCloseSectionIdUndefined: Self = StObject.set(x, "closeSectionId", js.undefined)
  }
}
