package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typings.microsoftGraph.microsoftGraphStrings.banner
  - typings.microsoftGraph.microsoftGraphStrings.modal
  - typings.microsoftGraph.microsoftGraphStrings.none_
*/
trait IosNotificationAlertType extends js.Object

object IosNotificationAlertType {
  @scala.inline
  def banner: typings.microsoftGraph.microsoftGraphStrings.banner = this.cast("banner")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typings.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def modal: typings.microsoftGraph.microsoftGraphStrings.modal = this.cast("modal")
  @scala.inline
  def none: none_ = this.cast("none")
}

