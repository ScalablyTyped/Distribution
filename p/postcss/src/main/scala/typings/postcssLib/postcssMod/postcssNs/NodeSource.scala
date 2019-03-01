package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeSource extends js.Object {
  /**
    * The ending position of the node's source.
    */
  var end: js.UndefOr[postcssLib.Anon_ColumnLine] = js.undefined
  var input: Input
  /**
    * The starting position of the node's source.
    */
  var start: js.UndefOr[postcssLib.Anon_ColumnLine] = js.undefined
}

object NodeSource {
  @scala.inline
  def apply(input: Input, end: postcssLib.Anon_ColumnLine = null, start: postcssLib.Anon_ColumnLine = null): NodeSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("input")(input)
    if (end != null) __obj.updateDynamic("end")(end)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[NodeSource]
  }
}

