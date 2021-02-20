package typings.nodeMailjet.mod.Email

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutResponseData extends StObject {
  
  val Count: Double = js.native
  
  val Data: js.Array[js.Object] = js.native
  
  val Total: Double = js.native
}
object PutResponseData {
  
  @scala.inline
  def apply(Count: Double, Data: js.Array[js.Object], Total: Double): PutResponseData = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Total = Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResponseData]
  }
  
  @scala.inline
  implicit class PutResponseDataMutableBuilder[Self <: PutResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = StObject.set(x, "Data", js.Array(value :_*))
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
  }
}
