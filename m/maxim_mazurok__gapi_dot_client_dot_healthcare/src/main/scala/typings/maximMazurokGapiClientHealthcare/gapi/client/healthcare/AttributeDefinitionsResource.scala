package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHealthcare.anon.Accesstoken
import typings.maximMazurokGapiClientHealthcare.anon.Alt
import typings.maximMazurokGapiClientHealthcare.anon.Callback
import typings.maximMazurokGapiClientHealthcare.anon.Fields
import typings.maximMazurokGapiClientHealthcare.anon.Key
import typings.maximMazurokGapiClientHealthcare.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeDefinitionsResource extends StObject {
  
  /** Creates a new Attribute definition in the parent consent store. */
  def create(request: Accesstoken): Request[AttributeDefinition] = js.native
  def create(request: Alt, body: AttributeDefinition): Request[AttributeDefinition] = js.native
  
  /** Deletes the specified Attribute definition. Fails if the Attribute definition is referenced by any User data mapping, or the latest revision of any Consent. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  /** Gets the specified Attribute definition. */
  def get(): Request[AttributeDefinition] = js.native
  def get(request: Callback): Request[AttributeDefinition] = js.native
  
  /** Lists the Attribute definitions in the specified consent store. */
  def list(): Request[ListAttributeDefinitionsResponse] = js.native
  def list(request: Fields): Request[ListAttributeDefinitionsResponse] = js.native
  
  /** Updates the specified Attribute definition. */
  def patch(request: Key): Request[AttributeDefinition] = js.native
  def patch(request: Name, body: AttributeDefinition): Request[AttributeDefinition] = js.native
}
