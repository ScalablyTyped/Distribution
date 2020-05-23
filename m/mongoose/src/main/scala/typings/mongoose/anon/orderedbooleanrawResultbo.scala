package typings.mongoose.anon

import typings.mongoose.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  ordered ? :boolean,   rawResult ? :boolean} & mongoose.mongoose.ModelOptions */
trait orderedbooleanrawResultbo extends js.Object {
  var ordered: js.UndefOr[Boolean] = js.undefined
  var rawResult: js.UndefOr[Boolean] = js.undefined
  var session: js.UndefOr[ClientSession | Null] = js.undefined
}

object orderedbooleanrawResultbo {
  @scala.inline
  def apply(
    ordered: js.UndefOr[Boolean] = js.undefined,
    rawResult: js.UndefOr[Boolean] = js.undefined,
    session: js.UndefOr[Null | ClientSession] = js.undefined
  ): orderedbooleanrawResultbo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ordered)) __obj.updateDynamic("ordered")(ordered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rawResult)) __obj.updateDynamic("rawResult")(rawResult.get.asInstanceOf[js.Any])
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    __obj.asInstanceOf[orderedbooleanrawResultbo]
  }
}

