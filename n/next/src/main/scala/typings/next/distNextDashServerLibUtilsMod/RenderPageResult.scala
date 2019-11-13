package typings.next.distNextDashServerLibUtilsMod

import typings.next.nextNumbers.`true`
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderPageResult extends js.Object {
  var dataOnly: js.UndefOr[`true`] = js.undefined
  var head: js.UndefOr[js.Array[Element | Null]] = js.undefined
  var html: String
}

object RenderPageResult {
  @scala.inline
  def apply(html: String, dataOnly: `true` = null, head: js.Array[Element | Null] = null): RenderPageResult = {
    val __obj = js.Dynamic.literal(html = html)
    if (dataOnly != null) __obj.updateDynamic("dataOnly")(dataOnly)
    if (head != null) __obj.updateDynamic("head")(head)
    __obj.asInstanceOf[RenderPageResult]
  }
}

