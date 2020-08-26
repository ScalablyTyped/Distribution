package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.ZendeskCallback
import typings.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Methods extends js.Object {
  def auth(): js.Promise[_] = js.native
  /** User Auth */
  def auth(cb: ZendeskCallback[_, _]): js.Any = js.native
  def create(user: CreatePayload): js.Promise[ResponsePayload] = js.native
  /** Creating Users */
  def create(user: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def createMany(users: CreateManyPayload): js.Promise[typings.nodeZendesk.mod.JobStatuses.ResponsePayload] = js.native
  def createMany(users: CreateManyPayload, cb: ZendeskCallback[_, _]): typings.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
  def createOrUpdate(user: CreatePayload): js.Promise[ResponsePayload] = js.native
  def createOrUpdate(user: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def createOrUpdateMany(users: CreateManyPayload): js.Promise[typings.nodeZendesk.mod.JobStatuses.ResponsePayload] = js.native
  def createOrUpdateMany(users: CreateManyPayload, cb: ZendeskCallback[_, _]): typings.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
  def delete(userId: ZendeskID): js.Promise[_] = js.native
  /** Deleting Users */
  def delete(userId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any = js.native
  def incremental(startTime: Double): js.Promise[ListPayload] = js.native
  def incremental(startTime: Double, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def incrementalInclude(startTime: Double, include: js.Any): js.Promise[ListPayload] = js.native
  /** Users Export */
  def incrementalInclude(startTime: Double, include: js.Any, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def incrementalSample(startTime: Double): js.Promise[ListPayload] = js.native
  def incrementalSample(startTime: Double, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def list(): js.Promise[ListPayload] = js.native
  /** Listing Users */
  def list(cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listByGroup(groupId: ZendeskID): js.Promise[ListPayload] = js.native
  def listByGroup(groupId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def listByOrganization(organizationId: ZendeskID): js.Promise[ListPayload] = js.native
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def me(): js.Promise[ResponsePayload] = js.native
  /** Getting own User */
  def me(cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def merge(userId: ZendeskID, targetUserId: ZendeskID): js.Promise[ResponsePayload] = js.native
  /** Merging Users */
  def merge(userId: ZendeskID, targetUserId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def password(userId: ZendeskID, oldPassword: String, newPassword: String): js.Promise[_] = js.native
  /** Changing User Password */
  def password(userId: ZendeskID, oldPassword: String, newPassword: String, cb: ZendeskCallback[_, _]): js.Any = js.native
  def search(params: js.Any): js.Promise[ListPayload] = js.native
  /** Searching Users */
  def search(params: js.Any, cb: ZendeskCallback[_, _]): ListPayload = js.native
  def show(userId: ZendeskID): js.Promise[ResponsePayload] = js.native
  /** Showing Users */
  def show(userId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def showMany(userIds: js.Array[ZendeskID]): js.Promise[ListPayload] = js.native
  def showMany(userIds: js.Array[ZendeskID], cb: ZendeskCallback[_, _]): ListPayload = js.native
  def suspend(userId: ZendeskID): js.Promise[ResponsePayload] = js.native
  /** Suspending Users */
  def suspend(userId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def unsuspend(userId: ZendeskID): js.Promise[ResponsePayload] = js.native
  def unsuspend(userId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def update(userId: ZendeskID, user: UpdatePayload): js.Promise[ResponsePayload] = js.native
  /** Updating Users */
  def update(userId: ZendeskID, user: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
  def updateMany(userIds: UpdateIdPayload, users: UpdateManyPayload): js.Promise[typings.nodeZendesk.mod.JobStatuses.ResponsePayload] = js.native
  def updateMany(userIds: UpdateIdPayload, users: UpdateManyPayload, cb: ZendeskCallback[_, _]): typings.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
}

