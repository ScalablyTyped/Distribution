package typings.pdfjsDist

import typings.pdfjsDist.typesSrcSharedUtilMod.PromiseCapability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcDisplayNodeStreamMod {
  
  @JSImport("pdfjs-dist/types/src/display/node_stream", "PDFNodeStream")
  @js.native
  open class PDFNodeStream protected () extends StObject {
    def this(source: Any) = this()
    
    var _fullRequestReader: PDFNodeStreamFsFullReader | PDFNodeStreamFullReader | Null = js.native
    
    def _progressiveDataLength: Double = js.native
    
    var _rangeRequestReaders: js.Array[Any] = js.native
    
    def cancelAllRequests(reason: Any): Unit = js.native
    
    def getFullReader(): PDFNodeStreamFsFullReader | PDFNodeStreamFullReader = js.native
    
    def getRangeReader(start: Any, end: Any): PDFNodeStreamFsRangeReader | PDFNodeStreamRangeReader | Null = js.native
    
    var httpHeaders: Any = js.native
    
    var isFsUrl: Boolean = js.native
    
    var isHttp: Boolean = js.native
    
    var source: Any = js.native
    
    var url: Any = js.native
  }
  
  @js.native
  trait BaseFullReader extends StObject {
    
    var _contentLength: Any = js.native
    
    var _disableRange: Any = js.native
    
    var _done: Boolean = js.native
    
    def _error(reason: Any): Unit = js.native
    
    var _filename: Any = js.native
    
    var _headersCapability: PromiseCapability = js.native
    
    var _isRangeSupported: Boolean = js.native
    
    var _isStreamingSupported: Boolean = js.native
    
    var _loaded: Double = js.native
    
    var _rangeChunkSize: Any = js.native
    
    var _readCapability: PromiseCapability = js.native
    
    var _readableStream: Any = js.native
    
    def _setReadableStream(readableStream: Any): Unit = js.native
    
    var _storedError: Any = js.native
    
    var _url: Any = js.native
    
    def cancel(reason: Any): Unit = js.native
    
    def contentLength: Any = js.native
    
    def filename: Any = js.native
    
    def headersReady: js.Promise[Any] = js.native
    
    def isRangeSupported: Boolean = js.native
    
    def isStreamingSupported: Boolean = js.native
    
    var onProgress: Any = js.native
    
    def read(): Any = js.native
  }
  
  @js.native
  trait BaseRangeReader extends StObject {
    
    var _done: Boolean = js.native
    
    def _error(reason: Any): Unit = js.native
    
    var _isStreamingSupported: Boolean = js.native
    
    var _loaded: Double = js.native
    
    var _readCapability: PromiseCapability = js.native
    
    var _readableStream: Any = js.native
    
    def _setReadableStream(readableStream: Any): Unit = js.native
    
    var _storedError: Any = js.native
    
    var _url: Any = js.native
    
    def cancel(reason: Any): Unit = js.native
    
    def isStreamingSupported: Boolean = js.native
    
    var onProgress: Any = js.native
    
    def read(): Any = js.native
  }
  
  type PDFNodeStreamFsFullReader = BaseFullReader
  
  type PDFNodeStreamFsRangeReader = BaseRangeReader
  
  @js.native
  trait PDFNodeStreamFullReader
    extends StObject
       with BaseFullReader {
    
    var _request: Any = js.native
  }
  
  @js.native
  trait PDFNodeStreamRangeReader
    extends StObject
       with BaseRangeReader {
    
    var _request: Any = js.native
  }
}
