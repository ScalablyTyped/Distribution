package typings.naja

import org.scalablytyped.runtime.StringDictionary
import typings.naja.anon.AbortController
import typings.naja.anon.Data
import typings.naja.anon.DefaultOptions
import typings.naja.anon.Request
import typings.naja.formsHandlerMod.FormsHandler
import typings.naja.historyHandlerMod.HistoryHandler
import typings.naja.najaStrings.abort
import typings.naja.najaStrings.before
import typings.naja.najaStrings.complete
import typings.naja.najaStrings.error
import typings.naja.najaStrings.init
import typings.naja.najaStrings.start
import typings.naja.najaStrings.success
import typings.naja.redirectHandlerMod.RedirectHandler
import typings.naja.scriptLoaderMod.ScriptLoader
import typings.naja.snippetHandlerMod.SnippetHandler
import typings.naja.uihandlerMod.UIHandler
import typings.std.AddEventListenerOptions
import typings.std.CustomEvent
import typings.std.Error
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object najaMod {
  
  @JSImport("naja/src/Naja", "HttpError")
  @js.native
  class HttpError () extends Error {
    
    val response: Response = js.native
  }
  
  @JSImport("naja/src/Naja", "Naja")
  @js.native
  class Naja () extends EventTarget {
    
    val VERSION: Double = js.native
    
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* event */ AbortEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ AbortEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ AbortEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_before(`type`: before, listener: js.ThisFunction1[/* this */ this.type, /* event */ BeforeEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_before(
      `type`: before,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ BeforeEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_before(
      `type`: before,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ BeforeEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_complete(`type`: complete, listener: js.ThisFunction1[/* this */ this.type, /* event */ CompleteEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_complete(
      `type`: complete,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ CompleteEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_complete(
      `type`: complete,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ CompleteEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_init(`type`: init, listener: js.ThisFunction1[/* this */ this.type, /* event */ InitEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_init(
      `type`: init,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ InitEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_init(
      `type`: init,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ InitEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, /* event */ StartEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_start(
      `type`: start,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ StartEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_start(
      `type`: start,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ StartEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_success(`type`: success, listener: js.ThisFunction1[/* this */ this.type, /* event */ SuccessEvent, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_success(
      `type`: success,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ SuccessEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_success(
      `type`: success,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ SuccessEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    var defaultOptions: Options = js.native
    
    val formsHandler: FormsHandler = js.native
    
    val historyHandler: HistoryHandler = js.native
    
    def initialize(): Unit = js.native
    def initialize(defaultOptions: Options): Unit = js.native
    
    def makeRequest(method: String, url: String): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: String, data: js.UndefOr[scala.Nothing], options: Options): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: String, data: js.Any): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: String, data: js.Any, options: Options): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: String, data: Null, options: Options): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: URL): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: URL, data: js.UndefOr[scala.Nothing], options: Options): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: URL, data: js.Any): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: URL, data: js.Any, options: Options): js.Promise[Payload] = js.native
    def makeRequest(method: String, url: URL, data: Null, options: Options): js.Promise[Payload] = js.native
    
    val redirectHandler: RedirectHandler = js.native
    
    def registerExtension(extension: Extension): Unit = js.native
    
    def removeEventListener(`type`: String, listener: Null, options: AddEventListenerOptions): Unit = js.native
    def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* event */ AbortEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ AbortEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ AbortEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_before(`type`: before, listener: js.ThisFunction1[/* this */ this.type, /* event */ BeforeEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_before(
      `type`: before,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ BeforeEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_before(
      `type`: before,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ BeforeEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_complete(`type`: complete, listener: js.ThisFunction1[/* this */ this.type, /* event */ CompleteEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_complete(
      `type`: complete,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ CompleteEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_complete(
      `type`: complete,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ CompleteEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(`type`: error, listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_error(
      `type`: error,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ ErrorEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_init(`type`: init, listener: js.ThisFunction1[/* this */ this.type, /* event */ InitEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_init(
      `type`: init,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ InitEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_init(
      `type`: init,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ InitEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_start(`type`: start, listener: js.ThisFunction1[/* this */ this.type, /* event */ StartEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_start(
      `type`: start,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ StartEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_start(
      `type`: start,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ StartEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_success(`type`: success, listener: js.ThisFunction1[/* this */ this.type, /* event */ SuccessEvent, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_success(
      `type`: success,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ SuccessEvent, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_success(
      `type`: success,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ SuccessEvent, _],
      options: AddEventListenerOptions
    ): Unit = js.native
    
    val scriptLoader: ScriptLoader = js.native
    
    val snippetHandler: SnippetHandler = js.native
    
    val uiHandler: UIHandler = js.native
  }
  
  type AbortEvent = CustomEvent[typings.naja.anon.Error]
  
  type BeforeEvent = CustomEvent[Data]
  
  type CompleteEvent = CustomEvent[typings.naja.anon.Payload]
  
  type ErrorEvent = CustomEvent[Request]
  
  @js.native
  trait Extension extends StObject {
    
    def initialize(naja: Naja): Unit = js.native
  }
  object Extension {
    
    @scala.inline
    def apply(initialize: Naja => Unit): Extension = {
      val __obj = js.Dynamic.literal(initialize = js.Any.fromFunction1(initialize))
      __obj.asInstanceOf[Extension]
    }
    
    @scala.inline
    implicit class ExtensionMutableBuilder[Self <: Extension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialize(value: Naja => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    }
  }
  
  type InitEvent = CustomEvent[DefaultOptions]
  
  @js.native
  trait NajaEventMap extends StObject {
    
    var abort: AbortEvent = js.native
    
    var before: BeforeEvent = js.native
    
    var complete: CompleteEvent = js.native
    
    var error: ErrorEvent = js.native
    
    var init: InitEvent = js.native
    
    var start: StartEvent = js.native
    
    var success: SuccessEvent = js.native
  }
  object NajaEventMap {
    
    @scala.inline
    def apply(
      abort: AbortEvent,
      before: BeforeEvent,
      complete: CompleteEvent,
      error: ErrorEvent,
      init: InitEvent,
      start: StartEvent,
      success: SuccessEvent
    ): NajaEventMap = {
      val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[NajaEventMap]
    }
    
    @scala.inline
    implicit class NajaEventMapMutableBuilder[Self <: NajaEventMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: AbortEvent): Self = StObject.set(x, "abort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBefore(value: BeforeEvent): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplete(value: CompleteEvent): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: ErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInit(value: InitEvent): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: StartEvent): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: SuccessEvent): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options
    extends /* key */ StringDictionary[js.Any] {
    
    var fetch: js.UndefOr[RequestInit] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFetch(value: RequestInit): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    }
  }
  
  @js.native
  trait Payload
    extends /* key */ StringDictionary[js.Any] {
    
    var postGet: js.UndefOr[Boolean] = js.native
    
    var redirect: js.UndefOr[String] = js.native
    
    var snippets: js.UndefOr[StringDictionary[String]] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Payload {
    
    @scala.inline
    def apply(): Payload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Payload]
    }
    
    @scala.inline
    implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostGet(value: Boolean): Self = StObject.set(x, "postGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostGetUndefined: Self = StObject.set(x, "postGet", js.undefined)
      
      @scala.inline
      def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setSnippets(value: StringDictionary[String]): Self = StObject.set(x, "snippets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnippetsUndefined: Self = StObject.set(x, "snippets", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type StartEvent = CustomEvent[AbortController]
  
  type SuccessEvent = CustomEvent[typings.naja.anon.Options]
}
