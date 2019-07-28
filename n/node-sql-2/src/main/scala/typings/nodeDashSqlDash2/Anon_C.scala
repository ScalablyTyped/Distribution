package typings.nodeDashSqlDash2

import typings.nodeDashSqlDash2.sqlMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_C extends js.Object {
  def LOWER[Name](c: Column[Name, String]): Column[Name, String]
}

object Anon_C {
  @scala.inline
  def apply(LOWER: Column[js.Any, String] => Column[js.Any, String]): Anon_C = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
  
    __obj.asInstanceOf[Anon_C]
  }
}

