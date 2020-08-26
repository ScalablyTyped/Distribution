package typings.pEvent.mod

import typings.pEvent.pEventBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiArgumentsOptions[EmittedType /* <: js.Array[_] */] extends Options[EmittedType] {
  @JSName("multiArgs")
  val multiArgs_MultiArgumentsOptions: `true` = js.native
}

object MultiArgumentsOptions {
  @scala.inline
  def apply[/* <: js.Array[_] */ EmittedType](multiArgs: `true`): MultiArgumentsOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(multiArgs = multiArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiArgumentsOptions[EmittedType]]
  }
  @scala.inline
  implicit class MultiArgumentsOptionsOps[Self <: MultiArgumentsOptions[_], /* <: js.Array[_] */ EmittedType] (val x: Self with MultiArgumentsOptions[EmittedType]) extends AnyVal {
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

