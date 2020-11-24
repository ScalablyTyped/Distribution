package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MajorAxis extends js.Object {
  
  var majorAxis: js.Object = js.native
  
  var minorAxis: js.Object = js.native
}
object MajorAxis {
  
  @scala.inline
  def apply(majorAxis: js.Object, minorAxis: js.Object): MajorAxis = {
    val __obj = js.Dynamic.literal(majorAxis = majorAxis.asInstanceOf[js.Any], minorAxis = minorAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[MajorAxis]
  }
  
  @scala.inline
  implicit class MajorAxisOps[Self <: MajorAxis] (val x: Self) extends AnyVal {
    
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
    def setMajorAxis(value: js.Object): Self = this.set("majorAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorAxis(value: js.Object): Self = this.set("minorAxis", value.asInstanceOf[js.Any])
  }
}
