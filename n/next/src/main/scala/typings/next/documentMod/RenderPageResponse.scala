package typings.next.documentMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderPageResponse extends js.Object {
  var head: js.UndefOr[ReactNode] = js.undefined
  var html: js.UndefOr[String] = js.undefined
}

object RenderPageResponse {
  @scala.inline
  def apply(head: ReactNode = null, html: String = null): RenderPageResponse = {
    val __obj = js.Dynamic.literal()
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html)
    __obj.asInstanceOf[RenderPageResponse]
  }
}

