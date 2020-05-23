package typings.osrsJsonApi.anon

import typings.osrsJsonApi.mod.hiscores.RankScoreObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hunter extends js.Object {
  var hunter: RankScoreObject
  var rogue: RankScoreObject
}

object Hunter {
  @scala.inline
  def apply(hunter: RankScoreObject, rogue: RankScoreObject): Hunter = {
    val __obj = js.Dynamic.literal(hunter = hunter.asInstanceOf[js.Any], rogue = rogue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hunter]
  }
}

