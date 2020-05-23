package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactField extends js.Object {
  var pref: Boolean
  var `type`: String
  var value: String
}

object ContactField {
  @scala.inline
  def apply(pref: Boolean, `type`: String, value: String): ContactField = {
    val __obj = js.Dynamic.literal(pref = pref.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactField]
  }
}

