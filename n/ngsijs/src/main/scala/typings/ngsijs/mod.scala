package typings.ngsijs

import typings.ngsijs.mod.Connection.V1
import typings.ngsijs.mod.Connection.V2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ngsijs", "Connection")
  @js.native
  open class Connection protected () extends StObject {
    def this(url: Any) = this()
    
    var v1: V1 = js.native
    
    var v2: V2 = js.native
  }
  object Connection {
    
    @JSImport("ngsijs", "Connection.V1")
    @js.native
    open class V1 protected () extends StObject {
      def this(connection: Any) = this()
      
      def addAttributes(toAdd: Any, callbacks: Any): Unit = js.native
      
      def cancelAvailabilitySubscription(subId: Any, callbacks: Any): Unit = js.native
      
      def cancelRegistration(regId: Any, callbacks: Any): Unit = js.native
      
      def cancelSubscription(subId: Any, options: Any): Unit = js.native
      
      def createAvailabilitySubscription(entities: Any, attributeNames: Any, duration: Any, restriction: Any, options: Any, args: Any*): Unit = js.native
      
      def createRegistration(entities: Any, attributes: Any, duration: Any, providingApplication: Any, callbacks: Any): Unit = js.native
      
      def createSubscription(
        entities: Any,
        attributeNames: Any,
        duration: Any,
        throttling: Any,
        cond: Any,
        options: Any,
        args: Any*
      ): Unit = js.native
      
      def deleteAttributes(toDelete: Any, callbacks: Any): Unit = js.native
      
      def discoverAvailability(entities: Any, attributeNames: Any, callbacks: Any): Unit = js.native
      
      def getAvailableTypes(options: Any): Unit = js.native
      
      def getTypeInfo(`type`: Any, options: Any): Unit = js.native
      
      def query(entities: Any, attributesName: Any, options: Any): Unit = js.native
      
      def updateAttributes(update: Any, callbacks: Any): Unit = js.native
      
      def updateAvailabilitySubscription(subId: Any, entities: Any, attributeNames: Any, duration: Any, restriction: Any, callbacks: Any): Unit = js.native
      
      def updateRegistration(
        regId: Any,
        entities: Any,
        attributes: Any,
        duration: Any,
        providingApplication: Any,
        callbacks: Any
      ): Any = js.native
      
      def updateSubscription(subId: Any, duration: Any, throttling: Any, cond: Any, options: Any): Unit = js.native
    }
    
    @JSImport("ngsijs", "Connection.V2")
    @js.native
    open class V2 protected () extends StObject {
      def this(connection: Any) = this()
      
      def appendEntityAttributes(changes: Any, options: Any): Any = js.native
      
      def batchQuery(query: Any, options: Any): Any = js.native
      
      def batchUpdate(changes: Any, options: Any): Any = js.native
      
      def createEntity(entity: Any, options: Any): Any = js.native
      
      def createSubscription(subscription: Any, options: Any): Any = js.native
      
      def deleteEntity(options: Any): Any = js.native
      
      def deleteEntityAttribute(options: Any): Any = js.native
      
      def deleteSubscription(options: Any): Any = js.native
      
      def getEntity(options: Any): Any = js.native
      
      def getEntityAttribute(options: Any): Any = js.native
      
      def getEntityAttributeValue(options: Any): Any = js.native
      
      def getEntityAttributes(options: Any): Any = js.native
      
      def getSubscription(options: Any): Any = js.native
      
      def getType(options: Any): Any = js.native
      
      def listEntities(options: Any): Any = js.native
      
      def listSubscriptions(options: Any): Any = js.native
      
      def listTypes(options: Any): Any = js.native
      
      def replaceEntityAttribute(changes: Any, options: Any): Any = js.native
      
      def replaceEntityAttributeValue(options: Any): Any = js.native
      
      def replaceEntityAttributes(entity: Any, options: Any): Any = js.native
      
      def updateEntityAttributes(changes: Any, options: Any): Any = js.native
      
      def updateSubscription(changes: Any, options: Any): Any = js.native
    }
  }
}
