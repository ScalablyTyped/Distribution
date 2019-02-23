package typings
package atPollyjsCoreLib.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var body: js.Any = js.native
  var headers: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String]] = js.native
  var statusCode: js.UndefOr[scala.Double] = js.native
  def end(): stdLib.Readonly[Response] = js.native
  def getHeader(name: java.lang.String): java.lang.String | scala.Null = js.native
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  def json(body: js.Any): Response = js.native
  def jsonBody(): js.Any = js.native
  def removeHeader(name: java.lang.String): Request = js.native
  def removeHeaders(headers: js.Array[java.lang.String]): Request = js.native
  def send(body: js.Any): Response = js.native
  def sendStatus(status: scala.Double): Response = js.native
  def setHeader(name: java.lang.String): Response = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): Response = js.native
  def setHeaders(headers: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String]]): Response = js.native
  def status(status: scala.Double): Response = js.native
  def `type`(contentType: java.lang.String): Response = js.native
}

