package typings.meteor.anon

import typings.meteor.meteorInts.`2`
import typings.meteor.meteorInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBatchType extends StObject {
  
  val DELETE: `3`
  
  val INSERT: typings.meteor.meteorInts.`1`
  
  val UPDATE: `2`
}
object TypeofBatchType {
  
  inline def apply(): TypeofBatchType = {
    val __obj = js.Dynamic.literal(DELETE = 3, INSERT = 1, UPDATE = 2)
    __obj.asInstanceOf[TypeofBatchType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofBatchType] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: `3`): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setINSERT(value: typings.meteor.meteorInts.`1`): Self = StObject.set(x, "INSERT", value.asInstanceOf[js.Any])
    
    inline def setUPDATE(value: `2`): Self = StObject.set(x, "UPDATE", value.asInstanceOf[js.Any])
  }
}
