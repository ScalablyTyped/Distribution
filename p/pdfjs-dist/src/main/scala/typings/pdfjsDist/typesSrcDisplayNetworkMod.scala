package typings.pdfjsDist

import typings.pdfjsDist.typesSrcSharedUtilMod.MissingPDFException
import typings.pdfjsDist.typesSrcSharedUtilMod.PromiseCapability
import typings.pdfjsDist.typesSrcSharedUtilMod.UnexpectedResponseException
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayNetworkMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPDFStream * / any */ @JSImport("pdfjs-dist/types/src/display/network", "PDFNetworkStream")
  @js.native
  open class PDFNetworkStream protected () extends StObject {
    def this(source: Any) = this()
    
    var _fullRequestReader: PDFNetworkStreamFullRequestReader | Null = js.native
    
    var _manager: NetworkManager = js.native
    
    def _onRangeRequestReaderClosed(reader: Any): Unit = js.native
    
    var _rangeChunkSize: Any = js.native
    
    var _rangeRequestReaders: js.Array[Any] = js.native
    
    var _source: Any = js.native
    
    def cancelAllRequests(reason: Any): Unit = js.native
    
    def getFullReader(): PDFNetworkStreamFullRequestReader = js.native
    
    def getRangeReader(begin: Any, end: Any): PDFNetworkStreamRangeRequestReader = js.native
  }
  
  trait NetworkManager extends StObject {
    
    def abortRequest(xhrId: Any): Unit
    
    var currXhrId: Double
    
    def getRequestXhr(xhrId: Any): Any
    
    var getXhr: Any
    
    var httpHeaders: Any
    
    var isHttp: Boolean
    
    def isPendingRequest(xhrId: Any): Boolean
    
    def onProgress(xhrId: Any, evt: Any): Unit
    
    def onStateChange(xhrId: Any, evt: Any): Unit
    
    var pendingRequests: Any
    
    def request(args: Any): Double
    
    def requestFull(listeners: Any): Double
    
    def requestRange(begin: Any, end: Any, listeners: Any): Double
    
    var url: Any
    
    var withCredentials: Any
  }
  object NetworkManager {
    
    inline def apply(
      abortRequest: Any => Unit,
      currXhrId: Double,
      getRequestXhr: Any => Any,
      getXhr: Any,
      httpHeaders: Any,
      isHttp: Boolean,
      isPendingRequest: Any => Boolean,
      onProgress: (Any, Any) => Unit,
      onStateChange: (Any, Any) => Unit,
      pendingRequests: Any,
      request: Any => Double,
      requestFull: Any => Double,
      requestRange: (Any, Any, Any) => Double,
      url: Any,
      withCredentials: Any
    ): NetworkManager = {
      val __obj = js.Dynamic.literal(abortRequest = js.Any.fromFunction1(abortRequest), currXhrId = currXhrId.asInstanceOf[js.Any], getRequestXhr = js.Any.fromFunction1(getRequestXhr), getXhr = getXhr.asInstanceOf[js.Any], httpHeaders = httpHeaders.asInstanceOf[js.Any], isHttp = isHttp.asInstanceOf[js.Any], isPendingRequest = js.Any.fromFunction1(isPendingRequest), onProgress = js.Any.fromFunction2(onProgress), onStateChange = js.Any.fromFunction2(onStateChange), pendingRequests = pendingRequests.asInstanceOf[js.Any], request = js.Any.fromFunction1(request), requestFull = js.Any.fromFunction1(requestFull), requestRange = js.Any.fromFunction3(requestRange), url = url.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkManager]
    }
    
    extension [Self <: NetworkManager](x: Self) {
      
      inline def setAbortRequest(value: Any => Unit): Self = StObject.set(x, "abortRequest", js.Any.fromFunction1(value))
      
      inline def setCurrXhrId(value: Double): Self = StObject.set(x, "currXhrId", value.asInstanceOf[js.Any])
      
      inline def setGetRequestXhr(value: Any => Any): Self = StObject.set(x, "getRequestXhr", js.Any.fromFunction1(value))
      
      inline def setGetXhr(value: Any): Self = StObject.set(x, "getXhr", value.asInstanceOf[js.Any])
      
      inline def setHttpHeaders(value: Any): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
      
      inline def setIsHttp(value: Boolean): Self = StObject.set(x, "isHttp", value.asInstanceOf[js.Any])
      
      inline def setIsPendingRequest(value: Any => Boolean): Self = StObject.set(x, "isPendingRequest", js.Any.fromFunction1(value))
      
      inline def setOnProgress(value: (Any, Any) => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction2(value))
      
      inline def setOnStateChange(value: (Any, Any) => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction2(value))
      
      inline def setPendingRequests(value: Any): Self = StObject.set(x, "pendingRequests", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Any => Double): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
      
      inline def setRequestFull(value: Any => Double): Self = StObject.set(x, "requestFull", js.Any.fromFunction1(value))
      
      inline def setRequestRange(value: (Any, Any, Any) => Double): Self = StObject.set(x, "requestRange", js.Any.fromFunction3(value))
      
      inline def setUrl(value: Any): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setWithCredentials(value: Any): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
  
  /** @implements {IPDFStreamReader} */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPDFStreamReader * / any */ @js.native
  trait PDFNetworkStreamFullRequestReader extends StObject {
    
    var _cachedChunks: js.Array[Any] = js.native
    
    var _contentLength: Any = js.native
    
    var _disableRange: Any = js.native
    
    var _done: Boolean = js.native
    
    var _filename: String | Null = js.native
    
    var _fullRequestId: Any = js.native
    
    var _fullRequestReader: Any = js.native
    
    var _headersReceivedCapability: PromiseCapability = js.native
    
    var _isRangeSupported: Boolean = js.native
    
    var _isStreamingSupported: Boolean = js.native
    
    var _manager: Any = js.native
    
    def _onDone(data: Any): Unit = js.native
    
    def _onError(status: Any): Unit = js.native
    
    def _onHeadersReceived(): Unit = js.native
    
    def _onProgress(evt: Any): Unit = js.native
    
    var _rangeChunkSize: Any = js.native
    
    var _requests: js.Array[Any] = js.native
    
    var _storedError: js.UndefOr[MissingPDFException | UnexpectedResponseException] = js.native
    
    var _url: Any = js.native
    
    def cancel(reason: Any): Unit = js.native
    
    def contentLength: Any = js.native
    
    def filename: String | Null = js.native
    
    def headersReady: js.Promise[Any] = js.native
    
    def isRangeSupported: Boolean = js.native
    
    def isStreamingSupported: Boolean = js.native
    
    var onProgress: Any = js.native
    
    def read(): js.Promise[Any] = js.native
  }
  
  /** @implements {IPDFStreamRangeReader} */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPDFStreamRangeReader * / any */ @js.native
  trait PDFNetworkStreamRangeRequestReader extends StObject {
    
    def _close(): Unit = js.native
    
    var _done: Boolean = js.native
    
    var _manager: Any = js.native
    
    def _onDone(data: Any): Unit = js.native
    
    def _onError(status: Any): Unit = js.native
    
    def _onProgress(evt: Any): Unit = js.native
    
    var _queuedChunk: Any = js.native
    
    var _requestId: Any = js.native
    
    var _requests: js.Array[Any] = js.native
    
    var _storedError: js.UndefOr[MissingPDFException | UnexpectedResponseException] = js.native
    
    var _url: Any = js.native
    
    def cancel(reason: Any): Unit = js.native
    
    def isStreamingSupported: Boolean = js.native
    
    var onClosed: Any = js.native
    
    var onProgress: Any = js.native
    
    def read(): js.Promise[Any] = js.native
  }
}
