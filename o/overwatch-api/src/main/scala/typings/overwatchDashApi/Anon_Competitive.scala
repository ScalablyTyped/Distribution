package typings.overwatchDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Competitive extends js.Object {
  var competitive: Anon_Draw
  var quickplay: Anon_Played
}

object Anon_Competitive {
  @scala.inline
  def apply(competitive: Anon_Draw, quickplay: Anon_Played): Anon_Competitive = {
    val __obj = js.Dynamic.literal(competitive = competitive, quickplay = quickplay)
  
    __obj.asInstanceOf[Anon_Competitive]
  }
}

