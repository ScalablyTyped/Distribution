package typings
package nockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.UndefOr[scala.Double] = js.undefined
  var head: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(body: scala.Int | scala.Double = null, head: scala.Int | scala.Double = null): Anon_Body = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Body]
  }
}

