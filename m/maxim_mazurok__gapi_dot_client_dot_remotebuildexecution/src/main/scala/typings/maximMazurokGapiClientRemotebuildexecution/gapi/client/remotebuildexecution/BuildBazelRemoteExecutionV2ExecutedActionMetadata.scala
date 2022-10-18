package typings.maximMazurokGapiClientRemotebuildexecution.gapi.client.remotebuildexecution

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBazelRemoteExecutionV2ExecutedActionMetadata extends StObject {
  
  /** Details that are specific to the kind of worker used. For example, on POSIX-like systems this could contain a message with getrusage(2) statistics. */
  var auxiliaryMetadata: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ]
  ] = js.undefined
  
  /** When the worker completed executing the action command. */
  var executionCompletedTimestamp: js.UndefOr[String] = js.undefined
  
  /** When the worker started executing the action command. */
  var executionStartTimestamp: js.UndefOr[String] = js.undefined
  
  /** When the worker finished fetching action inputs. */
  var inputFetchCompletedTimestamp: js.UndefOr[String] = js.undefined
  
  /** When the worker started fetching action inputs. */
  var inputFetchStartTimestamp: js.UndefOr[String] = js.undefined
  
  /** When the worker finished uploading action outputs. */
  var outputUploadCompletedTimestamp: js.UndefOr[String] = js.undefined
  
  /** When the worker started uploading action outputs. */
  var outputUploadStartTimestamp: js.UndefOr[String] = js.undefined
  
  /** When was the action added to the queue. */
  var queuedTimestamp: js.UndefOr[String] = js.undefined
  
  /** The name of the worker which ran the execution. */
  var worker: js.UndefOr[String] = js.undefined
  
  /** When the worker completed the action, including all stages. */
  var workerCompletedTimestamp: js.UndefOr[String] = js.undefined
  
  /** When the worker received the action. */
  var workerStartTimestamp: js.UndefOr[String] = js.undefined
}
object BuildBazelRemoteExecutionV2ExecutedActionMetadata {
  
  inline def apply(): BuildBazelRemoteExecutionV2ExecutedActionMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBazelRemoteExecutionV2ExecutedActionMetadata]
  }
  
  extension [Self <: BuildBazelRemoteExecutionV2ExecutedActionMetadata](x: Self) {
    
    inline def setAuxiliaryMetadata(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
        ]
    ): Self = StObject.set(x, "auxiliaryMetadata", value.asInstanceOf[js.Any])
    
    inline def setAuxiliaryMetadataUndefined: Self = StObject.set(x, "auxiliaryMetadata", js.undefined)
    
    inline def setAuxiliaryMetadataVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any)*
    ): Self = StObject.set(x, "auxiliaryMetadata", js.Array(value*))
    
    inline def setExecutionCompletedTimestamp(value: String): Self = StObject.set(x, "executionCompletedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExecutionCompletedTimestampUndefined: Self = StObject.set(x, "executionCompletedTimestamp", js.undefined)
    
    inline def setExecutionStartTimestamp(value: String): Self = StObject.set(x, "executionStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExecutionStartTimestampUndefined: Self = StObject.set(x, "executionStartTimestamp", js.undefined)
    
    inline def setInputFetchCompletedTimestamp(value: String): Self = StObject.set(x, "inputFetchCompletedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setInputFetchCompletedTimestampUndefined: Self = StObject.set(x, "inputFetchCompletedTimestamp", js.undefined)
    
    inline def setInputFetchStartTimestamp(value: String): Self = StObject.set(x, "inputFetchStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setInputFetchStartTimestampUndefined: Self = StObject.set(x, "inputFetchStartTimestamp", js.undefined)
    
    inline def setOutputUploadCompletedTimestamp(value: String): Self = StObject.set(x, "outputUploadCompletedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setOutputUploadCompletedTimestampUndefined: Self = StObject.set(x, "outputUploadCompletedTimestamp", js.undefined)
    
    inline def setOutputUploadStartTimestamp(value: String): Self = StObject.set(x, "outputUploadStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setOutputUploadStartTimestampUndefined: Self = StObject.set(x, "outputUploadStartTimestamp", js.undefined)
    
    inline def setQueuedTimestamp(value: String): Self = StObject.set(x, "queuedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimestampUndefined: Self = StObject.set(x, "queuedTimestamp", js.undefined)
    
    inline def setWorker(value: String): Self = StObject.set(x, "worker", value.asInstanceOf[js.Any])
    
    inline def setWorkerCompletedTimestamp(value: String): Self = StObject.set(x, "workerCompletedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setWorkerCompletedTimestampUndefined: Self = StObject.set(x, "workerCompletedTimestamp", js.undefined)
    
    inline def setWorkerStartTimestamp(value: String): Self = StObject.set(x, "workerStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setWorkerStartTimestampUndefined: Self = StObject.set(x, "workerStartTimestamp", js.undefined)
    
    inline def setWorkerUndefined: Self = StObject.set(x, "worker", js.undefined)
  }
}
