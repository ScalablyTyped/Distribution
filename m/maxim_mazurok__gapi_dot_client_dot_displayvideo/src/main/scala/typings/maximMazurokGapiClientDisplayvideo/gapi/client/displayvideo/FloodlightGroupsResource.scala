package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.FieldsFloodlightGroupId
import typings.maximMazurokGapiClientDisplayvideo.anon.FloodlightGroupId
import typings.maximMazurokGapiClientDisplayvideo.anon.FloodlightGroupIdKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightGroupsResource extends StObject {
  
  /** Gets a Floodlight group. */
  def get(): Request[FloodlightGroup] = js.native
  def get(request: FloodlightGroupId): Request[FloodlightGroup] = js.native
  
  /** Updates an existing Floodlight group. Returns the updated Floodlight group if successful. */
  def patch(request: FieldsFloodlightGroupId): Request[FloodlightGroup] = js.native
  def patch(request: FloodlightGroupIdKey, body: FloodlightGroup): Request[FloodlightGroup] = js.native
}
