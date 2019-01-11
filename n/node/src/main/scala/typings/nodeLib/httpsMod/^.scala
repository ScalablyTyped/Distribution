package typings
package nodeLib.httpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("https", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var globalAgent: nodeLib.httpsMod.Agent = js.native
  def createServer(options: nodeLib.httpsMod.ServerOptions): nodeLib.httpsMod.Server = js.native
  def createServer(
    options: nodeLib.httpsMod.ServerOptions,
    requestListener: js.Function2[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.httpsMod.Server = js.native
  def get(options: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: java.lang.String,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(options: nodeLib.httpsMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: nodeLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(options: nodeLib.urlMod.URL): nodeLib.httpMod.ClientRequest = js.native
  def get(
    options: nodeLib.urlMod.URL,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(url: java.lang.String, options: nodeLib.httpsMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    url: java.lang.String,
    options: nodeLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def get(url: nodeLib.urlMod.URL, options: nodeLib.httpsMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def get(
    url: nodeLib.urlMod.URL,
    options: nodeLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: java.lang.String,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: nodeLib.httpsMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: nodeLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(options: nodeLib.urlMod.URL): nodeLib.httpMod.ClientRequest = js.native
  def request(
    options: nodeLib.urlMod.URL,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(url: java.lang.String, options: nodeLib.httpsMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    url: java.lang.String,
    options: nodeLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def request(url: nodeLib.urlMod.URL, options: nodeLib.httpsMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def request(
    url: nodeLib.urlMod.URL,
    options: nodeLib.httpsMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
}

