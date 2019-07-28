package typings.atPollyjsCore.atPollyjsCoreMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var body: js.Any = js.native
  var headers: Record[String, String | js.Array[String]] = js.native
  var statusCode: js.UndefOr[Double] = js.native
  def end(): Response = js.native
  def getHeader(name: String): String | Null = js.native
  def hasHeader(name: String): Boolean = js.native
  def json(body: js.Any): Response = js.native
  def jsonBody(): js.Any = js.native
  def removeHeader(name: String): Request = js.native
  def removeHeaders(headers: js.Array[String]): Request = js.native
  def send(body: js.Any): Response = js.native
  def sendStatus(status: Double): Response = js.native
  def setHeader(name: String): Response = js.native
  def setHeader(name: String, value: String): Response = js.native
  def setHeaders(headers: Record[String, String | js.Array[String]]): Response = js.native
  def status(status: Double): Response = js.native
  def `type`(contentType: String): Response = js.native
}

