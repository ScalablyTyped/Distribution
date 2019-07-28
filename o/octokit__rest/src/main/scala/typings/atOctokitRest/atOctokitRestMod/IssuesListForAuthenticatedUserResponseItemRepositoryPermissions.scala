package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssuesListForAuthenticatedUserResponseItemRepositoryPermissions extends js.Object {
  var admin: Boolean
  var pull: Boolean
  var push: Boolean
}

object IssuesListForAuthenticatedUserResponseItemRepositoryPermissions {
  @scala.inline
  def apply(admin: Boolean, pull: Boolean, push: Boolean): IssuesListForAuthenticatedUserResponseItemRepositoryPermissions = {
    val __obj = js.Dynamic.literal(admin = admin, pull = pull, push = push)
  
    __obj.asInstanceOf[IssuesListForAuthenticatedUserResponseItemRepositoryPermissions]
  }
}

