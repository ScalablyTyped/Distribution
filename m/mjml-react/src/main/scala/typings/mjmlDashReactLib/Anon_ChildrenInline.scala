package typings
package mjmlDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ChildrenInline extends js.Object {
  var children: java.lang.String
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ChildrenInline {
  @scala.inline
  def apply(children: java.lang.String, `inline`: js.UndefOr[scala.Boolean] = js.undefined): Anon_ChildrenInline = {
    val __obj = js.Dynamic.literal(children = children)
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    __obj.asInstanceOf[Anon_ChildrenInline]
  }
}

