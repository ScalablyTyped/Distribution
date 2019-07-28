package typings.nextDashServer

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends js.Object {
  var Component: ComponentType[_]
  var err: js.Any
}

object Anon_Component {
  @scala.inline
  def apply(Component: ComponentType[_], err: js.Any): Anon_Component = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], err = err)
  
    __obj.asInstanceOf[Anon_Component]
  }
}

