package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.PartialSpaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeOptions[Value] extends js.Object {
  var source: js.UndefOr[NodeSource] = js.undefined
  var sourceIndex: js.UndefOr[Double] = js.undefined
  var spaces: js.UndefOr[PartialSpaces] = js.undefined
  var value: Value
}

object NodeOptions {
  @scala.inline
  def apply[Value](
    value: Value,
    source: NodeSource = null,
    sourceIndex: Int | Double = null,
    spaces: PartialSpaces = null
  ): NodeOptions[Value] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceIndex != null) __obj.updateDynamic("sourceIndex")(sourceIndex.asInstanceOf[js.Any])
    if (spaces != null) __obj.updateDynamic("spaces")(spaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions[Value]]
  }
}

