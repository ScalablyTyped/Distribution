package typings.parse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new ACL.
  * If no argument is given, the ACL has no permissions for anyone.
  * If the argument is a Parse.User, the ACL will have read and write
  *   permission for only that user.
  * If the argument is any other JSON object, that object will be interpretted
  *   as a serialized ACL created with toJSON().
  * @see Parse.Object#setACL
  *
  * <p>An ACL, or Access Control List can be added to any
  * <code>Parse.Object</code> to restrict access to only a subset of users
  * of your application.</p>
  */
@JSImport("parse", "ACL")
@js.native
class ACL ()
  extends typings.parse.mod._Global_.Parse.ACL {
  def this(arg1: js.Any) = this()
}

