package typings.postcssSelectorParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<postcss-selector-parser.postcss-selector-parser.Spaces> */
trait PartialSpaces extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[String] = js.undefined
}

object PartialSpaces {
  @scala.inline
  def apply(after: String = null, before: String = null): PartialSpaces = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSpaces]
  }
}

