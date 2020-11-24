package typings.pEvent.mod

import typings.pEvent.pEventBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IteratorMultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends IteratorOptions[EmittedType] {
  
  @JSName("multiArgs")
  var multiArgs_IteratorMultiArgumentsOptions: `true` = js.native
}
object IteratorMultiArgumentsOptions {
  
  @scala.inline
  def apply[EmittedType /* <: js.Array[_] */](multiArgs: `true`): IteratorMultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(multiArgs = multiArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorMultiArgumentsOptions[EmittedType]]
  }
  
  @scala.inline
  implicit class IteratorMultiArgumentsOptionsOps[Self <: IteratorMultiArgumentsOptions[_], EmittedType /* <: js.Array[_] */] (val x: Self with IteratorMultiArgumentsOptions[EmittedType]) extends AnyVal {
    
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
    def setMultiArgs(value: `true`): Self = this.set("multiArgs", value.asInstanceOf[js.Any])
  }
}
