package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutlineOffset extends js.Object {
  
  var appearance: String = js.native
  
  var outlineOffset: String = js.native
}
object OutlineOffset {
  
  @scala.inline
  def apply(appearance: String, outlineOffset: String): OutlineOffset = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], outlineOffset = outlineOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlineOffset]
  }
  
  @scala.inline
  implicit class OutlineOffsetOps[Self <: OutlineOffset] (val x: Self) extends AnyVal {
    
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
    def setAppearance(value: String): Self = this.set("appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineOffset(value: String): Self = this.set("outlineOffset", value.asInstanceOf[js.Any])
  }
}
