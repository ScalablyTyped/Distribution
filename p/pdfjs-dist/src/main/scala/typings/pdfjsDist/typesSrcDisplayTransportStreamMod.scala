package typings.pdfjsDist

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayTransportStreamMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPDFStream * / any */ @JSImport("pdfjs-dist/types/src/display/transport_stream", "PDFDataTransportStream")
  @js.native
  open class PDFDataTransportStream protected () extends StObject {
    def this(params: Any, pdfDataRangeTransport: Any) = this()
    
    var _contentDispositionFilename: Any = js.native
    
    var _contentLength: Any = js.native
    
    var _fullRequestReader: Any = js.native
    
    var _isRangeSupported: Boolean = js.native
    
    var _isStreamingSupported: Boolean = js.native
    
    def _onProgress(evt: Any): Unit = js.native
    
    def _onProgressiveDone(): Unit = js.native
    
    def _onReceiveData(args: Any): Unit = js.native
    
    var _pdfDataRangeTransport: Any = js.native
    
    def _progressiveDataLength: Any = js.native
    
    var _progressiveDone: Any = js.native
    
    var _queuedChunks: js.Array[js.typedarray.ArrayBuffer] = js.native
    
    var _rangeReaders: js.Array[Any] = js.native
    
    def _removeRangeReader(reader: Any): Unit = js.native
    
    def cancelAllRequests(reason: Any): Unit = js.native
    
    def getFullReader(): PDFDataTransportStreamReader = js.native
    
    def getRangeReader(begin: Any, end: Any): PDFDataTransportStreamRangeReader | Null = js.native
  }
  
  /** @implements {IPDFStreamRangeReader} */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPDFStreamRangeReader * / any */ @js.native
  trait PDFDataTransportStreamRangeReader extends StObject {
    
    var _begin: Any = js.native
    
    var _done: Boolean = js.native
    
    var _end: Any = js.native
    
    def _enqueue(chunk: Any): Unit = js.native
    
    var _queuedChunk: Any = js.native
    
    var _requests: js.Array[Any] = js.native
    
    var _stream: Any = js.native
    
    def cancel(reason: Any): Unit = js.native
    
    def isStreamingSupported: Boolean = js.native
    
    var onProgress: Any = js.native
    
    def read(): js.Promise[Any] = js.native
  }
  
  /** @implements {IPDFStreamReader} */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IPDFStreamReader * / any */ @js.native
  trait PDFDataTransportStreamReader extends StObject {
    
    var _done: Boolean = js.native
    
    def _enqueue(chunk: Any): Unit = js.native
    
    var _filename: Any = js.native
    
    var _headersReady: js.Promise[Unit] = js.native
    
    var _loaded: Double = js.native
    
    var _queuedChunks: Any = js.native
    
    var _requests: js.Array[Any] = js.native
    
    var _stream: Any = js.native
    
    def cancel(reason: Any): Unit = js.native
    
    def contentLength: Any = js.native
    
    def filename: Any = js.native
    
    def headersReady: js.Promise[Unit] = js.native
    
    def isRangeSupported: Any = js.native
    
    def isStreamingSupported: Any = js.native
    
    var onProgress: Any = js.native
    
    def progressiveDone(): Unit = js.native
    
    def read(): js.Promise[Any] = js.native
  }
}
