package typings.plotlyJs.anon

import typings.plotlyJs.mod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Frame> */
@js.native
trait PartialFrame extends js.Object {
  
  var baseframe: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Array[Data]] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var layout: js.UndefOr[PartialLayoutAngularaxis] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var traces: js.UndefOr[js.Array[Double]] = js.native
}
object PartialFrame {
  
  @scala.inline
  def apply(): PartialFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFrame]
  }
  
  @scala.inline
  implicit class PartialFrameOps[Self <: PartialFrame] (val x: Self) extends AnyVal {
    
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
    def setBaseframe(value: String): Self = this.set("baseframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseframe: Self = this.set("baseframe", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: Data*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[Data]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setLayout(value: PartialLayoutAngularaxis): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTracesVarargs(value: Double*): Self = this.set("traces", js.Array(value :_*))
    
    @scala.inline
    def setTraces(value: js.Array[Double]): Self = this.set("traces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraces: Self = this.set("traces", js.undefined)
  }
}
