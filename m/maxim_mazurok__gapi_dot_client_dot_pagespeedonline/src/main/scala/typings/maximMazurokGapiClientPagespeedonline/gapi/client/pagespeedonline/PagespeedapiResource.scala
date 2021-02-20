package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPagespeedonline.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PagespeedapiResource extends StObject {
  
  /** Runs PageSpeed analysis on the page at the specified URL, and returns PageSpeed scores, a list of suggestions to make that page faster, and other information. */
  def runpagespeed(): Request[PagespeedApiPagespeedResponseV5] = js.native
  def runpagespeed(request: Accesstoken): Request[PagespeedApiPagespeedResponseV5] = js.native
}
