package typings.maximMazurokGapiClientSlides.gapi.client.slides

import typings.maximMazurokGapiClientSlides.anon.Callback
import typings.maximMazurokGapiClientSlides.anon.Fields
import typings.maximMazurokGapiClientSlides.anon.Key
import typings.maximMazurokGapiClientSlides.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresentationsResource extends StObject {
  
  /**
    * Applies one or more updates to the presentation. Each request is validated before being applied. If any request is not valid, then the entire request will fail and nothing will be
    * applied. Some requests have replies to give you some information about how they are applied. Other requests do not need to return information; these each return an empty reply. The
    * order of replies matches that of the requests. For example, suppose you call batchUpdate with four updates, and only the third one returns information. The response would have two
    * empty replies: the reply to the third request, and another empty reply, in that order. Because other users may be editing the presentation, the presentation might not exactly
    * reflect your changes: your changes may be altered with respect to collaborator changes. If there are no collaborators, the presentation should reflect your changes. In any case, the
    * updates in your request are guaranteed to be applied together atomically.
    */
  def batchUpdate(request: Callback): typings.gapiClient.gapi.client.Request[BatchUpdatePresentationResponse] = js.native
  def batchUpdate(request: Fields, body: BatchUpdatePresentationRequest): typings.gapiClient.gapi.client.Request[BatchUpdatePresentationResponse] = js.native
  
  /**
    * Creates a blank presentation using the title given in the request. If a `presentationId` is provided, it is used as the ID of the new presentation. Otherwise, a new ID is generated.
    * Other fields in the request, including any provided content, are ignored. Returns the created presentation.
    */
  def create(request: Key): typings.gapiClient.gapi.client.Request[Presentation] = js.native
  def create(request: Oauthtoken, body: Presentation): typings.gapiClient.gapi.client.Request[Presentation] = js.native
  
  /** Gets the latest version of the specified presentation. */
  def get(): typings.gapiClient.gapi.client.Request[Presentation] = js.native
  def get(request: Fields): typings.gapiClient.gapi.client.Request[Presentation] = js.native
  
  var pages: PagesResource = js.native
}
