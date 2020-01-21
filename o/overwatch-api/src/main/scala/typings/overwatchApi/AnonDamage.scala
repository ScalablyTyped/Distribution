package typings.overwatchApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDamage extends js.Object {
  var damage: AnonRank
  var support: AnonRank
  var tank: AnonRank
}

object AnonDamage {
  @scala.inline
  def apply(damage: AnonRank, support: AnonRank, tank: AnonRank): AnonDamage = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], tank = tank.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDamage]
  }
}

