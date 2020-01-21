package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.other
  - typings.microsoftGraph.microsoftGraphStrings.home
  - typings.microsoftGraph.microsoftGraphStrings.work
  - typings.microsoftGraph.microsoftGraphStrings.blog
  - typings.microsoftGraph.microsoftGraphStrings.profile
*/
trait WebsiteType extends js.Object

object WebsiteType {
  @scala.inline
  def blog: typings.microsoftGraph.microsoftGraphStrings.blog = this.cast("blog")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def home: typings.microsoftGraph.microsoftGraphStrings.home = this.cast("home")
  @scala.inline
  def other: typings.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def profile: typings.microsoftGraph.microsoftGraphStrings.profile = this.cast("profile")
  @scala.inline
  def work: typings.microsoftGraph.microsoftGraphStrings.work = this.cast("work")
}

