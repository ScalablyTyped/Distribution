package typings.metascraperYoutube

import typings.metascraper.mod.Rule
import typings.metascraperYoutube.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metascraper-youtube", JSImport.Namespace)
  @js.native
  def apply(): Rule = js.native
  
  @JSImport("metascraper-youtube", "isValidUrl")
  @js.native
  def isValidUrl(config: Url): Boolean = js.native
}
