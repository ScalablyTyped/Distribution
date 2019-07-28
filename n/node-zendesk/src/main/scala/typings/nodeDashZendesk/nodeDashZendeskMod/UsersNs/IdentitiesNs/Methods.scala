package typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskCallback
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** Creating Identities */
  def create(
    userId: ZendeskID,
    identity: typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.CreatePayload,
    cb: ZendeskCallback[_, _]
  ): typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.ResponseModel
  /** Deleting Identities */
  def delete(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  /** Listing Identities */
  def list(userId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.ListPayload
  def makePrimary(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.ListPayload
  def requestVerification(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  /** Viewing Identities */
  def show(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.ResponsePayload
  /** Updating Identities */
  def update(
    userId: ZendeskID,
    identityId: ZendeskID,
    identity: typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.UpdatePayload,
    cb: ZendeskCallback[_, _]
  ): typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.ResponsePayload
  def verify(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    create: (ZendeskID, typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.CreatePayload, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.ResponseModel,
    delete: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => js.Any,
    list: (ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.ListPayload,
    makePrimary: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.ListPayload,
    requestVerification: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => js.Any,
    show: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.ResponsePayload,
    update: (ZendeskID, ZendeskID, typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.UpdatePayload, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.ResponsePayload,
    verify: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.IdentitiesNs.ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), delete = js.Any.fromFunction3(delete), list = js.Any.fromFunction2(list), makePrimary = js.Any.fromFunction3(makePrimary), requestVerification = js.Any.fromFunction3(requestVerification), show = js.Any.fromFunction3(show), update = js.Any.fromFunction4(update), verify = js.Any.fromFunction3(verify))
  
    __obj.asInstanceOf[Methods]
  }
}

