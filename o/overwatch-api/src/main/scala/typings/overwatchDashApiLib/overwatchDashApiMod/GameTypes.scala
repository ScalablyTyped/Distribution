package typings
package overwatchDashApiLib.overwatchDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameTypes extends js.Object {
  var competitive: CompetitiveGameType
  var quickplay: QuickplayGameType
}

object GameTypes {
  @scala.inline
  def apply(competitive: CompetitiveGameType, quickplay: QuickplayGameType): GameTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("competitive")(competitive)
    __obj.updateDynamic("quickplay")(quickplay)
    __obj.asInstanceOf[GameTypes]
  }
}

