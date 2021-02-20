package typings.maximMazurokGapiClientTranslate.gapi.client.translate

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTranslate.anon.Accesstoken
import typings.maximMazurokGapiClientTranslate.anon.Alt
import typings.maximMazurokGapiClientTranslate.anon.Callback
import typings.maximMazurokGapiClientTranslate.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlossariesResource extends StObject {
  
  /** Creates a glossary and returns the long-running operation. Returns NOT_FOUND, if the project doesn't exist. */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: Glossary): Request[Operation] = js.native
  
  /** Deletes a glossary, or cancels glossary construction if the glossary isn't created yet. Returns NOT_FOUND, if the glossary doesn't exist. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  /** Gets a glossary. Returns NOT_FOUND, if the glossary doesn't exist. */
  def get(): Request[Glossary] = js.native
  def get(request: Callback): Request[Glossary] = js.native
  
  /** Lists glossaries in a project. Returns NOT_FOUND, if the project doesn't exist. */
  def list(): Request[ListGlossariesResponse] = js.native
  def list(request: Fields): Request[ListGlossariesResponse] = js.native
}
