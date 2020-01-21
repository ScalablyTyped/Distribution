package typings.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPBase extends js.Object {
  var body: js.Any = js.native
  var headers: Headers = js.native
  def getHeader(name: String): String | js.Array[String] | Null = js.native
  def hasHeader(name: String): Boolean = js.native
  def json(body: js.Any): this.type = js.native
  def jsonBody(): js.Any = js.native
  def removeHeader(name: String): this.type = js.native
  def removeHeaders(headers: js.Array[String]): this.type = js.native
  def send(body: js.Any): this.type = js.native
  def setHeader(name: String): this.type = js.native
  def setHeader(name: String, value: String): this.type = js.native
  def setHeader(name: String, value: js.Array[String]): this.type = js.native
  def setHeaders(headers: Headers): this.type = js.native
  def `type`(contentType: String): this.type = js.native
}

