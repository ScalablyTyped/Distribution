package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientHealthcare.anon.KeyOauthtoken
import typings.maximMazurokGapiClientHealthcare.anon.Name
import typings.maximMazurokGapiClientHealthcare.anon.NameOauthtoken
import typings.maximMazurokGapiClientHealthcare.anon.OauthtokenParent
import typings.maximMazurokGapiClientHealthcare.anon.OrderBy
import typings.maximMazurokGapiClientHealthcare.anon.UpdateMask
import typings.maximMazurokGapiClientHealthcare.anon.Uploadprotocol
import typings.maximMazurokGapiClientHealthcare.anon.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagesResource extends StObject {
  
  /**
    * Parses and stores an HL7v2 message. This method triggers an asynchronous notification to any Cloud Pub/Sub topic configured in
    * projects.locations.datasets.hl7V2Stores.Hl7V2NotificationConfig, if the filtering matches the message. If an MLLP adapter is configured to listen to a Cloud Pub/Sub topic, the
    * adapter transmits the message when a notification is received.
    */
  def create(request: KeyOauthtoken): Request[Message] = js.native
  def create(request: Uploadprotocol, body: CreateMessageRequest): Request[Message] = js.native
  
  /** Deletes an HL7v2 message. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Gets an HL7v2 message. */
  def get(): Request[Message] = js.native
  def get(request: View): Request[Message] = js.native
  
  /**
    * Parses and stores an HL7v2 message. This method triggers an asynchronous notification to any Cloud Pub/Sub topic configured in
    * projects.locations.datasets.hl7V2Stores.Hl7V2NotificationConfig, if the filtering matches the message. If an MLLP adapter is configured to listen to a Cloud Pub/Sub topic, the
    * adapter transmits the message when a notification is received. This method also generates a response containing an HL7v2 acknowledgement (`ACK`) message when successful or a
    * negative acknowledgement (`NACK`) message in case of error, suitable for replying to HL7v2 interface systems that expect these acknowledgements.
    */
  def ingest(request: OauthtokenParent): Request[IngestMessageResponse] = js.native
  def ingest(request: Uploadprotocol, body: IngestMessageRequest): Request[IngestMessageResponse] = js.native
  
  /**
    * Lists all the messages in the given HL7v2 store with support for filtering. Note: HL7v2 messages are indexed asynchronously, so there might be a slight delay between the time a
    * message is created and when it can be found through a filter.
    */
  def list(): Request[ListMessagesResponse] = js.native
  def list(request: OrderBy): Request[ListMessagesResponse] = js.native
  
  /**
    * Update the message. The contents of the message in Message.data and data extracted from the contents such as Message.create_time cannot be altered. Only the Message.labels field is
    * allowed to be updated. The labels in the request are merged with the existing set of labels. Existing labels with the same keys are updated.
    */
  def patch(request: NameOauthtoken): Request[Message] = js.native
  def patch(request: UpdateMask, body: Message): Request[Message] = js.native
}
