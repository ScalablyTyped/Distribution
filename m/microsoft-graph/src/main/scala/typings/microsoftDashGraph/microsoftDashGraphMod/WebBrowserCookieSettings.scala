package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftDashGraph.microsoftDashGraphStrings.browserDefault
  - typings.microsoftDashGraph.microsoftDashGraphStrings.blockAlways
  - typings.microsoftDashGraph.microsoftDashGraphStrings.allowCurrentWebSite
  - typings.microsoftDashGraph.microsoftDashGraphStrings.allowFromWebsitesVisited
  - typings.microsoftDashGraph.microsoftDashGraphStrings.allowAlways
*/
trait WebBrowserCookieSettings extends js.Object

object WebBrowserCookieSettings {
  @scala.inline
  def allowAlways: typings.microsoftDashGraph.microsoftDashGraphStrings.allowAlways = this.cast("allowAlways")
  @scala.inline
  def allowCurrentWebSite: typings.microsoftDashGraph.microsoftDashGraphStrings.allowCurrentWebSite = this.cast("allowCurrentWebSite")
  @scala.inline
  def allowFromWebsitesVisited: typings.microsoftDashGraph.microsoftDashGraphStrings.allowFromWebsitesVisited = this.cast("allowFromWebsitesVisited")
  @scala.inline
  def blockAlways: typings.microsoftDashGraph.microsoftDashGraphStrings.blockAlways = this.cast("blockAlways")
  @scala.inline
  def browserDefault: typings.microsoftDashGraph.microsoftDashGraphStrings.browserDefault = this.cast("browserDefault")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

