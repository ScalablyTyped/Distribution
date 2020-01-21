package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.`private`
  - typings.microsoftGraph.microsoftGraphStrings.public
  - typings.microsoftGraph.microsoftGraphStrings.hiddenMembership
  - typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait TeamVisibilityType extends js.Object

object TeamVisibilityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hiddenMembership: typings.microsoftGraph.microsoftGraphStrings.hiddenMembership = this.cast("hiddenMembership")
  @scala.inline
  def `private`: typings.microsoftGraph.microsoftGraphStrings.`private` = this.cast("private")
  @scala.inline
  def public: typings.microsoftGraph.microsoftGraphStrings.public = this.cast("public")
  @scala.inline
  def unknownFutureValue: typings.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

