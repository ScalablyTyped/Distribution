package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined
  - typings.microsoftDashGraph.microsoftDashGraphStrings.allow
  - typings.microsoftDashGraph.microsoftDashGraphStrings.blockThirdParty
  - typings.microsoftDashGraph.microsoftDashGraphStrings.blockAll
*/
trait EdgeCookiePolicy extends js.Object

object EdgeCookiePolicy {
  @scala.inline
  def allow: typings.microsoftDashGraph.microsoftDashGraphStrings.allow = this.cast("allow")
  @scala.inline
  def blockAll: typings.microsoftDashGraph.microsoftDashGraphStrings.blockAll = this.cast("blockAll")
  @scala.inline
  def blockThirdParty: typings.microsoftDashGraph.microsoftDashGraphStrings.blockThirdParty = this.cast("blockThirdParty")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def userDefined: typings.microsoftDashGraph.microsoftDashGraphStrings.userDefined = this.cast("userDefined")
}

