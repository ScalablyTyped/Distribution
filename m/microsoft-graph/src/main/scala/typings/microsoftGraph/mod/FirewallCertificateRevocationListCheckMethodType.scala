package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.deviceDefault
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.attempt
  - typings.microsoftGraph.microsoftGraphStrings.require
*/
trait FirewallCertificateRevocationListCheckMethodType extends js.Object

object FirewallCertificateRevocationListCheckMethodType {
  @scala.inline
  def attempt: typings.microsoftGraph.microsoftGraphStrings.attempt = this.cast("attempt")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deviceDefault: typings.microsoftGraph.microsoftGraphStrings.deviceDefault = this.cast("deviceDefault")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def require: typings.microsoftGraph.microsoftGraphStrings.require = this.cast("require")
}

