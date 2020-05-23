package typings.natsHemera.mod

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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    expectedMessages$: js.UndefOr[Double] = js.undefined,
    maxMessages$: js.UndefOr[Double] = js.undefined,
    pubsub$: js.UndefOr[Boolean] = js.undefined,
    timeout$: js.UndefOr[Double] = js.undefined
  ): ClientPattern = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(expectedMessages$)) __obj.updateDynamic("expectedMessages$")(expectedMessages$.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMessages$)) __obj.updateDynamic("maxMessages$")(maxMessages$.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pubsub$)) __obj.updateDynamic("pubsub$")(pubsub$.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout$)) __obj.updateDynamic("timeout$")(timeout$.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPattern]
  }
}

