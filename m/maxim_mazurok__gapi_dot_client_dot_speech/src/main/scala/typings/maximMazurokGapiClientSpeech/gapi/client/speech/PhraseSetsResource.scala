package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSpeech.anon.Accesstoken
import typings.maximMazurokGapiClientSpeech.anon.Fields
import typings.maximMazurokGapiClientSpeech.anon.Key
import typings.maximMazurokGapiClientSpeech.anon.Oauthtoken
import typings.maximMazurokGapiClientSpeech.anon.Parent
import typings.maximMazurokGapiClientSpeech.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhraseSetsResource extends StObject {
  
  def create(request: Fields, body: CreatePhraseSetRequest): Request[PhraseSet] = js.native
  /**
    * Create a set of phrase hints. Each item in the set can be a single word or a multi-word phrase. The items in the PhraseSet are favored by the recognition model when you send a call
    * that includes the PhraseSet.
    */
  def create(request: Parent): Request[PhraseSet] = js.native
  
  /** Delete a phrase set. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /** Get a phrase set. */
  def get(): Request[PhraseSet] = js.native
  def get(request: Accesstoken): Request[PhraseSet] = js.native
  
  /** List phrase sets. */
  def list(): Request[ListPhraseSetResponse] = js.native
  def list(request: Key): Request[ListPhraseSetResponse] = js.native
  
  def patch(request: Oauthtoken, body: PhraseSet): Request[PhraseSet] = js.native
  /** Update a phrase set. */
  def patch(request: PrettyPrint): Request[PhraseSet] = js.native
}
