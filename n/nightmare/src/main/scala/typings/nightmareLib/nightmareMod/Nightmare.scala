package typings
package nightmareLib.nightmareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nightmare extends js.Object {
  val cookies: nightmareLib.nightmareMod.NightmareNs.Cookies = js.native
  // Settings
  def authentication(user: java.lang.String, password: java.lang.String): Nightmare = js.native
  def back(): Nightmare = js.native
  def check(seletor: java.lang.String): Nightmare = js.native
  def click(selector: java.lang.String): Nightmare = js.native
  def download(path: java.lang.String): Nightmare = js.native
  @JSName("download")
  def download_cancel(action: nightmareLib.nightmareLibStrings.cancel): Nightmare = js.native
  @JSName("download")
  def download_continue(action: nightmareLib.nightmareLibStrings.continue): Nightmare = js.native
  // Interact
  def end(): Nightmare = js.native
  def evaluate(fn: js.Function0[scala.Unit]): Nightmare = js.native
  def evaluate[R](fn: js.Function0[R], cb: js.Function1[/* result */ R, scala.Unit]): Nightmare = js.native
  def evaluate[T](fn: js.Function1[/* arg */ T, scala.Unit], cb: js.Function0[scala.Unit], arg: T): Nightmare = js.native
  def evaluate[T, R](fn: js.Function1[/* arg */ T, R], cb: js.Function1[/* result */ R, scala.Unit], arg: T): Nightmare = js.native
  def evaluate[T1, T2, R](
    fn: js.Function2[/* arg1 */ T1, /* arg2 */ T2, R],
    cb: js.Function1[/* result */ R, scala.Unit],
    arg1: T1,
    arg2: T2
  ): Nightmare = js.native
  def evaluate[T1, T2, T3, R](
    fn: js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, R],
    cb: js.Function1[/* result */ R, scala.Unit],
    arg1: T1,
    arg2: T2,
    arg3: T3
  ): Nightmare = js.native
  // Extract
  def exists(selector: java.lang.String): Nightmare = js.native
  // Extract
  def exists(selector: java.lang.String, cb: js.Function1[/* result */ scala.Boolean, scala.Unit]): Nightmare = js.native
  def forward(): Nightmare = js.native
  def goto(url: java.lang.String): Nightmare = js.native
  def goto(url: java.lang.String, headers: js.Object): Nightmare = js.native
  def halt(error: java.lang.String, cb: js.Function0[scala.Unit]): Nightmare = js.native
  def header(header: java.lang.String, value: java.lang.String): Nightmare = js.native
  def headers(headers: js.Object): Nightmare = js.native
  def html(path: java.lang.String, saveType: java.lang.String): Nightmare = js.native
  @JSName("html")
  def html_HTMLComplete(path: java.lang.String, saveType: nightmareLib.nightmareLibStrings.HTMLComplete): Nightmare = js.native
  @JSName("html")
  def html_HTMLOnly(path: java.lang.String, saveType: nightmareLib.nightmareLibStrings.HTMLOnly): Nightmare = js.native
  @JSName("html")
  def html_MHTML(path: java.lang.String, saveType: nightmareLib.nightmareLibStrings.MHTML): Nightmare = js.native
  def inject(`type`: java.lang.String, file: java.lang.String): Nightmare = js.native
  def insert(selector: java.lang.String, text: java.lang.String): Nightmare = js.native
  def mousedown(selector: java.lang.String): Nightmare = js.native
  def mouseover(selector: java.lang.String): Nightmare = js.native
  def mouseup(selector: java.lang.String): Nightmare = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): Nightmare = js.native
  @JSName("on")
  def on_alert(
    event: nightmareLib.nightmareLibStrings.alert,
    cb: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  @JSName("on")
  def on_confirm(
    event: nightmareLib.nightmareLibStrings.confirm,
    cb: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  @JSName("on")
  def on_consoleMessage(
    event: nightmareLib.nightmareLibStrings.consoleMessage,
    cb: js.Function3[
      /* msg */ java.lang.String, 
      /* lineNumber */ scala.Double, 
      /* sourceId */ scala.Double, 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("on")
  def on_error(
    event: nightmareLib.nightmareLibStrings.error,
    cb: js.Function2[
      /* msg */ java.lang.String, 
      /* trace */ js.UndefOr[js.Array[nightmareLib.nightmareMod.NightmareNs.IStackTrace]], 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("on")
  def on_initialized(event: nightmareLib.nightmareLibStrings.initialized, cb: js.Function0[scala.Unit]): Nightmare = js.native
  @JSName("on")
  def on_loadFinished(
    event: nightmareLib.nightmareLibStrings.loadFinished,
    cb: js.Function1[/* status */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  @JSName("on")
  def on_loadStarted(event: nightmareLib.nightmareLibStrings.loadStarted, cb: js.Function0[scala.Unit]): Nightmare = js.native
  @JSName("on")
  def on_navigationRequested(
    event: nightmareLib.nightmareLibStrings.navigationRequested,
    cb: js.Function4[
      /* url */ java.lang.String, 
      /* type */ java.lang.String, 
      /* willNavigate */ scala.Boolean, 
      /* main */ scala.Boolean, 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("on")
  def on_prompt(
    event: nightmareLib.nightmareLibStrings.prompt,
    cb: js.Function2[
      /* msg */ java.lang.String, 
      /* defaultValue */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("on")
  def on_resourceError(
    event: nightmareLib.nightmareLibStrings.resourceError,
    cb: js.Function1[
      /* resourceError */ nightmareLib.nightmareMod.NightmareNs.IResourceError, 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("on")
  def on_resourceReceived(
    event: nightmareLib.nightmareLibStrings.resourceReceived,
    cb: js.Function1[/* response */ nightmareLib.nightmareMod.NightmareNs.IResponse, scala.Unit]
  ): Nightmare = js.native
  @JSName("on")
  def on_resourceRequested(
    event: nightmareLib.nightmareLibStrings.resourceRequested,
    cb: js.Function2[
      /* requestData */ nightmareLib.nightmareMod.NightmareNs.IRequest, 
      /* networkRequest */ nightmareLib.nightmareMod.NightmareNs.INetwordRequest, 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("on")
  def on_timeout(
    event: nightmareLib.nightmareLibStrings.timeout,
    cb: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  @JSName("on")
  def on_urlChanged(
    event: nightmareLib.nightmareLibStrings.urlChanged,
    cb: js.Function1[/* targetUrl */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  def once(event: java.lang.String, cb: js.Function0[scala.Unit]): Nightmare = js.native
  @JSName("once")
  def once_alert(
    event: nightmareLib.nightmareLibStrings.alert,
    cb: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  @JSName("once")
  def once_confirm(
    event: nightmareLib.nightmareLibStrings.confirm,
    cb: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  @JSName("once")
  def once_consoleMessage(
    event: nightmareLib.nightmareLibStrings.consoleMessage,
    cb: js.Function3[
      /* msg */ java.lang.String, 
      /* lineNumber */ scala.Double, 
      /* sourceId */ scala.Double, 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("once")
  def once_error(
    event: nightmareLib.nightmareLibStrings.error,
    cb: js.Function2[
      /* msg */ java.lang.String, 
      /* trace */ js.UndefOr[js.Array[nightmareLib.nightmareMod.NightmareNs.IStackTrace]], 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("once")
  def once_initialized(event: nightmareLib.nightmareLibStrings.initialized, cb: js.Function0[scala.Unit]): Nightmare = js.native
  @JSName("once")
  def once_loadFinished(
    event: nightmareLib.nightmareLibStrings.loadFinished,
    cb: js.Function1[/* status */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  @JSName("once")
  def once_loadStarted(event: nightmareLib.nightmareLibStrings.loadStarted, cb: js.Function0[scala.Unit]): Nightmare = js.native
  @JSName("once")
  def once_navigationRequested(
    event: nightmareLib.nightmareLibStrings.navigationRequested,
    cb: js.Function4[
      /* url */ java.lang.String, 
      /* type */ java.lang.String, 
      /* willNavigate */ scala.Boolean, 
      /* main */ scala.Boolean, 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("once")
  def once_prompt(
    event: nightmareLib.nightmareLibStrings.prompt,
    cb: js.Function2[
      /* msg */ java.lang.String, 
      /* defaultValue */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("once")
  def once_resourceError(
    event: nightmareLib.nightmareLibStrings.resourceError,
    cb: js.Function1[
      /* resourceError */ nightmareLib.nightmareMod.NightmareNs.IResourceError, 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("once")
  def once_resourceReceived(
    event: nightmareLib.nightmareLibStrings.resourceReceived,
    cb: js.Function1[/* response */ nightmareLib.nightmareMod.NightmareNs.IResponse, scala.Unit]
  ): Nightmare = js.native
  @JSName("once")
  def once_resourceRequested(
    event: nightmareLib.nightmareLibStrings.resourceRequested,
    cb: js.Function2[
      /* requestData */ nightmareLib.nightmareMod.NightmareNs.IRequest, 
      /* networkRequest */ nightmareLib.nightmareMod.NightmareNs.INetwordRequest, 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("once")
  def once_timeout(
    event: nightmareLib.nightmareLibStrings.timeout,
    cb: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  @JSName("once")
  def once_urlChanged(
    event: nightmareLib.nightmareLibStrings.urlChanged,
    cb: js.Function1[/* targetUrl */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  def path(): java.lang.String = js.native
  def pdf(cb: js.Function2[/* err */ nodeLib.Error, /* data */ nodeLib.Buffer, scala.Unit]): Nightmare = js.native
  def pdf(path: java.lang.String): Nightmare = js.native
  def pdf(path: java.lang.String, options: js.Object): Nightmare = js.native
  def refresh(): Nightmare = js.native
  def removeListener(event: java.lang.String, cb: js.Function0[scala.Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_alert(
    event: nightmareLib.nightmareLibStrings.alert,
    cb: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_confirm(
    event: nightmareLib.nightmareLibStrings.confirm,
    cb: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_consoleMessage(
    event: nightmareLib.nightmareLibStrings.consoleMessage,
    cb: js.Function3[
      /* msg */ java.lang.String, 
      /* lineNumber */ scala.Double, 
      /* sourceId */ scala.Double, 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_error(
    event: nightmareLib.nightmareLibStrings.error,
    cb: js.Function2[
      /* msg */ java.lang.String, 
      /* trace */ js.UndefOr[js.Array[nightmareLib.nightmareMod.NightmareNs.IStackTrace]], 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_initialized(event: nightmareLib.nightmareLibStrings.initialized, cb: js.Function0[scala.Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_loadFinished(
    event: nightmareLib.nightmareLibStrings.loadFinished,
    cb: js.Function1[/* status */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_loadStarted(event: nightmareLib.nightmareLibStrings.loadStarted, cb: js.Function0[scala.Unit]): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_navigationRequested(
    event: nightmareLib.nightmareLibStrings.navigationRequested,
    cb: js.Function4[
      /* url */ java.lang.String, 
      /* type */ java.lang.String, 
      /* willNavigate */ scala.Boolean, 
      /* main */ scala.Boolean, 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_prompt(
    event: nightmareLib.nightmareLibStrings.prompt,
    cb: js.Function2[
      /* msg */ java.lang.String, 
      /* defaultValue */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_resourceError(
    event: nightmareLib.nightmareLibStrings.resourceError,
    cb: js.Function1[
      /* resourceError */ nightmareLib.nightmareMod.NightmareNs.IResourceError, 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_resourceReceived(
    event: nightmareLib.nightmareLibStrings.resourceReceived,
    cb: js.Function1[/* response */ nightmareLib.nightmareMod.NightmareNs.IResponse, scala.Unit]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_resourceRequested(
    event: nightmareLib.nightmareLibStrings.resourceRequested,
    cb: js.Function2[
      /* requestData */ nightmareLib.nightmareMod.NightmareNs.IRequest, 
      /* networkRequest */ nightmareLib.nightmareMod.NightmareNs.INetwordRequest, 
      scala.Unit
    ]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_timeout(
    event: nightmareLib.nightmareLibStrings.timeout,
    cb: js.Function1[/* msg */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  @JSName("removeListener")
  def removeListener_urlChanged(
    event: nightmareLib.nightmareLibStrings.urlChanged,
    cb: js.Function1[/* targetUrl */ java.lang.String, scala.Unit]
  ): Nightmare = js.native
  def run(): Nightmare = js.native
  def run(cb: js.Function2[/* err */ js.Any, /* nightmare */ this.type, scala.Unit]): Nightmare = js.native
  def screenshot(): Nightmare = js.native
  def screenshot(clip: nightmareLib.Anon_Y): Nightmare = js.native
  def screenshot(
    clip: nightmareLib.Anon_Y,
    done: js.Function2[/* err */ js.Any, /* buffer */ nodeLib.Buffer, scala.Unit]
  ): Nightmare = js.native
  def screenshot(done: js.Function2[/* err */ js.Any, /* buffer */ nodeLib.Buffer, scala.Unit]): Nightmare = js.native
  def screenshot(path: java.lang.String): Nightmare = js.native
  def screenshot(path: java.lang.String, clip: nightmareLib.Anon_Y): Nightmare = js.native
  def screenshot(
    path: java.lang.String,
    clip: nightmareLib.Anon_Y,
    done: js.Function1[/* err */ js.Any, scala.Unit]
  ): Nightmare = js.native
  def screenshot(path: java.lang.String, done: js.Function1[/* err */ js.Any, scala.Unit]): Nightmare = js.native
  def scrollTo(top: scala.Double, left: scala.Double): Nightmare = js.native
  def select(seletor: java.lang.String, option: java.lang.String): Nightmare = js.native
  def `then`[T, R](fn: js.Function1[/* value */ T, R]): js.Promise[R] = js.native
  def title(): java.lang.String = js.native
  def title(cb: js.Function1[/* title */ java.lang.String, scala.Unit]): Nightmare = js.native
  def `type`(selector: java.lang.String, text: java.lang.String): Nightmare = js.native
  def uncheck(seletor: java.lang.String): Nightmare = js.native
  def upload(selector: java.lang.String, path: java.lang.String): Nightmare = js.native
  def url(): java.lang.String = js.native
  def url(cb: js.Function1[/* url */ java.lang.String, scala.Unit]): Nightmare = js.native
  def use(plugin: js.Function1[/* nightmare */ this.type, scala.Unit]): Nightmare = js.native
  def useragent(useragent: java.lang.String): Nightmare = js.native
  def viewport(width: scala.Double, height: scala.Double): Nightmare = js.native
  def visible(selector: java.lang.String): Nightmare = js.native
  def visible(selector: java.lang.String, cb: js.Function1[/* result */ scala.Boolean, scala.Unit]): Nightmare = js.native
  def wait(fn: js.Function0[_]): Nightmare = js.native
  def wait(fn: js.Function0[_], value: js.Any): Nightmare = js.native
  def wait(fn: js.Function0[_], value: js.Any, delay: scala.Double): Nightmare = js.native
  def wait(ms: scala.Double): Nightmare = js.native
  def wait(selector: java.lang.String): Nightmare = js.native
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
  def zoom(zoomFactor: scala.Double): Nightmare = js.native
}

