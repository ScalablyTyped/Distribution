package typings
package nodeDashHorsemanLib.nodeDashHorsemanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait horseman extends js.Object {
  /** Handle page events inside PhantomJS. Phantom receives callback return value with .at but not with .on */
  def at(eventType: java.lang.String, callback: js.Function0[scala.Unit]): this.type = js.native
  /** Get the value of an attribute for a selector. */
  def attribute(selector: java.lang.String, attr: java.lang.String): java.lang.String = js.native
  /** Use basic HTTP authentication when opening a page. */
  def authentication(username: java.lang.String, password: java.lang.String): this.type = js.native
  /** Go back a page. */
  def back(): this.type = js.native
  /** Get the bounding rectangle of a selector. */
  def boundingRectangle(selector: java.lang.String): stdLib.ClientRect = js.native
  /** Clear an input field. */
  def clear(selector: java.lang.String): js.Any = js.native
  /** Click on a selector and fire a 'click event'. */
  def click(selector: java.lang.String): this.type = js.native
  /** Close the instance and perform cleanup. */
  def close(): this.type = js.native
  /** Close a tab and release its resources. */
  def closeTab(tabNumber: java.lang.String): this.type = js.native
  /** Get the cookies from Phantom. */
  def cookies(): java.lang.String = js.native
  /** Set the cookies for Phantom. */
  def cookies(args: java.lang.String): this.type = js.native
  /** Set the cookies for Phantom. */
  def cookies(args: js.Array[js.Object]): this.type = js.native
  /** Set the cookies for Phantom. */
  def cookies(args: js.Object): this.type = js.native
  /** Count the number of occurances of 'selector' on the page. */
  def count(selector: java.lang.String): scala.Double = js.native
  /** Save a cropped screenshot to disk. */
  def crop(area: java.lang.String, path: java.lang.String): this.type = js.native
  /** Save a cropped screenshot to disk. */
  def crop(area: js.Object, path: java.lang.String): this.type = js.native
  /** Take a base64 encoded cropped screenshot. */
  def cropBase64(area: java.lang.String, `type`: java.lang.String): js.Any = js.native
  /** Take a base64 encoded cropped screenshot. */
  @JSName("cropBase64")
  def cropBase64_PNG(area: java.lang.String, `type`: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.PNG): js.Any = js.native
  /** Get the value of an css property of a selector. */
  def cssProperty(selector: java.lang.String, prop: java.lang.String): java.lang.String = js.native
  /** Execute a function without breaking the api chain. */
  def `do`(fn: js.Function0[scala.Unit]): this.type = js.native
  /** Download a URL. */
  def download(
    url: java.lang.String,
    path: java.lang.String,
    binary: scala.Boolean,
    method: java.lang.String,
    data: java.lang.String
  ): this.type = js.native
  /** Run a javascript function on the current page and optionally return the results. */
  def evaluate(fn: js.Function0[scala.Unit]): this.type = js.native
  /** Run a javascript function on the current page and optionally return the results. */
  def evaluate(fn: js.Function0[scala.Unit], args: js.Array[_]): this.type = js.native
  /** Determine if the selector exists, at least once, on the page. */
  def exists(selector: java.lang.String): scala.Boolean = js.native
  /** Go forward a page. */
  def forward(): this.type = js.native
  /** Get the count of frames inside the current frame. */
  def frameCount(): scala.Double = js.native
  /** Get the name of the current frame. */
  def frameName(): java.lang.String = js.native
  /** Get the names of the frames inside the current frame. */
  def frameNames(): java.lang.String = js.native
  /** Set headers sent to the remote server during an 'open'. */
  def headers(headers: js.Array[js.Object]): this.type = js.native
  /** Get the height of an element. */
  def height(selector: java.lang.String): scala.Double = js.native
  /** Get the HTML for the page, or optionally for a selector. */
  def html(): js.Promise[java.lang.String] = js.native
  /** Get the HTML for the page, or optionally for a selector. */
  def html(selector: java.lang.String): js.Promise[java.lang.String] = js.native
  /** Get the HTML for the page, or optionally for a selector. */
  def html(selector: java.lang.String, file: java.lang.String): js.Promise[java.lang.String] = js.native
  /** Includes javascript script from a url on the page. */
  def includeJs(url: java.lang.String): this.type = js.native
  /** Injects javascript from a file into the page. */
  def injectJs(file: java.lang.String): this.type = js.native
  /** Fire a key event. */
  def keyboardEvent(): this.type = js.native
  /** Fire a key event. */
  def keyboardEvent(`type`: java.lang.String): this.type = js.native
  /** Fire a key event. */
  def keyboardEvent(`type`: java.lang.String, key: java.lang.String): this.type = js.native
  /** Fire a key event. */
  def keyboardEvent(`type`: java.lang.String, key: java.lang.String, modifier: scala.Double): this.type = js.native
  /** Log the output from either a previous chain method, or a string the user passed in. */
  def log(): this.type = js.native
  /** Log the output from either a previous chain method, or a string the user passed in. */
  def log(output: java.lang.String): this.type = js.native
  /** Run javascript on the page. */
  def manipulate(fn: js.Function0[scala.Unit]): this.type = js.native
  /** Run javascript on the page. */
  def manipulate(fn: js.Function0[scala.Unit], args: js.Array[_]): this.type = js.native
  /** Fire a mouse event. */
  def mouseEvent(): this.type = js.native
  /** Fire a mouse event. */
  def mouseEvent(`type`: java.lang.String): this.type = js.native
  /** Fire a mouse event. */
  def mouseEvent(`type`: java.lang.String, x: scala.Double): this.type = js.native
  /** Fire a mouse event. */
  def mouseEvent(`type`: java.lang.String, x: scala.Double, y: scala.Double): this.type = js.native
  /** Fire a mouse event. */
  def mouseEvent(`type`: java.lang.String, x: scala.Double, y: scala.Double, button: java.lang.String): this.type = js.native
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
  def on(event: java.lang.String, func: js.Function1[/* repeated */js.Any, scala.Unit]): this.type = js.native
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
  @JSName("on")
  def on_loadFinished(
    event: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.loadFinished,
    func: js.Function1[/* repeated */js.Any, scala.Unit]
  ): this.type = js.native
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
  @JSName("on")
  def on_pageCreated(
    event: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.pageCreated,
    func: js.Function1[/* repeated */js.Any, scala.Unit]
  ): this.type = js.native
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
  @JSName("on")
  def on_resourceReceived(
    event: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.resourceReceived,
    func: js.Function1[/* repeated */js.Any, scala.Unit]
  ): this.type = js.native
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
  @JSName("on")
  def on_resourceTimeout(
    event: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.resourceTimeout,
    func: js.Function1[/* repeated */js.Any, scala.Unit]
  ): this.type = js.native
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
  @JSName("on")
  def on_tabClosed(
    event: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.tabClosed,
    func: js.Function1[/* repeated */js.Any, scala.Unit]
  ): this.type = js.native
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
  @JSName("on")
  def on_tabCreated(
    event: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.tabCreated,
    func: js.Function1[/* repeated */js.Any, scala.Unit]
  ): this.type = js.native
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
  @JSName("on")
  def on_timeout(
    event: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.timeout,
    func: js.Function1[/* repeated */js.Any, scala.Unit]
  ): this.type = js.native
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
  @JSName("on")
  def on_urlChanged(
    event: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.urlChanged,
    func: js.Function1[/* repeated */js.Any, scala.Unit]
  ): this.type = js.native
  /** Open a url in Phantom. */
  def open(url: java.lang.String): this.type = js.native
  /** Open a url in Phantom. */
  def open(url: java.lang.String, method: java.lang.String): this.type = js.native
  /** Open URL in a new tab */
  def openTab(url: java.lang.String): this.type = js.native
  /** Open a url in Phantom. */
  @JSName("open")
  def open_GET(url: java.lang.String, method: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.GET): this.type = js.native
  def pageMaker(url: js.Any, _page: js.Any, args: js.Any*): js.Any = js.native
  /** Save the current page as a pdf. */
  def pdf(path: java.lang.String, paperSize: nodeDashHorsemanLib.Anon_Margin): this.type = js.native
  /** Get the plain text for the body of the page. */
  def plainText(): java.lang.String = js.native
  /** Send Post data to a url. */
  def post(url: java.lang.String, postData: java.lang.String): this.type = js.native
  /** Send Put data to a url. */
  def put(url: java.lang.String, putData: java.lang.String): this.type = js.native
  /** Reload the page. */
  def reload(): this.type = js.native
  /** Save a screenshot to disk. */
  def screenshot(path: java.lang.String): this.type = js.native
  /** Take a base64 encoded screenshot, e.g., PNG. */
  def screenshotBase64(`type`: java.lang.String): js.Any = js.native
  /** Take a base64 encoded screenshot, e.g., PNG. */
  @JSName("screenshotBase64")
  def screenshotBase64_PNG(`type`: nodeDashHorsemanLib.nodeDashHorsemanLibStrings.PNG): js.Any = js.native
  /** Scroll to a position on the page. */
  def scrollTo(top: scala.Double, left: scala.Double): this.type = js.native
  /** Select a value in an html select element. */
  def select(selector: java.lang.String, value: java.lang.String): js.Any = js.native
  /** Change the proxy settings. */
  def setProxy(
    ip: java.lang.String,
    port: java.lang.String,
    `type`: java.lang.String,
    username: java.lang.String,
    password: java.lang.String
  ): this.type = js.native
  /** Get the HTTP status of the last opened page. */
  def status(): java.lang.String = js.native
  /** Switch to a child frame. */
  def switchToChildFrame(nameOrPosition: java.lang.String): this.type = js.native
  /** Switch to a child frame. */
  def switchToChildFrame(nameOrPosition: scala.Double): this.type = js.native
  /** Switch to the focused frame. */
  def switchToFocusedFrame(): this.type = js.native
  /** Switch to a frame inside the current frame. */
  def switchToFrame(nameOrPosition: java.lang.String): this.type = js.native
  /** Switch to a frame inside the current frame. */
  def switchToFrame(nameOrPosition: scala.Double): this.type = js.native
  /** Switch to the main frame. */
  def switchToMainFrame(): this.type = js.native
  /** Switch to the parent frame of the current frame. */
  def switchToParentFrame(): this.type = js.native
  /** Switch to another of the open tabs */
  def switchToTab(tabNumber: scala.Double): this.type = js.native
  /** Returns the number of tabs */
  def tabCount(): scala.Double = js.native
  /** Get the text for the body of the page, or optionally for a selector. */
  def text(): java.lang.String = js.native
  /** Get the text for the body of the page, or optionally for a selector. */
  def text(selector: java.lang.String): java.lang.String = js.native
  /** Get the title of the current page. */
  def title(): java.lang.String = js.native
  /** Simulate a keypress on a selector */
  def `type`(selector: java.lang.String, text: java.lang.String): this.type = js.native
  /** Simulate a keypress on a selector */
  def `type`(selector: java.lang.String, text: java.lang.String, options: js.Object): this.type = js.native
  /** Upload a file to the page. */
  def upload(selector: java.lang.String, file: java.lang.String): this.type = js.native
  /** Get the url of the current page. */
  def url(): java.lang.String = js.native
  /** Get or set the user agent for Phantom. */
  def userAgent(args: js.Any*): js.Any = js.native
  /** Get the value of an element. */
  def value(selector: java.lang.String): java.lang.String = js.native
  /** Sets the value of an element. */
  def value(selector: java.lang.String, value: java.lang.String): this.type = js.native
  /** Get the size of the viewport. */
  def viewport(): js.Object = js.native
  /** Set the size of the viewport. */
  def viewport(width: scala.Double, height: scala.Double): this.type = js.native
  /** Determines if an element is visible. */
  def visible(selector: java.lang.String): scala.Boolean = js.native
  /** Wait for a specified period of time */
  def wait(milliseconds: scala.Double): this.type = js.native
  /** Waits for a function to evaluate to a given value in browser. If optsOrFn is a function, use the classic signature waitFor(fn, arg1, arg2, value), If arg is an object, use waitFor(options). */
  def waitFor(args: js.Any*): this.type = js.native
  /** Wait for a page load to occur */
  def waitForNextPage(): this.type = js.native
  /** Wait for a page load to occur */
  def waitForNextPage(`object`: js.Object): this.type = js.native
  /** Wait for a selector to be present on the current page. */
  def waitForSelector(selector: java.lang.String, options: js.Object): this.type = js.native
  /** Get the width of an element. */
  def width(selector: java.lang.String): scala.Double = js.native
  /** Set the zoom factor of the page. */
  def zoom(zoomFactor: scala.Double): this.type = js.native
}

