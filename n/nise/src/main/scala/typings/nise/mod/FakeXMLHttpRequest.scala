package typings.nise.mod

import typings.std.Document_
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeXMLHttpRequest extends js.Object {
  /**
    * Whether or not the request is asynchronous.
    */
  var async: Boolean = js.native
  /**
    * The request method as a string.
    */
  var method: String = js.native
  /**
    * Password, if any.
    */
  var password: String = js.native
  /**
    * The request body
    */
  var requestBody: String = js.native
  /**
    * An object of all request headers, i.e.:
    */
  var requestHeaders: js.Any = js.native
  /**
    * When using respond, this property is populated with a parsed document if response headers indicate as much (see the spec)
    */
  var responseXML: Document_ = js.native
  /**
    * The request’s status code.
    * undefined if the request has not been handled (see respond below)
    */
  var status: Double = js.native
  /**
    * Only populated if the respond method is called (see below).
    */
  var statusText: String = js.native
  var upload: FakeUploadProgress = js.native
  /**
    * The URL set on the request object.
    */
  var url: String = js.native
  /**
    * Username, if any.
    */
  var username: String = js.native
  var withCredentials: Boolean = js.native
  def autoRespond(ms: Double): Unit = js.native
  /**
    * Simulates a network error on the request. The onerror handler will be called and the status will be 0.
    */
  def error(): Unit = js.native
  /**
    * All response headers as an object.
    */
  def getAllResponseHeaders(): js.Any = js.native
  /**
    * The value of the given response header, if the request has been responded to (see respond).
    * @param header
    */
  def getResponseHeader(header: String): String = js.native
  def onabort(e: Event_): Unit = js.native
  def onerror(e: Event_): Unit = js.native
  def onload(e: Event_): Unit = js.native
  def onloadend(e: Event_): Unit = js.native
  def onloadstart(e: Event_): Unit = js.native
  def onprogress(e: Event_): Unit = js.native
  def ontimeout(e: Event_): Unit = js.native
  /**
    * Calls the above three methods.
    */
  def respond(status: Double): Unit = js.native
  def respond(status: Double, headers: js.Any): Unit = js.native
  def respond(status: Double, headers: js.Any, body: String): Unit = js.native
  /**
    * Sets the respond body, updates the readyState property and fires onreadystatechange.
    * Additionally, populates responseXML with a parsed document if response headers indicate as much.
    */
  def setResponseBody(body: String): Unit = js.native
  /**
    * Sets response headers (e.g. { "Content-Type": "text/html", ... }, updates the readyState property and fires onreadystatechange.
    * @param headers
    */
  def setResponseHeaders(headers: js.Any): Unit = js.native
}

