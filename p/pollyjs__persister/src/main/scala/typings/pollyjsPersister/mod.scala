package typings.pollyjsPersister

import typings.pollyjsPersister.anon.Blocked
import typings.pollyjsPersister.anon.Encoding
import typings.pollyjsPersister.anon.MimeType
import typings.pollyjsPersister.anon.Name
import typings.setCookieParser.mod.Cookie
import typings.std.Map
import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pollyjs/persister", JSImport.Default)
  @js.native
  open class default[TOptions /* <: js.Object */] protected ()
    extends StObject
       with Persister[TOptions] {
    def this(polly: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polly */ Any) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@pollyjs/persister", "default.id")
    @js.native
    val id: String = js.native
    
    @JSImport("@pollyjs/persister", "default.type")
    @js.native
    val `type`: String = js.native
  }
  
  trait Har extends StObject {
    
    var log: HarLog
  }
  object Har {
    
    inline def apply(log: HarLog): Har = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[Har]
    }
    
    extension [Self <: Har](x: Self) {
      
      inline def setLog(value: HarLog): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
  
  trait HarEntry extends StObject {
    
    var _id: String
    
    var _order: Double
    
    var request: HarRequest
    
    var response: HarResponse
    
    var startedDateTime: String
    
    var time: Double
    
    var timings: Blocked
  }
  object HarEntry {
    
    inline def apply(
      _id: String,
      _order: Double,
      request: HarRequest,
      response: HarResponse,
      startedDateTime: String,
      time: Double,
      timings: Blocked
    ): HarEntry = {
      val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], _order = _order.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], startedDateTime = startedDateTime.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], timings = timings.asInstanceOf[js.Any])
      __obj.asInstanceOf[HarEntry]
    }
    
    extension [Self <: HarEntry](x: Self) {
      
      inline def setRequest(value: HarRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: HarResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setStartedDateTime(value: String): Self = StObject.set(x, "startedDateTime", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimings(value: Blocked): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_order(value: Double): Self = StObject.set(x, "_order", value.asInstanceOf[js.Any])
    }
  }
  
  trait HarLog extends StObject {
    
    def addEntries(entries: js.Array[HarEntry]): Unit
    
    var browser: String
    
    var entries: js.Array[HarEntry]
    
    var pages: js.Array[Any]
    
    def sortEntries(): Unit
    
    var version: String
  }
  object HarLog {
    
    inline def apply(
      addEntries: js.Array[HarEntry] => Unit,
      browser: String,
      entries: js.Array[HarEntry],
      pages: js.Array[Any],
      sortEntries: () => Unit,
      version: String
    ): HarLog = {
      val __obj = js.Dynamic.literal(addEntries = js.Any.fromFunction1(addEntries), browser = browser.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], sortEntries = js.Any.fromFunction0(sortEntries), version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[HarLog]
    }
    
    extension [Self <: HarLog](x: Self) {
      
      inline def setAddEntries(value: js.Array[HarEntry] => Unit): Self = StObject.set(x, "addEntries", js.Any.fromFunction1(value))
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setEntries(value: js.Array[HarEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: HarEntry*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setPages(value: js.Array[Any]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesVarargs(value: Any*): Self = StObject.set(x, "pages", js.Array(value*))
      
      inline def setSortEntries(value: () => Unit): Self = StObject.set(x, "sortEntries", js.Any.fromFunction0(value))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait HarRequest extends StObject {
    
    var bodySize: js.UndefOr[Double] = js.undefined
    
    var cookies: js.Array[Cookie]
    
    var headers: js.Array[NVObject]
    
    var headersSize: Double
    
    var httpVersion: String
    
    var method: String
    
    var postData: js.UndefOr[MimeType] = js.undefined
    
    var queryString: js.Array[NVObject]
    
    var url: String
  }
  object HarRequest {
    
    inline def apply(
      cookies: js.Array[Cookie],
      headers: js.Array[NVObject],
      headersSize: Double,
      httpVersion: String,
      method: String,
      queryString: js.Array[NVObject],
      url: String
    ): HarRequest = {
      val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersSize = headersSize.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[HarRequest]
    }
    
    extension [Self <: HarRequest](x: Self) {
      
      inline def setBodySize(value: Double): Self = StObject.set(x, "bodySize", value.asInstanceOf[js.Any])
      
      inline def setBodySizeUndefined: Self = StObject.set(x, "bodySize", js.undefined)
      
      inline def setCookies(value: js.Array[Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesVarargs(value: Cookie*): Self = StObject.set(x, "cookies", js.Array(value*))
      
      inline def setHeaders(value: js.Array[NVObject]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersSize(value: Double): Self = StObject.set(x, "headersSize", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: NVObject*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setHttpVersion(value: String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPostData(value: MimeType): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
      
      inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
      
      inline def setQueryString(value: js.Array[NVObject]): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setQueryStringVarargs(value: NVObject*): Self = StObject.set(x, "queryString", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait HarResponse extends StObject {
    
    var bodySize: js.UndefOr[Double] = js.undefined
    
    var content: Encoding
    
    var cookies: js.Array[Cookie]
    
    var headers: js.Array[NVObject]
    
    var headersSize: Double
    
    var httpVersion: String
    
    var status: Double
    
    var statusText: String
  }
  object HarResponse {
    
    inline def apply(
      content: Encoding,
      cookies: js.Array[Cookie],
      headers: js.Array[NVObject],
      headersSize: Double,
      httpVersion: String,
      status: Double,
      statusText: String
    ): HarResponse = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], headersSize = headersSize.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[HarResponse]
    }
    
    extension [Self <: HarResponse](x: Self) {
      
      inline def setBodySize(value: Double): Self = StObject.set(x, "bodySize", value.asInstanceOf[js.Any])
      
      inline def setBodySizeUndefined: Self = StObject.set(x, "bodySize", js.undefined)
      
      inline def setContent(value: Encoding): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setCookies(value: js.Array[Cookie]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesVarargs(value: Cookie*): Self = StObject.set(x, "cookies", js.Array(value*))
      
      inline def setHeaders(value: js.Array[NVObject]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersSize(value: Double): Self = StObject.set(x, "headersSize", value.asInstanceOf[js.Any])
      
      inline def setHeadersVarargs(value: NVObject*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setHttpVersion(value: String): Self = StObject.set(x, "httpVersion", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  trait NVObject extends StObject {
    
    var name: String
    
    var value: String
  }
  object NVObject {
    
    inline def apply(name: String, value: String): NVObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[NVObject]
    }
    
    extension [Self <: NVObject](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Persister[TOptions /* <: js.Object */] extends StObject {
    
    /* private */ var _cache: Map[String, Har] = js.native
    
    def assert(message: String): Unit = js.native
    def assert(message: String, condition: Boolean): Unit = js.native
    
    val defaultOptions: TOptions = js.native
    
    /* private */ def deleteRecording(recordingId: String): js.Promise[Unit] = js.native
    
    def findEntry(request: Request): js.Promise[HarEntry | Null] = js.native
    
    /* private */ def findRecording(recordingId: String): js.Promise[Har | Null] = js.native
    
    var hasPending: Boolean = js.native
    
    def onDeleteRecording(recordingId: String): js.Promise[Unit] = js.native
    
    def onFindRecording(recordingId: String): js.Promise[Har | Null] = js.native
    
    def onSaveRecording(recordingId: String, har: Har): js.Promise[Unit] = js.native
    
    val options: TOptions = js.native
    
    /* private */ var pending: Map[String, Name] = js.native
    
    def persist(): js.Promise[Unit] = js.native
    
    var polly: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Polly */ Any = js.native
    
    def recordRequest(request: Request): Unit = js.native
    
    /* private */ def saveRecording(recordingId: String, har: Har): js.Promise[Unit] = js.native
    
    def stringify(value: Any): String = js.native
  }
}
