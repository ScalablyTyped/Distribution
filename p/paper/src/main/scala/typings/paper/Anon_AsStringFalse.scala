package typings.paper

import typings.paper.paperNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsStringFalse extends js.Object {
  var asString: `false`
  var precision: js.UndefOr[Double] = js.undefined
}

object Anon_AsStringFalse {
  @scala.inline
  def apply(asString: `false`, precision: Int | Double = null): Anon_AsStringFalse = {
    val __obj = js.Dynamic.literal(asString = asString)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AsStringFalse]
  }
}

