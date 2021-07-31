package typings.maximMazurokGapiClientScript.gapi.client.script

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientScript.anon.Fields
import typings.maximMazurokGapiClientScript.anon.Key
import typings.maximMazurokGapiClientScript.anon.PrettyPrint
import typings.maximMazurokGapiClientScript.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionsResource extends StObject {
  
  def create(request: Fields, body: Version): Request[Version] = js.native
  /** Creates a new immutable version using the current code, with a unique version number. */
  def create(request: PrettyPrint): Request[Version] = js.native
  
  /** Gets a version of a script project. */
  def get(): Request[Version] = js.native
  def get(request: QuotaUser): Request[Version] = js.native
  
  /** List the versions of a script project. */
  def list(): Request[ListVersionsResponse] = js.native
  def list(request: Key): Request[ListVersionsResponse] = js.native
}
