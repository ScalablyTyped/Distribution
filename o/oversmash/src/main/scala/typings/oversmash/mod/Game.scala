package typings.oversmash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Game extends js.Object {
  var gamesWon: Double
  var timePlayed: String
}

object Game {
  @scala.inline
  def apply(gamesWon: Double, timePlayed: String): Game = {
    val __obj = js.Dynamic.literal(gamesWon = gamesWon.asInstanceOf[js.Any], timePlayed = timePlayed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Game]
  }
}

