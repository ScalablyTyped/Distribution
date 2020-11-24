package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeRange extends js.Object {
  
  // The maximum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
  var maximumSize: js.UndefOr[NullableOption[Double]] = js.native
  
  // The minimum size (in kilobytes) that an incoming message must have in order for a condition or exception to apply.
  var minimumSize: js.UndefOr[NullableOption[Double]] = js.native
}
object SizeRange {
  
  @scala.inline
  def apply(): SizeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeRange]
  }
  
  @scala.inline
  implicit class SizeRangeOps[Self <: SizeRange] (val x: Self) extends AnyVal {
    
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
    def setMaximumSize(value: NullableOption[Double]): Self = this.set("maximumSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumSize: Self = this.set("maximumSize", js.undefined)
    
    @scala.inline
    def setMaximumSizeNull: Self = this.set("maximumSize", null)
    
    @scala.inline
    def setMinimumSize(value: NullableOption[Double]): Self = this.set("minimumSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumSize: Self = this.set("minimumSize", js.undefined)
    
    @scala.inline
    def setMinimumSizeNull: Self = this.set("minimumSize", null)
  }
}
