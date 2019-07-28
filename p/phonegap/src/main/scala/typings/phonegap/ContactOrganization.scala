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
    val __obj = js.Dynamic.literal(department = department, name = name, pref = pref, title = title)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContactOrganization]
  }
}

