package typings.nodeZendesk.mod.Users.Identities

import typings.nodeZendesk.mod.ZendeskCallback
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods extends js.Object {
  
  def create(userId: ZendeskID, identity: CreatePayload): js.Promise[ResponseModel] = js.native
  /** Creating Identities */
  def create(userId: ZendeskID, identity: CreatePayload, cb: ZendeskCallback[_, _]): ResponseModel = js.native
  
  def delete(userId: ZendeskID, identityId: ZendeskID): js.Promise[_] = js.native
  /** Deleting Identities */
  def delete(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
  
  def list(userId: ZendeskID): js.Promise[ListPayload] = js.native
  /** Listing Identities */
  def list(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  
  def makePrimary(userId: ZendeskID, identityId: ZendeskID): js.Promise[ListPayload] = js.native
  def makePrimary(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  
  def requestVerification(userId: ZendeskID, identityId: ZendeskID): js.Promise[_] = js.native
  def requestVerification(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
  
  def show(userId: ZendeskID, identityId: ZendeskID): js.Promise[ResponsePayload] = js.native
  /** Viewing Identities */
  def show(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  
  def update(userId: ZendeskID, identityId: ZendeskID, identity: UpdatePayload): js.Promise[ResponsePayload] = js.native
  /** Updating Identities */
  def update(userId: ZendeskID, identityId: ZendeskID, identity: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  
  def verify(userId: ZendeskID, identityId: ZendeskID): js.Promise[ResponsePayload] = js.native
  def verify(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
}
