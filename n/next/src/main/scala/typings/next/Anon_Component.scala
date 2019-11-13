package typings.next

import typings.react.reactMod.ComponentType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends js.Object {
  var Component: ComponentType[js.Object]
  var err: js.UndefOr[Error] = js.undefined
  var error: js.UndefOr[js.Any] = js.undefined
  var props: js.UndefOr[js.Any] = js.undefined
}

object Anon_Component {
  @scala.inline
  def apply(Component: ComponentType[js.Object], err: Error = null, error: js.Any = null, props: js.Any = null): Anon_Component = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err)
    if (error != null) __obj.updateDynamic("error")(error)
    if (props != null) __obj.updateDynamic("props")(props)
    __obj.asInstanceOf[Anon_Component]
  }
}

