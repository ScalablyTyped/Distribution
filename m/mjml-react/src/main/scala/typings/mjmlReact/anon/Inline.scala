package typings.mjmlReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inline extends js.Object {
  var children: String
  var `inline`: js.UndefOr[Boolean] = js.undefined
}

object Inline {
  @scala.inline
  def apply(children: String, `inline`: js.UndefOr[Boolean] = js.undefined): Inline = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Inline]
  }
}

