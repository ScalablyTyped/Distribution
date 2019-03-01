package typings
package nodeDashHorsemanLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_A3 extends js.Object {
  var format: js.UndefOr[
    nodeDashHorsemanLib.nodeDashHorsemanLibStrings.A3 | nodeDashHorsemanLib.nodeDashHorsemanLibStrings.A4 | nodeDashHorsemanLib.nodeDashHorsemanLibStrings.A5 | nodeDashHorsemanLib.nodeDashHorsemanLibStrings.Legal | nodeDashHorsemanLib.nodeDashHorsemanLibStrings.Letter | nodeDashHorsemanLib.nodeDashHorsemanLibStrings.Tabloid
  ] = js.undefined
  var margin: js.UndefOr[java.lang.String] = js.undefined
  var orientation: js.UndefOr[
    nodeDashHorsemanLib.nodeDashHorsemanLibStrings.portrait | nodeDashHorsemanLib.nodeDashHorsemanLibStrings.landscape
  ] = js.undefined
}

object Anon_A3 {
  @scala.inline
  def apply(
    format: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.A3 | nodeDashHorsemanLib.nodeDashHorsemanLibStrings.A4 | nodeDashHorsemanLib.nodeDashHorsemanLibStrings.A5 | nodeDashHorsemanLib.nodeDashHorsemanLibStrings.Legal | nodeDashHorsemanLib.nodeDashHorsemanLibStrings.Letter | nodeDashHorsemanLib.nodeDashHorsemanLibStrings.Tabloid = null,
    margin: java.lang.String = null,
    orientation: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.portrait | nodeDashHorsemanLib.nodeDashHorsemanLibStrings.landscape = null
  ): Anon_A3 = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_A3]
  }
}

