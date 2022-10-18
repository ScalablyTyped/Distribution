package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Select extends StObject {
  
  /**
    * Comma-separated list of navigation properties or paths to navigation properties to expand
    */
  var expand: js.UndefOr[String] = js.undefined
  
  /**
    * Comma-separated list of properties or paths to properties to select
    */
  var select: js.UndefOr[String] = js.undefined
}
object Select {
  
  inline def apply(): Select = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Select]
  }
  
  extension [Self <: Select](x: Self) {
    
    inline def setExpand(value: String): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setSelect(value: String): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
  }
}
