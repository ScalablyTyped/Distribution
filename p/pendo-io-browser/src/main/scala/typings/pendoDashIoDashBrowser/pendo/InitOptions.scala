package typings.pendoDashIoDashBrowser.pendo

import typings.pendoDashIoDashBrowser.Anon_Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitOptions extends Identity {
  var apiKey: js.UndefOr[String] = js.undefined
  var disablePersistence: js.UndefOr[Boolean] = js.undefined
  var events: js.UndefOr[EventCallbacks] = js.undefined
  var excludeAllText: js.UndefOr[Boolean] = js.undefined
  var excludeTitle: js.UndefOr[Boolean] = js.undefined
  var guides: js.UndefOr[Anon_Delay] = js.undefined
}

object InitOptions {
  @scala.inline
  def apply(
    visitor: Visitor,
    account: Account = null,
    apiKey: String = null,
    disablePersistence: js.UndefOr[Boolean] = js.undefined,
    events: EventCallbacks = null,
    excludeAllText: js.UndefOr[Boolean] = js.undefined,
    excludeTitle: js.UndefOr[Boolean] = js.undefined,
    guides: Anon_Delay = null
  ): InitOptions = {
    val __obj = js.Dynamic.literal(visitor = visitor)
    if (account != null) __obj.updateDynamic("account")(account)
    if (apiKey != null) __obj.updateDynamic("apiKey")(apiKey)
    if (!js.isUndefined(disablePersistence)) __obj.updateDynamic("disablePersistence")(disablePersistence)
    if (events != null) __obj.updateDynamic("events")(events)
    if (!js.isUndefined(excludeAllText)) __obj.updateDynamic("excludeAllText")(excludeAllText)
    if (!js.isUndefined(excludeTitle)) __obj.updateDynamic("excludeTitle")(excludeTitle)
    if (guides != null) __obj.updateDynamic("guides")(guides)
    __obj.asInstanceOf[InitOptions]
  }
}

