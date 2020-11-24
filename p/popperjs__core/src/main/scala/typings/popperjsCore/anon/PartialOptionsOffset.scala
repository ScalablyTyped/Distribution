package typings.popperjsCore.anon

import typings.popperjsCore.offsetMod.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@popperjs/core.@popperjs/core/lib/modifiers/offset.Options> */
@js.native
trait PartialOptionsOffset extends js.Object {
  
  var offset: js.UndefOr[Offset] = js.native
}
object PartialOptionsOffset {
  
  @scala.inline
  def apply(): PartialOptionsOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptionsOffset]
  }
  
  @scala.inline
  implicit class PartialOptionsOffsetOps[Self <: PartialOptionsOffset] (val x: Self) extends AnyVal {
    
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
    def setOffsetFunction1(value: /* arg0 */ Placement => js.Tuple2[js.UndefOr[Double | Null], js.UndefOr[Double | Null]]): Self = this.set("offset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOffset(value: Offset): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
  }
}
