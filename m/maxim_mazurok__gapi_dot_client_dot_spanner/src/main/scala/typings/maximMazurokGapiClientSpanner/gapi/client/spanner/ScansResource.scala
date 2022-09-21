package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSpanner.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScansResource extends StObject {
  
  /** Return available scans given a Database-specific resource name. */
  def list(): Request[ListScansResponse] = js.native
  def list(request: PageSize): Request[ListScansResponse] = js.native
}
