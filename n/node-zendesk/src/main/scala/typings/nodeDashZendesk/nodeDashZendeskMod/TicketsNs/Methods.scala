package typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs

import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskCallback
import typings.nodeDashZendesk.nodeDashZendeskMod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** Adding Tags */
  def addTags(ticketId: ZendeskID, tags: js.Array[String], cb: ZendeskCallback[_, _]): TagsPayload
  /** Creating Tickets */
  def create(ticket: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  def createMany(tickets: CreateManyPayload, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.JobStatusesNs.ResponsePayload
  /** Deleting Tickets */
  def delete(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  def deleteMany(ticketIds: js.Array[ZendeskID], cb: ZendeskCallback[_, _]): js.Any
  /** Ticket Exports */
  def export(startTime: Double, cb: ZendeskCallback[_, _]): js.Any
  /** Listing Audits */
  def exportAudit(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): AuditsListPayload
  def exportSample(startTime: Double, options: js.Any): js.Any
  /** Listing Comments */
  def getComments(requestId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.CommentsNs.ListPayload
  def incremental(startTime: Double, cb: ZendeskCallback[_, _]): js.Any
  def incrementalInclude(startTime: Double, include: js.Any, cb: ZendeskCallback[_, _]): js.Any
  def incrementalSample(startTime: Double, cb: ZendeskCallback[_, _]): js.Any
  /** Listing Tickets */
  def list(cb: ZendeskCallback[_, _]): ListPayload
  def listAssigned(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listByUserCCD(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listByUserRequested(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listCollaborators(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.ListPayload
  def listIncidents(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listMetrics(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.MetricsNs.ResponsePayload
  def listRecent(cb: ZendeskCallback[_, _]): ListPayload
  def listWithFilter(`type`: String, value: js.Any, cb: ZendeskCallback[_, _]): ListPayload
  /** Merging Tickets */
  def merge(ticketId: ZendeskID, mergingTickets: MergePayload, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.JobStatusesNs.ResponsePayload
  /** Viewing Tickets */
  def show(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  def showMany(ticketIds: js.Array[ZendeskID], cb: ZendeskCallback[_, _]): ListPayload
  /** Updating Tickets */
  def update(ticketId: ZendeskID, ticket: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  def updateMany(tickets: UpdateManyPayload, cb: ZendeskCallback[_, _]): typings.nodeDashZendesk.nodeDashZendeskMod.JobStatusesNs.ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    addTags: (ZendeskID, js.Array[String], ZendeskCallback[_, _]) => TagsPayload,
    create: (CreatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    createMany: (CreateManyPayload, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.JobStatusesNs.ResponsePayload,
    delete: (ZendeskID, ZendeskCallback[_, _]) => js.Any,
    deleteMany: (js.Array[ZendeskID], ZendeskCallback[_, _]) => js.Any,
    export: (Double, ZendeskCallback[_, _]) => js.Any,
    exportAudit: (ZendeskID, ZendeskCallback[_, _]) => AuditsListPayload,
    exportSample: (Double, js.Any) => js.Any,
    getComments: (ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.CommentsNs.ListPayload,
    incremental: (Double, ZendeskCallback[_, _]) => js.Any,
    incrementalInclude: (Double, js.Any, ZendeskCallback[_, _]) => js.Any,
    incrementalSample: (Double, ZendeskCallback[_, _]) => js.Any,
    list: ZendeskCallback[_, _] => ListPayload,
    listAssigned: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listByOrganization: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listByUserCCD: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listByUserRequested: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listCollaborators: (ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.UsersNs.ListPayload,
    listIncidents: (ZendeskID, ZendeskCallback[_, _]) => ListPayload,
    listMetrics: (ZendeskID, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.MetricsNs.ResponsePayload,
    listRecent: ZendeskCallback[_, _] => ListPayload,
    listWithFilter: (String, js.Any, ZendeskCallback[_, _]) => ListPayload,
    merge: (ZendeskID, MergePayload, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.JobStatusesNs.ResponsePayload,
    show: (ZendeskID, ZendeskCallback[_, _]) => ResponsePayload,
    showMany: (js.Array[ZendeskID], ZendeskCallback[_, _]) => ListPayload,
    update: (ZendeskID, UpdatePayload, ZendeskCallback[_, _]) => ResponsePayload,
    updateMany: (UpdateManyPayload, ZendeskCallback[_, _]) => typings.nodeDashZendesk.nodeDashZendeskMod.JobStatusesNs.ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(addTags = js.Any.fromFunction3(addTags), create = js.Any.fromFunction2(create), createMany = js.Any.fromFunction2(createMany), delete = js.Any.fromFunction2(delete), deleteMany = js.Any.fromFunction2(deleteMany), export = js.Any.fromFunction2(export), exportAudit = js.Any.fromFunction2(exportAudit), exportSample = js.Any.fromFunction2(exportSample), getComments = js.Any.fromFunction2(getComments), incremental = js.Any.fromFunction2(incremental), incrementalInclude = js.Any.fromFunction3(incrementalInclude), incrementalSample = js.Any.fromFunction2(incrementalSample), list = js.Any.fromFunction1(list), listAssigned = js.Any.fromFunction2(listAssigned), listByOrganization = js.Any.fromFunction2(listByOrganization), listByUserCCD = js.Any.fromFunction2(listByUserCCD), listByUserRequested = js.Any.fromFunction2(listByUserRequested), listCollaborators = js.Any.fromFunction2(listCollaborators), listIncidents = js.Any.fromFunction2(listIncidents), listMetrics = js.Any.fromFunction2(listMetrics), listRecent = js.Any.fromFunction1(listRecent), listWithFilter = js.Any.fromFunction3(listWithFilter), merge = js.Any.fromFunction3(merge), show = js.Any.fromFunction2(show), showMany = js.Any.fromFunction2(showMany), update = js.Any.fromFunction3(update), updateMany = js.Any.fromFunction2(updateMany))
  
    __obj.asInstanceOf[Methods]
  }
}

