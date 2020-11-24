package typings.nodeMailjet.mod.SMS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResponseData extends js.Object {
  
  val Data: js.Array[GetResponseDataData] = js.native
}
object GetResponseData {
  
  @scala.inline
  def apply(Data: js.Array[GetResponseDataData]): GetResponseData = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseData]
  }
  
  @scala.inline
  implicit class GetResponseDataOps[Self <: GetResponseData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataVarargs(value: GetResponseDataData*): Self = this.set("Data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[GetResponseDataData]): Self = this.set("Data", value.asInstanceOf[js.Any])
  }
}
