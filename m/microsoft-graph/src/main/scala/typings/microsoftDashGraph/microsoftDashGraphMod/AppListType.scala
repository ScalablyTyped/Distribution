package typings.microsoftDashGraph.microsoftDashGraphMod

import typings.microsoftDashGraph.microsoftDashGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.none_
  - typings.microsoftDashGraph.microsoftDashGraphStrings.appsInListCompliant
  - typings.microsoftDashGraph.microsoftDashGraphStrings.appsNotInListCompliant
*/
trait AppListType extends js.Object

object AppListType {
  @scala.inline
  def appsInListCompliant: typings.microsoftDashGraph.microsoftDashGraphStrings.appsInListCompliant = this.cast("appsInListCompliant")
  @scala.inline
  def appsNotInListCompliant: typings.microsoftDashGraph.microsoftDashGraphStrings.appsNotInListCompliant = this.cast("appsNotInListCompliant")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
}

