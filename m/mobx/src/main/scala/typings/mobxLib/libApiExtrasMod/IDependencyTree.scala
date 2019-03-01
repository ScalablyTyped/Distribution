package typings
package mobxLib.libApiExtrasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDependencyTree extends js.Object {
  var dependencies: js.UndefOr[js.Array[IDependencyTree]] = js.undefined
  var name: java.lang.String
}

object IDependencyTree {
  @scala.inline
  def apply(name: java.lang.String, dependencies: js.Array[IDependencyTree] = null): IDependencyTree = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    __obj.asInstanceOf[IDependencyTree]
  }
}

