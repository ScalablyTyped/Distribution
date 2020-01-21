package typings.nodePgMigrate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyOptions extends js.Object {
  var check: String
  var role: String | js.Array[String]
  var using: String
}

object PolicyOptions {
  @scala.inline
  def apply(check: String, role: String | js.Array[String], using: String): PolicyOptions = {
    val __obj = js.Dynamic.literal(check = check.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], using = using.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PolicyOptions]
  }
}

