package typings.officeJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expand extends StObject {
  
  var expand: js.UndefOr[String] = js.undefined
  
  var select: js.UndefOr[String] = js.undefined
}
object Expand {
  
  inline def apply(): Expand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Expand]
  }
  
  extension [Self <: Expand](x: Self) {
    
    inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
