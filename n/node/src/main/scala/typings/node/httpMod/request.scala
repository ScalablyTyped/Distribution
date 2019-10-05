package typings.node.httpMod

import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", "request")
@js.native
object request extends js.Object {
  def apply(options: java.lang.String): ClientRequest = js.native
  def apply(options: java.lang.String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def apply(options: RequestOptions): ClientRequest = js.native
  def apply(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def apply(options: URL): ClientRequest = js.native
  def apply(options: URL, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def apply(url: java.lang.String, options: RequestOptions): ClientRequest = js.native
  def apply(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ IncomingMessage, Unit]
  ): ClientRequest = js.native
  def apply(url: URL, options: RequestOptions): ClientRequest = js.native
  def apply(url: URL, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
}

