package typings
package pinoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  /**
    * Serializes an Error object.
    */
  def err(err: nodeLib.Error): Anon_Key
  /**
    * Generates a JSONifiable object from the HTTP `request` object passed to the `createServer` callback of Node's HTTP server.
    */
  def req(req: nodeLib.httpMod.IncomingMessage): Anon_Headers
  /**
    * Generates a JSONifiable object from the HTTP `response` object passed to the `createServer` callback of Node's HTTP server.
    */
  def res(res: nodeLib.httpMod.ServerResponse): Anon_Header
}

object Anon_Err {
  @scala.inline
  def apply(
    err: js.Function1[nodeLib.Error, Anon_Key],
    req: js.Function1[nodeLib.httpMod.IncomingMessage, Anon_Headers],
    res: js.Function1[nodeLib.httpMod.ServerResponse, Anon_Header]
  ): Anon_Err = {
    val __obj = js.Dynamic.literal(err = err, req = req, res = res)
  
    __obj.asInstanceOf[Anon_Err]
  }
}

