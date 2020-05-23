package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactName extends js.Object {
  var familyName: String
  var formatted: String
  var givenName: String
  var honorificPrefix: String
  var honorificSuffix: String
  var middleName: String
}

object ContactName {
  @scala.inline
  def apply(
    familyName: String,
    formatted: String,
    givenName: String,
    honorificPrefix: String,
    honorificSuffix: String,
    middleName: String
  ): ContactName = {
    val __obj = js.Dynamic.literal(familyName = familyName.asInstanceOf[js.Any], formatted = formatted.asInstanceOf[js.Any], givenName = givenName.asInstanceOf[js.Any], honorificPrefix = honorificPrefix.asInstanceOf[js.Any], honorificSuffix = honorificSuffix.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactName]
  }
}

