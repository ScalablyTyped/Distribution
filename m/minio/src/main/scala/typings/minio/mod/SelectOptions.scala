package typings.minio.mod

import typings.minio.anon.Enabled
import typings.minio.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectOptions extends StObject {
  
  var expression: String
  
  var expressionType: js.UndefOr[String] = js.undefined
  
  var inputSerialization: InputSerialization
  
  var outputSerialization: OutputSerialization
  
  var requestProgress: js.UndefOr[Enabled] = js.undefined
  
  var scanRange: js.UndefOr[End] = js.undefined
}
object SelectOptions {
  
  inline def apply(
    expression: String,
    inputSerialization: InputSerialization,
    outputSerialization: OutputSerialization
  ): SelectOptions = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], inputSerialization = inputSerialization.asInstanceOf[js.Any], outputSerialization = outputSerialization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectOptions]
  }
  
  extension [Self <: SelectOptions](x: Self) {
    
    inline def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionType(value: String): Self = StObject.set(x, "expressionType", value.asInstanceOf[js.Any])
    
    inline def setExpressionTypeUndefined: Self = StObject.set(x, "expressionType", js.undefined)
    
    inline def setInputSerialization(value: InputSerialization): Self = StObject.set(x, "inputSerialization", value.asInstanceOf[js.Any])
    
    inline def setOutputSerialization(value: OutputSerialization): Self = StObject.set(x, "outputSerialization", value.asInstanceOf[js.Any])
    
    inline def setRequestProgress(value: Enabled): Self = StObject.set(x, "requestProgress", value.asInstanceOf[js.Any])
    
    inline def setRequestProgressUndefined: Self = StObject.set(x, "requestProgress", js.undefined)
    
    inline def setScanRange(value: End): Self = StObject.set(x, "scanRange", value.asInstanceOf[js.Any])
    
    inline def setScanRangeUndefined: Self = StObject.set(x, "scanRange", js.undefined)
  }
}
