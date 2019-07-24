package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MimeContent extends js.Object {
  // Indicates the content mime type.
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  // The byte array that contains the actual content.
  var value: js.UndefOr[scala.Double] = js.undefined
}

object MimeContent {
  @scala.inline
  def apply(`type`: java.lang.String = null, value: scala.Int | scala.Double = null): MimeContent = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeContent]
  }
}

