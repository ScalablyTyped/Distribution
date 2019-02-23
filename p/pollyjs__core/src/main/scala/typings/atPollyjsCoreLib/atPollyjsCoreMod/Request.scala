package typings
package atPollyjsCoreLib.atPollyjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var body: js.Any = js.native
  var hash: java.lang.String = js.native
  var headers: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String]] = js.native
  var hostname: java.lang.String = js.native
  var method: java.lang.String = js.native
  var params: js.Any = js.native
  var pathname: java.lang.String = js.native
  var port: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var query: js.Any = js.native
  var recordingName: java.lang.String = js.native
  var responseTime: js.UndefOr[scala.Double] = js.native
  var url: java.lang.String = js.native
  def getHeader(name: java.lang.String): java.lang.String | scala.Null = js.native
  def hasHeader(name: java.lang.String): scala.Boolean = js.native
  def json(body: js.Any): Request = js.native
  def jsonBody(): js.Any = js.native
  def removeHeader(name: java.lang.String): Request = js.native
  def removeHeaders(headers: js.Array[java.lang.String]): Request = js.native
  def send(body: js.Any): Request = js.native
  def setHeader(name: java.lang.String): Request = js.native
  def setHeader(name: java.lang.String, value: java.lang.String): Request = js.native
  def setHeaders(headers: stdLib.Record[java.lang.String, java.lang.String | js.Array[java.lang.String]]): Request = js.native
  def `type`(contentType: java.lang.String): Request = js.native
}

