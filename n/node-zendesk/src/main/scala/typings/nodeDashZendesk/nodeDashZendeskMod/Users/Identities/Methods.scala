package typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskCallback
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** Creating Identities */
  def create(
    userId: ZendeskID,
    identity: typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.CreatePayload,
    cb: ZendeskCallback[_, _]
  ): typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ResponseModel
  /** Deleting Identities */
  def delete(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  /** Listing Identities */
  def list(userId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ListPayload
  def makePrimary(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ListPayload
  def requestVerification(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  /** Viewing Identities */
  def show(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ResponsePayload
  /** Updating Identities */
  def update(
    userId: ZendeskID,
    identityId: ZendeskID,
    identity: typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.UpdatePayload,
    cb: ZendeskCallback[_, _]
  ): typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ResponsePayload
  def verify(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    create: (ZendeskID, typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.CreatePayload, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ResponseModel,
    delete: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => js.Any,
    list: (ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ListPayload,
    makePrimary: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ListPayload,
    requestVerification: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => js.Any,
    show: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ResponsePayload,
    update: (ZendeskID, ZendeskID, typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.UpdatePayload, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ResponsePayload,
    verify: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), delete = js.Any.fromFunction3(delete), list = js.Any.fromFunction2(list), makePrimary = js.Any.fromFunction3(makePrimary), requestVerification = js.Any.fromFunction3(requestVerification), show = js.Any.fromFunction3(show), update = js.Any.fromFunction4(update), verify = js.Any.fromFunction3(verify))
  
    __obj.asInstanceOf[Methods]
  }
}

