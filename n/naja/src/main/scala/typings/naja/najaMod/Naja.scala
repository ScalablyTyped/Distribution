package typings.naja.najaMod

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
import typings.std.EventListenerOrEventListenerObject
import typings.std.EventTarget
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
