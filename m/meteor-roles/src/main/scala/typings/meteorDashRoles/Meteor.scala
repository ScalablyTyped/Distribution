package typings.meteorDashRoles

import typings.meteor.Mongo.Collection
import typings.meteorDashRoles.Roles.Role
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// module
@JSGlobal("Meteor")
@js.native
object Meteor extends js.Object {
  var roles: Collection[Role] = js.native
}

