package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Lifted 0 members from Set(mongodb.mongodb.EventEmitterWithState) */ @js.native
trait MonitorEvents extends StObject {
  
  def close(): Unit = js.native
  
  def resetConnectionPool(): Unit = js.native
  
  def resetServer(): Unit = js.native
  def resetServer(error: MongoError): Unit = js.native
  
  def serverHeartbeatFailed(event: ServerHeartbeatFailedEvent): Unit = js.native
  
  def serverHeartbeatStarted(event: ServerHeartbeatStartedEvent): Unit = js.native
  
  def serverHeartbeatSucceeded(event: ServerHeartbeatSucceededEvent): Unit = js.native
}
