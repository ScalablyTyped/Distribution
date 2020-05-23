package typings.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompetitiveQuickplay extends js.Object {
  var competitive: Gameswon
  var quickplay: Eliminationsperlife
}

object CompetitiveQuickplay {
  @scala.inline
  def apply(competitive: Gameswon, quickplay: Eliminationsperlife): CompetitiveQuickplay = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompetitiveQuickplay]
  }
}

