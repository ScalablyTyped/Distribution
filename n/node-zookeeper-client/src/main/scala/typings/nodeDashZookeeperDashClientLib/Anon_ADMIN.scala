package typings
package nodeDashZookeeperDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ADMIN extends js.Object {
  var ADMIN: scala.Double
  var ALL: scala.Double
  var CREATE: scala.Double
  var DELETE: scala.Double
  var READ: scala.Double
  var WRITE: scala.Double
}

object Anon_ADMIN {
  @scala.inline
  def apply(
    ADMIN: scala.Double,
    ALL: scala.Double,
    CREATE: scala.Double,
    DELETE: scala.Double,
    READ: scala.Double,
    WRITE: scala.Double
  ): Anon_ADMIN = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ADMIN")(ADMIN)
    __obj.updateDynamic("ALL")(ALL)
    __obj.updateDynamic("CREATE")(CREATE)
    __obj.updateDynamic("DELETE")(DELETE)
    __obj.updateDynamic("READ")(READ)
    __obj.updateDynamic("WRITE")(WRITE)
    __obj.asInstanceOf[Anon_ADMIN]
  }
}

