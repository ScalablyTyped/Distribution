package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveLearnset extends js.Object {
  var games: js.Array[java.lang.String]
  var learnset: js.Array[Learnset]
}

object MoveLearnset {
  @scala.inline
  def apply(games: js.Array[java.lang.String], learnset: js.Array[Learnset]): MoveLearnset = {
    val __obj = js.Dynamic.literal(games = games, learnset = learnset)
  
    __obj.asInstanceOf[MoveLearnset]
  }
}

