package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** Adding Tags */
  def addTags(
    ticketId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    tags: js.Array[java.lang.String],
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): TagsPayload
  /** Creating Tickets */
  def create(ticket: CreatePayload, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ResponsePayload
  def createMany(tickets: CreateManyPayload, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.ResponsePayload
  /** Deleting Tickets */
  def delete(
    ticketId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): js.Any
  def deleteMany(
    ticketIds: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID],
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): js.Any
  /** Ticket Exports */
  def export(startTime: scala.Double, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): js.Any
  /** Listing Audits */
  def exportAudit(
    ticketId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): AuditsListPayload
  def exportSample(startTime: scala.Double, options: js.Any): js.Any
  /** Listing Comments */
  def getComments(
    requestId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.CommentsNs.ListPayload
  def incremental(startTime: scala.Double, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): js.Any
  def incrementalInclude(
    startTime: scala.Double,
    include: js.Any,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): js.Any
  def incrementalSample(startTime: scala.Double, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): js.Any
  /** Listing Tickets */
  def list(cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ListPayload
  def listAssigned(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  def listByOrganization(
    organizationId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  def listByUserCCD(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  def listByUserRequested(
    userId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  def listCollaborators(
    ticketId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.ListPayload
  def listIncidents(
    ticketId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  def listMetrics(
    ticketId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.MetricsNs.ResponsePayload
  def listRecent(cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): ListPayload
  def listWithFilter(
    `type`: java.lang.String,
    value: js.Any,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  /** Merging Tickets */
  def merge(
    ticketId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    mergingTickets: MergePayload,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.ResponsePayload
  /** Viewing Tickets */
  def show(
    ticketId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
  def showMany(
    ticketIds: js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID],
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ListPayload
  /** Updating Tickets */
  def update(
    ticketId: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID,
    ticket: UpdatePayload,
    cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]
  ): ResponsePayload
  def updateMany(tickets: UpdateManyPayload, cb: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]): nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    addTags: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, js.Array[java.lang.String], nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => TagsPayload,
    create: (CreatePayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    createMany: (CreateManyPayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.ResponsePayload,
    delete: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    deleteMany: (js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID], nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    export: (scala.Double, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    exportAudit: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => AuditsListPayload,
    exportSample: (scala.Double, js.Any) => js.Any,
    getComments: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.CommentsNs.ListPayload,
    incremental: (scala.Double, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    incrementalInclude: (scala.Double, js.Any, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    incrementalSample: (scala.Double, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => js.Any,
    list: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _] => ListPayload,
    listAssigned: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    listByOrganization: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    listByUserCCD: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    listByUserRequested: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    listCollaborators: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.ListPayload,
    listIncidents: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    listMetrics: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.MetricsNs.ResponsePayload,
    listRecent: nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _] => ListPayload,
    listWithFilter: (java.lang.String, js.Any, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    merge: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, MergePayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.ResponsePayload,
    show: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    showMany: (js.Array[nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID], nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ListPayload,
    update: (nodeDashZendeskLib.nodeDashZendeskMod.ZendeskID, UpdatePayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => ResponsePayload,
    updateMany: (UpdateManyPayload, nodeDashZendeskLib.nodeDashZendeskMod.ZendeskCallback[_, _]) => nodeDashZendeskLib.nodeDashZendeskMod.JobStatusesNs.ResponsePayload
  ): Methods = {
    val __obj = js.Dynamic.literal(addTags = js.Any.fromFunction3(addTags), create = js.Any.fromFunction2(create), createMany = js.Any.fromFunction2(createMany), delete = js.Any.fromFunction2(delete), deleteMany = js.Any.fromFunction2(deleteMany), export = js.Any.fromFunction2(export), exportAudit = js.Any.fromFunction2(exportAudit), exportSample = js.Any.fromFunction2(exportSample), getComments = js.Any.fromFunction2(getComments), incremental = js.Any.fromFunction2(incremental), incrementalInclude = js.Any.fromFunction3(incrementalInclude), incrementalSample = js.Any.fromFunction2(incrementalSample), list = js.Any.fromFunction1(list), listAssigned = js.Any.fromFunction2(listAssigned), listByOrganization = js.Any.fromFunction2(listByOrganization), listByUserCCD = js.Any.fromFunction2(listByUserCCD), listByUserRequested = js.Any.fromFunction2(listByUserRequested), listCollaborators = js.Any.fromFunction2(listCollaborators), listIncidents = js.Any.fromFunction2(listIncidents), listMetrics = js.Any.fromFunction2(listMetrics), listRecent = js.Any.fromFunction1(listRecent), listWithFilter = js.Any.fromFunction3(listWithFilter), merge = js.Any.fromFunction3(merge), show = js.Any.fromFunction2(show), showMany = js.Any.fromFunction2(showMany), update = js.Any.fromFunction3(update), updateMany = js.Any.fromFunction2(updateMany))
  
    __obj.asInstanceOf[Methods]
  }
}

