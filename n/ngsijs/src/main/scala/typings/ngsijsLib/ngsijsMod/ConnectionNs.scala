package typings
package ngsijsLib.ngsijsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngsijs", "Connection")
@js.native
object ConnectionNs extends js.Object {
  @js.native
  class V1 protected () extends js.Object {
    def this(connection: js.Any) = this()
    def addAttributes(toAdd: js.Any, callbacks: js.Any): scala.Unit = js.native
    def cancelAvailabilitySubscription(subId: js.Any, callbacks: js.Any): scala.Unit = js.native
    def cancelRegistration(regId: js.Any, callbacks: js.Any): scala.Unit = js.native
    def cancelSubscription(subId: js.Any, options: js.Any): scala.Unit = js.native
    def createAvailabilitySubscription(
      entities: js.Any,
      attributeNames: js.Any,
      duration: js.Any,
      restriction: js.Any,
      options: js.Any,
      args: js.Any*
    ): scala.Unit = js.native
    def createRegistration(
      entities: js.Any,
      attributes: js.Any,
      duration: js.Any,
      providingApplication: js.Any,
      callbacks: js.Any
    ): scala.Unit = js.native
    def createSubscription(
      entities: js.Any,
      attributeNames: js.Any,
      duration: js.Any,
      throttling: js.Any,
      cond: js.Any,
      options: js.Any,
      args: js.Any*
    ): scala.Unit = js.native
    def deleteAttributes(toDelete: js.Any, callbacks: js.Any): scala.Unit = js.native
    def discoverAvailability(entities: js.Any, attributeNames: js.Any, callbacks: js.Any): scala.Unit = js.native
    def getAvailableTypes(options: js.Any): scala.Unit = js.native
    def getTypeInfo(`type`: js.Any, options: js.Any): scala.Unit = js.native
    def query(entities: js.Any, attributesName: js.Any, options: js.Any): scala.Unit = js.native
    def updateAttributes(update: js.Any, callbacks: js.Any): scala.Unit = js.native
    def updateAvailabilitySubscription(
      subId: js.Any,
      entities: js.Any,
      attributeNames: js.Any,
      duration: js.Any,
      restriction: js.Any,
      callbacks: js.Any
    ): scala.Unit = js.native
    def updateRegistration(
      regId: js.Any,
      entities: js.Any,
      attributes: js.Any,
      duration: js.Any,
      providingApplication: js.Any,
      callbacks: js.Any
    ): js.Any = js.native
    def updateSubscription(subId: js.Any, duration: js.Any, throttling: js.Any, cond: js.Any, options: js.Any): scala.Unit = js.native
  }
  
  @js.native
  class V2 protected () extends js.Object {
    def this(connection: js.Any) = this()
    def appendEntityAttributes(changes: js.Any, options: js.Any): js.Any = js.native
    def batchQuery(query: js.Any, options: js.Any): js.Any = js.native
    def batchUpdate(changes: js.Any, options: js.Any): js.Any = js.native
    def createEntity(entity: js.Any, options: js.Any): js.Any = js.native
    def createSubscription(subscription: js.Any, options: js.Any): js.Any = js.native
    def deleteEntity(options: js.Any): js.Any = js.native
    def deleteEntityAttribute(options: js.Any): js.Any = js.native
    def deleteSubscription(options: js.Any): js.Any = js.native
    def getEntity(options: js.Any): js.Any = js.native
    def getEntityAttribute(options: js.Any): js.Any = js.native
    def getEntityAttributeValue(options: js.Any): js.Any = js.native
    def getEntityAttributes(options: js.Any): js.Any = js.native
    def getSubscription(options: js.Any): js.Any = js.native
    def getType(options: js.Any): js.Any = js.native
    def listEntities(options: js.Any): js.Any = js.native
    def listSubscriptions(options: js.Any): js.Any = js.native
    def listTypes(options: js.Any): js.Any = js.native
    def replaceEntityAttribute(changes: js.Any, options: js.Any): js.Any = js.native
    def replaceEntityAttributeValue(options: js.Any): js.Any = js.native
    def replaceEntityAttributes(entity: js.Any, options: js.Any): js.Any = js.native
    def updateEntityAttributes(changes: js.Any, options: js.Any): js.Any = js.native
    def updateSubscription(changes: js.Any, options: js.Any): js.Any = js.native
  }
  
}

