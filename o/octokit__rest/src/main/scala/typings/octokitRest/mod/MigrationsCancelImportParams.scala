package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MigrationsCancelImportParams extends js.Object {
  var owner: String
  var repo: String
}

object MigrationsCancelImportParams {
  @scala.inline
  def apply(owner: String, repo: String): MigrationsCancelImportParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MigrationsCancelImportParams]
  }
}

