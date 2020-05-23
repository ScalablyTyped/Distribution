package typings.nock.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: js.UndefOr[Double] = js.undefined
  var head: js.UndefOr[Double] = js.undefined
}

object Body {
  @scala.inline
  def apply(body: js.UndefOr[Double] = js.undefined, head: js.UndefOr[Double] = js.undefined): Body = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(body)) __obj.updateDynamic("body")(body.get.asInstanceOf[js.Any])
    if (!js.isUndefined(head)) __obj.updateDynamic("head")(head.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

