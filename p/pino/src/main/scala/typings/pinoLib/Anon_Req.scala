package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  /**
    * Serializes an Error object.
    */
  def err(err: nodeLib.Error): Anon_Key
  /**
    * Generates a JSONifiable object from the HTTP `request` object passed to the `createServer` callback of Node's HTTP server.
    */
  def req(req: nodeLib.httpMod.IncomingMessage): Anon_Method
  /**
    * Generates a JSONifiable object from the HTTP `response` object passed to the `createServer` callback of Node's HTTP server.
    */
  def res(res: nodeLib.httpMod.ServerResponse): Anon_Header
}

