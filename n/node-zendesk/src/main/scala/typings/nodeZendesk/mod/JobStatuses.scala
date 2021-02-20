package typings.nodeZendesk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JobStatuses {
  
  @js.native
  trait Methods extends StObject {
    
    def show(jobStatusId: ZendeskID): js.Promise[ResponsePayload] = js.native
    def show(jobStatusId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload = js.native
    
    def watch(jobStatusId: ZendeskID, interval: Double, maxAttempts: Double): js.Promise[_] = js.native
    def watch(jobStatusId: ZendeskID, interval: Double, maxAttempts: Double, cb: ZendeskCallback[_, _]): js.Any = js.native
  }
  
  @js.native
  trait ResponseModel extends PersistableModel {
    
    val message: js.UndefOr[String | Null] = js.native
    
    val progress: js.UndefOr[Double] = js.native
    
    val results: js.UndefOr[js.Array[Result]] = js.native
    
    val status: js.UndefOr[Status] = js.native
    
    val total: js.UndefOr[Double] = js.native
    
    val url: js.UndefOr[String | Null] = js.native
  }
  object ResponseModel {
    
    @scala.inline
    def apply(id: ZendeskID): ResponseModel = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseModel]
    }
    
    @scala.inline
    implicit class ResponseModelMutableBuilder[Self <: ResponseModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageNull: Self = StObject.set(x, "message", null)
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setResults(value: js.Array[Result]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setResultsVarargs(value: Result*): Self = StObject.set(x, "results", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlNull: Self = StObject.set(x, "url", null)
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait ResponsePayload extends StObject {
    
    val job_status: ResponseModel = js.native
  }
  object ResponsePayload {
    
    @scala.inline
    def apply(job_status: ResponseModel): ResponsePayload = {
      val __obj = js.Dynamic.literal(job_status = job_status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsePayload]
    }
    
    @scala.inline
    implicit class ResponsePayloadMutableBuilder[Self <: ResponsePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJob_status(value: ResponseModel): Self = StObject.set(x, "job_status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Result extends PersistableModel {
    
    val action: String = js.native
    
    val status: String = js.native
    
    val success: Boolean = js.native
  }
  object Result {
    
    @scala.inline
    def apply(action: String, id: ZendeskID, status: String, success: Boolean): Result = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def completed: typings.nodeZendesk.nodeZendeskStrings.completed = "completed".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.completed]
    
    @scala.inline
    def failed: typings.nodeZendesk.nodeZendeskStrings.failed = "failed".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.failed]
    
    @scala.inline
    def killed: typings.nodeZendesk.nodeZendeskStrings.killed = "killed".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.killed]
    
    @scala.inline
    def queued: typings.nodeZendesk.nodeZendeskStrings.queued = "queued".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.queued]
    
    @scala.inline
    def working: typings.nodeZendesk.nodeZendeskStrings.working = "working".asInstanceOf[typings.nodeZendesk.nodeZendeskStrings.working]
  }
}
