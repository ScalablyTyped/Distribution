package typings.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Competitive extends js.Object {
  var competitive: Draw
  var quickplay: Played
}

object Competitive {
  @scala.inline
  def apply(competitive: Draw, quickplay: Played): Competitive = {
    val __obj = js.Dynamic.literal(competitive = competitive.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Competitive]
  }
}

