package typings.maximMazurokGapiClientSearchconsole.gapi.client.searchconsole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiDimensionFilter extends StObject {
  
  var dimension: js.UndefOr[String] = js.undefined
  
  var expression: js.UndefOr[String] = js.undefined
  
  var operator: js.UndefOr[String] = js.undefined
}
object ApiDimensionFilter {
  
  inline def apply(): ApiDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiDimensionFilter]
  }
  
  extension [Self <: ApiDimensionFilter](x: Self) {
    
    inline def setDimension(value: String): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
    
    inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
  }
}
