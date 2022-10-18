package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseSectionIds extends StObject {
  
  /**
    * IDs of the sections to be closed. Can be initial in the case of no previously opened section.
    */
  var closeSectionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * ID of the opened section
    */
  var openSectionId: js.UndefOr[String] = js.undefined
}
object CloseSectionIds {
  
  inline def apply(): CloseSectionIds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloseSectionIds]
  }
  
  extension [Self <: CloseSectionIds](x: Self) {
    
    inline def setCloseSectionIds(value: js.Array[String]): Self = StObject.set(x, "closeSectionIds", value.asInstanceOf[js.Any])
    
    inline def setCloseSectionIdsUndefined: Self = StObject.set(x, "closeSectionIds", js.undefined)
    
    inline def setCloseSectionIdsVarargs(value: String*): Self = StObject.set(x, "closeSectionIds", js.Array(value*))
    
    inline def setOpenSectionId(value: String): Self = StObject.set(x, "openSectionId", value.asInstanceOf[js.Any])
    
    inline def setOpenSectionIdUndefined: Self = StObject.set(x, "openSectionId", js.undefined)
  }
}
