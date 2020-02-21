package typings.migrateMongo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationStatus extends js.Object {
  /**
    * Either "PENDING" or a JSON date.
    */
  var appliedAt: String
  var fileName: String
}

object MigrationStatus {
  @scala.inline
  def apply(appliedAt: String, fileName: String): MigrationStatus = {
    val __obj = js.Dynamic.literal(appliedAt = appliedAt.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationStatus]
  }
}

