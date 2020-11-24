package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unordered extends js.Object {
  
  var unordered: js.UndefOr[Boolean] = js.native
  
  var weak: js.UndefOr[Boolean] = js.native
}
object Unordered {
  
  @scala.inline
  def apply(): Unordered = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Unordered]
  }
  
  @scala.inline
  implicit class UnorderedOps[Self <: Unordered] (val x: Self) extends AnyVal {
    
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
    def setUnordered(value: Boolean): Self = this.set("unordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnordered: Self = this.set("unordered", js.undefined)
    
    @scala.inline
    def setWeak(value: Boolean): Self = this.set("weak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeak: Self = this.set("weak", js.undefined)
  }
}
