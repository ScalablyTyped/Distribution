package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.PartialSpaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerOptions extends NodeOptions[String] {
  var nodes: js.UndefOr[js.Array[Node]] = js.undefined
}

object ContainerOptions {
  @scala.inline
  def apply(
    value: String,
    nodes: js.Array[Node] = null,
    source: NodeSource = null,
    sourceIndex: Int | Double = null,
    spaces: PartialSpaces = null
  ): ContainerOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (nodes != null) __obj.updateDynamic("nodes")(nodes.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceIndex != null) __obj.updateDynamic("sourceIndex")(sourceIndex.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerOptions]
  }
}

