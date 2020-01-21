package typings.onfleetNodeOnfleet.recipientsMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recipient extends js.Object {
  def create(recipient: CreateRecipientProps): js.Promise[OnfleetRecipient] = js.native
  def get(queryOrId: String): js.Promise[OnfleetRecipient] = js.native
  def get(queryOrId: String, queryKey: RecipientQueryKey): js.Promise[OnfleetRecipient] = js.native
  def update(id: String, recipient: Partial[CreateRecipientProps]): js.Promise[OnfleetRecipient] = js.native
}

