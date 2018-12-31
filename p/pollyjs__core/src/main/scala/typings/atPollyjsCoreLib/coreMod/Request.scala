package typings
package atPollyjsCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var body: js.Any
  var hash: java.lang.String
  var headers: stdLib.Record[java.lang.String, java.lang.String]
  var hostname: java.lang.String
  var method: java.lang.String
  var params: js.Any
  var pathname: java.lang.String
  var port: java.lang.String
  var protocol: java.lang.String
  var query: js.Any
  var recordingName: java.lang.String
  var responseTime: js.UndefOr[scala.Double] = js.undefined
  var url: java.lang.String
  def getHeader(name: java.lang.String): java.lang.String | scala.Null
  def hasHeader(name: java.lang.String): scala.Boolean
  def json(body: js.Any): Request
  def jsonBody(): js.Any
  def send(body: js.Any): Request
  def setHeader(name: java.lang.String, value: java.lang.String): Request
  def setHeaders(headers: js.Any): Request
  def `type`(contentType: java.lang.String): Request
}

