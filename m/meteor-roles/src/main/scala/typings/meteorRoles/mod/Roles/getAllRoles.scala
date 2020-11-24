package typings.meteorRoles.mod.Roles

import typings.meteor.Mongo.Cursor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/alanning:roles", "Roles.getAllRoles")
@js.native
object getAllRoles extends js.Object {
  
  /**
    * Retrieve set of all existing roles
    *
    * @method getAllRoles
    * @return {Cursor} cursor of existing roles
    */
  def apply(): Cursor[Role, Role] = js.native
}
