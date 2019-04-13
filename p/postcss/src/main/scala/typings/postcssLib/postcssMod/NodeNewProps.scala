package typings
package postcssLib.postcssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeNewProps extends js.Object {
  var raws: js.UndefOr[NodeRaws] = js.undefined
  var source: js.UndefOr[NodeSource] = js.undefined
}

object NodeNewProps {
  @scala.inline
  def apply(raws: NodeRaws = null, source: NodeSource = null): NodeNewProps = {
    val __obj = js.Dynamic.literal()
    if (raws != null) __obj.updateDynamic("raws")(raws)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[NodeNewProps]
  }
}

