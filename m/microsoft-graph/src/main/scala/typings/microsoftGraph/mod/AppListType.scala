package typings.microsoftGraph.mod

import typings.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.none_
  - typings.microsoftGraph.microsoftGraphStrings.appsInListCompliant
  - typings.microsoftGraph.microsoftGraphStrings.appsNotInListCompliant
*/
trait AppListType extends js.Object

object AppListType {
  @scala.inline
  def appsInListCompliant: typings.microsoftGraph.microsoftGraphStrings.appsInListCompliant = this.cast("appsInListCompliant")
  @scala.inline
  def appsNotInListCompliant: typings.microsoftGraph.microsoftGraphStrings.appsNotInListCompliant = this.cast("appsNotInListCompliant")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
}

