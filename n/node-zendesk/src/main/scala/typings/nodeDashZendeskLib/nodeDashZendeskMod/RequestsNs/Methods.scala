package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** Creating Requests */
  def create(request: CreatePayload, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ResponsePayload
  /** Get Comment */
  def getComment(
    requestId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    commentId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.ResponsePayload
  /** Viewing Requests */
  def getRequest(
    requestId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
  /** Listing Requests */
  def list(cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ListPayload
  def listByOrganization(
    organizationId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  def listByUser(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  def listCCD(
    organizationId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  /** Listing Comments */
  def listComments(
    requestId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.ListPayload
  def listOpen(cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ListPayload
  def listSolved(cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ListPayload
  /** Inherited */
  def requestAll(
    httpMethod: java.lang.String,
    fields: js.Any,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  /** Updating Requests */
  def update(
    requestId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    request: UpdatePayload,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    create: (CreatePayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    getComment: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.ResponsePayload,
    getRequest: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    list: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _] => ListPayload,
    listByOrganization: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    listByUser: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    listCCD: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    listComments: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.ListPayload,
    listOpen: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _] => ListPayload,
    listSolved: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _] => ListPayload,
    requestAll: (java.lang.String, js.Any, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    update: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, UpdatePayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), getComment = js.Any.fromFunction3(getComment), getRequest = js.Any.fromFunction2(getRequest), list = js.Any.fromFunction1(list), listByOrganization = js.Any.fromFunction2(listByOrganization), listByUser = js.Any.fromFunction2(listByUser), listCCD = js.Any.fromFunction2(listCCD), listComments = js.Any.fromFunction2(listComments), listOpen = js.Any.fromFunction1(listOpen), listSolved = js.Any.fromFunction1(listSolved), requestAll = js.Any.fromFunction3(requestAll), update = js.Any.fromFunction3(update))
  
    __obj.asInstanceOf[Methods]
  }
}

