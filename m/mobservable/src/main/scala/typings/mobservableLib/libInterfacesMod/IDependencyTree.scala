package typings
package mobservableLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDependencyTree extends js.Object {
  var context: js.Any
  var dependencies: js.UndefOr[js.Array[IDependencyTree]] = js.undefined
  var id: scala.Double
  var name: java.lang.String
}

object IDependencyTree {
  @scala.inline
  def apply(
    context: js.Any,
    id: scala.Double,
    name: java.lang.String,
    dependencies: js.Array[IDependencyTree] = null
  ): IDependencyTree = {
    val __obj = js.Dynamic.literal(context = context, id = id, name = name)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    __obj.asInstanceOf[IDependencyTree]
  }
}

