package typings.maximMazurokGapiClientDns.gapi.client.dns

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDns.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  /** Fetch the representation of an existing Project. */
  def get(): Request[Project] = js.native
  def get(request: PrettyPrint): Request[Project] = js.native
}
