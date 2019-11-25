package typings.mobservable.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDependencyTree extends js.Object {
  var context: js.Any
  var dependencies: js.UndefOr[js.Array[IDependencyTree]] = js.undefined
  var id: Double
  var name: String
}

object IDependencyTree {
  @scala.inline
  def apply(context: js.Any, id: Double, name: String, dependencies: js.Array[IDependencyTree] = null): IDependencyTree = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDependencyTree]
  }
}

