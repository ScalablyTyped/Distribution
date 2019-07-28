package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[MigrationsCancelImportParams]
  }
}

