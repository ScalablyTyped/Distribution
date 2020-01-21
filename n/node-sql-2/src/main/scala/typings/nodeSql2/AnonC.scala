package typings.nodeSql2

import typings.nodeSql2.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonC extends js.Object {
  def LOWER[Name](c: Column[Name, String]): Column[Name, String]
}

object AnonC {
  @scala.inline
  def apply(LOWER: Column[js.Any, String] => Column[js.Any, String]): AnonC = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
  
    __obj.asInstanceOf[AnonC]
  }
}

