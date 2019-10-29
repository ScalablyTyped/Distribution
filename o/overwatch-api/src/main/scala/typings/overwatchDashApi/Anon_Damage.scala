package typings.overwatchDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Damage extends js.Object {
  var damage: Anon_Rank
  var support: Anon_Rank
  var tank: Anon_Rank
}

object Anon_Damage {
  @scala.inline
  def apply(damage: Anon_Rank, support: Anon_Rank, tank: Anon_Rank): Anon_Damage = {
    val __obj = js.Dynamic.literal(damage = damage, support = support, tank = tank)
  
    __obj.asInstanceOf[Anon_Damage]
  }
}

