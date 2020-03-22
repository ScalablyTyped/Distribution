package typings.postcssSelectorParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<postcss-selector-parser.postcss-selector-parser.SpaceAround> */
trait PartialSpaceAround extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[String] = js.undefined
}

object PartialSpaceAround {
  @scala.inline
  def apply(after: String = null, before: String = null): PartialSpaceAround = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSpaceAround]
  }
}

