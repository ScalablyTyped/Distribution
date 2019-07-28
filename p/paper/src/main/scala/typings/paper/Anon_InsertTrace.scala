package typings.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InsertTrace extends js.Object {
  var insert: js.UndefOr[Boolean] = js.undefined
  var trace: js.UndefOr[Boolean] = js.undefined
}

object Anon_InsertTrace {
  @scala.inline
  def apply(insert: js.UndefOr[Boolean] = js.undefined, trace: js.UndefOr[Boolean] = js.undefined): Anon_InsertTrace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(insert)) __obj.updateDynamic("insert")(insert)
    if (!js.isUndefined(trace)) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[Anon_InsertTrace]
  }
}

