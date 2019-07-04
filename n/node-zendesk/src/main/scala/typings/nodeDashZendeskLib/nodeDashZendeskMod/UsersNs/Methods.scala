package typings
package nodeDashZendeskLib.nodeDashZendeskMod.UsersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** User Auth */
  def auth(cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): js.Any
  /** Creating Users */
  def create(user: CreatePayload, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ResponsePayload
  def createMany(users: CreateManyPayload, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.ResponsePayload
  def createOrUpdate(user: CreatePayload, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ResponsePayload
  def createOrUpdateMany(users: CreateManyPayload, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.ResponsePayload
  /** Deleting Users */
  def delete(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): js.Any
  def incremental(startTime: scala.Double, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ListPayload
  /** Users Export */
  def incrementalInclude(
    startTime: scala.Double,
    include: js.Any,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  def incrementalSample(startTime: scala.Double, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ListPayload
  /** Listing Users */
  def list(cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ListPayload
  def listByGroup(
    groupId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  def listByOrganization(
    organizationId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  /** Getting own User */
  def me(cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ResponsePayload
  /** Merging Users */
  def merge(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    targetUserId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
  /** Changing User Password */
  def password(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    oldPassword: java.lang.String,
    newPassword: java.lang.String,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): js.Any
  /** Searching Users */
  def search(params: js.Any, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ListPayload
  /** Showing Users */
  def show(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
  def showMany(
    userIds: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID],
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  /** Suspending Users */
  def suspend(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
  def unsuspend(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
  /** Updating Users */
  def update(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    user: UpdatePayload,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
  def updateMany(
    userIds: UpdateIdPayload,
    users: UpdateManyPayload,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    auth: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _] => js.Any,
    create: (CreatePayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    createMany: (CreateManyPayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.ResponsePayload,
    createOrUpdate: (CreatePayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    createOrUpdateMany: (CreateManyPayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.ResponsePayload,
    delete: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    incremental: (scala.Double, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    incrementalInclude: (scala.Double, js.Any, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    incrementalSample: (scala.Double, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    list: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _] => ListPayload,
    listByGroup: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    listByOrganization: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    me: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _] => ResponsePayload,
    merge: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    password: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, java.lang.String, java.lang.String, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    search: (js.Any, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    show: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    showMany: (js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID], nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    suspend: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    unsuspend: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    update: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, UpdatePayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    updateMany: (UpdateIdPayload, UpdateManyPayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(auth = js.Any.fromFunction1(auth), create = js.Any.fromFunction2(create), createMany = js.Any.fromFunction2(createMany), createOrUpdate = js.Any.fromFunction2(createOrUpdate), createOrUpdateMany = js.Any.fromFunction2(createOrUpdateMany), delete = js.Any.fromFunction2(delete), incremental = js.Any.fromFunction2(incremental), incrementalInclude = js.Any.fromFunction3(incrementalInclude), incrementalSample = js.Any.fromFunction2(incrementalSample), list = js.Any.fromFunction1(list), listByGroup = js.Any.fromFunction2(listByGroup), listByOrganization = js.Any.fromFunction2(listByOrganization), me = js.Any.fromFunction1(me), merge = js.Any.fromFunction3(merge), password = js.Any.fromFunction4(password), search = js.Any.fromFunction2(search), show = js.Any.fromFunction2(show), showMany = js.Any.fromFunction2(showMany), suspend = js.Any.fromFunction2(suspend), unsuspend = js.Any.fromFunction2(unsuspend), update = js.Any.fromFunction3(update), updateMany = js.Any.fromFunction3(updateMany))
  
    __obj.asInstanceOf[Methods]
  }
}

