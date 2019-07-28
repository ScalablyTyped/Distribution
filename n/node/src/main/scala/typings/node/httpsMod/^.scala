package typings.node.httpsMod

import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.RequestListener
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var globalAgent: Agent = js.native
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

