package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDbName extends js.Object {
  var dbName: js.UndefOr[String] = js.undefined
}

object AnonDbName {
  @scala.inline
  def apply(dbName: String = null): AnonDbName = {
    val __obj = js.Dynamic.literal()
    if (dbName != null) __obj.updateDynamic("dbName")(dbName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDbName]
  }
}

