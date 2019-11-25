package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactOrganization extends js.Object {
  var department: String
  var name: String
  var pref: Boolean
  var title: String
  var `type`: String
}

object ContactOrganization {
  @scala.inline
  def apply(department: String, name: String, pref: Boolean, title: String, `type`: String): ContactOrganization = {
    val __obj = js.Dynamic.literal(department = department.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pref = pref.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactOrganization]
  }
}

