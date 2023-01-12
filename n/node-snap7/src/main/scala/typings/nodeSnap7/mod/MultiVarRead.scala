package typings.nodeSnap7.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiVarRead extends StObject {
  
  var Amount: Double
  
  var Area: typings.nodeSnap7.mod.Area
  
  var DBNumber: js.UndefOr[Double] = js.undefined
  
  var Start: Double
  
  var WordLen: typings.nodeSnap7.mod.WordLen
}
object MultiVarRead {
  
  inline def apply(Amount: Double, Area: Area, Start: Double, WordLen: WordLen): MultiVarRead = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Area = Area.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], WordLen = WordLen.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiVarRead]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiVarRead] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
    
    inline def setArea(value: Area): Self = StObject.set(x, "Area", value.asInstanceOf[js.Any])
    
    inline def setDBNumber(value: Double): Self = StObject.set(x, "DBNumber", value.asInstanceOf[js.Any])
    
    inline def setDBNumberUndefined: Self = StObject.set(x, "DBNumber", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
    
    inline def setWordLen(value: WordLen): Self = StObject.set(x, "WordLen", value.asInstanceOf[js.Any])
  }
}
