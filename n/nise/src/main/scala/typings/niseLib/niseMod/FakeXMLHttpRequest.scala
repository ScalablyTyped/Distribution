package typings
package niseLib.niseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FakeXMLHttpRequest extends js.Object {
  /**
    * Whether or not the request is asynchronous.
    */
  var async: scala.Boolean = js.native
  /**
    * The request method as a string.
    */
  var method: java.lang.String = js.native
  /**
    * Password, if any.
    */
  var password: java.lang.String = js.native
  /**
    * The request body
    */
  var requestBody: java.lang.String = js.native
  /**
    * An object of all request headers, i.e.:
    */
  var requestHeaders: js.Any = js.native
  /**
    * When using respond, this property is populated with a parsed document if response headers indicate as much (see the spec)
    */
  var responseXML: stdLib.Document = js.native
  /**
    * The request’s status code.
    * undefined if the request has not been handled (see respond below)
    */
  var status: scala.Double = js.native
  /**
    * Only populated if the respond method is called (see below).
    */
  var statusText: java.lang.String = js.native
  var upload: FakeUploadProgress = js.native
  /**
    * The URL set on the request object.
    */
  var url: java.lang.String = js.native
  /**
    * Username, if any.
    */
  var username: java.lang.String = js.native
  var withCredentials: scala.Boolean = js.native
  def autoRespond(ms: scala.Double): scala.Unit = js.native
  /**
    * Simulates a network error on the request. The onerror handler will be called and the status will be 0.
    */
  def error(): scala.Unit = js.native
  /**
    * All response headers as an object.
    */
  def getAllResponseHeaders(): js.Any = js.native
  /**
    * The value of the given response header, if the request has been responded to (see respond).
    * @param header
    */
  def getResponseHeader(header: java.lang.String): java.lang.String = js.native
  def onabort(e: stdLib.Event): scala.Unit = js.native
  def onerror(e: stdLib.Event): scala.Unit = js.native
  def onload(e: stdLib.Event): scala.Unit = js.native
  def onloadend(e: stdLib.Event): scala.Unit = js.native
  def onloadstart(e: stdLib.Event): scala.Unit = js.native
  def onprogress(e: stdLib.Event): scala.Unit = js.native
  def ontimeout(e: stdLib.Event): scala.Unit = js.native
  /**
    * Calls the above three methods.
    */
  def respond(status: scala.Double): scala.Unit = js.native
  def respond(status: scala.Double, headers: js.Any): scala.Unit = js.native
  def respond(status: scala.Double, headers: js.Any, body: java.lang.String): scala.Unit = js.native
  /**
    * Sets the respond body, updates the readyState property and fires onreadystatechange.
    * Additionally, populates responseXML with a parsed document if response headers indicate as much.
    */
  def setResponseBody(body: java.lang.String): scala.Unit = js.native
  /**
    * Sets response headers (e.g. { "Content-Type": "text/html", ... }, updates the readyState property and fires onreadystatechange.
    * @param headers
    */
  def setResponseHeaders(headers: js.Any): scala.Unit = js.native
}

