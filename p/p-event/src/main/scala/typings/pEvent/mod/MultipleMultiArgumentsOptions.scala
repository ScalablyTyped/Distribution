package typings.pEvent.mod

import typings.pEvent.pEventBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleMultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends MultipleOptions[EmittedType] {
  @JSName("multiArgs")
  val multiArgs_MultipleMultiArgumentsOptions: `true` = js.native
}

object MultipleMultiArgumentsOptions {
  @scala.inline
  def apply[/* <: js.Array[_] */ EmittedType](count: Double, multiArgs: `true`): MultipleMultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], multiArgs = multiArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleMultiArgumentsOptions[EmittedType]]
  }
  @scala.inline
  implicit class MultipleMultiArgumentsOptionsOps[Self <: MultipleMultiArgumentsOptions[_], /* <: js.Array[_] */ EmittedType] (val x: Self with MultipleMultiArgumentsOptions[EmittedType]) extends AnyVal {
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

