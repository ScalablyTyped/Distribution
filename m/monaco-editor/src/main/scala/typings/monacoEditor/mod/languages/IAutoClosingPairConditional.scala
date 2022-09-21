package typings.monacoEditor.mod.languages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAutoClosingPairConditional
  extends StObject
     with IAutoClosingPair {
  
  var notIn: js.UndefOr[js.Array[String]] = js.undefined
}
object IAutoClosingPairConditional {
  
  inline def apply(close: String, open: String): IAutoClosingPairConditional = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutoClosingPairConditional]
  }
  
  extension [Self <: IAutoClosingPairConditional](x: Self) {
    
    inline def setNotIn(value: js.Array[String]): Self = StObject.set(x, "notIn", value.asInstanceOf[js.Any])
    
    inline def setNotInUndefined: Self = StObject.set(x, "notIn", js.undefined)
    
    inline def setNotInVarargs(value: String*): Self = StObject.set(x, "notIn", js.Array(value*))
  }
}
