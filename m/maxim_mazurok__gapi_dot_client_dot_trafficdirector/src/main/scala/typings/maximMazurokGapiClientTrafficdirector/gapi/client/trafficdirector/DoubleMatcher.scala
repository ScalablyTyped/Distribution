package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleMatcher extends js.Object {
  
  /** If specified, the input double value must be equal to the value specified here. */
  var exact: js.UndefOr[Double] = js.native
  
  /** If specified, the input double value must be in the range specified here. Note: The range is using half-open interval semantics [start, end). */
  var range: js.UndefOr[DoubleRange] = js.native
}
object DoubleMatcher {
  
  @scala.inline
  def apply(): DoubleMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleMatcher]
  }
  
  @scala.inline
  implicit class DoubleMatcherOps[Self <: DoubleMatcher] (val x: Self) extends AnyVal {
    
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
    def setExact(value: Double): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    
    @scala.inline
    def setRange(value: DoubleRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
