package typings.node.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeWorker {
  
  trait AttachedToWorkerEventDataType extends StObject {
    
    /**
      * Identifier assigned to the session used to send/receive messages.
      */
    var sessionId: SessionID
    
    var waitingForDebugger: Boolean
    
    var workerInfo: WorkerInfo
  }
  object AttachedToWorkerEventDataType {
    
    inline def apply(sessionId: SessionID, waitingForDebugger: Boolean, workerInfo: WorkerInfo): AttachedToWorkerEventDataType = {
      val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], waitingForDebugger = waitingForDebugger.asInstanceOf[js.Any], workerInfo = workerInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachedToWorkerEventDataType]
    }
    
    extension [Self <: AttachedToWorkerEventDataType](x: Self) {
      
      inline def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setWaitingForDebugger(value: Boolean): Self = StObject.set(x, "waitingForDebugger", value.asInstanceOf[js.Any])
      
      inline def setWorkerInfo(value: WorkerInfo): Self = StObject.set(x, "workerInfo", value.asInstanceOf[js.Any])
    }
  }
  
  trait DetachParameterType extends StObject {
    
    var sessionId: SessionID
  }
  object DetachParameterType {
    
    inline def apply(sessionId: SessionID): DetachParameterType = {
      val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetachParameterType]
    }
    
    extension [Self <: DetachParameterType](x: Self) {
      
      inline def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait DetachedFromWorkerEventDataType extends StObject {
    
    /**
      * Detached session identifier.
      */
    var sessionId: SessionID
  }
  object DetachedFromWorkerEventDataType {
    
    inline def apply(sessionId: SessionID): DetachedFromWorkerEventDataType = {
      val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetachedFromWorkerEventDataType]
    }
    
    extension [Self <: DetachedFromWorkerEventDataType](x: Self) {
      
      inline def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait EnableParameterType extends StObject {
    
    /**
      * Whether to new workers should be paused until the frontend sends `Runtime.runIfWaitingForDebugger`
      * message to run them.
      */
    var waitForDebuggerOnStart: Boolean
  }
  object EnableParameterType {
    
    inline def apply(waitForDebuggerOnStart: Boolean): EnableParameterType = {
      val __obj = js.Dynamic.literal(waitForDebuggerOnStart = waitForDebuggerOnStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnableParameterType]
    }
    
    extension [Self <: EnableParameterType](x: Self) {
      
      inline def setWaitForDebuggerOnStart(value: Boolean): Self = StObject.set(x, "waitForDebuggerOnStart", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReceivedMessageFromWorkerEventDataType extends StObject {
    
    var message: String
    
    /**
      * Identifier of a session which sends a message.
      */
    var sessionId: SessionID
  }
  object ReceivedMessageFromWorkerEventDataType {
    
    inline def apply(message: String, sessionId: SessionID): ReceivedMessageFromWorkerEventDataType = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceivedMessageFromWorkerEventDataType]
    }
    
    extension [Self <: ReceivedMessageFromWorkerEventDataType](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SendMessageToWorkerParameterType extends StObject {
    
    var message: String
    
    /**
      * Identifier of the session.
      */
    var sessionId: SessionID
  }
  object SendMessageToWorkerParameterType {
    
    inline def apply(message: String, sessionId: SessionID): SendMessageToWorkerParameterType = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMessageToWorkerParameterType]
    }
    
    extension [Self <: SendMessageToWorkerParameterType](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Unique identifier of attached debugging session.
    */
  type SessionID = String
  
  type WorkerID = String
  
  trait WorkerInfo extends StObject {
    
    var title: String
    
    var `type`: String
    
    var url: String
    
    var workerId: WorkerID
  }
  object WorkerInfo {
    
    inline def apply(title: String, `type`: String, url: String, workerId: WorkerID): WorkerInfo = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerInfo]
    }
    
    extension [Self <: WorkerInfo](x: Self) {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWorkerId(value: WorkerID): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    }
  }
}
