package typings
package atPollyjsCoreLib.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: js.Any
  var headers: stdLib.Record[java.lang.String, java.lang.String]
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  def end(): stdLib.Readonly[Response]
  def getHeader(name: java.lang.String): java.lang.String | scala.Null
  def hasHeader(name: java.lang.String): scala.Boolean
  def json(body: js.Any): Response
  def jsonBody(): js.Any
  def send(body: js.Any): Response
  def sendStatus(status: scala.Double): Response
  def setHeader(name: java.lang.String, value: java.lang.String): Response
  def setHeaders(headers: js.Any): Response
  def status(status: scala.Double): Response
  def `type`(contentType: java.lang.String): Response
}

