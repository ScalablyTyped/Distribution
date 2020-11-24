package typings.moment.momentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationInputObject
  extends MomentInputObject
     with _DurationInputArg1 {
  
  var Q: js.UndefOr[Double] = js.native
  
  var quarter: js.UndefOr[Double] = js.native
  
  var quarters: js.UndefOr[Double] = js.native
  
  var w: js.UndefOr[Double] = js.native
  
  var week: js.UndefOr[Double] = js.native
  
  var weeks: js.UndefOr[Double] = js.native
}
object DurationInputObject {
  
  @scala.inline
  def apply(): DurationInputObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationInputObject]
  }
  
  @scala.inline
  implicit class DurationInputObjectOps[Self <: DurationInputObject] (val x: Self) extends AnyVal {
    
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
    def setQ(value: Double): Self = this.set("Q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("Q", js.undefined)
    
    @scala.inline
    def setQuarter(value: Double): Self = this.set("quarter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuarter: Self = this.set("quarter", js.undefined)
    
    @scala.inline
    def setQuarters(value: Double): Self = this.set("quarters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuarters: Self = this.set("quarters", js.undefined)
    
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    
    @scala.inline
    def setWeek(value: Double): Self = this.set("week", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeek: Self = this.set("week", js.undefined)
    
    @scala.inline
    def setWeeks(value: Double): Self = this.set("weeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeeks: Self = this.set("weeks", js.undefined)
  }
}
