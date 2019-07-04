package typings
package nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** Creating Identities */
  def create(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    identity: CreatePayload,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponseModel
  /** Deleting Identities */
  def delete(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    identityId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): js.Any
  /** Listing Identities */
  def list(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  def makePrimary(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    identityId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  def requestVerification(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    identityId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): js.Any
  /** Viewing Identities */
  def show(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    identityId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
  /** Updating Identities */
  def update(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    identityId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    identity: UpdatePayload,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
  def verify(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    identityId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    create: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, CreatePayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponseModel,
    delete: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    list: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    makePrimary: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    requestVerification: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    show: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    update: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, UpdatePayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    verify: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), delete = js.Any.fromFunction3(delete), list = js.Any.fromFunction2(list), makePrimary = js.Any.fromFunction3(makePrimary), requestVerification = js.Any.fromFunction3(requestVerification), show = js.Any.fromFunction3(show), update = js.Any.fromFunction4(update), verify = js.Any.fromFunction3(verify))
  
    __obj.asInstanceOf[Methods]
  }
}

