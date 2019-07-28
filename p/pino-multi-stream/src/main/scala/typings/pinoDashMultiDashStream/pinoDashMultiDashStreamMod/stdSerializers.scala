package typings.pinoDashMultiDashStream.pinoDashMultiDashStreamMod

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.pino.Anon_Header
import typings.pino.Anon_Headers
import typings.pino.Anon_Key
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino-multi-stream", "stdSerializers")
@js.native
object stdSerializers extends js.Object {
  /**
    * Serializes an Error object.
    */
  def err(err: Error): Anon_Key = js.native
  /**
    * Generates a JSONifiable object from the HTTP `request` object passed to the `createServer` callback of Node's HTTP server.
    */
  def req(req: IncomingMessage): Anon_Headers = js.native
  /**
    * Generates a JSONifiable object from the HTTP `response` object passed to the `createServer` callback of Node's HTTP server.
    */
  def res(res: ServerResponse): Anon_Header = js.native
}

