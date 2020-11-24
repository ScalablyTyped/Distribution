package typings.metascraperYoutube

import typings.metascraper.mod.Rule
import typings.metascraperYoutube.anon.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("metascraper-youtube", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): Rule = js.native
  
  def isValidUrl(config: Url): Boolean = js.native
}
