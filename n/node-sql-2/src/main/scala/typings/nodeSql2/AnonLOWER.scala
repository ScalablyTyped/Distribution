package typings.nodeSql2

import typings.nodeSql2.mod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLOWER extends js.Object {
  def LOWER[Name](c: Column[Name, String]): Column[Name, String]
}

object AnonLOWER {
  @scala.inline
  def apply(LOWER: Column[js.Any, String] => Column[js.Any, String]): AnonLOWER = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
  
    __obj.asInstanceOf[AnonLOWER]
  }
}

