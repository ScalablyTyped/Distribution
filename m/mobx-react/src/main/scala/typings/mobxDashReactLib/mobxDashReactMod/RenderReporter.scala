package typings
package mobxDashReactLib.mobxDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderReporter extends js.Object {
  def on(handler: js.Function1[/* data */ IRenderEvent, scala.Unit]): scala.Unit
}

object RenderReporter {
  @scala.inline
  def apply(on: js.Function1[js.Function1[/* data */ IRenderEvent, scala.Unit], scala.Unit]): RenderReporter = {
    val __obj = js.Dynamic.literal(on = on)
  
    __obj.asInstanceOf[RenderReporter]
  }
}

