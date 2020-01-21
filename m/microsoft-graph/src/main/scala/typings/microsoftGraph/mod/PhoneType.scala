package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.home
  - typings.microsoftGraph.microsoftGraphStrings.business
  - typings.microsoftGraph.microsoftGraphStrings.mobile
  - typings.microsoftGraph.microsoftGraphStrings.other
  - typings.microsoftGraph.microsoftGraphStrings.assistant
  - typings.microsoftGraph.microsoftGraphStrings.homeFax
  - typings.microsoftGraph.microsoftGraphStrings.businessFax
  - typings.microsoftGraph.microsoftGraphStrings.otherFax
  - typings.microsoftGraph.microsoftGraphStrings.pager
  - typings.microsoftGraph.microsoftGraphStrings.radio
*/
trait PhoneType extends js.Object

object PhoneType {
  @scala.inline
  def assistant: typings.microsoftGraph.microsoftGraphStrings.assistant = this.cast("assistant")
  @scala.inline
  def business: typings.microsoftGraph.microsoftGraphStrings.business = this.cast("business")
  @scala.inline
  def businessFax: typings.microsoftGraph.microsoftGraphStrings.businessFax = this.cast("businessFax")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def home: typings.microsoftGraph.microsoftGraphStrings.home = this.cast("home")
  @scala.inline
  def homeFax: typings.microsoftGraph.microsoftGraphStrings.homeFax = this.cast("homeFax")
  @scala.inline
  def mobile: typings.microsoftGraph.microsoftGraphStrings.mobile = this.cast("mobile")
  @scala.inline
  def other: typings.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def otherFax: typings.microsoftGraph.microsoftGraphStrings.otherFax = this.cast("otherFax")
  @scala.inline
  def pager: typings.microsoftGraph.microsoftGraphStrings.pager = this.cast("pager")
  @scala.inline
  def radio: typings.microsoftGraph.microsoftGraphStrings.radio = this.cast("radio")
}

