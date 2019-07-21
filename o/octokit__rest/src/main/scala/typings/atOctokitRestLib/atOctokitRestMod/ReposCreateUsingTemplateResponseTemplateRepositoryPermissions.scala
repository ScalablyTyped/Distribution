package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCreateUsingTemplateResponseTemplateRepositoryPermissions extends js.Object {
  var admin: scala.Boolean
  var pull: scala.Boolean
  var push: scala.Boolean
}

object ReposCreateUsingTemplateResponseTemplateRepositoryPermissions {
  @scala.inline
  def apply(admin: scala.Boolean, pull: scala.Boolean, push: scala.Boolean): ReposCreateUsingTemplateResponseTemplateRepositoryPermissions = {
    val __obj = js.Dynamic.literal(admin = admin, pull = pull, push = push)
  
    __obj.asInstanceOf[ReposCreateUsingTemplateResponseTemplateRepositoryPermissions]
  }
}

