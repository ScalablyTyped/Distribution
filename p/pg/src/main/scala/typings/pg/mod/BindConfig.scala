package typings.pg.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindConfig extends StObject {
  
  var binary: js.UndefOr[String] = js.undefined
  
  var portal: js.UndefOr[String] = js.undefined
  
  var statement: js.UndefOr[String] = js.undefined
  
  var values: js.UndefOr[js.Array[js.UndefOr[Buffer | Null | String]]] = js.undefined
}
object BindConfig {
  
  inline def apply(): BindConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindConfig]
  }
  
  extension [Self <: BindConfig](x: Self) {
    
    inline def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setPortal(value: String): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    inline def setStatement(value: String): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    inline def setStatementUndefined: Self = StObject.set(x, "statement", js.undefined)
    
    inline def setValues(value: js.Array[js.UndefOr[Buffer | Null | String]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: (js.UndefOr[Buffer | Null | String])*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
