package typings.monk.anon

import typings.monk.monkBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawCursor extends js.Object {
  
  var rawCursor: `true` = js.native
}
object RawCursor {
  
  @scala.inline
  def apply(rawCursor: `true`): RawCursor = {
    val __obj = js.Dynamic.literal(rawCursor = rawCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawCursor]
  }
  
  @scala.inline
  implicit class RawCursorOps[Self <: RawCursor] (val x: Self) extends AnyVal {
    
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
    def setRawCursor(value: `true`): Self = this.set("rawCursor", value.asInstanceOf[js.Any])
  }
}
