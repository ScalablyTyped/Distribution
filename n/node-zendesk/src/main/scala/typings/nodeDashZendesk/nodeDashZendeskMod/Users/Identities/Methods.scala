package typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskCallback
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** Creating Identities */
  def create(userId: ZendeskID, identity: CreatePayload, cb: ZendeskCallback[_, _]): ResponseModel
  /** Deleting Identities */
  def delete(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  /** Listing Identities */
  def list(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def makePrimary(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def requestVerification(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  /** Viewing Identities */
  def show(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  /** Updating Identities */
  def update(userId: ZendeskID, identityId: ZendeskID, identity: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  def verify(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    create: (ZendeskID, CreatePayload, ZendeskCallback[_, _]) => ResponseModel,
    delete: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => js.Any,
    list: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    makePrimary: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    requestVerification: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => js.Any,
    show: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    update: (ZendeskID, ZendeskID, UpdatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    verify: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), delete = js.Any.fromFunction3(delete), list = js.Any.fromFunction2(list), makePrimary = js.Any.fromFunction3(makePrimary), requestVerification = js.Any.fromFunction3(requestVerification), show = js.Any.fromFunction3(show), update = js.Any.fromFunction4(update), verify = js.Any.fromFunction3(verify))
  
    __obj.asInstanceOf[Methods]
  }
}

