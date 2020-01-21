package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.microsoftGraph.microsoftGraphStrings.browserDefault
  - typings.microsoftGraph.microsoftGraphStrings.blockAlways
  - typings.microsoftGraph.microsoftGraphStrings.allowCurrentWebSite
  - typings.microsoftGraph.microsoftGraphStrings.allowFromWebsitesVisited
  - typings.microsoftGraph.microsoftGraphStrings.allowAlways
*/
trait WebBrowserCookieSettings extends js.Object

object WebBrowserCookieSettings {
  @scala.inline
  def allowAlways: typings.microsoftGraph.microsoftGraphStrings.allowAlways = this.cast("allowAlways")
  @scala.inline
  def allowCurrentWebSite: typings.microsoftGraph.microsoftGraphStrings.allowCurrentWebSite = this.cast("allowCurrentWebSite")
  @scala.inline
  def allowFromWebsitesVisited: typings.microsoftGraph.microsoftGraphStrings.allowFromWebsitesVisited = this.cast("allowFromWebsitesVisited")
  @scala.inline
  def blockAlways: typings.microsoftGraph.microsoftGraphStrings.blockAlways = this.cast("blockAlways")
  @scala.inline
  def browserDefault: typings.microsoftGraph.microsoftGraphStrings.browserDefault = this.cast("browserDefault")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

