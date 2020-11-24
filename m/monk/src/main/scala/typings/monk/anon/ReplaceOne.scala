package typings.monk.anon

import typings.monk.monkBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceOne extends js.Object {
  
  var replaceOne: js.UndefOr[`false`] = js.native
}
object ReplaceOne {
  
  @scala.inline
  def apply(): ReplaceOne = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplaceOne]
  }
  
  @scala.inline
  implicit class ReplaceOneOps[Self <: ReplaceOne] (val x: Self) extends AnyVal {
    
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
    def setReplaceOne(value: `false`): Self = this.set("replaceOne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceOne: Self = this.set("replaceOne", js.undefined)
  }
}
