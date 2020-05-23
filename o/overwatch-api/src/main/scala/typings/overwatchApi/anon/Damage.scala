package typings.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Damage extends js.Object {
  var damage: Rank
  var support: Rank
  var tank: Rank
}

object Damage {
  @scala.inline
  def apply(damage: Rank, support: Rank, tank: Rank): Damage = {
    val __obj = js.Dynamic.literal(damage = damage.asInstanceOf[js.Any], support = support.asInstanceOf[js.Any], tank = tank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Damage]
  }
}

