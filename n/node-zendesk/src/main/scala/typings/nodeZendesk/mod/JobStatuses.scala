package typings.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JobStatuses {
  
  @js.native
  trait Methods extends StObject {
    
    def show(jobStatusId: ZendeskID): js.Promise[ResponsePayload] = js.native
    def show(jobStatusId: ZendeskID, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
    
    def watch(jobStatusId: ZendeskID, interval: Double, maxAttempts: Double): js.Promise[Any] = js.native
    def watch(jobStatusId: ZendeskID, interval: Double, maxAttempts: Double, cb: ZendeskCallback[Any, Any]): Any = js.native
  }
  
  trait ResponseModel
    extends StObject
       with PersistableModel {
    
    val message: js.UndefOr[String | Null] = js.undefined
    
    val progress: js.UndefOr[Double] = js.undefined
    
    val results: js.UndefOr[js.Array[Result]] = js.undefined
    
    val status: js.UndefOr[Status] = js.undefined
    
    val total: js.UndefOr[Double] = js.undefined
    
    val url: js.UndefOr[String | Null] = js.undefined
  }
  object ResponseModel {
    
    inline def apply(id: ZendeskID): ResponseModel = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseModel]
    }
    
    extension [Self <: ResponseModel](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      inline def setResults(value: js.Array[Result]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      inline def setResultsVarargs(value: Result*): Self = StObject.set(x, "results", js.Array(value*))
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlNull: Self = StObject.set(x, "url", null)
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait ResponsePayload extends StObject {
    
    val job_status: ResponseModel
  }
  object ResponsePayload {
    
    inline def apply(job_status: ResponseModel): ResponsePayload = {
      val __obj = js.Dynamic.literal(job_status = job_status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsePayload]
    }
    
    extension [Self <: ResponsePayload](x: Self) {
      
      inline def setJob_status(value: ResponseModel): Self = StObject.set(x, "job_status", value.asInstanceOf[js.Any])
    }
  }
  
  trait Result
    extends StObject
       with PersistableModel {
    
    val action: String
    
    val status: String
    
    val success: Boolean
  }
  object Result {
    
    inline def apply(action: String, id: ZendeskID, status: String, success: Boolean): Result = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.nodeZendesk.nodeZendeskStrings.queued
    - typings.nodeZendesk.nodeZendeskStrings.working
    - typings.nodeZendesk.nodeZendeskStrings.failed
    - typings.nodeZendesk.nodeZendeskStrings.completed
    - typings.nodeZendesk.nodeZendeskStrings.killed
  */
  trait Status extends StObject
  object Status {
    
    inline def completed: typings.nodeZendesk.nodeZendeskStrings.completed = "completed".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.completed]
    
    inline def failed: typings.nodeZendesk.nodeZendeskStrings.failed = "failed".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.failed]
    
    inline def killed: typings.nodeZendesk.nodeZendeskStrings.killed = "killed".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.killed]
    
    inline def queued: typings.nodeZendesk.nodeZendeskStrings.queued = "queued".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.queued]
    
    inline def working: typings.nodeZendesk.nodeZendeskStrings.working = "working".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.working]
  }
}
