package typings.naja

import typings.naja.snippetHandlerMod.SnippetUpdateOperation
import typings.std.Event
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AbortController extends StObject {
    
    var abortController: typings.std.AbortController = js.native
    
    var options: typings.naja.najaMod.Options = js.native
    
    var promise: js.Promise[Response] = js.native
    
    var request: typings.std.Request = js.native
  }
  object AbortController {
    
    @scala.inline
    def apply(
      abortController: typings.std.AbortController,
      options: typings.naja.najaMod.Options,
      promise: js.Promise[Response],
      request: typings.std.Request
    ): AbortController = {
      val __obj = js.Dynamic.literal(abortController = abortController.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbortController]
    }
    
    @scala.inline
    implicit class AbortControllerMutableBuilder[Self <: AbortController] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbortController(value: typings.std.AbortController): Self = StObject.set(x, "abortController", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromise(value: js.Promise[Response]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Append extends StObject {
    
    def append(snippet: typings.std.Element, content: String): Unit = js.native
    @JSName("append")
    var append_Original: SnippetUpdateOperation = js.native
    
    def prepend(snippet: typings.std.Element, content: String): Unit = js.native
    @JSName("prepend")
    var prepend_Original: SnippetUpdateOperation = js.native
    
    def replace(snippet: typings.std.Element, content: String): Unit = js.native
    @JSName("replace")
    var replace_Original: SnippetUpdateOperation = js.native
  }
  
  @js.native
  trait ChangeOperation extends StObject {
    
    def changeOperation(value: SnippetUpdateOperation): Unit = js.native
    
    var content: String = js.native
    
    var fromCache: Boolean = js.native
    
    def operation(snippet: typings.std.Element, content: String): Unit = js.native
    @JSName("operation")
    var operation_Original: SnippetUpdateOperation = js.native
    
    var options: typings.naja.najaMod.Options = js.native
    
    var snippet: typings.std.Element = js.native
  }
  
  @js.native
  trait Content extends StObject {
    
    var content: String = js.native
    
    var fromCache: Boolean = js.native
    
    def operation(snippet: typings.std.Element, content: String): Unit = js.native
    @JSName("operation")
    var operation_Original: SnippetUpdateOperation = js.native
    
    var options: typings.naja.najaMod.Options = js.native
    
    var snippet: typings.std.Element = js.native
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: js.Any = js.native
    
    var method: String = js.native
    
    var options: typings.naja.najaMod.Options = js.native
    
    var request: typings.std.Request = js.native
    
    var url: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply(
      data: js.Any,
      method: String,
      options: typings.naja.najaMod.Options,
      request: typings.std.Request,
      url: String
    ): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefaultOptions extends StObject {
    
    var defaultOptions: typings.naja.najaMod.Options = js.native
  }
  object DefaultOptions {
    
    @scala.inline
    def apply(defaultOptions: typings.naja.najaMod.Options): DefaultOptions = {
      val __obj = js.Dynamic.literal(defaultOptions = defaultOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultOptions]
    }
    
    @scala.inline
    implicit class DefaultOptionsMutableBuilder[Self <: DefaultOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "defaultOptions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Element extends StObject {
    
    var element: typings.std.Element = js.native
    
    var options: typings.naja.najaMod.Options = js.native
    
    var originalEvent: js.UndefOr[Event] = js.native
  }
  object Element {
    
    @scala.inline
    def apply(element: typings.std.Element, options: typings.naja.najaMod.Options): Element = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    var error: typings.std.Error = js.native
    
    var options: typings.naja.najaMod.Options = js.native
    
    var request: typings.std.Request = js.native
  }
  object Error {
    
    @scala.inline
    def apply(error: typings.std.Error, options: typings.naja.najaMod.Options, request: typings.std.Request): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IsHardRedirect extends StObject {
    
    var isHardRedirect: Boolean = js.native
    
    var options: typings.naja.najaMod.Options = js.native
    
    def setHardRedirect(value: Boolean): Unit = js.native
    
    var url: String = js.native
  }
  object IsHardRedirect {
    
    @scala.inline
    def apply(
      isHardRedirect: Boolean,
      options: typings.naja.najaMod.Options,
      setHardRedirect: Boolean => Unit,
      url: String
    ): IsHardRedirect = {
      val __obj = js.Dynamic.literal(isHardRedirect = isHardRedirect.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], setHardRedirect = js.Any.fromFunction1(setHardRedirect), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsHardRedirect]
    }
    
    @scala.inline
    implicit class IsHardRedirectMutableBuilder[Self <: IsHardRedirect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHardRedirect(value: Boolean): Self = StObject.set(x, "isHardRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetHardRedirect(value: Boolean => Unit): Self = StObject.set(x, "setHardRedirect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var options: typings.naja.najaMod.Options = js.native
    
    var payload: typings.naja.najaMod.Payload = js.native
    
    var request: typings.std.Request = js.native
    
    var response: Response = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      options: typings.naja.najaMod.Options,
      payload: typings.naja.najaMod.Payload,
      request: typings.std.Request,
      response: Response
    ): Options = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: typings.naja.najaMod.Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Payload extends StObject {
    
    var error: js.UndefOr[typings.std.Error] = js.native
    
    var options: typings.naja.najaMod.Options = js.native
    
    var payload: js.UndefOr[typings.naja.najaMod.Payload] = js.native
    
    var request: typings.std.Request = js.native
    
    var response: js.UndefOr[Response] = js.native
  }
  object Payload {
    
    @scala.inline
    def apply(options: typings.naja.najaMod.Options, request: typings.std.Request): Payload = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: typings.naja.najaMod.Payload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  @js.native
  trait Request extends StObject {
    
    var error: typings.std.Error = js.native
    
    var options: typings.naja.najaMod.Options = js.native
    
    var request: typings.std.Request = js.native
    
    var response: js.UndefOr[Response] = js.native
  }
  object Request {
    
    @scala.inline
    def apply(error: typings.std.Error, options: typings.naja.najaMod.Options, request: typings.std.Request): Request = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: typings.std.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: typings.naja.najaMod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
}
