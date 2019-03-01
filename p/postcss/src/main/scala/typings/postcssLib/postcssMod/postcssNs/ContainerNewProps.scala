package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerNewProps extends NodeNewProps {
  /**
    * Contains the container's children.
    */
  var nodes: js.UndefOr[js.Array[Node]] = js.undefined
  @JSName("raws")
  var raws_ContainerNewProps: js.UndefOr[ContainerRaws] = js.undefined
}

object ContainerNewProps {
  @scala.inline
  def apply(nodes: js.Array[Node] = null, raws: ContainerRaws = null): ContainerNewProps = {
    val __obj = js.Dynamic.literal()
    if (nodes != null) __obj.updateDynamic("nodes")(nodes)
    if (raws != null) __obj.updateDynamic("raws")(raws)
    __obj.asInstanceOf[ContainerNewProps]
  }
}

