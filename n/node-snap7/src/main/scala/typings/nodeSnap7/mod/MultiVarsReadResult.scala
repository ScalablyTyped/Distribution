package typings.nodeSnap7.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiVarsReadResult extends StObject {
  
  //Error Code
  var Data: Buffer
  
  var Result: Double
}
object MultiVarsReadResult {
  
  inline def apply(Data: Buffer, Result: Double): MultiVarsReadResult = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarsReadResult]
  }
  
  extension [Self <: MultiVarsReadResult](x: Self) {
    
    inline def setData(value: Buffer): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Double): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
