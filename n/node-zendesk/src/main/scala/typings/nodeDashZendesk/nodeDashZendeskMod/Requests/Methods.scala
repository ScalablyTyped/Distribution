package typings.nodeDashZendesk.nodeDashZendeskMod.Requests

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskCallback
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** Creating Requests */
  def create(request: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  /** Get Comment */
  def getComment(requestId: ZendeskID, commentId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments.ResponsePayload
  /** Viewing Requests */
  def getRequest(requestId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  /** Listing Requests */
  def list(cb: ZendeskCallback[_, _]): ListPayload
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listByUser(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listCCD(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  /** Listing Comments */
  def listComments(requestId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments.ListPayload
  def listOpen(cb: ZendeskCallback[_, _]): ListPayload
  def listSolved(cb: ZendeskCallback[_, _]): ListPayload
  /** Inherited */
  def requestAll(httpMethod: String, fields: js.Any, cb: ZendeskCallback[_, _]): ListPayload
  /** Updating Requests */
  def update(requestId: ZendeskID, request: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    create: (CreatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    getComment: (ZendeskID, ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments.ResponsePayload,
    getRequest: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    list: ZendeskCallback[_, _] => ListPayload,
    listByOrganization: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listByUser: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listCCD: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listComments: (ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments.ListPayload,
    listOpen: ZendeskCallback[_, _] => ListPayload,
    listSolved: ZendeskCallback[_, _] => ListPayload,
    requestAll: (String, js.Any, ZendeskCallback[_, _]) => ListPayload,
    update: (ZendeskID, UpdatePayload, ZendeskCallback[_, _]) => ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), getComment = js.Any.fromFunction3(getComment), getRequest = js.Any.fromFunction2(getRequest), list = js.Any.fromFunction1(list), listByOrganization = js.Any.fromFunction2(listByOrganization), listByUser = js.Any.fromFunction2(listByUser), listCCD = js.Any.fromFunction2(listCCD), listComments = js.Any.fromFunction2(listComments), listOpen = js.Any.fromFunction1(listOpen), listSolved = js.Any.fromFunction1(listSolved), requestAll = js.Any.fromFunction3(requestAll), update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[Methods]
  }
}

