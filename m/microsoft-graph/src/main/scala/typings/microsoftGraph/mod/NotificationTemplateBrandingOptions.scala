package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.includeCompanyLogo
  - typings.microsoftGraph.microsoftGraphStrings.includeCompanyName
  - typings.microsoftGraph.microsoftGraphStrings.includeContactInformation
*/
trait NotificationTemplateBrandingOptions extends js.Object

object NotificationTemplateBrandingOptions {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def includeCompanyLogo: typings.microsoftGraph.microsoftGraphStrings.includeCompanyLogo = this.cast("includeCompanyLogo")
  @scala.inline
  def includeCompanyName: typings.microsoftGraph.microsoftGraphStrings.includeCompanyName = this.cast("includeCompanyName")
  @scala.inline
  def includeContactInformation: typings.microsoftGraph.microsoftGraphStrings.includeContactInformation = this.cast("includeContactInformation")
  @scala.inline
  def none: none_ = this.cast("none")
}

