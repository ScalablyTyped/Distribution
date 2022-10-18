package typings.openui5.anon

import typings.openui5.sapMUploadUploadSetItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  /**
    * The file whose upload has just been terminated.
    */
  var item: js.UndefOr[default] = js.undefined
}
object `24` {
  
  inline def apply(): `24` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
  }
}
