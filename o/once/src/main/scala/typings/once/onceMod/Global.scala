package typings.once.onceMod

import typings.once.onceMod.Global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object Global extends js.Object {
  @js.native
  trait Function extends js.Object {
    // tslint:disable-next-line ban-types
    def once(): Function with FnProps[_] = js.native
  }
  
}

