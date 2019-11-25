package typings.mobx.libApiExtrasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDependencyTree extends js.Object {
  var dependencies: js.UndefOr[js.Array[IDependencyTree]] = js.undefined
  var name: String
}

object IDependencyTree {
  @scala.inline
  def apply(name: String, dependencies: js.Array[IDependencyTree] = null): IDependencyTree = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDependencyTree]
  }
}

