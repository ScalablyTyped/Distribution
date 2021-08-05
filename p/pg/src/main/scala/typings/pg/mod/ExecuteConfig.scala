package typings.pg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecuteConfig extends StObject {
  
  var portal: js.UndefOr[String] = js.undefined
  
  var rows: js.UndefOr[String] = js.undefined
}
object ExecuteConfig {
  
  inline def apply(): ExecuteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteConfig]
  }
  
  extension [Self <: ExecuteConfig](x: Self) {
    
    inline def setPortal(value: String): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    inline def setRows(value: String): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
  }
}
