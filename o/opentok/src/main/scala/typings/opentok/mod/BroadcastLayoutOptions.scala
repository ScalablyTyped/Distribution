package typings.opentok.mod

import typings.opentok.opentokStrings.bestFit
import typings.opentok.opentokStrings.custom
import typings.opentok.opentokStrings.horizontalPresentation
import typings.opentok.opentokStrings.pip
import typings.opentok.opentokStrings.verticalPresentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BroadcastLayoutOptions extends js.Object {
  var stylesheet: js.UndefOr[String] = js.undefined
  var `type`: bestFit | pip | verticalPresentation | horizontalPresentation | custom
}

object BroadcastLayoutOptions {
  @scala.inline
  def apply(
    `type`: bestFit | pip | verticalPresentation | horizontalPresentation | custom,
    stylesheet: String = null
  ): BroadcastLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[BroadcastLayoutOptions]
  }
}

