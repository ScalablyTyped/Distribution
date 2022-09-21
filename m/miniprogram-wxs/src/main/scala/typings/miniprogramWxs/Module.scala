package typings.miniprogramWxs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module extends StObject {
  
  /**
    * 导出内容
    */
  var exports: Any
}
object Module {
  
  inline def apply(exports: Any): Module = {
    val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  extension [Self <: Module](x: Self) {
    
    inline def setExports(value: Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
  }
}
