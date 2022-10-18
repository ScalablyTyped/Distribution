package typings.openui5.anon

import typings.openui5.sapMListItemBaseMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SrcControl extends StObject {
  
  /**
    * The item which fired the pressed event.
    */
  var listItem: js.UndefOr[default] = js.undefined
  
  /**
    * The control which caused the press event within the container.
    */
  var srcControl: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
}
object SrcControl {
  
  inline def apply(): SrcControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SrcControl]
  }
  
  extension [Self <: SrcControl](x: Self) {
    
    inline def setListItem(value: default): Self = StObject.set(x, "listItem", value.asInstanceOf[js.Any])
    
    inline def setListItemUndefined: Self = StObject.set(x, "listItem", js.undefined)
    
    inline def setSrcControl(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "srcControl", value.asInstanceOf[js.Any])
    
    inline def setSrcControlUndefined: Self = StObject.set(x, "srcControl", js.undefined)
  }
}
