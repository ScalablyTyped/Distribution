package typings.atPollyjsCore.atPollyjsCoreMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var body: js.Any = js.native
  var hash: String = js.native
  var headers: Record[String, String | js.Array[String]] = js.native
  var hostname: String = js.native
  var method: String = js.native
  var params: js.Any = js.native
  var pathname: String = js.native
  var port: String = js.native
  var protocol: String = js.native
  var query: js.Any = js.native
  var recordingName: String = js.native
  var responseTime: js.UndefOr[Double] = js.native
  var url: String = js.native
  def getHeader(name: String): String | Null = js.native
  def hasHeader(name: String): Boolean = js.native
  def json(body: js.Any): Request = js.native
  def jsonBody(): js.Any = js.native
  def removeHeader(name: String): Request = js.native
  def removeHeaders(headers: js.Array[String]): Request = js.native
  def send(body: js.Any): Request = js.native
  def setHeader(name: String): Request = js.native
  def setHeader(name: String, value: String): Request = js.native
  def setHeaders(headers: Record[String, String | js.Array[String]]): Request = js.native
  def `type`(contentType: String): Request = js.native
}

