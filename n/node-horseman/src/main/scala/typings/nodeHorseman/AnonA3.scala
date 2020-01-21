package typings.nodeHorseman

import typings.nodeHorseman.nodeHorsemanStrings.A3
import typings.nodeHorseman.nodeHorsemanStrings.A4
import typings.nodeHorseman.nodeHorsemanStrings.A5
import typings.nodeHorseman.nodeHorsemanStrings.Legal
import typings.nodeHorseman.nodeHorsemanStrings.Letter
import typings.nodeHorseman.nodeHorsemanStrings.Tabloid
import typings.nodeHorseman.nodeHorsemanStrings.landscape
import typings.nodeHorseman.nodeHorsemanStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonA3 extends js.Object {
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
  var margin: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
}

object AnonA3 {
  @scala.inline
  def apply(
    format: A3 | A4 | A5 | Legal | Letter | Tabloid = null,
    margin: String = null,
    orientation: portrait | landscape = null
  ): AnonA3 = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonA3]
  }
}

