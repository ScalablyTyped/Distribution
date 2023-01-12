package typings.nodeSnap7.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiVarWrite extends StObject {
  
  var Amount: Double
  
  var Area: typings.nodeSnap7.mod.Area
  
  var DBNumber: js.UndefOr[Double] = js.undefined
  
  var Data: Buffer
  
  var Start: Double
  
  var WordLen: typings.nodeSnap7.mod.WordLen
}
object MultiVarWrite {
  
  inline def apply(Amount: Double, Area: Area, Data: Buffer, Start: Double, WordLen: WordLen): MultiVarWrite = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Area = Area.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], WordLen = WordLen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarWrite]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiVarWrite] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    inline def setArea(value: Area): Self = StObject.set(x, "Area", value.asInstanceOf[js.Any])
    
    inline def setDBNumber(value: Double): Self = StObject.set(x, "DBNumber", value.asInstanceOf[js.Any])
    
    inline def setDBNumberUndefined: Self = StObject.set(x, "DBNumber", js.undefined)
    
    inline def setData(value: Buffer): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setStart(value: Double): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setWordLen(value: WordLen): Self = StObject.set(x, "WordLen", value.asInstanceOf[js.Any])
  }
}
