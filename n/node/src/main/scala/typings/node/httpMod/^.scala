package typings.node.httpMod

import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val METHODS: js.Array[java.lang.String] = js.native
  var globalAgent: Agent = js.native
  /**
    * Read-only property specifying the maximum allowed size of HTTP headers in bytes.
    * Defaults to 8KB. Configurable using the [`--max-http-header-size`][] CLI option.
    */
  val maxHeaderSize: Double = js.native
  def createServer(): Server = js.native
  def createServer(options: ServerOptions): Server = js.native
  def createServer(options: ServerOptions, requestListener: RequestListener): Server = js.native
  def createServer(requestListener: RequestListener): Server = js.native
  def get(options: java.lang.String): ClientRequest = js.native
  def get(options: java.lang.String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(options: RequestOptions): ClientRequest = js.native
  def get(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(options: URL): ClientRequest = js.native
  def get(options: URL, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def get(url: java.lang.String, options: RequestOptions): ClientRequest = js.native
  def get(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ IncomingMessage, Unit]
  ): ClientRequest = js.native
  def get(url: URL, options: RequestOptions): ClientRequest = js.native
  def get(url: URL, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(options: java.lang.String): ClientRequest = js.native
  def request(options: java.lang.String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(options: RequestOptions): ClientRequest = js.native
  def request(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(options: URL): ClientRequest = js.native
  def request(options: URL, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def request(url: java.lang.String, options: RequestOptions): ClientRequest = js.native
  def request(
    url: java.lang.String,
    options: RequestOptions,
    callback: js.Function1[/* res */ IncomingMessage, Unit]
  ): ClientRequest = js.native
  def request(url: URL, options: RequestOptions): ClientRequest = js.native
  def request(url: URL, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
}

