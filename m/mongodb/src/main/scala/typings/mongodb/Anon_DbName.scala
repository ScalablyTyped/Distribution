package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DbName extends js.Object {
  var dbName: js.UndefOr[String] = js.undefined
}

object Anon_DbName {
  @scala.inline
  def apply(dbName: String = null): Anon_DbName = {
    val __obj = js.Dynamic.literal()
    if (dbName != null) __obj.updateDynamic("dbName")(dbName)
    __obj.asInstanceOf[Anon_DbName]
  }
}

