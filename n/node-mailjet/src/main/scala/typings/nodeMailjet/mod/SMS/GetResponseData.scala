package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResponseData extends StObject {
  
  val Data: js.Array[GetResponseDataData] = js.native
}
object GetResponseData {
  
  @scala.inline
  def apply(Data: js.Array[GetResponseDataData]): GetResponseData = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseData]
  }
  
  @scala.inline
  implicit class GetResponseDataMutableBuilder[Self <: GetResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[GetResponseDataData]): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: GetResponseDataData*): Self = StObject.set(x, "Data", js.Array(value :_*))
  }
}
