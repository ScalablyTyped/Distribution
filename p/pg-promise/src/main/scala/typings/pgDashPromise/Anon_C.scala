package typings.pgDashPromise

import typings.pgDashPromise.pgDashPromiseMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_C extends js.Object {
  var from: js.UndefOr[String] = js.undefined
  var skip: js.UndefOr[String | js.Array[String] | (js.Function1[/* c */ Column, Boolean])] = js.undefined
  var to: js.UndefOr[String] = js.undefined
}

object Anon_C {
  @scala.inline
  def apply(
    from: String = null,
    skip: String | js.Array[String] | (js.Function1[/* c */ Column, Boolean]) = null,
    to: String = null
  ): Anon_C = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_C]
  }
}

