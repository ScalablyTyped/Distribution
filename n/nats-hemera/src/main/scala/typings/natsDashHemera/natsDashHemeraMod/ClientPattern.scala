package typings.natsDashHemera.natsDashHemeraMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientPattern
  extends /* key */ StringDictionary[js.Any] {
  @JSName("expectedMessages$")
  var expectedMessages$: js.UndefOr[Double] = js.undefined
  @JSName("maxMessages$")
  var maxMessages$: js.UndefOr[Double] = js.undefined
  @JSName("pubsub$")
  var pubsub$: js.UndefOr[Boolean] = js.undefined
  @JSName("timeout$")
  var timeout$: js.UndefOr[Double] = js.undefined
  var topic: String
}

object ClientPattern {
  @scala.inline
  def apply(
    topic: String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    expectedMessages$: Int | Double = null,
    maxMessages$: Int | Double = null,
    pubsub$: js.UndefOr[Boolean] = js.undefined,
    timeout$: Int | Double = null
  ): ClientPattern = {
    val __obj = js.Dynamic.literal(topic = topic)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (expectedMessages$ != null) __obj.updateDynamic("expectedMessages$")(expectedMessages$.asInstanceOf[js.Any])
    if (maxMessages$ != null) __obj.updateDynamic("maxMessages$")(maxMessages$.asInstanceOf[js.Any])
    if (!js.isUndefined(pubsub$)) __obj.updateDynamic("pubsub$")(pubsub$)
    if (timeout$ != null) __obj.updateDynamic("timeout$")(timeout$.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPattern]
  }
}

