package typings
package mssqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Js extends js.Object {
  @JSName("js")
  var `js_`: js.Any
  var sql: js.Any
}

object Anon_Js {
  @scala.inline
  def apply(`js_`: js.Any, sql: js.Any): Anon_Js = {
    val __obj = js.Dynamic.literal(`js_` = `js_`)
    __obj.updateDynamic("sql")(sql)
    __obj.asInstanceOf[Anon_Js]
  }
}

