package typings.popperJs.mod.Popper

import typings.popperJs.popperJsBooleans.`false`
import typings.popperJs.popperJsStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends js.Object {
  
  var `x-out-of-boundaries`: _empty | `false` = js.native
  
  var `x-placement`: Placement = js.native
}
object Attributes {
  
  @scala.inline
  def apply(`x-out-of-boundaries`: _empty | `false`, `x-placement`: Placement): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-out-of-boundaries")(`x-out-of-boundaries`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-placement")(`x-placement`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    
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
    def `setX-out-of-boundaries`(value: _empty | `false`): Self = this.set("x-out-of-boundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-placement`(value: Placement): Self = this.set("x-placement", value.asInstanceOf[js.Any])
  }
}
