package typings.mjmlReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenInline extends js.Object {
  var children: String
  var `inline`: js.UndefOr[Boolean] = js.undefined
}

object AnonChildrenInline {
  @scala.inline
  def apply(children: String, `inline`: js.UndefOr[Boolean] = js.undefined): AnonChildrenInline = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenInline]
  }
}

