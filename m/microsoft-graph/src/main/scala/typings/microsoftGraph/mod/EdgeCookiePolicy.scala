package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.userDefined
  - typings.microsoftGraph.microsoftGraphStrings.allow
  - typings.microsoftGraph.microsoftGraphStrings.blockThirdParty
  - typings.microsoftGraph.microsoftGraphStrings.blockAll
*/
trait EdgeCookiePolicy extends js.Object

object EdgeCookiePolicy {
  @scala.inline
  def allow: typings.microsoftGraph.microsoftGraphStrings.allow = this.cast("allow")
  @scala.inline
  def blockAll: typings.microsoftGraph.microsoftGraphStrings.blockAll = this.cast("blockAll")
  @scala.inline
  def blockThirdParty: typings.microsoftGraph.microsoftGraphStrings.blockThirdParty = this.cast("blockThirdParty")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def userDefined: typings.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

