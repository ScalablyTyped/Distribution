package typings.nodeDashZendesk.nodeDashZendeskMod.Users

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskCallback
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** User Auth */
  def auth(cb: ZendeskCallback[_, _]): js.Any
  /** Creating Users */
  def create(user: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  def createMany(users: CreateManyPayload, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.JobStatuses.ResponsePayload
  def createOrUpdate(user: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  def createOrUpdateMany(users: CreateManyPayload, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.JobStatuses.ResponsePayload
  /** Deleting Users */
  def delete(userId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  def incremental(startTime: Double, cb: ZendeskCallback[_, _]): ListPayload
  /** Users Export */
  def incrementalInclude(startTime: Double, include: js.Any, cb: ZendeskCallback[_, _]): ListPayload
  def incrementalSample(startTime: Double, cb: ZendeskCallback[_, _]): ListPayload
  /** Listing Users */
  def list(cb: ZendeskCallback[_, _]): ListPayload
  def listByGroup(groupId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  /** Getting own User */
  def me(cb: ZendeskCallback[_, _]): ResponsePayload
  /** Merging Users */
  def merge(userId: ZendeskID, targetUserId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  /** Changing User Password */
  def password(userId: ZendeskID, oldPassword: String, newPassword: String, cb: ZendeskCallback[_, _]): js.Any
  /** Searching Users */
  def search(params: js.Any, cb: ZendeskCallback[_, _]): ListPayload
  /** Showing Users */
  def show(userId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  def showMany(userIds: js.Array[ZendeskID], cb: ZendeskCallback[_, _]): ListPayload
  /** Suspending Users */
  def suspend(userId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  def unsuspend(userId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  /** Updating Users */
  def update(userId: ZendeskID, user: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  def updateMany(userIds: UpdateIdPayload, users: UpdateManyPayload, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.JobStatuses.ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    auth: ZendeskCallback[_, _] => js.Any,
    create: (CreatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    createMany: (CreateManyPayload, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.JobStatuses.ResponsePayload,
    createOrUpdate: (CreatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    createOrUpdateMany: (CreateManyPayload, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.JobStatuses.ResponsePayload,
    delete: (ZendeskID, ZendeskCallback[_, _]) => js.Any,
    incremental: (Double, ZendeskCallback[_, _]) => ListPayload,
    incrementalInclude: (Double, js.Any, ZendeskCallback[_, _]) => ListPayload,
    incrementalSample: (Double, ZendeskCallback[_, _]) => ListPayload,
    list: ZendeskCallback[_, _] => ListPayload,
    listByGroup: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listByOrganization: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    me: ZendeskCallback[_, _] => ResponsePayload,
    merge: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    password: (ZendeskID, String, String, ZendeskCallback[_, _]) => js.Any,
    search: (js.Any, ZendeskCallback[_, _]) => ListPayload,
    show: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    showMany: (js.Array[ZendeskID], ZendeskCallback[_, _]) => ListPayload,
    suspend: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    unsuspend: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    update: (ZendeskID, UpdatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    updateMany: (UpdateIdPayload, UpdateManyPayload, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.JobStatuses.ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(auth = js.Any.fromFunction1(auth), create = js.Any.fromFunction2(create), createMany = js.Any.fromFunction2(createMany), createOrUpdate = js.Any.fromFunction2(createOrUpdate), createOrUpdateMany = js.Any.fromFunction2(createOrUpdateMany), delete = js.Any.fromFunction2(delete), incremental = js.Any.fromFunction2(incremental), incrementalInclude = js.Any.fromFunction3(incrementalInclude), incrementalSample = js.Any.fromFunction2(incrementalSample), list = js.Any.fromFunction1(list), listByGroup = js.Any.fromFunction2(listByGroup), listByOrganization = js.Any.fromFunction2(listByOrganization), me = js.Any.fromFunction1(me), merge = js.Any.fromFunction3(merge), password = js.Any.fromFunction4(password), search = js.Any.fromFunction2(search), show = js.Any.fromFunction2(show), showMany = js.Any.fromFunction2(showMany), suspend = js.Any.fromFunction2(suspend), unsuspend = js.Any.fromFunction2(unsuspend), update = js.Any.fromFunction3(update), updateMany = js.Any.fromFunction3(updateMany))
  
    __obj.asInstanceOf[Methods]
  }
}

