package typings
package nodeLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("http", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val METHODS: js.Array[java.lang.String] = js.native
  var globalAgent: nodeLib.httpMod.Agent = js.native
  /**
    * Read-only property specifying the maximum allowed size of HTTP headers in bytes.
    * Defaults to 8KB. Configurable using the [`--max-http-header-size`][] CLI option.
    */
  val maxHeaderSize: scala.Double = js.native
  def createClient(): js.Any = js.native
  def createClient(port: scala.Double): js.Any = js.native
  def createClient(port: scala.Double, host: java.lang.String): js.Any = js.native
  def createServer(): nodeLib.httpMod.Server = js.native
  def createServer(
    requestListener: js.Function2[
      /* request */ nodeLib.httpMod.IncomingMessage, 
      /* response */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.httpMod.Server = js.native
  def get(options: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: java.lang.String,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(options: nodeLib.urlMod.URL): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: nodeLib.urlMod.URL,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(url: java.lang.String, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    url: java.lang.String,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(url: nodeLib.urlMod.URL, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    url: nodeLib.urlMod.URL,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: java.lang.String,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: nodeLib.urlMod.URL): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: nodeLib.urlMod.URL,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(url: java.lang.String, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    url: java.lang.String,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(url: nodeLib.urlMod.URL, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    url: nodeLib.urlMod.URL,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
}

