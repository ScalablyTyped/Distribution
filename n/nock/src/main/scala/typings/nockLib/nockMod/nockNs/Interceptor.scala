package typings
package nockLib.nockMod.nockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interceptor extends js.Object {
  def basicAuth(options: nockLib.Anon_User): this.type = js.native
  def delay(opts: nockLib.Anon_BodyHead): this.type = js.native
  def delay(opts: scala.Double): this.type = js.native
  def delayBody(timeMs: scala.Double): this.type = js.native
  def delayConnection(timeMs: scala.Double): this.type = js.native
  def getTotalDelay(): scala.Double = js.native
  def once(): this.type = js.native
  def optionally(): this.type = js.native
  def query(params: js.Any): this.type = js.native
  def query(params: nockLib.Anon_QuerObject): this.type = js.native
  def query(params: scala.Boolean): this.type = js.native
  def reply(
    callback: js.Function3[
      /* uri */ java.lang.String, 
      /* body */ java.lang.String, 
      /* cb */ js.UndefOr[ReplyCallback], 
      ReplyCallbackResult
    ]
  ): Scope = js.native
  def reply(
    callback: js.Function3[
      /* uri */ java.lang.String, 
      /* body */ java.lang.String, 
      /* cb */ js.UndefOr[ReplyCallback], 
      ReplyCallbackResult
    ],
    headers: HttpHeaders
  ): Scope = js.native
  def reply(responseCode: scala.Double): Scope = js.native
  def reply(responseCode: scala.Double, body: java.lang.String): Scope = js.native
  def reply(responseCode: scala.Double, body: java.lang.String, headers: HttpHeaders): Scope = js.native
  def reply(responseCode: scala.Double, body: js.Any): Scope = js.native
  def reply(responseCode: scala.Double, body: js.Any, headers: HttpHeaders): Scope = js.native
  def reply(
    responseCode: scala.Double,
    callback: js.Function3[
      /* uri */ java.lang.String, 
      /* body */ java.lang.String, 
      /* cb */ js.UndefOr[ReplyCallback], 
      ReplyCallbackResult
    ]
  ): Scope = js.native
  def reply(
    responseCode: scala.Double,
    callback: js.Function3[
      /* uri */ java.lang.String, 
      /* body */ java.lang.String, 
      /* cb */ js.UndefOr[ReplyCallback], 
      ReplyCallbackResult
    ],
    headers: HttpHeaders
  ): Scope = js.native
  def replyWithError(errorMessage: java.lang.String): Scope = js.native
  def replyWithError(errorMessage: js.Any): Scope = js.native
  def replyWithFile(responseCode: scala.Double, fileName: java.lang.String): Scope = js.native
  def replyWithFile(responseCode: scala.Double, fileName: java.lang.String, headers: HttpHeaders): Scope = js.native
  def socketDelay(timeMs: scala.Double): this.type = js.native
  def thrice(): this.type = js.native
  def times(newCounter: scala.Double): this.type = js.native
  def twice(): this.type = js.native
}

