package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbName extends js.Object {
  var dbName: js.UndefOr[String] = js.undefined
}

object DbName {
  @scala.inline
  def apply(dbName: String = null): DbName = {
    val __obj = js.Dynamic.literal()
    if (dbName != null) __obj.updateDynamic("dbName")(dbName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbName]
  }
}

