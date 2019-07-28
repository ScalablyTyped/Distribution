package typings.nightmare.nightmareMod

import typings.nightmare.Anon_Height
import typings.nightmare.nightmareStrings.HTMLComplete
import typings.nightmare.nightmareStrings.HTMLOnly
import typings.nightmare.nightmareStrings.MHTML
import typings.nightmare.nightmareStrings.alert
import typings.nightmare.nightmareStrings.cancel
import typings.nightmare.nightmareStrings.confirm
import typings.nightmare.nightmareStrings.consoleMessage
import typings.nightmare.nightmareStrings.continue
import typings.nightmare.nightmareStrings.error
import typings.nightmare.nightmareStrings.initialized
import typings.nightmare.nightmareStrings.loadFinished
import typings.nightmare.nightmareStrings.loadStarted
import typings.nightmare.nightmareStrings.navigationRequested
import typings.nightmare.nightmareStrings.prompt
import typings.nightmare.nightmareStrings.resourceError
import typings.nightmare.nightmareStrings.resourceReceived
import typings.nightmare.nightmareStrings.resourceRequested
import typings.nightmare.nightmareStrings.timeout
import typings.nightmare.nightmareStrings.urlChanged
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nightmare extends js.Object {
  val cookies: Cookies = js.native
  // Settings
  def authentication(user: String, password: String): Nightmare = js.native
  def back(): Nightmare = js.native
  def check(seletor: String): Nightmare = js.native
  def click(selector: String): Nightmare = js.native
  def download(path: String): Nightmare = js.native
  @JSName("download")
  def download_cancel(action: cancel): Nightmare = js.native
  @JSName("download")
  def download_continue(action: continue): Nightmare = js.native
  // Interact
  def end(): Nightmare = js.native
  def evaluate(fn: js.Function0[Unit]): Nightmare = js.native
  def evaluate[R](fn: js.Function0[R], cb: js.Function1[/* result */ R, Unit]): Nightmare = js.native
  def evaluate[T](fn: js.Function1[/* arg */ T, Unit], cb: js.Function0[Unit], arg: T): Nightmare = js.native
  def evaluate[T, R](fn: js.Function1[/* arg */ T, R], cb: js.Function1[/* result */ R, Unit], arg: T): Nightmare = js.native
  def evaluate[T1, T2, R](
    fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, R],
    cb: js.Function1[/* result */ R, Unit],
    arg1: T1,
    arg2: T2
  ): Nightmare = js.native
  def evaluate[T1, T2, T3, R](
    fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, R],
    cb: js.Function1[/* result */ R, Unit],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): Nightmare = js.native
  // Extract
  def exists(selector: String): Nightmare = js.native
  def exists(selector: String, cb: js.Function1[/* result */ Boolean, Unit]): Nightmare = js.native
  def forward(): Nightmare = js.native
  def goto(url: String): Nightmare = js.native
  def goto(url: String, headers: js.Object): Nightmare = js.native
  def halt(error: String, cb: js.Function0[Unit]): Nightmare = js.native
  def header(header: String, value: String): Nightmare = js.native
  def headers(headers: js.Object): Nightmare = js.native
  def html(path: String, saveType: String): Nightmare = js.native
  @JSName("html")
  def html_HTMLComplete(path: String, saveType: HTMLComplete): Nightmare = js.native
  @JSName("html")
  def html_HTMLOnly(path: String, saveType: HTMLOnly): Nightmare = js.native
  @JSName("html")
  def html_MHTML(path: String, saveType: MHTML): Nightmare = js.native
  def inject(`type`: String, file: String): Nightmare = js.native
  def insert(selector: String, text: String): Nightmare = js.native
  def mousedown(selector: String): Nightmare = js.native
  def mouseover(selector: String): Nightmare = js.native
  def mouseup(selector: String): Nightmare = js.native
  def on(event: String, cb: js.Function0[Unit]): Nightmare = js.native
  @JSName("on")
  def on_alert(event: alert, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
  @JSName("on")
  def on_confirm(event: confirm, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
  @JSName("on")
  def on_consoleMessage(
    event: consoleMessage,
    cb: js.Function3[/* msg */ String, /* lineNumber */ Double, /* sourceId */ Double, Unit]
  ): Nightmare = js.native
  @JSName("on")
  def on_error(
    event: error,
    cb: js.Function2[/* msg */ String, /* trace */ js.UndefOr[js.Array[IStackTrace]], Unit]
  ): Nightmare = js.native
  @JSName("on")
  def on_initialized(event: initialized, cb: js.Function0[Unit]): Nightmare = js.native
  @JSName("on")
  def on_loadFinished(event: loadFinished, cb: js.Function1[/* status */ String, Unit]): Nightmare = js.native
  @JSName("on")
  def on_loadStarted(event: loadStarted, cb: js.Function0[Unit]): Nightmare = js.native
  @JSName("on")
  def on_navigationRequested(
    event: navigationRequested,
    cb: js.Function4[
      /* url */ String, 
      /* type */ String, 
      /* willNavigate */ Boolean, 
      /* main */ Boolean, 
      Unit
    ]
  ): Nightmare = js.native
  @JSName("on")
  def on_prompt(event: prompt, cb: js.Function2[/* msg */ String, /* defaultValue */ js.UndefOr[String], Unit]): Nightmare = js.native
  @JSName("on")
  def on_resourceError(event: resourceError, cb: js.Function1[/* resourceError */ IResourceError, Unit]): Nightmare = js.native
  @JSName("on")
  def on_resourceReceived(event: resourceReceived, cb: js.Function1[/* response */ IResponse, Unit]): Nightmare = js.native
  @JSName("on")
  def on_resourceRequested(
    event: resourceRequested,
    cb: js.Function2[/* requestData */ IRequest, /* networkRequest */ INetwordRequest, Unit]
  ): Nightmare = js.native
  @JSName("on")
  def on_timeout(event: timeout, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
  @JSName("on")
  def on_urlChanged(event: urlChanged, cb: js.Function1[/* targetUrl */ String, Unit]): Nightmare = js.native
  def once(event: String, cb: js.Function0[Unit]): Nightmare = js.native
  @JSName("once")
  def once_alert(event: alert, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
  @JSName("once")
  def once_confirm(event: confirm, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
  @JSName("once")
  def once_consoleMessage(
    event: consoleMessage,
    cb: js.Function3[/* msg */ String, /* lineNumber */ Double, /* sourceId */ Double, Unit]
  ): Nightmare = js.native
  @JSName("once")
  def once_error(
    event: error,
    cb: js.Function2[/* msg */ String, /* trace */ js.UndefOr[js.Array[IStackTrace]], Unit]
  ): Nightmare = js.native
  @JSName("once")
  def once_initialized(event: initialized, cb: js.Function0[Unit]): Nightmare = js.native
  @JSName("once")
  def once_loadFinished(event: loadFinished, cb: js.Function1[/* status */ String, Unit]): Nightmare = js.native
  @JSName("once")
  def once_loadStarted(event: loadStarted, cb: js.Function0[Unit]): Nightmare = js.native
  @JSName("once")
  def once_navigationRequested(
    event: navigationRequested,
    cb: js.Function4[
      /* url */ String, 
      /* type */ String, 
      /* willNavigate */ Boolean, 
      /* main */ Boolean, 
      Unit
    ]
  ): Nightmare = js.native
  @JSName("once")
  def once_prompt(event: prompt, cb: js.Function2[/* msg */ String, /* defaultValue */ js.UndefOr[String], Unit]): Nightmare = js.native
  @JSName("once")
  def once_resourceError(event: resourceError, cb: js.Function1[/* resourceError */ IResourceError, Unit]): Nightmare = js.native
  @JSName("once")
  def once_resourceReceived(event: resourceReceived, cb: js.Function1[/* response */ IResponse, Unit]): Nightmare = js.native
  @JSName("once")
  def once_resourceRequested(
    event: resourceRequested,
    cb: js.Function2[/* requestData */ IRequest, /* networkRequest */ INetwordRequest, Unit]
  ): Nightmare = js.native
  @JSName("once")
  def once_timeout(event: timeout, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
  @JSName("once")
  def once_urlChanged(event: urlChanged, cb: js.Function1[/* targetUrl */ String, Unit]): Nightmare = js.native
  def path(): String = js.native
  def pdf(cb: js.Function2[/* err */ Error, /* data */ Buffer, Unit]): Nightmare = js.native
  def pdf(path: String): Nightmare = js.native
  def pdf(path: String, options: js.Object): Nightmare = js.native
  def refresh(): Nightmare = js.native
  def removeListener(event: String, cb: js.Function0[Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_alert(event: alert, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_confirm(event: confirm, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_consoleMessage(
    event: consoleMessage,
    cb: js.Function3[/* msg */ String, /* lineNumber */ Double, /* sourceId */ Double, Unit]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: error,
    cb: js.Function2[/* msg */ String, /* trace */ js.UndefOr[js.Array[IStackTrace]], Unit]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_initialized(event: initialized, cb: js.Function0[Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_loadFinished(event: loadFinished, cb: js.Function1[/* status */ String, Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_loadStarted(event: loadStarted, cb: js.Function0[Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_navigationRequested(
    event: navigationRequested,
    cb: js.Function4[
      /* url */ String, 
      /* type */ String, 
      /* willNavigate */ Boolean, 
      /* main */ Boolean, 
      Unit
    ]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_prompt(event: prompt, cb: js.Function2[/* msg */ String, /* defaultValue */ js.UndefOr[String], Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_resourceError(event: resourceError, cb: js.Function1[/* resourceError */ IResourceError, Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_resourceReceived(event: resourceReceived, cb: js.Function1[/* response */ IResponse, Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_resourceRequested(
    event: resourceRequested,
    cb: js.Function2[/* requestData */ IRequest, /* networkRequest */ INetwordRequest, Unit]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_timeout(event: timeout, cb: js.Function1[/* msg */ String, Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_urlChanged(event: urlChanged, cb: js.Function1[/* targetUrl */ String, Unit]): Nightmare = js.native
  def run(): Nightmare = js.native
  def run(cb: js.Function2[/* err */ js.Any, /* nightmare */ this.type, Unit]): Nightmare = js.native
  def screenshot(): Nightmare = js.native
  def screenshot(clip: Anon_Height): Nightmare = js.native
  def screenshot(clip: Anon_Height, done: js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]): Nightmare = js.native
  def screenshot(done: js.Function2[/* err */ js.Any, /* buffer */ Buffer, Unit]): Nightmare = js.native
  def screenshot(path: String): Nightmare = js.native
  def screenshot(path: String, clip: Anon_Height): Nightmare = js.native
  def screenshot(path: String, clip: Anon_Height, done: js.Function1[/* err */ js.Any, Unit]): Nightmare = js.native
  def screenshot(path: String, done: js.Function1[/* err */ js.Any, Unit]): Nightmare = js.native
  def scrollTo(top: Double, left: Double): Nightmare = js.native
  def select(seletor: String, option: String): Nightmare = js.native
  def `then`[T, R](fn: js.Function1[/* value */ T, R]): js.Promise[R] = js.native
  def title(): String = js.native
  def title(cb: js.Function1[/* title */ String, Unit]): Nightmare = js.native
  def `type`(selector: String, text: String): Nightmare = js.native
  def uncheck(seletor: String): Nightmare = js.native
  def upload(selector: String, path: String): Nightmare = js.native
  def url(): String = js.native
  def url(cb: js.Function1[/* url */ String, Unit]): Nightmare = js.native
  def use(plugin: js.Function1[/* nightmare */ this.type, Unit]): Nightmare = js.native
  def useragent(useragent: String): Nightmare = js.native
  def viewport(width: Double, height: Double): Nightmare = js.native
  def visible(selector: String): Nightmare = js.native
  def visible(selector: String, cb: js.Function1[/* result */ Boolean, Unit]): Nightmare = js.native
  def wait(fn: js.Function0[_]): Nightmare = js.native
  def wait(fn: js.Function0[_], value: js.Any): Nightmare = js.native
  def wait(fn: js.Function0[_], value: js.Any, delay: Double): Nightmare = js.native
  def wait(ms: Double): Nightmare = js.native
  def wait(selector: String): Nightmare = js.native
  def wait[T1](fn: js.Function1[/* arg1 */ T1, _], value1: T1): Nightmare = js.native
  def wait[T1, T2](fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, _], value1: T1, value2: T2): Nightmare = js.native
  def wait[T1, T2, T3](
    fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, _],
    value1: T1,
    value2: T2,
    value3: T3
  ): Nightmare = js.native
  def wait[T1, T2, T3, T4](
    fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, _],
    value1: T1,
    value2: T2,
    value3: T3,
    value4: T4
  ): Nightmare = js.native
  def wait[T1, T2, T3, T4, T5](
    fn: js.Function5[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, /* arg5 */ T5, _],
    value1: T1,
    value2: T2,
    value3: T3,
    value4: T4,
    value5: T5
  ): Nightmare = js.native
  def zoom(zoomFactor: Double): Nightmare = js.native
}

