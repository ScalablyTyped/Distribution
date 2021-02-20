package typings.node.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeWorker {
  
  @js.native
  trait AttachedToWorkerEventDataType extends StObject {
    
    /**
      * Identifier assigned to the session used to send/receive messages.
      */
    var sessionId: SessionID = js.native
    
    var waitingForDebugger: Boolean = js.native
    
    var workerInfo: WorkerInfo = js.native
  }
  object AttachedToWorkerEventDataType {
    
    @scala.inline
    def apply(sessionId: SessionID, waitingForDebugger: Boolean, workerInfo: WorkerInfo): AttachedToWorkerEventDataType = {
      val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any], waitingForDebugger = waitingForDebugger.asInstanceOf[js.Any], workerInfo = workerInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachedToWorkerEventDataType]
    }
    
    @scala.inline
    implicit class AttachedToWorkerEventDataTypeMutableBuilder[Self <: AttachedToWorkerEventDataType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitingForDebugger(value: Boolean): Self = StObject.set(x, "waitingForDebugger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerInfo(value: WorkerInfo): Self = StObject.set(x, "workerInfo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DetachParameterType extends StObject {
    
    var sessionId: SessionID = js.native
  }
  object DetachParameterType {
    
    @scala.inline
    def apply(sessionId: SessionID): DetachParameterType = {
      val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetachParameterType]
    }
    
    @scala.inline
    implicit class DetachParameterTypeMutableBuilder[Self <: DetachParameterType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DetachedFromWorkerEventDataType extends StObject {
    
    /**
      * Detached session identifier.
      */
    var sessionId: SessionID = js.native
  }
  object DetachedFromWorkerEventDataType {
    
    @scala.inline
    def apply(sessionId: SessionID): DetachedFromWorkerEventDataType = {
      val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetachedFromWorkerEventDataType]
    }
    
    @scala.inline
    implicit class DetachedFromWorkerEventDataTypeMutableBuilder[Self <: DetachedFromWorkerEventDataType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EnableParameterType extends StObject {
    
    /**
      * Whether to new workers should be paused until the frontend sends `Runtime.runIfWaitingForDebugger`
      * message to run them.
      */
    var waitForDebuggerOnStart: Boolean = js.native
  }
  object EnableParameterType {
    
    @scala.inline
    def apply(waitForDebuggerOnStart: Boolean): EnableParameterType = {
      val __obj = js.Dynamic.literal(waitForDebuggerOnStart = waitForDebuggerOnStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnableParameterType]
    }
    
    @scala.inline
    implicit class EnableParameterTypeMutableBuilder[Self <: EnableParameterType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWaitForDebuggerOnStart(value: Boolean): Self = StObject.set(x, "waitForDebuggerOnStart", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReceivedMessageFromWorkerEventDataType extends StObject {
    
    var message: String = js.native
    
    /**
      * Identifier of a session which sends a message.
      */
    var sessionId: SessionID = js.native
  }
  object ReceivedMessageFromWorkerEventDataType {
    
    @scala.inline
    def apply(message: String, sessionId: SessionID): ReceivedMessageFromWorkerEventDataType = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReceivedMessageFromWorkerEventDataType]
    }
    
    @scala.inline
    implicit class ReceivedMessageFromWorkerEventDataTypeMutableBuilder[Self <: ReceivedMessageFromWorkerEventDataType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SendMessageToWorkerParameterType extends StObject {
    
    var message: String = js.native
    
    /**
      * Identifier of the session.
      */
    var sessionId: SessionID = js.native
  }
  object SendMessageToWorkerParameterType {
    
    @scala.inline
    def apply(message: String, sessionId: SessionID): SendMessageToWorkerParameterType = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendMessageToWorkerParameterType]
    }
    
    @scala.inline
    implicit class SendMessageToWorkerParameterTypeMutableBuilder[Self <: SendMessageToWorkerParameterType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionId(value: SessionID): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Unique identifier of attached debugging session.
    */
  type SessionID = String
  
  type WorkerID = String
  
  @js.native
  trait WorkerInfo extends StObject {
    
    var title: String = js.native
    
    var `type`: String = js.native
    
    var url: String = js.native
    
    var workerId: WorkerID = js.native
  }
  object WorkerInfo {
    
    @scala.inline
    def apply(title: String, `type`: String, url: String, workerId: WorkerID): WorkerInfo = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkerInfo]
    }
    
    @scala.inline
    implicit class WorkerInfoMutableBuilder[Self <: WorkerInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWorkerId(value: WorkerID): Self = StObject.set(x, "workerId", value.asInstanceOf[js.Any])
    }
  }
}
