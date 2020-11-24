package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.Delta> */
@js.native
trait PartialDelta extends js.Object {
  
  var decreasing: js.UndefOr[Symbol] = js.native
  
  var increasing: js.UndefOr[Symbol] = js.native
  
  var position: js.UndefOr[top | bottom | left | right] = js.native
  
  var reference: js.UndefOr[Double] = js.native
  
  var relative: js.UndefOr[Boolean] = js.native
  
  var valueformat: js.UndefOr[String] = js.native
}
object PartialDelta {
  
  @scala.inline
  def apply(): PartialDelta = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDelta]
  }
  
  @scala.inline
  implicit class PartialDeltaOps[Self <: PartialDelta] (val x: Self) extends AnyVal {
    
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
    def setDecreasing(value: Symbol): Self = this.set("decreasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecreasing: Self = this.set("decreasing", js.undefined)
    
    @scala.inline
    def setIncreasing(value: Symbol): Self = this.set("increasing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncreasing: Self = this.set("increasing", js.undefined)
    
    @scala.inline
    def setPosition(value: top | bottom | left | right): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setReference(value: Double): Self = this.set("reference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
    
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
    
    @scala.inline
    def setValueformat(value: String): Self = this.set("valueformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueformat: Self = this.set("valueformat", js.undefined)
  }
}
