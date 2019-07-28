package typings.nodeDashHorseman

import typings.nodeDashHorseman.nodeDashHorsemanStrings.A3
import typings.nodeDashHorseman.nodeDashHorsemanStrings.A4
import typings.nodeDashHorseman.nodeDashHorsemanStrings.A5
import typings.nodeDashHorseman.nodeDashHorsemanStrings.Legal
import typings.nodeDashHorseman.nodeDashHorsemanStrings.Letter
import typings.nodeDashHorseman.nodeDashHorsemanStrings.Tabloid
import typings.nodeDashHorseman.nodeDashHorsemanStrings.landscape
import typings.nodeDashHorseman.nodeDashHorsemanStrings.portrait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A3 extends js.Object {
  var format: js.UndefOr[A3 | A4 | A5 | Legal | Letter | Tabloid] = js.undefined
  var margin: js.UndefOr[String] = js.undefined
  var orientation: js.UndefOr[portrait | landscape] = js.undefined
}

object Anon_A3 {
  @scala.inline
  def apply(
    format: A3 | A4 | A5 | Legal | Letter | Tabloid = null,
    margin: String = null,
    orientation: portrait | landscape = null
  ): Anon_A3 = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_A3]
  }
}

