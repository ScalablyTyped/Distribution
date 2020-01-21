package typings.officeUiFabricReact

import typings.officeUiFabricReact.hoverCardTypesMod.HoverCardType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCardDismissDelay extends js.Object {
  var cardDismissDelay: Double
  var cardOpenDelay: Double
  var expandedCardOpenDelay: Double
  var instantOpenOnClick: Boolean
  var openHotKey: Double
  var setInitialFocus: Boolean
  var `type`: HoverCardType
}

object AnonCardDismissDelay {
  @scala.inline
  def apply(
    cardDismissDelay: Double,
    cardOpenDelay: Double,
    expandedCardOpenDelay: Double,
    instantOpenOnClick: Boolean,
    openHotKey: Double,
    setInitialFocus: Boolean,
    `type`: HoverCardType
  ): AnonCardDismissDelay = {
    val __obj = js.Dynamic.literal(cardDismissDelay = cardDismissDelay.asInstanceOf[js.Any], cardOpenDelay = cardOpenDelay.asInstanceOf[js.Any], expandedCardOpenDelay = expandedCardOpenDelay.asInstanceOf[js.Any], instantOpenOnClick = instantOpenOnClick.asInstanceOf[js.Any], openHotKey = openHotKey.asInstanceOf[js.Any], setInitialFocus = setInitialFocus.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCardDismissDelay]
  }
}

