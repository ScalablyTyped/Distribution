package typings
package nextLib.documentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderPageResponse extends js.Object {
  var head: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var html: js.UndefOr[java.lang.String] = js.undefined
}

object RenderPageResponse {
  @scala.inline
  def apply(head: reactLib.reactMod.ReactNs.ReactNode = null, html: java.lang.String = null): RenderPageResponse = {
    val __obj = js.Dynamic.literal()
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html)
    __obj.asInstanceOf[RenderPageResponse]
  }
}

