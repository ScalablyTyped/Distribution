package typings.plottable.anon

import typings.plottable.plottableStrings.bottomup
import typings.plottable.plottableStrings.topdown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bottomup extends js.Object {
  
  var bottomup: typings.plottable.plottableStrings.bottomup = js.native
  
  var topdown: typings.plottable.plottableStrings.topdown = js.native
}
object Bottomup {
  
  @scala.inline
  def apply(bottomup: bottomup, topdown: topdown): Bottomup = {
    val __obj = js.Dynamic.literal(bottomup = bottomup.asInstanceOf[js.Any], topdown = topdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottomup]
  }
  
  @scala.inline
  implicit class BottomupOps[Self <: Bottomup] (val x: Self) extends AnyVal {
    
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
    def setBottomup(value: bottomup): Self = this.set("bottomup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopdown(value: topdown): Self = this.set("topdown", value.asInstanceOf[js.Any])
  }
}
