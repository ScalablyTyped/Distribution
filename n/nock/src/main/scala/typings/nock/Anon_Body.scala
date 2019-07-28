package typings.nock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[Double] = js.undefined
  var head: js.UndefOr[Double] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(body: Int | Double = null, head: Int | Double = null): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Body]
  }
}

