package typings.nodeZendesk.mod.Users

import typings.nodeZendesk.mod.ZendeskCallback
import typings.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods extends StObject {
  
  def auth(): js.Promise[Any] = js.native
  /** User Auth */
  def auth(cb: ZendeskCallback[Any, Any]): Any = js.native
  
  def create(user: CreatePayload): js.Promise[ResponsePayload] = js.native
  /** Creating Users */
  def create(user: CreatePayload, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
  
  def createMany(users: CreateManyPayload): js.Promise[typings.nodeZendesk.mod.JobStatuses.ResponsePayload] = js.native
  def createMany(users: CreateManyPayload, cb: ZendeskCallback[Any, Any]): typings.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
  
  def createOrUpdate(user: CreatePayload): js.Promise[ResponsePayload] = js.native
  def createOrUpdate(user: CreatePayload, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
  
  def createOrUpdateMany(users: CreateManyPayload): js.Promise[typings.nodeZendesk.mod.JobStatuses.ResponsePayload] = js.native
  def createOrUpdateMany(users: CreateManyPayload, cb: ZendeskCallback[Any, Any]): typings.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
  
  def delete(userId: ZendeskID): js.Promise[Any] = js.native
  /** Deleting Users */
  def delete(userId: ZendeskID, cb: ZendeskCallback[Any, Any]): Any = js.native
  
  def incremental(startTime: Double): js.Promise[ListPayload] = js.native
  def incremental(startTime: Double, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def incrementalInclude(startTime: Double, include: Any): js.Promise[ListPayload] = js.native
  /** Users Export */
  def incrementalInclude(startTime: Double, include: Any, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def incrementalSample(startTime: Double): js.Promise[ListPayload] = js.native
  def incrementalSample(startTime: Double, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def list(): js.Promise[ListPayload] = js.native
  /** Listing Users */
  def list(cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def listByGroup(groupId: ZendeskID): js.Promise[ListPayload] = js.native
  def listByGroup(groupId: ZendeskID, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def listByOrganization(organizationId: ZendeskID): js.Promise[ListPayload] = js.native
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def me(): js.Promise[ResponsePayload] = js.native
  /** Getting own User */
  def me(cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
  
  def merge(userId: ZendeskID, targetUserId: ZendeskID): js.Promise[ResponsePayload] = js.native
  /** Merging Users */
  def merge(userId: ZendeskID, targetUserId: ZendeskID, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
  
  def password(userId: ZendeskID, oldPassword: String, newPassword: String): js.Promise[Any] = js.native
  /** Changing User Password */
  def password(userId: ZendeskID, oldPassword: String, newPassword: String, cb: ZendeskCallback[Any, Any]): Any = js.native
  
  def search(params: Any): js.Promise[ListPayload] = js.native
  /** Searching Users */
  def search(params: Any, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def show(userId: ZendeskID): js.Promise[ResponseModel] = js.native
  /** Showing Users */
  def show(userId: ZendeskID, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
  
  def showMany(userIds: js.Array[ZendeskID]): js.Promise[ListPayload] = js.native
  def showMany(userIds: js.Array[ZendeskID], cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def suspend(userId: ZendeskID): js.Promise[ResponsePayload] = js.native
  /** Suspending Users */
  def suspend(userId: ZendeskID, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
  
  def unsuspend(userId: ZendeskID): js.Promise[ResponsePayload] = js.native
  def unsuspend(userId: ZendeskID, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
  
  def update(userId: ZendeskID, user: UpdatePayload): js.Promise[ResponsePayload] = js.native
  /** Updating Users */
  def update(userId: ZendeskID, user: UpdatePayload, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
  
  def updateMany(userIds: UpdateIdPayload, users: UpdateManyPayload): js.Promise[typings.nodeZendesk.mod.JobStatuses.ResponsePayload] = js.native
  def updateMany(userIds: UpdateIdPayload, users: UpdateManyPayload, cb: ZendeskCallback[Any, Any]): typings.nodeZendesk.mod.JobStatuses.ResponsePayload = js.native
}
