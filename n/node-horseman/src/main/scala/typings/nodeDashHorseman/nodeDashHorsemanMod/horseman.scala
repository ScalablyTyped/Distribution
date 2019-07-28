package typings.nodeDashHorseman.nodeDashHorsemanMod

import typings.nodeDashHorseman.Anon_A3
import typings.nodeDashHorseman.nodeDashHorsemanStrings.GET
import typings.nodeDashHorseman.nodeDashHorsemanStrings.PNG
import typings.nodeDashHorseman.nodeDashHorsemanStrings.loadFinished
import typings.nodeDashHorseman.nodeDashHorsemanStrings.pageCreated
import typings.nodeDashHorseman.nodeDashHorsemanStrings.resourceReceived
import typings.nodeDashHorseman.nodeDashHorsemanStrings.resourceTimeout
import typings.nodeDashHorseman.nodeDashHorsemanStrings.tabClosed
import typings.nodeDashHorseman.nodeDashHorsemanStrings.tabCreated
import typings.nodeDashHorseman.nodeDashHorsemanStrings.timeout
import typings.nodeDashHorseman.nodeDashHorsemanStrings.urlChanged
import typings.std.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait horseman extends js.Object {
  /** Handle page events inside PhantomJS. Phantom receives callback return value with .at but not with .on */
  def at(eventType: String, callback: js.Function0[Unit]): this.type = js.native
  /** Get the value of an attribute for a selector. */
  def attribute(selector: String, attr: String): String = js.native
  /** Use basic HTTP authentication when opening a page. */
  def authentication(username: String, password: String): this.type = js.native
  /** Go back a page. */
  def back(): this.type = js.native
  /** Get the bounding rectangle of a selector. */
  def boundingRectangle(selector: String): ClientRect = js.native
  /** Clear an input field. */
  def clear(selector: String): js.Any = js.native
  /** Click on a selector and fire a 'click event'. */
  def click(selector: String): this.type = js.native
  /** Close the instance and perform cleanup. */
  def close(): this.type = js.native
  /** Close a tab and release its resources. */
  def closeTab(tabNumber: String): this.type = js.native
  /** Get the cookies from Phantom. */
  def cookies(): String = js.native
  def cookies(args: String): this.type = js.native
  def cookies(args: js.Array[js.Object]): this.type = js.native
  /** Set the cookies for Phantom. */
  def cookies(args: js.Object): this.type = js.native
  /** Count the number of occurances of 'selector' on the page. */
  def count(selector: String): Double = js.native
  /** Save a cropped screenshot to disk. */
  def crop(area: String, path: String): this.type = js.native
  def crop(area: js.Object, path: String): this.type = js.native
  /** Take a base64 encoded cropped screenshot. */
  def cropBase64(area: String, `type`: String): js.Any = js.native
  @JSName("cropBase64")
  def cropBase64_PNG(area: String, `type`: PNG): js.Any = js.native
  /** Get the value of an css property of a selector. */
  def cssProperty(selector: String, prop: String): String = js.native
  /** Execute a function without breaking the api chain. */
  def `do`(fn: js.Function0[Unit]): this.type = js.native
  /** Download a URL. */
  def download(url: String, path: String, binary: Boolean, method: String, data: String): this.type = js.native
  /** Run a javascript function on the current page and optionally return the results. */
  def evaluate(fn: js.Function0[Unit]): this.type = js.native
  def evaluate(fn: js.Function0[Unit], args: js.Array[_]): this.type = js.native
  /** Determine if the selector exists, at least once, on the page. */
  def exists(selector: String): Boolean = js.native
  /** Go forward a page. */
  def forward(): this.type = js.native
  /** Get the count of frames inside the current frame. */
  def frameCount(): Double = js.native
  /** Get the name of the current frame. */
  def frameName(): String = js.native
  /** Get the names of the frames inside the current frame. */
  def frameNames(): String = js.native
  /** Set headers sent to the remote server during an 'open'. */
  def headers(headers: js.Array[js.Object]): this.type = js.native
  /** Get the height of an element. */
  def height(selector: String): Double = js.native
  /** Get the HTML for the page, or optionally for a selector. */
  def html(): js.Promise[String] = js.native
  def html(selector: String): js.Promise[String] = js.native
  def html(selector: String, file: String): js.Promise[String] = js.native
  /** Includes javascript script from a url on the page. */
  def includeJs(url: String): this.type = js.native
  /** Injects javascript from a file into the page. */
  def injectJs(file: String): this.type = js.native
  /** Fire a key event. */
  def keyboardEvent(): this.type = js.native
  def keyboardEvent(`type`: String): this.type = js.native
  def keyboardEvent(`type`: String, key: String): this.type = js.native
  def keyboardEvent(`type`: String, key: String, modifier: Double): this.type = js.native
  /** Log the output from either a previous chain method, or a string the user passed in. */
  def log(): this.type = js.native
  def log(output: String): this.type = js.native
  /** Run javascript on the page. */
  def manipulate(fn: js.Function0[Unit]): this.type = js.native
  def manipulate(fn: js.Function0[Unit], args: js.Array[_]): this.type = js.native
  /** Fire a mouse event. */
  def mouseEvent(): this.type = js.native
  def mouseEvent(`type`: String): this.type = js.native
  def mouseEvent(`type`: String, x: Double): this.type = js.native
  def mouseEvent(`type`: String, x: Double, y: Double): this.type = js.native
  def mouseEvent(`type`: String, x: Double, y: Double, button: String): this.type = js.native
  /**
    * Handles page events.
    * eventType can be one of:
    *  initialized - callback()
    *  loadStarted - callback()
    *  loadFinished - callback(status)
    *  tabCreated - callback(tabNum, tab)
    *  tabClosed - callback(tabNum, tab)
    *  urlChanged - callback(targetUrl)
    *  navigationRequested - callback(url, type, willNavigate, main)
    *  resourceRequested - callback(requestData, networkRequest)
    *  resourceReceived - callback(response)
    *  pageCreated - callback(newPage)
    *  consoleMessage(msg, lineNum, sourceId)
    *  alert - callback(msg)
    *  confirm - callback(msg)
    *  prompt - callback(msg, defaultVal)
    *  filePicker - callback(oldFile)
    *  error - callback(msg, trace);
    *  timeout - callback(type)
    */
  def on(event: String, func: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_loadFinished(event: loadFinished, func: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_pageCreated(event: pageCreated, func: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_resourceReceived(event: resourceReceived, func: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_resourceTimeout(event: resourceTimeout, func: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_tabClosed(event: tabClosed, func: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_tabCreated(event: tabCreated, func: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_timeout(event: timeout, func: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_urlChanged(event: urlChanged, func: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  /** Open a url in Phantom. */
  def open(url: String): this.type = js.native
  def open(url: String, method: String): this.type = js.native
  /** Open URL in a new tab */
  def openTab(url: String): this.type = js.native
  @JSName("open")
  def open_GET(url: String, method: GET): this.type = js.native
  def pageMaker(url: js.Any, _page: js.Any, args: js.Any*): js.Any = js.native
  /** Save the current page as a pdf. */
  def pdf(path: String, paperSize: Anon_A3): this.type = js.native
  /** Get the plain text for the body of the page. */
  def plainText(): String = js.native
  /** Send Post data to a url. */
  def post(url: String, postData: String): this.type = js.native
  /** Send Put data to a url. */
  def put(url: String, putData: String): this.type = js.native
  /** Reload the page. */
  def reload(): this.type = js.native
  /** Save a screenshot to disk. */
  def screenshot(path: String): this.type = js.native
  /** Take a base64 encoded screenshot, e.g., PNG. */
  def screenshotBase64(`type`: String): js.Any = js.native
  @JSName("screenshotBase64")
  def screenshotBase64_PNG(`type`: PNG): js.Any = js.native
  /** Scroll to a position on the page. */
  def scrollTo(top: Double, left: Double): this.type = js.native
  /** Select a value in an html select element. */
  def select(selector: String, value: String): js.Any = js.native
  /** Change the proxy settings. */
  def setProxy(ip: String, port: String, `type`: String, username: String, password: String): this.type = js.native
  /** Get the HTTP status of the last opened page. */
  def status(): String = js.native
  /** Switch to a child frame. */
  def switchToChildFrame(nameOrPosition: String): this.type = js.native
  def switchToChildFrame(nameOrPosition: Double): this.type = js.native
  /** Switch to the focused frame. */
  def switchToFocusedFrame(): this.type = js.native
  /** Switch to a frame inside the current frame. */
  def switchToFrame(nameOrPosition: String): this.type = js.native
  def switchToFrame(nameOrPosition: Double): this.type = js.native
  /** Switch to the main frame. */
  def switchToMainFrame(): this.type = js.native
  /** Switch to the parent frame of the current frame. */
  def switchToParentFrame(): this.type = js.native
  /** Switch to another of the open tabs */
  def switchToTab(tabNumber: Double): this.type = js.native
  /** Returns the number of tabs */
  def tabCount(): Double = js.native
  /** Get the text for the body of the page, or optionally for a selector. */
  def text(): String = js.native
  def text(selector: String): String = js.native
  /** Get the title of the current page. */
  def title(): String = js.native
  /** Simulate a keypress on a selector */
  def `type`(selector: String, text: String): this.type = js.native
  def `type`(selector: String, text: String, options: js.Object): this.type = js.native
  /** Upload a file to the page. */
  def upload(selector: String, file: String): this.type = js.native
  /** Get the url of the current page. */
  def url(): String = js.native
  /** Get or set the user agent for Phantom. */
  def userAgent(args: js.Any*): js.Any = js.native
  /** Get the value of an element. */
  def value(selector: String): String = js.native
  /** Sets the value of an element. */
  def value(selector: String, value: String): this.type = js.native
  /** Get the size of the viewport. */
  def viewport(): js.Object = js.native
  /** Set the size of the viewport. */
  def viewport(width: Double, height: Double): this.type = js.native
  /** Determines if an element is visible. */
  def visible(selector: String): Boolean = js.native
  /** Wait for a specified period of time */
  def wait(milliseconds: Double): this.type = js.native
  /** Waits for a function to evaluate to a given value in browser. If optsOrFn is a function, use the classic signature waitFor(fn, arg1, arg2, value), If arg is an object, use waitFor(options). */
  def waitFor(args: js.Any*): this.type = js.native
  /** Wait for a page load to occur */
  def waitForNextPage(): this.type = js.native
  def waitForNextPage(`object`: js.Object): this.type = js.native
  /** Wait for a selector to be present on the current page. */
  def waitForSelector(selector: String, options: js.Object): this.type = js.native
  /** Get the width of an element. */
  def width(selector: String): Double = js.native
  /** Set the zoom factor of the page. */
  def zoom(zoomFactor: Double): this.type = js.native
}

