package typings.naja

import typings.naja.snippetHandlerMod.SnippetUpdateOperation
import typings.std.Event
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AbortController extends StObject {
    
    var abortController: typings.std.AbortController
    
    var options: typings.naja.najaMod.Options
    
    var promise: js.Promise[Response]
    
    var request: typings.std.Request
  }
  object AbortController {
    
    inline def apply(
      abortController: typings.std.AbortController,
      options: typings.naja.najaMod.Options,
      promise: js.Promise[Response],
      request: typings.std.Request
    ): AbortController = {
      val __obj = js.Dynamic.literal(abortController = abortController.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortController]
    }
    
    extension [Self <: AbortController](x: Self) {
      
      inline def setAbortController(value: typings.std.AbortController): Self = StObject.set(x, "abortController", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: js.Promise[Response]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait Append extends StObject {
    
    def append(snippet: typings.std.Element, content: String): Unit
    @JSName("append")
    var append_Original: SnippetUpdateOperation
    
    def prepend(snippet: typings.std.Element, content: String): Unit
    @JSName("prepend")
    var prepend_Original: SnippetUpdateOperation
    
    def replace(snippet: typings.std.Element, content: String): Unit
    @JSName("replace")
    var replace_Original: SnippetUpdateOperation
  }
  object Append {
    
    inline def apply(
      append: (/* snippet */ typings.std.Element, /* content */ String) => Unit,
      prepend: (/* snippet */ typings.std.Element, /* content */ String) => Unit,
      replace: (/* snippet */ typings.std.Element, /* content */ String) => Unit
    ): Append = {
      val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), prepend = js.Any.fromFunction2(prepend), replace = js.Any.fromFunction2(replace))
      __obj.asInstanceOf[Append]
    }
    
    extension [Self <: Append](x: Self) {
      
      inline def setAppend(value: (/* snippet */ typings.std.Element, /* content */ String) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
      
      inline def setPrepend(value: (/* snippet */ typings.std.Element, /* content */ String) => Unit): Self = StObject.set(x, "prepend", js.Any.fromFunction2(value))
      
      inline def setReplace(value: (/* snippet */ typings.std.Element, /* content */ String) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    }
  }
  
  trait ChangeOperation extends StObject {
    
    def changeOperation(value: SnippetUpdateOperation): Unit
    
    var content: String
    
    var fromCache: Boolean
    
    def operation(snippet: typings.std.Element, content: String): Unit
    @JSName("operation")
    var operation_Original: SnippetUpdateOperation
    
    var options: typings.naja.najaMod.Options
    
    var snippet: typings.std.Element
  }
  object ChangeOperation {
    
    inline def apply(
      changeOperation: SnippetUpdateOperation => Unit,
      content: String,
      fromCache: Boolean,
      operation: (/* snippet */ typings.std.Element, /* content */ String) => Unit,
      options: typings.naja.najaMod.Options,
      snippet: typings.std.Element
    ): ChangeOperation = {
      val __obj = js.Dynamic.literal(changeOperation = js.Any.fromFunction1(changeOperation), content = content.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], operation = js.Any.fromFunction2(operation), options = options.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeOperation]
    }
    
    extension [Self <: ChangeOperation](x: Self) {
      
      inline def setChangeOperation(value: SnippetUpdateOperation => Unit): Self = StObject.set(x, "changeOperation", js.Any.fromFunction1(value))
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: (/* snippet */ typings.std.Element, /* content */ String) => Unit): Self = StObject.set(x, "operation", js.Any.fromFunction2(value))
      
      inline def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSnippet(value: typings.std.Element): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    }
  }
  
  trait Content extends StObject {
    
    var content: String
    
    var fromCache: Boolean
    
    def operation(snippet: typings.std.Element, content: String): Unit
    @JSName("operation")
    var operation_Original: SnippetUpdateOperation
    
    var options: typings.naja.najaMod.Options
    
    var snippet: typings.std.Element
  }
  object Content {
    
    inline def apply(
      content: String,
      fromCache: Boolean,
      operation: (/* snippet */ typings.std.Element, /* content */ String) => Unit,
      options: typings.naja.najaMod.Options,
      snippet: typings.std.Element
    ): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], fromCache = fromCache.asInstanceOf[js.Any], operation = js.Any.fromFunction2(operation), options = options.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: (/* snippet */ typings.std.Element, /* content */ String) => Unit): Self = StObject.set(x, "operation", js.Any.fromFunction2(value))
      
      inline def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSnippet(value: typings.std.Element): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.Any
    
    var method: String
    
    var options: typings.naja.najaMod.Options
    
    var request: typings.std.Request
    
    var url: String
  }
  object Data {
    
    inline def apply(
      data: js.Any,
      method: String,
      options: typings.naja.najaMod.Options,
      request: typings.std.Request,
      url: String
    ): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultOptions extends StObject {
    
    var defaultOptions: typings.naja.najaMod.Options
  }
  object DefaultOptions {
    
    inline def apply(defaultOptions: typings.naja.najaMod.Options): DefaultOptions = {
      val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOptions]
    }
    
    extension [Self <: DefaultOptions](x: Self) {
      
      inline def setDefaultOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Element extends StObject {
    
    var element: typings.std.Element
    
    var options: typings.naja.najaMod.Options
    
    var originalEvent: js.UndefOr[Event] = js.undefined
  }
  object Element {
    
    inline def apply(element: typings.std.Element, options: typings.naja.najaMod.Options): Element = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: typings.std.Error
    
    var options: typings.naja.najaMod.Options
    
    var request: typings.std.Request
  }
  object Error {
    
    inline def apply(error: typings.std.Error, options: typings.naja.najaMod.Options, request: typings.std.Request): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsHardRedirect extends StObject {
    
    var isHardRedirect: Boolean
    
    var options: typings.naja.najaMod.Options
    
    def setHardRedirect(value: Boolean): Unit
    
    var url: String
  }
  object IsHardRedirect {
    
    inline def apply(
      isHardRedirect: Boolean,
      options: typings.naja.najaMod.Options,
      setHardRedirect: Boolean => Unit,
      url: String
    ): IsHardRedirect = {
      val __obj = js.Dynamic.literal(isHardRedirect = isHardRedirect.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setHardRedirect = js.Any.fromFunction1(setHardRedirect), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsHardRedirect]
    }
    
    extension [Self <: IsHardRedirect](x: Self) {
      
      inline def setIsHardRedirect(value: Boolean): Self = StObject.set(x, "isHardRedirect", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSetHardRedirect(value: Boolean => Unit): Self = StObject.set(x, "setHardRedirect", js.Any.fromFunction1(value))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var options: typings.naja.najaMod.Options
    
    var payload: typings.naja.najaMod.Payload
    
    var request: typings.std.Request
    
    var response: Response
  }
  object Options {
    
    inline def apply(
      options: typings.naja.najaMod.Options,
      payload: typings.naja.najaMod.Payload,
      request: typings.std.Request,
      response: Response
    ): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: typings.naja.najaMod.Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait Payload extends StObject {
    
    var error: js.UndefOr[typings.std.Error] = js.undefined
    
    var options: typings.naja.najaMod.Options
    
    var payload: js.UndefOr[typings.naja.najaMod.Payload] = js.undefined
    
    var request: typings.std.Request
    
    var response: js.UndefOr[Response] = js.undefined
  }
  object Payload {
    
    inline def apply(options: typings.naja.najaMod.Options, request: typings.std.Request): Payload = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    extension [Self <: Payload](x: Self) {
      
      inline def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: typings.naja.najaMod.Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  trait Request extends StObject {
    
    var error: typings.std.Error
    
    var options: typings.naja.najaMod.Options
    
    var request: typings.std.Request
    
    var response: js.UndefOr[Response] = js.undefined
  }
  object Request {
    
    inline def apply(error: typings.std.Error, options: typings.naja.najaMod.Options, request: typings.std.Request): Request = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
}
