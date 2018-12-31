package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActionSendNotification extends js.Object {
  var Message: java.lang.String
  var RecipientsEx: IUserOrUserGroupIDExs
  var Subject: java.lang.String
  def Clone(): IActionSendNotification
}

