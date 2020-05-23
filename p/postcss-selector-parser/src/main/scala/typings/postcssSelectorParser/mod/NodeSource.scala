package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.anon.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeSource extends js.Object {
  var end: js.UndefOr[Column] = js.undefined
  var start: js.UndefOr[Column] = js.undefined
}

object NodeSource {
  @scala.inline
  def apply(end: Column = null, start: Column = null): NodeSource = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSource]
  }
}

